package com.carlettos.silverfishmod.listas;

import com.carlettos.silverfishmod.util.Mineral;
import com.carlettos.silverfishmod.util.Util;
import com.carlettos.silverfishmod.world.entity.MineralEgg;
import com.carlettos.silverfishmod.world.entity.MineralSilverfish;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

public class ListaEntidades {
    public static final EntityType<MineralSilverfish> COAL_SILVERFISH;
    public static final EntityType<MineralSilverfish> DEEPSLATE_COAL_SILVERFISH;
    public static final EntityType<MineralSilverfish> COPPER_SILVERFISH;
    public static final EntityType<MineralSilverfish> DEEPSLATE_COPPER_SILVERFISH;
    public static final EntityType<MineralSilverfish> LAPIS_SILVERFISH;
    public static final EntityType<MineralSilverfish> DEEPSLATE_LAPIS_SILVERFISH;
    public static final EntityType<MineralSilverfish> IRON_SILVERFISH;
    public static final EntityType<MineralSilverfish> DEEPSLATE_IRON_SILVERFISH;
    public static final EntityType<MineralSilverfish> GOLD_SILVERFISH;
    public static final EntityType<MineralSilverfish> DEEPSLATE_GOLD_SILVERFISH;
    public static final EntityType<MineralSilverfish> NETHER_GOLD_SILVERFISH;
    public static final EntityType<MineralSilverfish> REDSTONE_SILVERFISH;
    public static final EntityType<MineralSilverfish> DEEPSLATE_REDSTONE_SILVERFISH;
    public static final EntityType<MineralSilverfish> DIAMOND_SILVERFISH;
    public static final EntityType<MineralSilverfish> DEEPSLATE_DIAMOND_SILVERFISH;
    public static final EntityType<MineralSilverfish> EMERALD_SILVERFISH;
    public static final EntityType<MineralSilverfish> DEEPSLATE_EMERALD_SILVERFISH;
    public static final EntityType<MineralSilverfish> QUARTZ_SILVERFISH;
    public static final EntityType<MineralSilverfish> NETHERITE_SILVERFISH;
    
    public static final EntityType<MineralEgg> COAL_SILVERFISH_EGG;
    public static final EntityType<MineralEgg> DEEPSLATE_COAL_SILVERFISH_EGG;
    public static final EntityType<MineralEgg> COPPER_SILVERFISH_EGG;
    public static final EntityType<MineralEgg> DEEPSLATE_COPPER_SILVERFISH_EGG;
    public static final EntityType<MineralEgg> LAPIS_SILVERFISH_EGG;
    public static final EntityType<MineralEgg> DEEPSLATE_LAPIS_SILVERFISH_EGG;
    public static final EntityType<MineralEgg> IRON_SILVERFISH_EGG;
    public static final EntityType<MineralEgg> DEEPSLATE_IRON_SILVERFISH_EGG;
    public static final EntityType<MineralEgg> GOLD_SILVERFISH_EGG;
    public static final EntityType<MineralEgg> DEEPSLATE_GOLD_SILVERFISH_EGG;
    public static final EntityType<MineralEgg> NETHER_GOLD_SILVERFISH_EGG;
    public static final EntityType<MineralEgg> REDSTONE_SILVERFISH_EGG;
    public static final EntityType<MineralEgg> DEEPSLATE_REDSTONE_SILVERFISH_EGG;
    public static final EntityType<MineralEgg> DIAMOND_SILVERFISH_EGG;
    public static final EntityType<MineralEgg> DEEPSLATE_DIAMOND_SILVERFISH_EGG;
    public static final EntityType<MineralEgg> EMERALD_SILVERFISH_EGG;
    public static final EntityType<MineralEgg> DEEPSLATE_EMERALD_SILVERFISH_EGG;
    public static final EntityType<MineralEgg> QUARTZ_SILVERFISH_EGG;
    public static final EntityType<MineralEgg> NETHERITE_SILVERFISH_EGG;
    
