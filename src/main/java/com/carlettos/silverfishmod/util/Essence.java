package com.carlettos.silverfishmod.util;

import com.carlettos.silverfishmod.listas.ListaBloques;
import com.carlettos.silverfishmod.listas.ListaFluidos;
import com.carlettos.silverfishmod.listas.ListaItems;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.Fluids;

public enum Essence {
    NINGUNO(Items.AIR,                  (byte)-1),
    COAL(Items.COAL,                    (byte)0),
    COPPER(Items.RAW_COPPER,            (byte)1),
    LAPIS(Items.LAPIS_LAZULI,           (byte)2),
    IRON(Items.RAW_IRON,                (byte)3),
    GOLD(Items.RAW_GOLD,                (byte)4),
    REDSTONE(Items.REDSTONE,            (byte)5),
    DIAMOND(Items.DIAMOND,              (byte)6),
    EMERALD(Items.EMERALD,              (byte)7),
    QUARTZ(Items.QUARTZ,                (byte)8),
    NETHERITE(Items.NETHERITE_SCRAP,    (byte)9);

    public static final Essence FIRST = COAL;
    public static final Essence LAST = NETHERITE;
    
    public final Item item;
    public final byte index;
    private Essence(Item item, byte index) {
        this.index = index;
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
            return NINGUNO;
        }
    }
    
    public static Essence getFromItem(Item item) {
        for (Essence mineralessence : Essence.values()) {
            if(mineralessence.item.equals(item)) {
                return mineralessence;
            }
        }
        return NINGUNO;
    }
    
    public Block getFluidBlockFromMineral() {
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
            return Blocks.AIR;
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
            return Fluids.EMPTY;
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
            return Fluids.EMPTY;
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
            return Items.AIR;
        }
    }
}
