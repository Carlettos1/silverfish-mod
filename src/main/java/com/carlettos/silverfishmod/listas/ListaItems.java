package com.carlettos.silverfishmod.listas;

import com.carlettos.silverfishmod.entity.egg.MineralEgg;
import com.carlettos.silverfishmod.entity.silverfish.MineralSilverfish;
import com.carlettos.silverfishmod.item.Detector;
import com.carlettos.silverfishmod.item.SilverfishAwakener;
import com.carlettos.silverfishmod.item.SilverfishedEssence;
import com.carlettos.silverfishmod.util.Essence;
import com.carlettos.silverfishmod.util.Util;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.FlowingFluid;

public class ListaItems {
    public static final Item DETECTOR;
    public static final Item SILVERFISH_AWAKENER;
    public static final Item COAL_BUCKET;
    public static final Item COPPER_BUCKET;
    public static final Item LAPIS_BUCKET;
    public static final Item IRON_BUCKET;
    public static final Item GOLD_BUCKET;
    public static final Item REDSTONE_BUCKET;
    public static final Item DIAMOND_BUCKET;
    public static final Item EMERALD_BUCKET;
    public static final Item QUARTZ_BUCKET;
    public static final Item NETHERITE_BUCKET;
    
    //Spawn eggs silvefishs
    public static final Item COAL_SILVERFISH_SPAWN_EGG;
    public static final Item DEEPSLATE_COAL_SILVERFISH_SPAWN_EGG;
    public static final Item COPPER_SILVERFISH_SPAWN_EGG;
    public static final Item DEEPSLATE_COPPER_SILVERFISH_SPAWN_EGG;
    public static final Item LAPIS_SILVERFISH_SPAWN_EGG;
    public static final Item DEEPSLATE_LAPIS_SILVERFISH_SPAWN_EGG;
    public static final Item IRON_SILVERFISH_SPAWN_EGG;
    public static final Item DEEPSLATE_IRON_SILVERFISH_SPAWN_EGG;
    public static final Item GOLD_SILVERFISH_SPAWN_EGG;
    public static final Item DEEPSLATE_GOLD_SILVERFISH_SPAWN_EGG;
    public static final Item NETHER_GOLD_SILVERFISH_SPAWN_EGG;
    public static final Item REDSTONE_SILVERFISH_SPAWN_EGG;
    public static final Item DEEPSLATE_REDSTONE_SILVERFISH_SPAWN_EGG;
    public static final Item DIAMOND_SILVERFISH_SPAWN_EGG;
    public static final Item DEEPSLATE_DIAMOND_SILVERFISH_SPAWN_EGG;
    public static final Item EMERALD_SILVERFISH_SPAWN_EGG;
    public static final Item DEEPSLATE_EMERALD_SILVERFISH_SPAWN_EGG;
    public static final Item QUARTZ_SILVERFISH_SPAWN_EGG;
    public static final Item NETHERITE_SILVERFISH_SPAWN_EGG;
    
    //Spawn eggs eggs
    public static final Item COAL_SILVERFISH_EGG_SPAWN_EGG;
    public static final Item DEEPSLATE_COAL_SILVERFISH_EGG_SPAWN_EGG;
    public static final Item COPPER_SILVERFISH_EGG_SPAWN_EGG;
    public static final Item DEEPSLATE_COPPER_SILVERFISH_EGG_SPAWN_EGG;
    public static final Item LAPIS_SILVERFISH_EGG_SPAWN_EGG;
    public static final Item DEEPSLATE_LAPIS_SILVERFISH_EGG_SPAWN_EGG;
    public static final Item IRON_SILVERFISH_EGG_SPAWN_EGG;
    public static final Item DEEPSLATE_IRON_SILVERFISH_EGG_SPAWN_EGG;
    public static final Item GOLD_SILVERFISH_EGG_SPAWN_EGG;
    public static final Item DEEPSLATE_GOLD_SILVERFISH_EGG_SPAWN_EGG;
    public static final Item NETHER_GOLD_SILVERFISH_EGG_SPAWN_EGG;
    public static final Item REDSTONE_SILVERFISH_EGG_SPAWN_EGG;
    public static final Item DEEPSLATE_REDSTONE_SILVERFISH_EGG_SPAWN_EGG;
    public static final Item DIAMOND_SILVERFISH_EGG_SPAWN_EGG;
    public static final Item DEEPSLATE_DIAMOND_SILVERFISH_EGG_SPAWN_EGG;
    public static final Item EMERALD_SILVERFISH_EGG_SPAWN_EGG;
    public static final Item DEEPSLATE_EMERALD_SILVERFISH_EGG_SPAWN_EGG;
    public static final Item QUARTZ_SILVERFISH_EGG_SPAWN_EGG;
    public static final Item NETHERITE_SILVERFISH_EGG_SPAWN_EGG;
    
