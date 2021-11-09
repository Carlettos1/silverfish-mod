package com.carlettos.silverfishmod.listas;

import com.carlettos.silverfishmod.item.Detector;
import com.carlettos.silverfishmod.item.SilverfishedEssence;
import com.carlettos.silverfishmod.util.Essence;
import com.carlettos.silverfishmod.util.Util;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.SpawnEggItem;

@SuppressWarnings("deprecation") //content == null ????? 
public class ListaItems {
    public static final Item DETECTOR;
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
    
    //Spawn eggs
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
        COAL_BUCKET = new BucketItem(ListaFluidos.COAL, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).tab(Util.GRUPO));
        COPPER_BUCKET = new BucketItem(ListaFluidos.COPPER, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).tab(Util.GRUPO));
        LAPIS_BUCKET = new BucketItem(ListaFluidos.LAPIS, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).tab(Util.GRUPO));
        IRON_BUCKET = new BucketItem(ListaFluidos.IRON, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).tab(Util.GRUPO));
        GOLD_BUCKET = new BucketItem(ListaFluidos.GOLD, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).tab(Util.GRUPO));
        REDSTONE_BUCKET = new BucketItem(ListaFluidos.REDSTONE, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).tab(Util.GRUPO));
        DIAMOND_BUCKET = new BucketItem(ListaFluidos.DIAMOND, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).tab(Util.GRUPO));
        EMERALD_BUCKET = new BucketItem(ListaFluidos.EMERALD, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).tab(Util.GRUPO));
        QUARTZ_BUCKET = new BucketItem(ListaFluidos.QUARTZ, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).tab(Util.GRUPO));
        NETHERITE_BUCKET = new BucketItem(ListaFluidos.NETHERITE, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).tab(Util.GRUPO));
        
        COAL_SILVERFISH_SPAWN_EGG = new SpawnEggItem(ListaEntidades.COAL_SILVERFISH, 0x000000, 0x000000, new Item.Properties().tab(Util.GRUPO));
        DEEPSLATE_COAL_SILVERFISH_SPAWN_EGG = new SpawnEggItem(ListaEntidades.DEEPSLATE_COAL_SILVERFISH, 0x000000, 0x000000, new Item.Properties().tab(Util.GRUPO));
        COPPER_SILVERFISH_SPAWN_EGG = new SpawnEggItem(ListaEntidades.COPPER_SILVERFISH, 0x000000, 0x000000, new Item.Properties().tab(Util.GRUPO));
        DEEPSLATE_COPPER_SILVERFISH_SPAWN_EGG = new SpawnEggItem(ListaEntidades.DEEPSLATE_COPPER_SILVERFISH, 0x000000, 0x000000, new Item.Properties().tab(Util.GRUPO));
        LAPIS_SILVERFISH_SPAWN_EGG = new SpawnEggItem(ListaEntidades.LAPIS_SILVERFISH, 0x000000, 0x000000, new Item.Properties().tab(Util.GRUPO));
        DEEPSLATE_LAPIS_SILVERFISH_SPAWN_EGG = new SpawnEggItem(ListaEntidades.DEEPSLATE_LAPIS_SILVERFISH, 0x000000, 0x000000, new Item.Properties().tab(Util.GRUPO));
        IRON_SILVERFISH_SPAWN_EGG = new SpawnEggItem(ListaEntidades.IRON_SILVERFISH, 0x000000, 0x000000, new Item.Properties().tab(Util.GRUPO));
        DEEPSLATE_IRON_SILVERFISH_SPAWN_EGG = new SpawnEggItem(ListaEntidades.DEEPSLATE_IRON_SILVERFISH, 0x000000, 0x000000, new Item.Properties().tab(Util.GRUPO));
        GOLD_SILVERFISH_SPAWN_EGG = new SpawnEggItem(ListaEntidades.GOLD_SILVERFISH, 0x000000, 0x000000, new Item.Properties().tab(Util.GRUPO));
        DEEPSLATE_GOLD_SILVERFISH_SPAWN_EGG = new SpawnEggItem(ListaEntidades.DEEPSLATE_GOLD_SILVERFISH, 0x000000, 0x000000, new Item.Properties().tab(Util.GRUPO));
        NETHER_GOLD_SILVERFISH_SPAWN_EGG = new SpawnEggItem(ListaEntidades.NETHER_GOLD_SILVERFISH, 0x000000, 0x000000, new Item.Properties().tab(Util.GRUPO));
        REDSTONE_SILVERFISH_SPAWN_EGG = new SpawnEggItem(ListaEntidades.REDSTONE_SILVERFISH, 0x000000, 0x000000, new Item.Properties().tab(Util.GRUPO));
        DEEPSLATE_REDSTONE_SILVERFISH_SPAWN_EGG = new SpawnEggItem(ListaEntidades.DEEPSLATE_REDSTONE_SILVERFISH, 0x000000, 0x000000, new Item.Properties().tab(Util.GRUPO));
        DIAMOND_SILVERFISH_SPAWN_EGG = new SpawnEggItem(ListaEntidades.DIAMOND_SILVERFISH, 0x000000, 0x000000, new Item.Properties().tab(Util.GRUPO));
        DEEPSLATE_DIAMOND_SILVERFISH_SPAWN_EGG = new SpawnEggItem(ListaEntidades.DEEPSLATE_DIAMOND_SILVERFISH, 0x000000, 0x000000, new Item.Properties().tab(Util.GRUPO));
        EMERALD_SILVERFISH_SPAWN_EGG = new SpawnEggItem(ListaEntidades.EMERALD_SILVERFISH, 0x000000, 0x000000, new Item.Properties().tab(Util.GRUPO));
        DEEPSLATE_EMERALD_SILVERFISH_SPAWN_EGG = new SpawnEggItem(ListaEntidades.DEEPSLATE_EMERALD_SILVERFISH, 0x000000, 0x000000, new Item.Properties().tab(Util.GRUPO));
        QUARTZ_SILVERFISH_SPAWN_EGG = new SpawnEggItem(ListaEntidades.QUARTZ_SILVERFISH, 0x000000, 0x000000, new Item.Properties().tab(Util.GRUPO));
        NETHERITE_SILVERFISH_SPAWN_EGG = new SpawnEggItem(ListaEntidades.NETHERITE_SILVERFISH, 0x000000, 0x000000, new Item.Properties().tab(Util.GRUPO));
        
        INFESTED_COAL_ORE = new BlockItem(ListaBloques.INFESTED_COAL_ORE, new Item.Properties().tab(Util.GRUPO));
        INFESTED_DEEPSLATE_COAL_ORE = new BlockItem(ListaBloques.INFESTED_DEEPSLATE_COAL_ORE, new Item.Properties().tab(Util.GRUPO));
        INFESTED_COPPER_ORE = new BlockItem(ListaBloques.INFESTED_COPPER_ORE, new Item.Properties().tab(Util.GRUPO));
        INFESTED_DEEPSLATE_COPPER_ORE = new BlockItem(ListaBloques.INFESTED_DEEPSLATE_COPPER_ORE, new Item.Properties().tab(Util.GRUPO));
        INFESTED_LAPIS_ORE = new BlockItem(ListaBloques.INFESTED_LAPIS_ORE, new Item.Properties().tab(Util.GRUPO));
        INFESTED_DEEPSLATE_LAPIS_ORE = new BlockItem(ListaBloques.INFESTED_DEEPSLATE_LAPIS_ORE, new Item.Properties().tab(Util.GRUPO));
        INFESTED_IRON_ORE = new BlockItem(ListaBloques.INFESTED_IRON_ORE, new Item.Properties().tab(Util.GRUPO));
        INFESTED_DEEPSLATE_IRON_ORE = new BlockItem(ListaBloques.INFESTED_DEEPSLATE_IRON_ORE, new Item.Properties().tab(Util.GRUPO));
        INFESTED_GOLD_ORE = new BlockItem(ListaBloques.INFESTED_GOLD_ORE, new Item.Properties().tab(Util.GRUPO));
        INFESTED_DEEPSLATE_GOLD_ORE = new BlockItem(ListaBloques.INFESTED_DEEPSLATE_GOLD_ORE, new Item.Properties().tab(Util.GRUPO));
        INFESTED_NETHER_GOLD_ORE = new BlockItem(ListaBloques.INFESTED_NETHER_GOLD_ORE, new Item.Properties().tab(Util.GRUPO));
        INFESTED_REDSTONE_ORE = new BlockItem(ListaBloques.INFESTED_REDSTONE_ORE, new Item.Properties().tab(Util.GRUPO));
        INFESTED_DEEPSLATE_REDSTONE_ORE = new BlockItem(ListaBloques.INFESTED_DEEPSLATE_REDSTONE_ORE, new Item.Properties().tab(Util.GRUPO));
        INFESTED_DIAMOND_ORE = new BlockItem(ListaBloques.INFESTED_DIAMOND_ORE, new Item.Properties().tab(Util.GRUPO));
        INFESTED_DEEPSLATE_DIAMOND_ORE = new BlockItem(ListaBloques.INFESTED_DEEPSLATE_DIAMOND_ORE, new Item.Properties().tab(Util.GRUPO));
        INFESTED_EMERALD_ORE = new BlockItem(ListaBloques.INFESTED_EMERALD_ORE, new Item.Properties().tab(Util.GRUPO));
        INFESTED_DEEPSLATE_EMERALD_ORE = new BlockItem(ListaBloques.INFESTED_DEEPSLATE_EMERALD_ORE, new Item.Properties().tab(Util.GRUPO));
        INFESTED_NETHER_QUARTZ_ORE = new BlockItem(ListaBloques.INFESTED_NETHER_QUARTZ_ORE, new Item.Properties().tab(Util.GRUPO));
        INFESTED_ANCIENT_DEBRIS = new BlockItem(ListaBloques.INFESTED_ANCIENT_DEBRIS, new Item.Properties().tab(Util.GRUPO));

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
}
