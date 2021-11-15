package com.carlettos.silverfishmod.listas;

import com.carlettos.silverfishmod.world.block.EssenceFluidBlock;
import com.carlettos.silverfishmod.world.block.EssenceTableBlock;
import com.carlettos.silverfishmod.world.block.SilverfishedOre;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.InfestedBlock;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Material;

public class ListaBloques {
    public static final Block ESSENCE_TABLE;
    
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
        ESSENCE_TABLE = new EssenceTableBlock(BlockBehaviour.Properties.of(Material.STONE).strength(3F).sound(SoundType.STONE));
        
        COAL = createLiquidBlock(ListaFluidos.COAL);
        COPPER = createLiquidBlock(ListaFluidos.COPPER);
        LAPIS = createLiquidBlock(ListaFluidos.LAPIS);
        IRON = createLiquidBlock(ListaFluidos.IRON);
        GOLD = createLiquidBlock(ListaFluidos.GOLD);
        REDSTONE = createLiquidBlock(ListaFluidos.REDSTONE);
        DIAMOND = createLiquidBlock(ListaFluidos.DIAMOND);
        EMERALD = createLiquidBlock(ListaFluidos.EMERALD);
        QUARTZ = createLiquidBlock(ListaFluidos.QUARTZ);
        NETHERITE = createLiquidBlock(ListaFluidos.NETHERITE);
        
        //FIXME: añadir al map BLOCK_BY_HOST_BLOCK de InfestedBlock de una forma más elegante.
        new InfestedBlock(Blocks.TUFF, BlockBehaviour.Properties.of(Material.STONE));
        new InfestedBlock(Blocks.GRAVEL, BlockBehaviour.Properties.of(Material.STONE));
        new InfestedBlock(Blocks.DIORITE, BlockBehaviour.Properties.of(Material.STONE));
        new InfestedBlock(Blocks.GRANITE, BlockBehaviour.Properties.of(Material.STONE));
        new InfestedBlock(Blocks.ANDESITE, BlockBehaviour.Properties.of(Material.STONE));
        new InfestedBlock(Blocks.DEEPSLATE, BlockBehaviour.Properties.of(Material.STONE));
        new InfestedBlock(Blocks.NETHERRACK, BlockBehaviour.Properties.of(Material.STONE));
        new InfestedBlock(Blocks.BLACKSTONE, BlockBehaviour.Properties.of(Material.STONE));
        
        INFESTED_COAL_ORE = createSilverfishedOre(Blocks.COAL_ORE);
        INFESTED_DEEPSLATE_COAL_ORE = createSilverfishedOre(Blocks.DEEPSLATE_COAL_ORE);
        INFESTED_COPPER_ORE = createSilverfishedOre(Blocks.COPPER_ORE);
        INFESTED_DEEPSLATE_COPPER_ORE = createSilverfishedOre(Blocks.DEEPSLATE_COPPER_ORE);
        INFESTED_LAPIS_ORE = createSilverfishedOre(Blocks.LAPIS_ORE);
        INFESTED_DEEPSLATE_LAPIS_ORE = createSilverfishedOre(Blocks.DEEPSLATE_LAPIS_ORE);
        INFESTED_IRON_ORE = createSilverfishedOre(Blocks.IRON_ORE);
        INFESTED_DEEPSLATE_IRON_ORE = createSilverfishedOre(Blocks.DEEPSLATE_IRON_ORE);
        INFESTED_GOLD_ORE = createSilverfishedOre(Blocks.GOLD_ORE);
        INFESTED_DEEPSLATE_GOLD_ORE = createSilverfishedOre(Blocks.DEEPSLATE_GOLD_ORE);
        INFESTED_NETHER_GOLD_ORE = createSilverfishedOre(Blocks.NETHER_GOLD_ORE);
        INFESTED_REDSTONE_ORE = createSilverfishedOre(Blocks.REDSTONE_ORE);
        INFESTED_DEEPSLATE_REDSTONE_ORE = createSilverfishedOre(Blocks.DEEPSLATE_REDSTONE_ORE);
        INFESTED_DIAMOND_ORE = createSilverfishedOre(Blocks.DIAMOND_ORE);
        INFESTED_DEEPSLATE_DIAMOND_ORE = createSilverfishedOre(Blocks.DEEPSLATE_DIAMOND_ORE);
        INFESTED_EMERALD_ORE = createSilverfishedOre(Blocks.EMERALD_ORE);
        INFESTED_DEEPSLATE_EMERALD_ORE = createSilverfishedOre(Blocks.DEEPSLATE_EMERALD_ORE);
        INFESTED_NETHER_QUARTZ_ORE = createSilverfishedOre(Blocks.NETHER_QUARTZ_ORE);
        INFESTED_ANCIENT_DEBRIS = createSilverfishedOre(Blocks.ANCIENT_DEBRIS);
    }
    
    public static final SilverfishedOre createSilverfishedOre(Block block) {
        return new SilverfishedOre(block, BlockBehaviour.Properties.of(Material.STONE));
    }

    //FIXME: cannot use supplier bcs this.fluid == null in that constructor
    public static final LiquidBlock createLiquidBlock(FlowingFluid fluid) {
        return new EssenceFluidBlock(fluid);
    }
}