    //Ores
    public static final Item INFESTED_COAL_ORE;
    public static final Item INFESTED_DEEPSLATE_COAL_ORE;
    public static final Item INFESTED_COPPER_ORE;
    public static final Item INFESTED_DEEPSLATE_COPPER_ORE;
    public static final Item INFESTED_LAPIS_ORE;
    public static final Item INFESTED_DEEPSLATE_LAPIS_ORE;
    public static final Item INFESTED_IRON_ORE;
    public static final Item INFESTED_DEEPSLATE_IRON_ORE;
    public static final Item INFESTED_GOLD_ORE;
    public static final Item INFESTED_DEEPSLATE_GOLD_ORE;
    public static final Item INFESTED_NETHER_GOLD_ORE;
    public static final Item INFESTED_REDSTONE_ORE;
    public static final Item INFESTED_DEEPSLATE_REDSTONE_ORE;
    public static final Item INFESTED_DIAMOND_ORE;
    public static final Item INFESTED_DEEPSLATE_DIAMOND_ORE;
    public static final Item INFESTED_EMERALD_ORE;
    public static final Item INFESTED_DEEPSLATE_EMERALD_ORE;
    public static final Item INFESTED_NETHER_QUARTZ_ORE;
    public static final Item INFESTED_ANCIENT_DEBRIS;
    
    //SilverfishedEssences
    public static final Item SILVERFISHED_COAL;
    public static final Item SILVERFISHED_COPPER;
    public static final Item SILVERFISHED_LAPIS;
    public static final Item SILVERFISHED_IRON;
    public static final Item SILVERFISHED_GOLD;
    public static final Item SILVERFISHED_REDSTONE;
    public static final Item SILVERFISHED_DIAMOND;
    public static final Item SILVERFISHED_EMERALD;
    public static final Item SILVERFISHED_QUARTZ;
    public static final Item SILVERFISHED_NETHERITE;
    
