package com.carlettos.silverfishmod.listas;

import com.google.common.collect.ImmutableList;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;

public class ListaFeatures {
    public static final ImmutableList<OreConfiguration.TargetBlockState> ORE_COAL_INFESTED_TARGET_LIST;
    public static final ImmutableList<OreConfiguration.TargetBlockState> ORE_COPPER_INFESTED_TARGET_LIST;
    public static final ImmutableList<OreConfiguration.TargetBlockState> ORE_LAPIS_INFESTED_TARGET_LIST;
    public static final ImmutableList<OreConfiguration.TargetBlockState> ORE_IRON_INFESTED_TARGET_LIST;
    public static final ImmutableList<OreConfiguration.TargetBlockState> ORE_GOLD_INFESTED_TARGET_LIST;
    public static final ImmutableList<OreConfiguration.TargetBlockState> ORE_REDSTONE_INFESTED_TARGET_LIST;
    public static final ImmutableList<OreConfiguration.TargetBlockState> ORE_DIAMOND_INFESTED_TARGET_LIST;
    public static final ImmutableList<OreConfiguration.TargetBlockState> ORE_EMERALD_INFESTED_TARGET_LIST;

    public static final OreConfiguration ORE_COAL_INFESTED_CONFIG;
    public static final OreConfiguration ORE_COPPER_INFESTED_CONFIG;
    public static final OreConfiguration ORE_LAPIS_INFESTED_CONFIG;
    public static final OreConfiguration ORE_IRON_INFESTED_CONFIG;
    public static final OreConfiguration ORE_GOLD_INFESTED_CONFIG;
    public static final OreConfiguration ORE_REDSTONE_INFESTED_CONFIG;
    public static final OreConfiguration ORE_DIAMOND_INFESTED_CONFIG;
    public static final OreConfiguration ORE_EMERALD_INFESTED_CONFIG;

    public static final ConfiguredFeature<?, ?> ORE_COAL_INFESTED;
    public static final ConfiguredFeature<?, ?> ORE_COPPER_INFESTED;
    public static final ConfiguredFeature<?, ?> ORE_LAPIS_INFESTED;
    public static final ConfiguredFeature<?, ?> ORE_IRON_INFESTED;
    public static final ConfiguredFeature<?, ?> ORE_GOLD_INFESTED;
    public static final ConfiguredFeature<?, ?> ORE_REDSTONE_INFESTED;
    public static final ConfiguredFeature<?, ?> ORE_DIAMOND_INFESTED;
    public static final ConfiguredFeature<?, ?> ORE_EMERALD_INFESTED;
    public static final ConfiguredFeature<?, ?> PROTOTYPE_ORE_REDSTONE_INFESTED;
    public static final ConfiguredFeature<?, ?> PROTOTYPE_ORE_REDSTONE_INFESTED_LOWER;
    
