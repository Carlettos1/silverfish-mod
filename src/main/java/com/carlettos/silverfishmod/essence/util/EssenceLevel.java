package com.carlettos.silverfishmod.essence.util;

import java.util.Arrays;
import java.util.Random;

import com.carlettos.silverfishmod.util.Essence;
import static com.carlettos.silverfishmod.util.Essence.COAL;
import static com.carlettos.silverfishmod.util.Essence.COPPER;
import static com.carlettos.silverfishmod.util.Essence.LAPIS;
import static com.carlettos.silverfishmod.util.Essence.IRON;
import static com.carlettos.silverfishmod.util.Essence.GOLD;
import static com.carlettos.silverfishmod.util.Essence.REDSTONE;
import static com.carlettos.silverfishmod.util.Essence.DIAMOND;
import static com.carlettos.silverfishmod.util.Essence.EMERALD;
import static com.carlettos.silverfishmod.util.Essence.QUARTZ;
import static com.carlettos.silverfishmod.util.Essence.NETHERITE;

public class EssenceLevel{
    //TODO: que sea configurable
    public static final int INITIAL_LEVEL = 100;
    public static final int MAX_LEVEL = 200;
    
    public final float[] escencias = new float[Essence.LAST.index + 1];
    
    public EssenceLevel(Random random) {
        this(INITIAL_LEVEL * random.nextFloat(), INITIAL_LEVEL * random.nextFloat(), INITIAL_LEVEL * random.nextFloat(), INITIAL_LEVEL * random.nextFloat(), INITIAL_LEVEL * random.nextFloat(), INITIAL_LEVEL * random.nextFloat(), INITIAL_LEVEL * random.nextFloat(), INITIAL_LEVEL * random.nextFloat(), INITIAL_LEVEL * random.nextFloat(), INITIAL_LEVEL * random.nextFloat());
    }
    
    public EssenceLevel() {
        this(INITIAL_LEVEL, INITIAL_LEVEL, INITIAL_LEVEL, INITIAL_LEVEL, INITIAL_LEVEL, INITIAL_LEVEL, INITIAL_LEVEL, INITIAL_LEVEL, INITIAL_LEVEL, INITIAL_LEVEL);
    }
    
    public EssenceLevel(float coal, float copper, float lapis, float iron, float gold, float redstone, float diamond, float emerald, float quartz, float netherite) {
        escencias[COAL.index] = coal;
        escencias[COPPER.index] = copper;
        escencias[LAPIS.index] = lapis;
        escencias[IRON.index] = iron;
        escencias[GOLD.index] = gold;
        escencias[REDSTONE.index] = redstone;
        escencias[DIAMOND.index] = diamond;
        escencias[EMERALD.index] = emerald;
        escencias[QUARTZ.index] = quartz;
        escencias[NETHERITE.index] = netherite;
    }
    
    public EssenceLevel getCopy() {
        return new EssenceLevel(escencias[COAL.index], escencias[COPPER.index], escencias[LAPIS.index], escencias[IRON.index], 
                escencias[GOLD.index], escencias[REDSTONE.index], escencias[DIAMOND.index], escencias[EMERALD.index],
                escencias[QUARTZ.index], escencias[NETHERITE.index]);
    }
    
    public float getEscenciaTotal() {
        float total = 0;
        for (float f : escencias) {
            total += f;
        }
        return total;
    }
    
    public float getEscencia(byte index) {
        return escencias[index];
    }
    
    public float getCoal() {
        return escencias[COAL.index];
    }
    
    public float getCopper() {
        return escencias[COPPER.index];
    }
    
    public float getLapis() {
        return escencias[LAPIS.index];
    }
    
    public float getIron() {
        return escencias[IRON.index];
    }
    
    public float getGold() {
        return escencias[GOLD.index];
    }
    
    public float getRedstone() {
        return escencias[REDSTONE.index];
    }
    
    public float getDiamond() {
        return escencias[DIAMOND.index];
    }

    public float getEmerald() {
        return escencias[EMERALD.index];
    }
    
    public float getQuartz() {
        return escencias[QUARTZ.index];
    }
    
    public float getNetherita() {
        return escencias[NETHERITE.index];
    }
    
    public void setEscencia(byte index, float cantidad) {
        escencias[index] = cantidad;
    }
    
    public void setCoal(float cantidad) {
        escencias[COAL.index] = cantidad;
    }
    
    public void setCopper(float cantidad) {
        escencias[COPPER.index] = cantidad;
    }
    
    public void setLapis(float cantidad) {
        escencias[LAPIS.index] = cantidad;
    }
    
    public void setIron(float cantidad) {
        escencias[IRON.index] = cantidad;
    }
    
    public void setGold(float cantidad) {
        escencias[GOLD.index] = cantidad;
    }
    
    public void setRedstone(float cantidad) {
        escencias[REDSTONE.index] = cantidad;
    }
    
    public void setDiamond(float cantidad) {
        escencias[DIAMOND.index] = cantidad;
    }

    public void setEmerald(float cantidad) {
        escencias[EMERALD.index] = cantidad;
    }
    
    public void setQuartz(float cantidad) {
        escencias[QUARTZ.index] = cantidad;
    }
    
    public void setNetherita(float cantidad) {
        escencias[NETHERITE.index] = cantidad;
    }
    
    @Override
    public String toString() {
        return this.getEscenciaTotal() + ": " + Arrays.toString(escencias);
    }
}