    static {
        DETECTOR = new Detector(new Item.Properties().tab(Util.GRUPO).defaultDurability(1500));
        SILVERFISH_AWAKENER = new SilverfishAwakener();
        
        COAL_BUCKET = createBucket(ListaFluidos.COAL);
        COPPER_BUCKET = createBucket(ListaFluidos.COPPER);
        LAPIS_BUCKET = createBucket(ListaFluidos.LAPIS);
        IRON_BUCKET = createBucket(ListaFluidos.IRON);
        GOLD_BUCKET = createBucket(ListaFluidos.GOLD);
        REDSTONE_BUCKET = createBucket(ListaFluidos.REDSTONE);
        DIAMOND_BUCKET = createBucket(ListaFluidos.DIAMOND);
        EMERALD_BUCKET = createBucket(ListaFluidos.EMERALD);
        QUARTZ_BUCKET = createBucket(ListaFluidos.QUARTZ);
        NETHERITE_BUCKET = createBucket(ListaFluidos.NETHERITE);
        
        COAL_SILVERFISH_SPAWN_EGG = createSilverfishSpawnEgg(ListaEntidades.COAL_SILVERFISH, 0xa5a5a5, 0x000000);
        DEEPSLATE_COAL_SILVERFISH_SPAWN_EGG = createSilverfishSpawnEgg(ListaEntidades.DEEPSLATE_COAL_SILVERFISH, 0x555555, 0x000000);
        COPPER_SILVERFISH_SPAWN_EGG = createSilverfishSpawnEgg(ListaEntidades.COPPER_SILVERFISH, 0xa5a5a5, 0xdd5040);
        DEEPSLATE_COPPER_SILVERFISH_SPAWN_EGG = createSilverfishSpawnEgg(ListaEntidades.DEEPSLATE_COPPER_SILVERFISH, 0x555555, 0xdd5040);
        LAPIS_SILVERFISH_SPAWN_EGG = createSilverfishSpawnEgg(ListaEntidades.LAPIS_SILVERFISH, 0xa5a5a5, 0x0000ff);
        DEEPSLATE_LAPIS_SILVERFISH_SPAWN_EGG = createSilverfishSpawnEgg(ListaEntidades.DEEPSLATE_LAPIS_SILVERFISH, 0x555555, 0x0000ff);
        IRON_SILVERFISH_SPAWN_EGG = createSilverfishSpawnEgg(ListaEntidades.IRON_SILVERFISH, 0xa5a5a5, 0xe0e0e0);
        DEEPSLATE_IRON_SILVERFISH_SPAWN_EGG = createSilverfishSpawnEgg(ListaEntidades.DEEPSLATE_IRON_SILVERFISH, 0x555555, 0xe0e0e0);
        GOLD_SILVERFISH_SPAWN_EGG = createSilverfishSpawnEgg(ListaEntidades.GOLD_SILVERFISH, 0xa5a5a5, 0xffff00);
        DEEPSLATE_GOLD_SILVERFISH_SPAWN_EGG = createSilverfishSpawnEgg(ListaEntidades.DEEPSLATE_GOLD_SILVERFISH, 0x555555, 0xffff00);
        NETHER_GOLD_SILVERFISH_SPAWN_EGG = createSilverfishSpawnEgg(ListaEntidades.NETHER_GOLD_SILVERFISH, 0xd53333, 0xffff00);
        REDSTONE_SILVERFISH_SPAWN_EGG = createSilverfishSpawnEgg(ListaEntidades.REDSTONE_SILVERFISH, 0xa5a5a5, 0xff0000);
        DEEPSLATE_REDSTONE_SILVERFISH_SPAWN_EGG = createSilverfishSpawnEgg(ListaEntidades.DEEPSLATE_REDSTONE_SILVERFISH, 0x555555, 0xff0000);
        DIAMOND_SILVERFISH_SPAWN_EGG = createSilverfishSpawnEgg(ListaEntidades.DIAMOND_SILVERFISH, 0xa5a5a5, 0x00ffff);
        DEEPSLATE_DIAMOND_SILVERFISH_SPAWN_EGG = createSilverfishSpawnEgg(ListaEntidades.DEEPSLATE_DIAMOND_SILVERFISH, 0x555555, 0x00ffff);
        EMERALD_SILVERFISH_SPAWN_EGG = createSilverfishSpawnEgg(ListaEntidades.EMERALD_SILVERFISH, 0xa5a5a5, 0x00ff00);
        DEEPSLATE_EMERALD_SILVERFISH_SPAWN_EGG = createSilverfishSpawnEgg(ListaEntidades.DEEPSLATE_EMERALD_SILVERFISH, 0x555555, 0x00ff00);
        QUARTZ_SILVERFISH_SPAWN_EGG = createSilverfishSpawnEgg(ListaEntidades.QUARTZ_SILVERFISH, 0xd53333, 0xf5f5f5);
        NETHERITE_SILVERFISH_SPAWN_EGG = createSilverfishSpawnEgg(ListaEntidades.NETHERITE_SILVERFISH, 0xd53333, 0x5D342C);
        
        COAL_SILVERFISH_EGG_SPAWN_EGG = createEggSpawnEgg(ListaEntidades.COAL_SILVERFISH_EGG, 0xa5a5a5, 0x000000);
        DEEPSLATE_COAL_SILVERFISH_EGG_SPAWN_EGG = createEggSpawnEgg(ListaEntidades.DEEPSLATE_COAL_SILVERFISH_EGG, 0x555555, 0x000000);
        COPPER_SILVERFISH_EGG_SPAWN_EGG = createEggSpawnEgg(ListaEntidades.COPPER_SILVERFISH_EGG, 0xa5a5a5, 0xdd5040);
        DEEPSLATE_COPPER_SILVERFISH_EGG_SPAWN_EGG = createEggSpawnEgg(ListaEntidades.DEEPSLATE_COPPER_SILVERFISH_EGG, 0x555555, 0xdd5040);
        LAPIS_SILVERFISH_EGG_SPAWN_EGG = createEggSpawnEgg(ListaEntidades.LAPIS_SILVERFISH_EGG, 0xa5a5a5, 0x0000ff);
        DEEPSLATE_LAPIS_SILVERFISH_EGG_SPAWN_EGG = createEggSpawnEgg(ListaEntidades.DEEPSLATE_LAPIS_SILVERFISH_EGG, 0x555555, 0x0000ff);
        IRON_SILVERFISH_EGG_SPAWN_EGG = createEggSpawnEgg(ListaEntidades.IRON_SILVERFISH_EGG, 0xa5a5a5, 0xe0e0e0);
        DEEPSLATE_IRON_SILVERFISH_EGG_SPAWN_EGG = createEggSpawnEgg(ListaEntidades.DEEPSLATE_IRON_SILVERFISH_EGG, 0x555555, 0xe0e0e0);
        GOLD_SILVERFISH_EGG_SPAWN_EGG = createEggSpawnEgg(ListaEntidades.GOLD_SILVERFISH_EGG, 0xa5a5a5, 0xffff00);
        DEEPSLATE_GOLD_SILVERFISH_EGG_SPAWN_EGG = createEggSpawnEgg(ListaEntidades.DEEPSLATE_GOLD_SILVERFISH_EGG, 0x555555, 0xffff00);
        NETHER_GOLD_SILVERFISH_EGG_SPAWN_EGG = createEggSpawnEgg(ListaEntidades.NETHER_GOLD_SILVERFISH_EGG, 0xd53333, 0xffff00);
        REDSTONE_SILVERFISH_EGG_SPAWN_EGG = createEggSpawnEgg(ListaEntidades.REDSTONE_SILVERFISH_EGG, 0xa5a5a5, 0xff0000);
        DEEPSLATE_REDSTONE_SILVERFISH_EGG_SPAWN_EGG = createEggSpawnEgg(ListaEntidades.DEEPSLATE_REDSTONE_SILVERFISH_EGG, 0x555555, 0xff0000);
        DIAMOND_SILVERFISH_EGG_SPAWN_EGG = createEggSpawnEgg(ListaEntidades.DIAMOND_SILVERFISH_EGG, 0xa5a5a5, 0x00ffff);
        DEEPSLATE_DIAMOND_SILVERFISH_EGG_SPAWN_EGG = createEggSpawnEgg(ListaEntidades.DEEPSLATE_DIAMOND_SILVERFISH_EGG, 0x555555, 0x00ffff);
        EMERALD_SILVERFISH_EGG_SPAWN_EGG = createEggSpawnEgg(ListaEntidades.EMERALD_SILVERFISH_EGG, 0xa5a5a5, 0x00ff00);
        DEEPSLATE_EMERALD_SILVERFISH_EGG_SPAWN_EGG = createEggSpawnEgg(ListaEntidades.DEEPSLATE_EMERALD_SILVERFISH_EGG, 0x555555, 0x00ff00);
        QUARTZ_SILVERFISH_EGG_SPAWN_EGG = createEggSpawnEgg(ListaEntidades.QUARTZ_SILVERFISH_EGG, 0xd53333, 0xf5f5f5);
        NETHERITE_SILVERFISH_EGG_SPAWN_EGG = createEggSpawnEgg(ListaEntidades.NETHERITE_SILVERFISH_EGG, 0xd53333, 0x5D342C);
        
        INFESTED_COAL_ORE = createBlockItem(ListaBloques.INFESTED_COAL_ORE);
        INFESTED_DEEPSLATE_COAL_ORE = createBlockItem(ListaBloques.INFESTED_DEEPSLATE_COAL_ORE);
        INFESTED_COPPER_ORE = createBlockItem(ListaBloques.INFESTED_COPPER_ORE);
        INFESTED_DEEPSLATE_COPPER_ORE = createBlockItem(ListaBloques.INFESTED_DEEPSLATE_COPPER_ORE);
        INFESTED_LAPIS_ORE = createBlockItem(ListaBloques.INFESTED_LAPIS_ORE);
        INFESTED_DEEPSLATE_LAPIS_ORE = createBlockItem(ListaBloques.INFESTED_DEEPSLATE_LAPIS_ORE);
        INFESTED_IRON_ORE = createBlockItem(ListaBloques.INFESTED_IRON_ORE);
        INFESTED_DEEPSLATE_IRON_ORE = createBlockItem(ListaBloques.INFESTED_DEEPSLATE_IRON_ORE);
        INFESTED_GOLD_ORE = createBlockItem(ListaBloques.INFESTED_GOLD_ORE);
        INFESTED_DEEPSLATE_GOLD_ORE = createBlockItem(ListaBloques.INFESTED_DEEPSLATE_GOLD_ORE);
        INFESTED_NETHER_GOLD_ORE = createBlockItem(ListaBloques.INFESTED_NETHER_GOLD_ORE);
        INFESTED_REDSTONE_ORE = createBlockItem(ListaBloques.INFESTED_REDSTONE_ORE);
        INFESTED_DEEPSLATE_REDSTONE_ORE = createBlockItem(ListaBloques.INFESTED_DEEPSLATE_REDSTONE_ORE);
        INFESTED_DIAMOND_ORE = createBlockItem(ListaBloques.INFESTED_DIAMOND_ORE);
        INFESTED_DEEPSLATE_DIAMOND_ORE = createBlockItem(ListaBloques.INFESTED_DEEPSLATE_DIAMOND_ORE);
        INFESTED_EMERALD_ORE = createBlockItem(ListaBloques.INFESTED_EMERALD_ORE);
        INFESTED_DEEPSLATE_EMERALD_ORE = createBlockItem(ListaBloques.INFESTED_DEEPSLATE_EMERALD_ORE);
        INFESTED_NETHER_QUARTZ_ORE = createBlockItem(ListaBloques.INFESTED_NETHER_QUARTZ_ORE);
        INFESTED_ANCIENT_DEBRIS = createBlockItem(ListaBloques.INFESTED_ANCIENT_DEBRIS);

        SILVERFISHED_COAL = new SilverfishedEssence(Essence.COAL);
        SILVERFISHED_COPPER = new SilverfishedEssence(Essence.COPPER);
        SILVERFISHED_LAPIS = new SilverfishedEssence(Essence.LAPIS);
        SILVERFISHED_IRON = new SilverfishedEssence(Essence.IRON);
        SILVERFISHED_GOLD = new SilverfishedEssence(Essence.GOLD);
        SILVERFISHED_REDSTONE = new SilverfishedEssence(Essence.REDSTONE);
        SILVERFISHED_DIAMOND = new SilverfishedEssence(Essence.DIAMOND);
        SILVERFISHED_EMERALD = new SilverfishedEssence(Essence.EMERALD);
        SILVERFISHED_QUARTZ = new SilverfishedEssence(Essence.QUARTZ);
        SILVERFISHED_NETHERITE = new SilverfishedEssence(Essence.NETHERITE);
    }
    
    public static final BlockItem createBlockItem(Block block) {
        return new BlockItem(block, new Item.Properties().tab(Util.GRUPO));
    }

    @SuppressWarnings("deprecation") //content == null ????? 
    public static final SpawnEggItem createEggSpawnEgg(EntityType<? extends MineralEgg> entity, int backgroundColor, int highlightColor) {
        return new SpawnEggItem(entity, backgroundColor, highlightColor, new Item.Properties().tab(Util.GRUPO));
    }

    @SuppressWarnings("deprecation") //content == null ????? 
    public static final SpawnEggItem createSilverfishSpawnEgg(EntityType<? extends MineralSilverfish> entity, int backgroundColor, int highlightColor) {
        return new SpawnEggItem(entity, backgroundColor, highlightColor, new Item.Properties().tab(Util.GRUPO));
    }

    @SuppressWarnings("deprecation") //content == null ????? 
    public static final BucketItem createBucket(FlowingFluid fluid) {
        return new BucketItem(fluid, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).tab(Util.GRUPO));
    }
}