    static {
        //Silverfishes
        COAL_SILVERFISH = createMineralSilverfish(Mineral.COAL);
        DEEPSLATE_COAL_SILVERFISH = createMineralSilverfish(Mineral.DEEPSLATE_COAL);
        COPPER_SILVERFISH = createMineralSilverfish(Mineral.COPPER);
        DEEPSLATE_COPPER_SILVERFISH = createMineralSilverfish(Mineral.DEEPSLATE_COPPER);
        LAPIS_SILVERFISH = createMineralSilverfish(Mineral.LAPIS);
        DEEPSLATE_LAPIS_SILVERFISH = createMineralSilverfish(Mineral.DEEPSLATE_LAPIS);
        IRON_SILVERFISH = createMineralSilverfish(Mineral.IRON);
        DEEPSLATE_IRON_SILVERFISH = createMineralSilverfish(Mineral.DEEPSLATE_IRON);
        GOLD_SILVERFISH = createMineralSilverfish(Mineral.GOLD);
        DEEPSLATE_GOLD_SILVERFISH = createMineralSilverfish(Mineral.DEEPSLATE_GOLD);
        NETHER_GOLD_SILVERFISH = createMineralSilverfish(Mineral.NETHER_GOLD);
        REDSTONE_SILVERFISH = createMineralSilverfish(Mineral.REDSTONE);
        DEEPSLATE_REDSTONE_SILVERFISH = createMineralSilverfish(Mineral.DEEPSLATE_REDSTONE);
        DIAMOND_SILVERFISH = createMineralSilverfish(Mineral.DIAMOND);
        DEEPSLATE_DIAMOND_SILVERFISH = createMineralSilverfish(Mineral.DEEPSLATE_DIAMOND);
        EMERALD_SILVERFISH = createMineralSilverfish(Mineral.EMERALD);
        DEEPSLATE_EMERALD_SILVERFISH = createMineralSilverfish(Mineral.DEEPSLATE_EMERALD);
        QUARTZ_SILVERFISH = createMineralSilverfish(Mineral.QUARTZ);
        NETHERITE_SILVERFISH = createMineralSilverfish(Mineral.NETHERITE);

        //Eggs
        COAL_SILVERFISH_EGG = createMineralEgg(Mineral.COAL);
        DEEPSLATE_COAL_SILVERFISH_EGG = createMineralEgg(Mineral.DEEPSLATE_COAL);
        COPPER_SILVERFISH_EGG = createMineralEgg(Mineral.COPPER);
        DEEPSLATE_COPPER_SILVERFISH_EGG = createMineralEgg(Mineral.DEEPSLATE_COPPER);
        LAPIS_SILVERFISH_EGG = createMineralEgg(Mineral.LAPIS);
        DEEPSLATE_LAPIS_SILVERFISH_EGG = createMineralEgg(Mineral.DEEPSLATE_LAPIS);
        IRON_SILVERFISH_EGG = createMineralEgg(Mineral.IRON);
        DEEPSLATE_IRON_SILVERFISH_EGG = createMineralEgg(Mineral.DEEPSLATE_IRON);
        GOLD_SILVERFISH_EGG = createMineralEgg(Mineral.GOLD);
        DEEPSLATE_GOLD_SILVERFISH_EGG = createMineralEgg(Mineral.DEEPSLATE_GOLD);
        NETHER_GOLD_SILVERFISH_EGG = createMineralEgg(Mineral.NETHER_GOLD);
        REDSTONE_SILVERFISH_EGG = createMineralEgg(Mineral.REDSTONE);
        DEEPSLATE_REDSTONE_SILVERFISH_EGG = createMineralEgg(Mineral.DEEPSLATE_REDSTONE);
        DIAMOND_SILVERFISH_EGG = createMineralEgg(Mineral.DIAMOND);
        DEEPSLATE_DIAMOND_SILVERFISH_EGG = createMineralEgg(Mineral.DEEPSLATE_DIAMOND);
        EMERALD_SILVERFISH_EGG = createMineralEgg(Mineral.EMERALD);
        DEEPSLATE_EMERALD_SILVERFISH_EGG = createMineralEgg(Mineral.DEEPSLATE_EMERALD);
        QUARTZ_SILVERFISH_EGG = createMineralEgg(Mineral.QUARTZ);
        NETHERITE_SILVERFISH_EGG = createMineralEgg(Mineral.NETHERITE);
    }
    
    public static final EntityType<MineralSilverfish> createMineralSilverfish(Mineral mineral){
        return EntityType.Builder.<MineralSilverfish>of((t, l) -> new MineralSilverfish(t, l, mineral), MobCategory.MONSTER).sized(0.4F, 0.3F).clientTrackingRange(32).build(Util.MOD_ID + ":" + mineral.name().toLowerCase() + "_silverfish");
    }
    
    public static final EntityType<MineralEgg> createMineralEgg(Mineral mineral){
        return EntityType.Builder.<MineralEgg>of((t, l) -> new MineralEgg(t, l, mineral), MobCategory.MONSTER).sized(0.3F, 0.3F).clientTrackingRange(32).build(Util.MOD_ID + ":" + mineral.name().toLowerCase() + "_silverfish_egg");
    }
}