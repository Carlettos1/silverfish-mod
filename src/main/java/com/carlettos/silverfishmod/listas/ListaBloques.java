package com.carlettos.silverfishmod.listas;

import com.carlettos.silverfishmod.block.SilverfishedOre;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

@SuppressWarnings("deprecation") //TODO: cannot use supplier bcs this.fluid == null in that constructor
public class ListaBloques {
    public static final Block COAL;
    public static final Block COPPER;
    public static final Block LAPIS;
    public static final Block IRON;
    public static final Block GOLD;
    public static final Block REDSTONE;
    public static final Block DIAMOND;
    public static final Block EMERALD;
    public static final Block QUARTZ;
    public static final Block NETHERITE;
    
    public static final Block INFESTED_COAL_ORE;
    public static final Block INFESTED_DEEPSLATE_COAL_ORE;
    public static final Block INFESTED_COPPER_ORE;
    public static final Block INFESTED_DEEPSLATE_COPPER_ORE;
    public static final Block INFESTED_LAPIS_ORE;
    public static final Block INFESTED_DEEPSLATE_LAPIS_ORE;
    public static final Block INFESTED_IRON_ORE;
    public static final Block INFESTED_DEEPSLATE_IRON_ORE;
    public static final Block INFESTED_GOLD_ORE;
    public static final Block INFESTED_DEEPSLATE_GOLD_ORE;
    public static final Block INFESTED_NETHER_GOLD_ORE;
    public static final Block INFESTED_REDSTONE_ORE;
    public static final Block INFESTED_DEEPSLATE_REDSTONE_ORE;
    public static final Block INFESTED_DIAMOND_ORE;
    public static final Block INFESTED_DEEPSLATE_DIAMOND_ORE;
    public static final Block INFESTED_EMERALD_ORE;
    public static final Block INFESTED_DEEPSLATE_EMERALD_ORE;
    public static final Block INFESTED_NETHER_QUARTZ_ORE;
    public static final Block INFESTED_ANCIENT_DEBRIS;
    
    static {
        COAL = new LiquidBlock(ListaFluidos.COAL, BlockBehaviour.Properties.of(Material.WATER).noCollission().strength(100).noDrops());
        COPPER = new LiquidBlock(ListaFluidos.COPPER, BlockBehaviour.Properties.of(Material.WATER).noCollission().strength(100).noDrops());
        LAPIS = new LiquidBlock(ListaFluidos.LAPIS, BlockBehaviour.Properties.of(Material.WATER).noCollission().strength(100).noDrops());
        IRON = new LiquidBlock(ListaFluidos.IRON, BlockBehaviour.Properties.of(Material.WATER).noCollission().strength(100).noDrops());
        GOLD = new LiquidBlock(ListaFluidos.GOLD, BlockBehaviour.Properties.of(Material.WATER).noCollission().strength(100).noDrops());
        REDSTONE = new LiquidBlock(ListaFluidos.REDSTONE, BlockBehaviour.Properties.of(Material.WATER).noCollission().strength(100).noDrops());
        DIAMOND = new LiquidBlock(ListaFluidos.DIAMOND, BlockBehaviour.Properties.of(Material.WATER).noCollission().strength(100).noDrops());
        EMERALD = new LiquidBlock(ListaFluidos.EMERALD, BlockBehaviour.Properties.of(Material.WATER).noCollission().strength(100).noDrops());
        QUARTZ = new LiquidBlock(ListaFluidos.QUARTZ, BlockBehaviour.Properties.of(Material.WATER).noCollission().strength(100).noDrops());
        NETHERITE = new LiquidBlock(ListaFluidos.NETHERITE, BlockBehaviour.Properties.of(Material.WATER).noCollission().strength(100).noDrops());
        
        INFESTED_COAL_ORE = new SilverfishedOre(Blocks.COAL_ORE, BlockBehaviour.Properties.of(Material.CLAY));
        INFESTED_DEEPSLATE_COAL_ORE = new SilverfishedOre(Blocks.DEEPSLATE_COAL_ORE, BlockBehaviour.Properties.of(Material.CLAY));
        INFESTED_COPPER_ORE = new SilverfishedOre(Blocks.COPPER_ORE, BlockBehaviour.Properties.of(Material.CLAY));
        INFESTED_DEEPSLATE_COPPER_ORE = new SilverfishedOre(Blocks.DEEPSLATE_COPPER_ORE, BlockBehaviour.Properties.of(Material.CLAY));
        INFESTED_LAPIS_ORE = new SilverfishedOre(Blocks.LAPIS_ORE, BlockBehaviour.Properties.of(Material.CLAY));
        INFESTED_DEEPSLATE_LAPIS_ORE = new SilverfishedOre(Blocks.DEEPSLATE_LAPIS_ORE, BlockBehaviour.Properties.of(Material.CLAY));
        INFESTED_IRON_ORE = new SilverfishedOre(Blocks.IRON_ORE, BlockBehaviour.Properties.of(Material.CLAY));
        INFESTED_DEEPSLATE_IRON_ORE = new SilverfishedOre(Blocks.DEEPSLATE_IRON_ORE, BlockBehaviour.Properties.of(Material.CLAY));
        INFESTED_GOLD_ORE = new SilverfishedOre(Blocks.GOLD_ORE, BlockBehaviour.Properties.of(Material.CLAY));
        INFESTED_DEEPSLATE_GOLD_ORE = new SilverfishedOre(Blocks.DEEPSLATE_GOLD_ORE, BlockBehaviour.Properties.of(Material.CLAY));
        INFESTED_NETHER_GOLD_ORE = new SilverfishedOre(Blocks.NETHER_GOLD_ORE, BlockBehaviour.Properties.of(Material.CLAY));
        INFESTED_REDSTONE_ORE = new SilverfishedOre(Blocks.REDSTONE_ORE, BlockBehaviour.Properties.of(Material.CLAY));
        INFESTED_DEEPSLATE_REDSTONE_ORE = new SilverfishedOre(Blocks.DEEPSLATE_REDSTONE_ORE, BlockBehaviour.Properties.of(Material.CLAY));
        INFESTED_DIAMOND_ORE = new SilverfishedOre(Blocks.DIAMOND_ORE, BlockBehaviour.Properties.of(Material.CLAY));
        INFESTED_DEEPSLATE_DIAMOND_ORE = new SilverfishedOre(Blocks.DEEPSLATE_DIAMOND_ORE, BlockBehaviour.Properties.of(Material.CLAY));
        INFESTED_EMERALD_ORE = new SilverfishedOre(Blocks.EMERALD_ORE, BlockBehaviour.Properties.of(Material.CLAY));
        INFESTED_DEEPSLATE_EMERALD_ORE = new SilverfishedOre(Blocks.DEEPSLATE_EMERALD_ORE, BlockBehaviour.Properties.of(Material.CLAY));
        INFESTED_NETHER_QUARTZ_ORE = new SilverfishedOre(Blocks.NETHER_QUARTZ_ORE, BlockBehaviour.Properties.of(Material.CLAY));
        INFESTED_ANCIENT_DEBRIS = new SilverfishedOre(Blocks.ANCIENT_DEBRIS, BlockBehaviour.Properties.of(Material.CLAY));
    }
}
