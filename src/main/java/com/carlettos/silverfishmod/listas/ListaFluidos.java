package com.carlettos.silverfishmod.listas;

import com.carlettos.silverfishmod.fluid.MineralFluid;
import com.carlettos.silverfishmod.util.Essence;

import net.minecraft.world.level.material.FlowingFluid;

public class ListaFluidos {
    public static final FlowingFluid COAL;
    public static final FlowingFluid FLOWING_COAL;
    public static final FlowingFluid COPPER;
    public static final FlowingFluid FLOWING_COPPER;
    public static final FlowingFluid LAPIS;
    public static final FlowingFluid FLOWING_LAPIS;
    public static final FlowingFluid IRON;
    public static final FlowingFluid FLOWING_IRON;
    public static final FlowingFluid GOLD;
    public static final FlowingFluid FLOWING_GOLD;
    public static final FlowingFluid REDSTONE;
    public static final FlowingFluid FLOWING_REDSTONE;
    public static final FlowingFluid DIAMOND;
    public static final FlowingFluid FLOWING_DIAMOND;
    public static final FlowingFluid EMERALD;
    public static final FlowingFluid FLOWING_EMERALD;
    public static final FlowingFluid QUARTZ;
    public static final FlowingFluid FLOWING_QUARTZ;
    public static final FlowingFluid NETHERITE;
    public static final FlowingFluid FLOWING_NETHERITE;
    
    static {
        COAL = new MineralFluid.Source(Essence.COAL);
        FLOWING_COAL = new MineralFluid.Flowing(Essence.COAL);
        COPPER = new MineralFluid.Source(Essence.COPPER);
        FLOWING_COPPER = new MineralFluid.Flowing(Essence.COPPER);
        LAPIS = new MineralFluid.Source(Essence.LAPIS);
        FLOWING_LAPIS = new MineralFluid.Flowing(Essence.LAPIS);
        IRON = new MineralFluid.Source(Essence.IRON);
        FLOWING_IRON = new MineralFluid.Flowing(Essence.IRON);
        GOLD = new MineralFluid.Source(Essence.GOLD);
        FLOWING_GOLD = new MineralFluid.Flowing(Essence.GOLD);
        REDSTONE = new MineralFluid.Source(Essence.REDSTONE);
        FLOWING_REDSTONE = new MineralFluid.Flowing(Essence.REDSTONE);
        DIAMOND = new MineralFluid.Source(Essence.DIAMOND);
        FLOWING_DIAMOND = new MineralFluid.Flowing(Essence.DIAMOND);
        EMERALD = new MineralFluid.Source(Essence.EMERALD);
        FLOWING_EMERALD = new MineralFluid.Flowing(Essence.EMERALD);
        QUARTZ = new MineralFluid.Source(Essence.QUARTZ);
        FLOWING_QUARTZ = new MineralFluid.Flowing(Essence.QUARTZ);
        NETHERITE = new MineralFluid.Source(Essence.NETHERITE);
        FLOWING_NETHERITE = new MineralFluid.Flowing(Essence.NETHERITE);
    }
}
