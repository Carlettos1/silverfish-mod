package com.carlettos.silverfishmod.listas;

import com.carlettos.silverfishmod.mob.MineralSilverfish;
import com.carlettos.silverfishmod.mob.egg.MineralEgg;
import com.carlettos.silverfishmod.mob.silverfish.CoalSilverfish;
import com.carlettos.silverfishmod.mob.silverfish.CopperSilverfish;
import com.carlettos.silverfishmod.mob.silverfish.DeepslateCoalSilverfish;
import com.carlettos.silverfishmod.mob.silverfish.DeepslateCopperSilverfish;
import com.carlettos.silverfishmod.mob.silverfish.DeepslateDiamondSilverfish;
import com.carlettos.silverfishmod.mob.silverfish.DeepslateEmeraldSilverfish;
import com.carlettos.silverfishmod.mob.silverfish.DeepslateGoldSilverfish;
import com.carlettos.silverfishmod.mob.silverfish.DeepslateIronSilverfish;
import com.carlettos.silverfishmod.mob.silverfish.DeepslateLapisSilverfish;
import com.carlettos.silverfishmod.mob.silverfish.DeepslateRedstoneSilverfish;
import com.carlettos.silverfishmod.mob.silverfish.DiamondSilverfish;
import com.carlettos.silverfishmod.mob.silverfish.EmeraldSilverfish;
import com.carlettos.silverfishmod.mob.silverfish.GoldSilverfish;
import com.carlettos.silverfishmod.mob.silverfish.IronSilverfish;
import com.carlettos.silverfishmod.mob.silverfish.LapisSilverfish;
import com.carlettos.silverfishmod.mob.silverfish.NetherGoldSilverfish;
import com.carlettos.silverfishmod.mob.silverfish.NetheriteSilverfish;
import com.carlettos.silverfishmod.mob.silverfish.QuartzSilverfish;
import com.carlettos.silverfishmod.mob.silverfish.RedstoneSilverfish;
import com.carlettos.silverfishmod.util.Mineral;
import com.carlettos.silverfishmod.util.Util;

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
        COAL_SILVERFISH = EntityType.Builder.<MineralSilverfish>of(CoalSilverfish::new, MobCategory.MONSTER).sized(0.4F, 0.3F).clientTrackingRange(8).build(Util.MOD_ID + ":coal_silverfish");
        DEEPSLATE_COAL_SILVERFISH = EntityType.Builder.<MineralSilverfish>of(DeepslateCoalSilverfish::new, MobCategory.MONSTER).sized(0.4F, 0.3F).clientTrackingRange(8).build(Util.MOD_ID + ":deepslate_coal_silverfish");
        COPPER_SILVERFISH = EntityType.Builder.<MineralSilverfish>of(CopperSilverfish::new, MobCategory.MONSTER).sized(0.4F, 0.3F).clientTrackingRange(8).build(Util.MOD_ID + ":copper_silverfish");
        DEEPSLATE_COPPER_SILVERFISH = EntityType.Builder.<MineralSilverfish>of(DeepslateCopperSilverfish::new, MobCategory.MONSTER).sized(0.4F, 0.3F).clientTrackingRange(8).build(Util.MOD_ID + ":deepslate_copper_silverfish");
        LAPIS_SILVERFISH = EntityType.Builder.<MineralSilverfish>of(LapisSilverfish::new, MobCategory.MONSTER).sized(0.4F, 0.3F).clientTrackingRange(8).build(Util.MOD_ID + ":lapis_silverfish");
        DEEPSLATE_LAPIS_SILVERFISH = EntityType.Builder.<MineralSilverfish>of(DeepslateLapisSilverfish::new, MobCategory.MONSTER).sized(0.4F, 0.3F).clientTrackingRange(8).build(Util.MOD_ID + ":deepslate_lapis_silverfish");
        IRON_SILVERFISH = EntityType.Builder.<MineralSilverfish>of(IronSilverfish::new, MobCategory.MONSTER).sized(0.4F, 0.3F).clientTrackingRange(8).build(Util.MOD_ID + ":iron_silverfish");
        DEEPSLATE_IRON_SILVERFISH = EntityType.Builder.<MineralSilverfish>of(DeepslateIronSilverfish::new, MobCategory.MONSTER).sized(0.4F, 0.3F).clientTrackingRange(8).build(Util.MOD_ID + ":deepslate_iron_silverfish");
        GOLD_SILVERFISH = EntityType.Builder.<MineralSilverfish>of(GoldSilverfish::new, MobCategory.MONSTER).sized(0.4F, 0.3F).clientTrackingRange(8).build(Util.MOD_ID + ":gold_silverfish");
        DEEPSLATE_GOLD_SILVERFISH = EntityType.Builder.<MineralSilverfish>of(DeepslateGoldSilverfish::new, MobCategory.MONSTER).sized(0.4F, 0.3F).clientTrackingRange(8).build(Util.MOD_ID + ":deepslate_gold_silverfish");
        NETHER_GOLD_SILVERFISH = EntityType.Builder.<MineralSilverfish>of(NetherGoldSilverfish::new, MobCategory.MONSTER).sized(0.4F, 0.3F).clientTrackingRange(8).build(Util.MOD_ID + ":nether_gold_silverfish");
        REDSTONE_SILVERFISH = EntityType.Builder.<MineralSilverfish>of(RedstoneSilverfish::new, MobCategory.MONSTER).sized(0.4F, 0.3F).clientTrackingRange(8).build(Util.MOD_ID + ":redstone_silverfish");
        DEEPSLATE_REDSTONE_SILVERFISH = EntityType.Builder.<MineralSilverfish>of(DeepslateRedstoneSilverfish::new, MobCategory.MONSTER).sized(0.4F, 0.3F).clientTrackingRange(8).build(Util.MOD_ID + ":deepslate_redstone_silverfish");
        DIAMOND_SILVERFISH = EntityType.Builder.<MineralSilverfish>of(DiamondSilverfish::new, MobCategory.MONSTER).sized(0.4F, 0.3F).clientTrackingRange(8).build(Util.MOD_ID + ":diamond_silverfish");
        DEEPSLATE_DIAMOND_SILVERFISH = EntityType.Builder.<MineralSilverfish>of(DeepslateDiamondSilverfish::new, MobCategory.MONSTER).sized(0.4F, 0.3F).clientTrackingRange(8).build(Util.MOD_ID + ":deepslate_diamond_silverfish");
        EMERALD_SILVERFISH = EntityType.Builder.<MineralSilverfish>of(EmeraldSilverfish::new, MobCategory.MONSTER).sized(0.4F, 0.3F).clientTrackingRange(8).build(Util.MOD_ID + ":emerald_silverfish");
        DEEPSLATE_EMERALD_SILVERFISH = EntityType.Builder.<MineralSilverfish>of(DeepslateEmeraldSilverfish::new, MobCategory.MONSTER).sized(0.4F, 0.3F).clientTrackingRange(8).build(Util.MOD_ID + ":deepslate_emerald_silverfish");
        QUARTZ_SILVERFISH = EntityType.Builder.<MineralSilverfish>of(QuartzSilverfish::new, MobCategory.MONSTER).sized(0.4F, 0.3F).clientTrackingRange(8).build(Util.MOD_ID + ":quartz_silverfish");
        NETHERITE_SILVERFISH = EntityType.Builder.<MineralSilverfish>of(NetheriteSilverfish::new, MobCategory.MONSTER).sized(0.4F, 0.3F).clientTrackingRange(8).build(Util.MOD_ID + ":netherite_silverfish");

        //TODO: hacer modelos y renderers, además de todas las cosas
        COAL_SILVERFISH_EGG = EntityType.Builder.<MineralEgg>of((type, level) -> new MineralEgg(type, level, Mineral.COAL), MobCategory.MONSTER).sized(0.4F, 0.3F).clientTrackingRange(8).build(Util.MOD_ID + ":coal_silverfish_egg");
        DEEPSLATE_COAL_SILVERFISH_EGG = EntityType.Builder.<MineralEgg>of((type, level) -> new MineralEgg(type, level, Mineral.DEEPSLATE_COAL), MobCategory.MONSTER).sized(0.4F, 0.3F).clientTrackingRange(8).build(Util.MOD_ID + ":deepslate_coal_silverfish_egg");
        COPPER_SILVERFISH_EGG = EntityType.Builder.<MineralEgg>of((type, level) -> new MineralEgg(type, level, Mineral.COPPER), MobCategory.MONSTER).sized(0.4F, 0.3F).clientTrackingRange(8).build(Util.MOD_ID + ":copper_silverfish_egg");
        DEEPSLATE_COPPER_SILVERFISH_EGG = EntityType.Builder.<MineralEgg>of((type, level) -> new MineralEgg(type, level, Mineral.DEEPSLATE_COPPER), MobCategory.MONSTER).sized(0.4F, 0.3F).clientTrackingRange(8).build(Util.MOD_ID + ":deepslate_copper_silverfish_egg");
        LAPIS_SILVERFISH_EGG = EntityType.Builder.<MineralEgg>of((type, level) -> new MineralEgg(type, level, Mineral.LAPIS), MobCategory.MONSTER).sized(0.4F, 0.3F).clientTrackingRange(8).build(Util.MOD_ID + ":lapis_silverfish_egg");
        DEEPSLATE_LAPIS_SILVERFISH_EGG = EntityType.Builder.<MineralEgg>of((type, level) -> new MineralEgg(type, level, Mineral.DEEPSLATE_LAPIS), MobCategory.MONSTER).sized(0.4F, 0.3F).clientTrackingRange(8).build(Util.MOD_ID + ":deepslate_lapis_silverfish_egg");
        IRON_SILVERFISH_EGG = EntityType.Builder.<MineralEgg>of((type, level) -> new MineralEgg(type, level, Mineral.IRON), MobCategory.MONSTER).sized(0.4F, 0.3F).clientTrackingRange(8).build(Util.MOD_ID + ":iron_silverfish_egg");
        DEEPSLATE_IRON_SILVERFISH_EGG = EntityType.Builder.<MineralEgg>of((type, level) -> new MineralEgg(type, level, Mineral.DEEPSLATE_IRON), MobCategory.MONSTER).sized(0.4F, 0.3F).clientTrackingRange(8).build(Util.MOD_ID + ":deepslate_iron_silverfish_egg");
        GOLD_SILVERFISH_EGG = EntityType.Builder.<MineralEgg>of((type, level) -> new MineralEgg(type, level, Mineral.GOLD), MobCategory.MONSTER).sized(0.4F, 0.3F).clientTrackingRange(8).build(Util.MOD_ID + ":gold_silverfish_egg");
        DEEPSLATE_GOLD_SILVERFISH_EGG = EntityType.Builder.<MineralEgg>of((type, level) -> new MineralEgg(type, level, Mineral.DEEPSLATE_GOLD), MobCategory.MONSTER).sized(0.4F, 0.3F).clientTrackingRange(8).build(Util.MOD_ID + ":deepslate_gold_silverfish_egg");
        NETHER_GOLD_SILVERFISH_EGG = EntityType.Builder.<MineralEgg>of((type, level) -> new MineralEgg(type, level, Mineral.NETHER_GOLD), MobCategory.MONSTER).sized(0.4F, 0.3F).clientTrackingRange(8).build(Util.MOD_ID + ":nether_gold_silverfish_egg");
        REDSTONE_SILVERFISH_EGG = EntityType.Builder.<MineralEgg>of((type, level) -> new MineralEgg(type, level, Mineral.REDSTONE), MobCategory.MONSTER).sized(0.4F, 0.3F).clientTrackingRange(8).build(Util.MOD_ID + ":redstone_silverfish_egg");
        DEEPSLATE_REDSTONE_SILVERFISH_EGG = EntityType.Builder.<MineralEgg>of((type, level) -> new MineralEgg(type, level, Mineral.DEEPSLATE_REDSTONE), MobCategory.MONSTER).sized(0.4F, 0.3F).clientTrackingRange(8).build(Util.MOD_ID + ":deepslate_redstone_silverfish_egg");
        DIAMOND_SILVERFISH_EGG = EntityType.Builder.<MineralEgg>of((type, level) -> new MineralEgg(type, level, Mineral.DIAMOND), MobCategory.MONSTER).sized(0.4F, 0.3F).clientTrackingRange(8).build(Util.MOD_ID + ":diamond_silverfish_egg");
        DEEPSLATE_DIAMOND_SILVERFISH_EGG = EntityType.Builder.<MineralEgg>of((type, level) -> new MineralEgg(type, level, Mineral.DEEPSLATE_DIAMOND), MobCategory.MONSTER).sized(0.4F, 0.3F).clientTrackingRange(8).build(Util.MOD_ID + ":deepslate_diamond_silverfish_egg");
        EMERALD_SILVERFISH_EGG = EntityType.Builder.<MineralEgg>of((type, level) -> new MineralEgg(type, level, Mineral.EMERALD), MobCategory.MONSTER).sized(0.4F, 0.3F).clientTrackingRange(8).build(Util.MOD_ID + ":emerald_silverfish_egg");
        DEEPSLATE_EMERALD_SILVERFISH_EGG = EntityType.Builder.<MineralEgg>of((type, level) -> new MineralEgg(type, level, Mineral.DEEPSLATE_EMERALD), MobCategory.MONSTER).sized(0.4F, 0.3F).clientTrackingRange(8).build(Util.MOD_ID + ":deepslate_emerald_silverfish_egg");
        QUARTZ_SILVERFISH_EGG = EntityType.Builder.<MineralEgg>of((type, level) -> new MineralEgg(type, level, Mineral.QUARTZ), MobCategory.MONSTER).sized(0.4F, 0.3F).clientTrackingRange(8).build(Util.MOD_ID + ":quartz_silverfish_egg");
        NETHERITE_SILVERFISH_EGG = EntityType.Builder.<MineralEgg>of((type, level) -> new MineralEgg(type, level, Mineral.NETHERITE), MobCategory.MONSTER).sized(0.4F, 0.3F).clientTrackingRange(8).build(Util.MOD_ID + ":netherite_silverfish_egg");
    }
}