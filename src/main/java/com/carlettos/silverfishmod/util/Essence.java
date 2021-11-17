package com.carlettos.silverfishmod.util;

import com.carlettos.silverfishmod.listas.ListaBloques;
import com.carlettos.silverfishmod.listas.ListaFluidos;
import com.carlettos.silverfishmod.listas.ListaItems;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Fluid;

public enum Essence {
    COAL(Items.COAL),
    COPPER(Items.RAW_COPPER),
    LAPIS(Items.LAPIS_LAZULI),
    IRON(Items.RAW_IRON),
    GOLD(Items.RAW_GOLD),
    REDSTONE(Items.REDSTONE),
    DIAMOND(Items.DIAMOND),
    EMERALD(Items.EMERALD),
    QUARTZ(Items.QUARTZ),
    NETHERITE(Items.NETHERITE_SCRAP);
    
    public final Item item;
    private Essence(Item item) {
        this.item = item;
    }
    
    public static final Essence getEssenceFromMineral(Mineral mineral) {
        switch (mineral) {
        case COAL:
        case DEEPSLATE_COAL:
            return COAL;
        case COPPER:
        case DEEPSLATE_COPPER:
            return COPPER;
        case LAPIS:
        case DEEPSLATE_LAPIS:
            return LAPIS;
        case IRON:
        case DEEPSLATE_IRON:
            return IRON;
        case GOLD:
        case DEEPSLATE_GOLD:
        case NETHER_GOLD:
            return GOLD;
        case REDSTONE:
        case DEEPSLATE_REDSTONE:
            return REDSTONE;
        case DIAMOND:
        case DEEPSLATE_DIAMOND:
            return DIAMOND;
        case EMERALD:
        case DEEPSLATE_EMERALD:
            return EMERALD;
        case QUARTZ:
            return QUARTZ;
        case NETHERITE:
            return NETHERITE;
        default:
            throw new IllegalArgumentException("No essence for mineral: " + mineral);
        }
    }
    
    public static Essence getFromItem(Item item) {
        for (Essence mineralessence : Essence.values()) {
            if(mineralessence.item.equals(item)) {
                return mineralessence;
            }
        }
        throw new IllegalArgumentException("No essence for item: " + item);
    }

    
    public Block getFluidBlock() {
        switch (this) {
        case COAL:
            return ListaBloques.COAL;
        case COPPER:
            return ListaBloques.COPPER;
        case LAPIS:
            return ListaBloques.LAPIS;
        case IRON:
            return ListaBloques.IRON;
        case GOLD:
            return ListaBloques.GOLD;
        case REDSTONE:
            return ListaBloques.REDSTONE;
        case DIAMOND:
            return ListaBloques.DIAMOND;
        case EMERALD:
            return ListaBloques.EMERALD;
        case QUARTZ:
            return ListaBloques.QUARTZ;
        case NETHERITE:
            return ListaBloques.NETHERITE;
        default:
            throw new IllegalArgumentException("No fluid block for : " + this);
        }
    }
    
    public Fluid getFluidSource() {
        switch (this) {
        case COAL:
            return ListaFluidos.COAL;
        case COPPER:
            return ListaFluidos.COPPER;
        case LAPIS:
            return ListaFluidos.LAPIS;
        case IRON:
            return ListaFluidos.IRON;
        case GOLD:
            return ListaFluidos.GOLD;
        case REDSTONE:
            return ListaFluidos.REDSTONE;
        case DIAMOND:
            return ListaFluidos.DIAMOND;
        case EMERALD:
            return ListaFluidos.EMERALD;
        case QUARTZ:
            return ListaFluidos.QUARTZ;
        case NETHERITE:
            return ListaFluidos.NETHERITE;
        default:
            throw new IllegalArgumentException("No fluid source for : " + this);
        }
    }
    
    public Fluid getFluidFlowing() {
        switch (this) {
        case COAL:
            return ListaFluidos.FLOWING_COAL;
        case COPPER:
            return ListaFluidos.FLOWING_COPPER;
        case LAPIS:
            return ListaFluidos.FLOWING_LAPIS;
        case IRON:
            return ListaFluidos.FLOWING_IRON;
        case GOLD:
            return ListaFluidos.FLOWING_GOLD;
        case REDSTONE:
            return ListaFluidos.FLOWING_REDSTONE;
        case DIAMOND:
            return ListaFluidos.FLOWING_DIAMOND;
        case EMERALD:
            return ListaFluidos.FLOWING_EMERALD;
        case QUARTZ:
            return ListaFluidos.FLOWING_QUARTZ;
        case NETHERITE:
            return ListaFluidos.FLOWING_NETHERITE;
        default:
            throw new IllegalArgumentException("No flowing fluid for : " + this);
        }
    }
    
    public Item getFluidBucket() {
        switch (this) {
        case COAL:
            return ListaItems.COAL_BUCKET;
        case COPPER:
            return ListaItems.COPPER_BUCKET;
        case LAPIS:
            return ListaItems.LAPIS_BUCKET;
        case IRON:
            return ListaItems.IRON_BUCKET;
        case GOLD:
            return ListaItems.GOLD_BUCKET;
        case REDSTONE:
            return ListaItems.REDSTONE_BUCKET;
        case DIAMOND:
            return ListaItems.DIAMOND_BUCKET;
        case EMERALD:
            return ListaItems.EMERALD_BUCKET;
        case QUARTZ:
            return ListaItems.QUARTZ_BUCKET;
        case NETHERITE:
            return ListaItems.NETHERITE_BUCKET;
        default:
            throw new IllegalArgumentException("No fluid bucket for : " + this);
        }
    }

}
