package com.carlettos.silverfishmod.util;

import com.carlettos.silverfishmod.listas.ListaBloques;
import com.carlettos.silverfishmod.listas.ListaEntidades;
import com.carlettos.silverfishmod.mob.silverfish.MineralSilverfish;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

public enum Mineral {
    NINGUNO             (Blocks.AIR,                     Fuerza.DEBIL,           0),
    COAL                (Blocks.COAL_ORE,                Fuerza.DEBIL,           5),
    DEEPSLATE_COAL      (Blocks.DEEPSLATE_COAL_ORE,      Fuerza.DEBIL,           10),
    COPPER              (Blocks.COPPER_ORE,              Fuerza.FUERTE,          10),
    DEEPSLATE_COPPER    (Blocks.DEEPSLATE_COPPER_ORE,    Fuerza.FUERTE,          15),
    LAPIS               (Blocks.LAPIS_ORE,               Fuerza.DEBIL,           10),
    DEEPSLATE_LAPIS     (Blocks.DEEPSLATE_LAPIS_ORE,     Fuerza.FUERTE,          15),
    IRON                (Blocks.IRON_ORE,                Fuerza.FUERTE,          15),
    DEEPSLATE_IRON      (Blocks.DEEPSLATE_IRON_ORE,      Fuerza.SUPER_FUERTE,    20),
    GOLD                (Blocks.GOLD_ORE,                Fuerza.DEBIL,           15),
    DEEPSLATE_GOLD      (Blocks.DEEPSLATE_GOLD_ORE,      Fuerza.FUERTE,          20),
    NETHER_GOLD         (Blocks.NETHER_GOLD_ORE,         Fuerza.DEBIL,           5),
    REDSTONE            (Blocks.REDSTONE_ORE,            Fuerza.DEBIL,           10),
    DEEPSLATE_REDSTONE  (Blocks.DEEPSLATE_REDSTONE_ORE,  Fuerza.FUERTE,          15),
    DIAMOND             (Blocks.DIAMOND_ORE,             Fuerza.FUERTE,          15),
    DEEPSLATE_DIAMOND   (Blocks.DEEPSLATE_DIAMOND_ORE,   Fuerza.SUPER_FUERTE,    20),
    EMERALD             (Blocks.EMERALD_ORE,             Fuerza.FUERTE,          15),
    DEEPSLATE_EMERALD   (Blocks.DEEPSLATE_EMERALD_ORE,   Fuerza.SUPER_FUERTE,    20),
    QUARTZ              (Blocks.NETHER_QUARTZ_ORE,       Fuerza.DEBIL,           5),
    NETHERITE           (Blocks.ANCIENT_DEBRIS,          Fuerza.SUPER_FUERTE,    50);
    
    public final float contenido;
    public final Block bloque;
    public final Fuerza fuerza;
    
    //TODO: peso configurable
    private Mineral(Block bloque, Fuerza fuerza, float peso) {
        this.bloque = bloque;
        this.contenido = peso;
        this.fuerza = fuerza;
    }
    
    public static Mineral getFromBlock(Block bloque) {
        for (Mineral mineral : Mineral.values()) {
            if(mineral.bloque.equals(bloque)) {
                return mineral;
            }
        }
        return NINGUNO;
    }
    
    public Block getInfestedBlock() {
        switch (this) {
            case COAL:
                return ListaBloques.INFESTED_COAL_ORE;
            case DEEPSLATE_COAL:
                return ListaBloques.INFESTED_DEEPSLATE_COAL_ORE;
            case COPPER:
                return ListaBloques.INFESTED_COPPER_ORE;
            case DEEPSLATE_COPPER:
                return ListaBloques.INFESTED_DEEPSLATE_COPPER_ORE;
            case LAPIS:
                return ListaBloques.INFESTED_LAPIS_ORE;
            case DEEPSLATE_LAPIS:
                return ListaBloques.INFESTED_DEEPSLATE_LAPIS_ORE;
            case IRON:
                return ListaBloques.INFESTED_IRON_ORE;
            case DEEPSLATE_IRON:
                return ListaBloques.INFESTED_DEEPSLATE_IRON_ORE;
            case GOLD:
                return ListaBloques.INFESTED_GOLD_ORE;
            case DEEPSLATE_GOLD:
                return ListaBloques.INFESTED_DEEPSLATE_GOLD_ORE;
            case NETHER_GOLD:
                return ListaBloques.INFESTED_NETHER_GOLD_ORE;
            case REDSTONE:
                return ListaBloques.INFESTED_REDSTONE_ORE;
            case DEEPSLATE_REDSTONE:
                return ListaBloques.INFESTED_DEEPSLATE_REDSTONE_ORE;
            case DIAMOND:
                return ListaBloques.INFESTED_DIAMOND_ORE;
            case DEEPSLATE_DIAMOND:
                return ListaBloques.INFESTED_DEEPSLATE_DIAMOND_ORE;
            case EMERALD:
                return ListaBloques.INFESTED_EMERALD_ORE;
            case DEEPSLATE_EMERALD:
                return ListaBloques.INFESTED_DEEPSLATE_EMERALD_ORE;
            case QUARTZ:
                return ListaBloques.INFESTED_NETHER_QUARTZ_ORE;
            case NETHERITE:
                return ListaBloques.INFESTED_ANCIENT_DEBRIS;
            default:
                return Blocks.AIR;
        }
    }
    
    public EntityType<MineralSilverfish> getSilverfish(){
        switch (this) {
            case COAL:
                return ListaEntidades.COAL_SILVERFISH;
            case DEEPSLATE_COAL:
                return ListaEntidades.DEEPSLATE_COAL_SILVERFISH;
            case COPPER:
                return ListaEntidades.COPPER_SILVERFISH;
            case DEEPSLATE_COPPER:
                return ListaEntidades.DEEPSLATE_COPPER_SILVERFISH;
            case LAPIS:
                return ListaEntidades.LAPIS_SILVERFISH;
            case DEEPSLATE_LAPIS:
                return ListaEntidades.DEEPSLATE_LAPIS_SILVERFISH;
            case IRON:
                return ListaEntidades.IRON_SILVERFISH;
            case DEEPSLATE_IRON:
                return ListaEntidades.DEEPSLATE_IRON_SILVERFISH;
            case GOLD:
                return ListaEntidades.GOLD_SILVERFISH;
            case DEEPSLATE_GOLD:
                return ListaEntidades.DEEPSLATE_GOLD_SILVERFISH;
            case NETHER_GOLD:
                return ListaEntidades.NETHER_GOLD_SILVERFISH;
            case REDSTONE:
                return ListaEntidades.REDSTONE_SILVERFISH;
            case DEEPSLATE_REDSTONE:
                return ListaEntidades.DEEPSLATE_REDSTONE_SILVERFISH;
            case DIAMOND:
                return ListaEntidades.DIAMOND_SILVERFISH;
            case DEEPSLATE_DIAMOND:
                return ListaEntidades.DEEPSLATE_DIAMOND_SILVERFISH;
            case EMERALD:
                return ListaEntidades.EMERALD_SILVERFISH;
            case DEEPSLATE_EMERALD:
                return ListaEntidades.DEEPSLATE_EMERALD_SILVERFISH;
            case QUARTZ:
                return ListaEntidades.QUARTZ_SILVERFISH;
            case NETHERITE:
                return ListaEntidades.NETHERITE_SILVERFISH;
            default:
                return ListaEntidades.COAL_SILVERFISH;
        }
    }
}