    static {
        ORE_COAL_INFESTED_TARGET_LIST = ImmutableList.of(
                OreConfiguration.target(OreConfiguration.Predicates.STONE_ORE_REPLACEABLES, ListaFeaturesStates.INFESTED_COAL_ORE),
                OreConfiguration.target(OreConfiguration.Predicates.DEEPSLATE_ORE_REPLACEABLES, ListaFeaturesStates.INFESTED_DEEPSLATE_COAL_ORE));
        ORE_COPPER_INFESTED_TARGET_LIST = ImmutableList.of(
                OreConfiguration.target(OreConfiguration.Predicates.STONE_ORE_REPLACEABLES, ListaFeaturesStates.INFESTED_COPPER_ORE),
                OreConfiguration.target(OreConfiguration.Predicates.DEEPSLATE_ORE_REPLACEABLES, ListaFeaturesStates.INFESTED_DEEPSLATE_COPPER_ORE));
        ORE_LAPIS_INFESTED_TARGET_LIST = ImmutableList.of(
                OreConfiguration.target(OreConfiguration.Predicates.STONE_ORE_REPLACEABLES, ListaFeaturesStates.INFESTED_LAPIS_ORE),
                OreConfiguration.target(OreConfiguration.Predicates.DEEPSLATE_ORE_REPLACEABLES, ListaFeaturesStates.INFESTED_DEEPSLATE_LAPIS_ORE));
        ORE_IRON_INFESTED_TARGET_LIST = ImmutableList.of(
                OreConfiguration.target(OreConfiguration.Predicates.STONE_ORE_REPLACEABLES, ListaFeaturesStates.INFESTED_IRON_ORE),
                OreConfiguration.target(OreConfiguration.Predicates.DEEPSLATE_ORE_REPLACEABLES, ListaFeaturesStates.INFESTED_DEEPSLATE_IRON_ORE));
        ORE_GOLD_INFESTED_TARGET_LIST = ImmutableList.of(
                OreConfiguration.target(OreConfiguration.Predicates.STONE_ORE_REPLACEABLES, ListaFeaturesStates.INFESTED_GOLD_ORE),
                OreConfiguration.target(OreConfiguration.Predicates.DEEPSLATE_ORE_REPLACEABLES, ListaFeaturesStates.INFESTED_DEEPSLATE_GOLD_ORE));
        ORE_REDSTONE_INFESTED_TARGET_LIST = ImmutableList.of(
                OreConfiguration.target(OreConfiguration.Predicates.STONE_ORE_REPLACEABLES, ListaFeaturesStates.INFESTED_REDSTONE_ORE),
                OreConfiguration.target(OreConfiguration.Predicates.DEEPSLATE_ORE_REPLACEABLES, ListaFeaturesStates.INFESTED_DEEPSLATE_REDSTONE_ORE));
        ORE_DIAMOND_INFESTED_TARGET_LIST = ImmutableList.of(
                OreConfiguration.target(OreConfiguration.Predicates.STONE_ORE_REPLACEABLES, ListaFeaturesStates.INFESTED_DIAMOND_ORE),
                OreConfiguration.target(OreConfiguration.Predicates.DEEPSLATE_ORE_REPLACEABLES, ListaFeaturesStates.INFESTED_DEEPSLATE_DIAMOND_ORE));
        ORE_EMERALD_INFESTED_TARGET_LIST = ImmutableList.of(
                OreConfiguration.target(OreConfiguration.Predicates.STONE_ORE_REPLACEABLES, ListaFeaturesStates.INFESTED_EMERALD_ORE),
                OreConfiguration.target(OreConfiguration.Predicates.DEEPSLATE_ORE_REPLACEABLES, ListaFeaturesStates.INFESTED_DEEPSLATE_EMERALD_ORE));

        ORE_COAL_INFESTED_CONFIG = new OreConfiguration(ORE_COAL_INFESTED_TARGET_LIST, 8); //17
        ORE_COPPER_INFESTED_CONFIG = new OreConfiguration(ORE_COPPER_INFESTED_TARGET_LIST, 5); //10
        ORE_LAPIS_INFESTED_CONFIG = new OreConfiguration(ORE_LAPIS_INFESTED_TARGET_LIST, 3); //7
        ORE_IRON_INFESTED_CONFIG = new OreConfiguration(ORE_IRON_INFESTED_TARGET_LIST, 4); //9
        ORE_GOLD_INFESTED_CONFIG = new OreConfiguration(ORE_GOLD_INFESTED_TARGET_LIST, 4); //9
        ORE_REDSTONE_INFESTED_CONFIG = new OreConfiguration(ORE_REDSTONE_INFESTED_TARGET_LIST, 4); //8
        ORE_DIAMOND_INFESTED_CONFIG = new OreConfiguration(ORE_DIAMOND_INFESTED_TARGET_LIST, 4); //8
        ORE_EMERALD_INFESTED_CONFIG = new OreConfiguration(ORE_EMERALD_INFESTED_TARGET_LIST, 4); //1

        ORE_COAL_INFESTED = Feature.ORE.configured(ORE_COAL_INFESTED_CONFIG).rangeUniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(127)).squared().count(10); //20
        ORE_COPPER_INFESTED = Feature.ORE.configured(ORE_COPPER_INFESTED_CONFIG).rangeUniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(96)).squared().count(3); //6
        ORE_LAPIS_INFESTED = Feature.ORE.configured(ORE_LAPIS_INFESTED_CONFIG).rangeUniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(30)).squared(); //1 ?
        ORE_IRON_INFESTED = Feature.ORE.configured(ORE_IRON_INFESTED_CONFIG).rangeUniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(63)).squared().count(10); //20
        ORE_GOLD_INFESTED = Feature.ORE.configured(ORE_GOLD_INFESTED_CONFIG).rangeUniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(31)).squared().count(1); //2
        ORE_REDSTONE_INFESTED = Feature.ORE.configured(ORE_REDSTONE_INFESTED_CONFIG).rangeUniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(15)).squared().count(4); //4
        ORE_DIAMOND_INFESTED = Feature.ORE.configured(ORE_DIAMOND_INFESTED_CONFIG).rangeUniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(15)).squared(); //1?
        ORE_EMERALD_INFESTED = Feature.ORE.configured(ORE_EMERALD_INFESTED_CONFIG).rangeUniform(VerticalAnchor.absolute(4), VerticalAnchor.absolute(31)).squared().count(UniformInt.of(1, 4)); //3-8
        PROTOTYPE_ORE_REDSTONE_INFESTED = Feature.ORE.configured(ORE_REDSTONE_INFESTED_CONFIG).rangeUniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(15)).squared().count(2);
        PROTOTYPE_ORE_REDSTONE_INFESTED_LOWER = Feature.ORE.configured(ORE_REDSTONE_INFESTED_CONFIG).rangeTriangle(VerticalAnchor.aboveBottom(-32), VerticalAnchor.aboveBottom(32)).squared().count(4);        
    }
}
