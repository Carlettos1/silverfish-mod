package com.carlettos.silverfishmod.listas;

import com.carlettos.silverfishmod.util.Essence;
import com.carlettos.silverfishmod.world.fluid.EssenceFluid;

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
        COAL = new EssenceFluid.Source(Essence.COAL);
        FLOWING_COAL = new EssenceFluid.Flowing(Essence.COAL);
        COPPER = new EssenceFluid.Source(Essence.COPPER);
        FLOWING_COPPER = new EssenceFluid.Flowing(Essence.COPPER);
        LAPIS = new EssenceFluid.Source(Essence.LAPIS);
        FLOWING_LAPIS = new EssenceFluid.Flowing(Essence.LAPIS);
        IRON = new EssenceFluid.Source(Essence.IRON);
        FLOWING_IRON = new EssenceFluid.Flowing(Essence.IRON);
        GOLD = new EssenceFluid.Source(Essence.GOLD);
        FLOWING_GOLD = new EssenceFluid.Flowing(Essence.GOLD);
        REDSTONE = new EssenceFluid.Source(Essence.REDSTONE);
        FLOWING_REDSTONE = new EssenceFluid.Flowing(Essence.REDSTONE);
        DIAMOND = new EssenceFluid.Source(Essence.DIAMOND);
        FLOWING_DIAMOND = new EssenceFluid.Flowing(Essence.DIAMOND);
        EMERALD = new EssenceFluid.Source(Essence.EMERALD);
        FLOWING_EMERALD = new EssenceFluid.Flowing(Essence.EMERALD);
        QUARTZ = new EssenceFluid.Source(Essence.QUARTZ);
        FLOWING_QUARTZ = new EssenceFluid.Flowing(Essence.QUARTZ);
        NETHERITE = new EssenceFluid.Source(Essence.NETHERITE);
        FLOWING_NETHERITE = new EssenceFluid.Flowing(Essence.NETHERITE);
    }
}
