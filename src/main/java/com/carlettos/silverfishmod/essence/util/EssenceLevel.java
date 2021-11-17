package com.carlettos.silverfishmod.essence.util;

import static com.carlettos.silverfishmod.util.Essence.COAL;
import static com.carlettos.silverfishmod.util.Essence.COPPER;
import static com.carlettos.silverfishmod.util.Essence.DIAMOND;
import static com.carlettos.silverfishmod.util.Essence.EMERALD;
import static com.carlettos.silverfishmod.util.Essence.GOLD;
import static com.carlettos.silverfishmod.util.Essence.IRON;
import static com.carlettos.silverfishmod.util.Essence.LAPIS;
import static com.carlettos.silverfishmod.util.Essence.NETHERITE;
import static com.carlettos.silverfishmod.util.Essence.QUARTZ;
import static com.carlettos.silverfishmod.util.Essence.REDSTONE;

import java.util.Arrays;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import com.carlettos.silverfishmod.util.Essence;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.util.GsonHelper;

public class EssenceLevel {
    //TODO: que sea configurable
    public static final int INITIAL_LEVEL = 100;
    public static final int MAX_LEVEL = 200;
    
    public final float[] essences = new float[Essence.values().length];
    
    public EssenceLevel(Random random) {
        this(random, INITIAL_LEVEL);
    }
    
    public EssenceLevel(float level) {
        this(level, level, level, level, level, level, level, level, level, level);
    }
    
    public EssenceLevel(Random random, float level) {
        this(level * random.nextFloat(), level * random.nextFloat(), level * random.nextFloat(), level * random.nextFloat(), level * random.nextFloat(), level * random.nextFloat(), level * random.nextFloat(), level * random.nextFloat(), level * random.nextFloat(), level * random.nextFloat());
    }
    
    public EssenceLevel() {
        this(INITIAL_LEVEL);
    }
    
    public EssenceLevel(float coal, float copper, float lapis, float iron, float gold, float redstone, float diamond, float emerald, float quartz, float netherite) {
        essences[COAL.ordinal()] = coal;
        essences[COPPER.ordinal()] = copper;
        essences[LAPIS.ordinal()] = lapis;
        essences[IRON.ordinal()] = iron;
        essences[GOLD.ordinal()] = gold;
        essences[REDSTONE.ordinal()] = redstone;
        essences[DIAMOND.ordinal()] = diamond;
        essences[EMERALD.ordinal()] = emerald;
        essences[QUARTZ.ordinal()] = quartz;
        essences[NETHERITE.ordinal()] = netherite;
    }

    public EssenceLevel getCopy() {
        return new EssenceLevel(essences[COAL.ordinal()], essences[COPPER.ordinal()], essences[LAPIS.ordinal()], essences[IRON.ordinal()], 
                essences[GOLD.ordinal()], essences[REDSTONE.ordinal()], essences[DIAMOND.ordinal()], essences[EMERALD.ordinal()],
                essences[QUARTZ.ordinal()], essences[NETHERITE.ordinal()]);
    }
    
    public void toNetwork(FriendlyByteBuf buffer) {
        buffer.writeFloat(this.get(COAL));
        buffer.writeFloat(this.get(COPPER));
        buffer.writeFloat(this.get(LAPIS));
        buffer.writeFloat(this.get(IRON));
        buffer.writeFloat(this.get(GOLD));
        buffer.writeFloat(this.get(REDSTONE));
        buffer.writeFloat(this.get(DIAMOND));
        buffer.writeFloat(this.get(EMERALD));
        buffer.writeFloat(this.get(QUARTZ));
        buffer.writeFloat(this.get(NETHERITE));
    }
    
    public static EssenceLevel fromNetwork(FriendlyByteBuf buffer) {
        EssenceLevel level = new EssenceLevel(0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        level.set(COAL, buffer.readFloat());
        level.set(COPPER, buffer.readFloat());
        level.set(LAPIS, buffer.readFloat());
        level.set(IRON, buffer.readFloat());
        level.set(GOLD, buffer.readFloat());
        level.set(REDSTONE, buffer.readFloat());
        level.set(DIAMOND, buffer.readFloat());
        level.set(EMERALD, buffer.readFloat());
        level.set(QUARTZ, buffer.readFloat());
        level.set(NETHERITE,buffer.readFloat());
        return level;
    }
    
    public static EssenceLevel fromJson(JsonElement json) {
        EssenceLevel level = new EssenceLevel(0);
        Set<Map.Entry<String, JsonElement>> levels = GsonHelper.getAsJsonObject((JsonObject)json, "level").entrySet();
        levels.forEach(entry -> {
            level.set(Essence.valueOf(entry.getKey().toUpperCase()), entry.getValue().getAsFloat());
        });;
        return level;
    }
    
    public float getTotal() {
        float total = 0;
        for (float f : essences) {
            total += f;
        }
        return total;
    }
    
    public float get(Essence essence) {
        return essences[essence.ordinal()];
    }
    
    public void set(Essence essence, float cantidad) {
        essences[essence.ordinal()] = cantidad;
    }
    
    public void add(Essence essence, float cantidad){
        essences[essence.ordinal()] += cantidad;
    }
    
    @Override
    public String toString() {
        return this.getTotal() + ": " + Arrays.toString(essences);
    }
}
