package com.carlettos.silverfishmod.registry;

import com.carlettos.silverfishmod.listas.ListaItems;
import com.carlettos.silverfishmod.util.Util;

import net.minecraft.world.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD, modid=Util.MOD_ID)
public class RegistryItem {
    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> reg) {
        ListaItems.DETECTOR.setRegistryName(Util.getResLoc("detector"));
        ListaItems.SILVERFISH_AWAKENER.setRegistryName(Util.getResLoc("silverfish_awakener"));
        ListaItems.COAL_BUCKET.setRegistryName(Util.getResLoc("coal_bucket"));
        ListaItems.COPPER_BUCKET.setRegistryName(Util.getResLoc("copper_bucket"));
        ListaItems.LAPIS_BUCKET.setRegistryName(Util.getResLoc("lapis_bucket"));
        ListaItems.IRON_BUCKET.setRegistryName(Util.getResLoc("iron_bucket"));
        ListaItems.GOLD_BUCKET.setRegistryName(Util.getResLoc("gold_bucket"));
        ListaItems.REDSTONE_BUCKET.setRegistryName(Util.getResLoc("redstone_bucket"));
        ListaItems.DIAMOND_BUCKET.setRegistryName(Util.getResLoc("diamond_bucket"));
        ListaItems.EMERALD_BUCKET.setRegistryName(Util.getResLoc("emerald_bucket"));
        ListaItems.QUARTZ_BUCKET.setRegistryName(Util.getResLoc("quartz_bucket"));
        ListaItems.NETHERITE_BUCKET.setRegistryName(Util.getResLoc("netherite_bucket"));

        reg.getRegistry().register(ListaItems.DETECTOR);
        reg.getRegistry().register(ListaItems.SILVERFISH_AWAKENER);
        reg.getRegistry().register(ListaItems.COAL_BUCKET);
        reg.getRegistry().register(ListaItems.COPPER_BUCKET);
        reg.getRegistry().register(ListaItems.LAPIS_BUCKET);
        reg.getRegistry().register(ListaItems.IRON_BUCKET);
        reg.getRegistry().register(ListaItems.GOLD_BUCKET);
        reg.getRegistry().register(ListaItems.REDSTONE_BUCKET);
        reg.getRegistry().register(ListaItems.DIAMOND_BUCKET);
        reg.getRegistry().register(ListaItems.EMERALD_BUCKET);
        reg.getRegistry().register(ListaItems.QUARTZ_BUCKET);
        reg.getRegistry().register(ListaItems.NETHERITE_BUCKET);
        
        ListaItems.COAL_SILVERFISH_SPAWN_EGG.setRegistryName(Util.getResLoc("coal_silverfish_spawn_egg"));
        ListaItems.DEEPSLATE_COAL_SILVERFISH_SPAWN_EGG.setRegistryName(Util.getResLoc("deepslate_coal_silverfish_spawn_egg"));
        ListaItems.COPPER_SILVERFISH_SPAWN_EGG.setRegistryName(Util.getResLoc("copper_silverfish_spawn_egg"));
        ListaItems.DEEPSLATE_COPPER_SILVERFISH_SPAWN_EGG.setRegistryName(Util.getResLoc("deepslate_copper_silverfish_spawn_egg"));
        ListaItems.LAPIS_SILVERFISH_SPAWN_EGG.setRegistryName(Util.getResLoc("lapis_silverfish_spawn_egg"));
        ListaItems.DEEPSLATE_LAPIS_SILVERFISH_SPAWN_EGG.setRegistryName(Util.getResLoc("deepslate_lapis_silverfish_spawn_egg"));
        ListaItems.IRON_SILVERFISH_SPAWN_EGG.setRegistryName(Util.getResLoc("iron_silverfish_spawn_egg"));
        ListaItems.DEEPSLATE_IRON_SILVERFISH_SPAWN_EGG.setRegistryName(Util.getResLoc("deepslate_iron_silverfish_spawn_egg"));
        ListaItems.GOLD_SILVERFISH_SPAWN_EGG.setRegistryName(Util.getResLoc("gold_silverfish_spawn_egg"));
        ListaItems.DEEPSLATE_GOLD_SILVERFISH_SPAWN_EGG.setRegistryName(Util.getResLoc("deepslate_gold_silverfish_spawn_egg"));
        ListaItems.NETHER_GOLD_SILVERFISH_SPAWN_EGG.setRegistryName(Util.getResLoc("nether_gold_silverfish_spawn_egg"));
        ListaItems.REDSTONE_SILVERFISH_SPAWN_EGG.setRegistryName(Util.getResLoc("redstone_silverfish_spawn_egg"));
        ListaItems.DEEPSLATE_REDSTONE_SILVERFISH_SPAWN_EGG.setRegistryName(Util.getResLoc("deepslate_redstone_silverfish_spawn_egg"));
        ListaItems.DIAMOND_SILVERFISH_SPAWN_EGG.setRegistryName(Util.getResLoc("diamond_silverfish_spawn_egg"));
        ListaItems.DEEPSLATE_DIAMOND_SILVERFISH_SPAWN_EGG.setRegistryName(Util.getResLoc("deepslate_diamond_silverfish_spawn_egg"));
        ListaItems.EMERALD_SILVERFISH_SPAWN_EGG.setRegistryName(Util.getResLoc("emerald_silverfish_spawn_egg"));
        ListaItems.DEEPSLATE_EMERALD_SILVERFISH_SPAWN_EGG.setRegistryName(Util.getResLoc("deepslate_emerald_silverfish_spawn_egg"));
        ListaItems.QUARTZ_SILVERFISH_SPAWN_EGG.setRegistryName(Util.getResLoc("quartz_silverfish_spawn_egg"));
        ListaItems.NETHERITE_SILVERFISH_SPAWN_EGG.setRegistryName(Util.getResLoc("netherite_silverfish_spawn_egg"));
        
        reg.getRegistry().register(ListaItems.COAL_SILVERFISH_SPAWN_EGG);
        reg.getRegistry().register(ListaItems.DEEPSLATE_COAL_SILVERFISH_SPAWN_EGG);
        reg.getRegistry().register(ListaItems.COPPER_SILVERFISH_SPAWN_EGG);
        reg.getRegistry().register(ListaItems.DEEPSLATE_COPPER_SILVERFISH_SPAWN_EGG);
        reg.getRegistry().register(ListaItems.LAPIS_SILVERFISH_SPAWN_EGG);
        reg.getRegistry().register(ListaItems.DEEPSLATE_LAPIS_SILVERFISH_SPAWN_EGG);
        reg.getRegistry().register(ListaItems.IRON_SILVERFISH_SPAWN_EGG);
        reg.getRegistry().register(ListaItems.DEEPSLATE_IRON_SILVERFISH_SPAWN_EGG);
        reg.getRegistry().register(ListaItems.GOLD_SILVERFISH_SPAWN_EGG);
        reg.getRegistry().register(ListaItems.DEEPSLATE_GOLD_SILVERFISH_SPAWN_EGG);
        reg.getRegistry().register(ListaItems.NETHER_GOLD_SILVERFISH_SPAWN_EGG);
        reg.getRegistry().register(ListaItems.REDSTONE_SILVERFISH_SPAWN_EGG);
        reg.getRegistry().register(ListaItems.DEEPSLATE_REDSTONE_SILVERFISH_SPAWN_EGG);
        reg.getRegistry().register(ListaItems.DIAMOND_SILVERFISH_SPAWN_EGG);
        reg.getRegistry().register(ListaItems.DEEPSLATE_DIAMOND_SILVERFISH_SPAWN_EGG);
        reg.getRegistry().register(ListaItems.EMERALD_SILVERFISH_SPAWN_EGG);
        reg.getRegistry().register(ListaItems.DEEPSLATE_EMERALD_SILVERFISH_SPAWN_EGG);
        reg.getRegistry().register(ListaItems.QUARTZ_SILVERFISH_SPAWN_EGG);
        reg.getRegistry().register(ListaItems.NETHERITE_SILVERFISH_SPAWN_EGG);
        
        ListaItems.COAL_SILVERFISH_EGG_SPAWN_EGG.setRegistryName(Util.getResLoc("coal_silverfish_egg_spawn_egg"));
        ListaItems.DEEPSLATE_COAL_SILVERFISH_EGG_SPAWN_EGG.setRegistryName(Util.getResLoc("deepslate_coal_silverfish_egg_spawn_egg"));
        ListaItems.COPPER_SILVERFISH_EGG_SPAWN_EGG.setRegistryName(Util.getResLoc("copper_silverfish_egg_spawn_egg"));
        ListaItems.DEEPSLATE_COPPER_SILVERFISH_EGG_SPAWN_EGG.setRegistryName(Util.getResLoc("deepslate_copper_silverfish_egg_spawn_egg"));
        ListaItems.LAPIS_SILVERFISH_EGG_SPAWN_EGG.setRegistryName(Util.getResLoc("lapis_silverfish_egg_spawn_egg"));
        ListaItems.DEEPSLATE_LAPIS_SILVERFISH_EGG_SPAWN_EGG.setRegistryName(Util.getResLoc("deepslate_lapis_silverfish_egg_spawn_egg"));
        ListaItems.IRON_SILVERFISH_EGG_SPAWN_EGG.setRegistryName(Util.getResLoc("iron_silverfish_egg_spawn_egg"));
        ListaItems.DEEPSLATE_IRON_SILVERFISH_EGG_SPAWN_EGG.setRegistryName(Util.getResLoc("deepslate_iron_silverfish_egg_spawn_egg"));
        ListaItems.GOLD_SILVERFISH_EGG_SPAWN_EGG.setRegistryName(Util.getResLoc("gold_silverfish_egg_spawn_egg"));
        ListaItems.DEEPSLATE_GOLD_SILVERFISH_EGG_SPAWN_EGG.setRegistryName(Util.getResLoc("deepslate_gold_silverfish_egg_spawn_egg"));
        ListaItems.NETHER_GOLD_SILVERFISH_EGG_SPAWN_EGG.setRegistryName(Util.getResLoc("nether_gold_silverfish_egg_spawn_egg"));
        ListaItems.REDSTONE_SILVERFISH_EGG_SPAWN_EGG.setRegistryName(Util.getResLoc("redstone_silverfish_egg_spawn_egg"));
        ListaItems.DEEPSLATE_REDSTONE_SILVERFISH_EGG_SPAWN_EGG.setRegistryName(Util.getResLoc("deepslate_redstone_silverfish_egg_spawn_egg"));
        ListaItems.DIAMOND_SILVERFISH_EGG_SPAWN_EGG.setRegistryName(Util.getResLoc("diamond_silverfish_egg_spawn_egg"));
        ListaItems.DEEPSLATE_DIAMOND_SILVERFISH_EGG_SPAWN_EGG.setRegistryName(Util.getResLoc("deepslate_diamond_silverfish_egg_spawn_egg"));
        ListaItems.EMERALD_SILVERFISH_EGG_SPAWN_EGG.setRegistryName(Util.getResLoc("emerald_silverfish_egg_spawn_egg"));
        ListaItems.DEEPSLATE_EMERALD_SILVERFISH_EGG_SPAWN_EGG.setRegistryName(Util.getResLoc("deepslate_emerald_silverfish_egg_spawn_egg"));
        ListaItems.QUARTZ_SILVERFISH_EGG_SPAWN_EGG.setRegistryName(Util.getResLoc("quartz_silverfish_egg_spawn_egg"));
        ListaItems.NETHERITE_SILVERFISH_EGG_SPAWN_EGG.setRegistryName(Util.getResLoc("netherite_silverfish_egg_spawn_egg"));
        
        reg.getRegistry().register(ListaItems.COAL_SILVERFISH_EGG_SPAWN_EGG);
        reg.getRegistry().register(ListaItems.DEEPSLATE_COAL_SILVERFISH_EGG_SPAWN_EGG);
        reg.getRegistry().register(ListaItems.COPPER_SILVERFISH_EGG_SPAWN_EGG);
        reg.getRegistry().register(ListaItems.DEEPSLATE_COPPER_SILVERFISH_EGG_SPAWN_EGG);
        reg.getRegistry().register(ListaItems.LAPIS_SILVERFISH_EGG_SPAWN_EGG);
        reg.getRegistry().register(ListaItems.DEEPSLATE_LAPIS_SILVERFISH_EGG_SPAWN_EGG);
        reg.getRegistry().register(ListaItems.IRON_SILVERFISH_EGG_SPAWN_EGG);
        reg.getRegistry().register(ListaItems.DEEPSLATE_IRON_SILVERFISH_EGG_SPAWN_EGG);
        reg.getRegistry().register(ListaItems.GOLD_SILVERFISH_EGG_SPAWN_EGG);
        reg.getRegistry().register(ListaItems.DEEPSLATE_GOLD_SILVERFISH_EGG_SPAWN_EGG);
        reg.getRegistry().register(ListaItems.NETHER_GOLD_SILVERFISH_EGG_SPAWN_EGG);
        reg.getRegistry().register(ListaItems.REDSTONE_SILVERFISH_EGG_SPAWN_EGG);
        reg.getRegistry().register(ListaItems.DEEPSLATE_REDSTONE_SILVERFISH_EGG_SPAWN_EGG);
        reg.getRegistry().register(ListaItems.DIAMOND_SILVERFISH_EGG_SPAWN_EGG);
        reg.getRegistry().register(ListaItems.DEEPSLATE_DIAMOND_SILVERFISH_EGG_SPAWN_EGG);
        reg.getRegistry().register(ListaItems.EMERALD_SILVERFISH_EGG_SPAWN_EGG);
        reg.getRegistry().register(ListaItems.DEEPSLATE_EMERALD_SILVERFISH_EGG_SPAWN_EGG);
        reg.getRegistry().register(ListaItems.QUARTZ_SILVERFISH_EGG_SPAWN_EGG);
        reg.getRegistry().register(ListaItems.NETHERITE_SILVERFISH_EGG_SPAWN_EGG);
        
        ListaItems.INFESTED_COAL_ORE.setRegistryName(Util.getResLoc("infested_coal_ore"));
        ListaItems.INFESTED_DEEPSLATE_COAL_ORE.setRegistryName(Util.getResLoc("infested_deepslate_coal_ore"));
        ListaItems.INFESTED_COPPER_ORE.setRegistryName(Util.getResLoc("infested_copper_ore"));
        ListaItems.INFESTED_DEEPSLATE_COPPER_ORE.setRegistryName(Util.getResLoc("infested_deepslate_copper_ore"));
        ListaItems.INFESTED_LAPIS_ORE.setRegistryName(Util.getResLoc("infested_lapis_ore"));
        ListaItems.INFESTED_DEEPSLATE_LAPIS_ORE.setRegistryName(Util.getResLoc("infested_deepslate_lapis_ore"));
        ListaItems.INFESTED_IRON_ORE.setRegistryName(Util.getResLoc("infested_iron_ore"));
        ListaItems.INFESTED_DEEPSLATE_IRON_ORE.setRegistryName(Util.getResLoc("infested_deepslate_iron_ore"));
        ListaItems.INFESTED_GOLD_ORE.setRegistryName(Util.getResLoc("infested_gold_ore"));
        ListaItems.INFESTED_DEEPSLATE_GOLD_ORE.setRegistryName(Util.getResLoc("infested_deepslate_gold_ore"));
        ListaItems.INFESTED_NETHER_GOLD_ORE.setRegistryName(Util.getResLoc("infested_nether_gold_ore"));
        ListaItems.INFESTED_REDSTONE_ORE.setRegistryName(Util.getResLoc("infested_redstone_ore"));
        ListaItems.INFESTED_DEEPSLATE_REDSTONE_ORE.setRegistryName(Util.getResLoc("infested_deepslate_redstone_ore"));
        ListaItems.INFESTED_DIAMOND_ORE.setRegistryName(Util.getResLoc("infested_diamond_ore"));
        ListaItems.INFESTED_DEEPSLATE_DIAMOND_ORE.setRegistryName(Util.getResLoc("infested_deepslate_diamond_ore"));
        ListaItems.INFESTED_EMERALD_ORE.setRegistryName(Util.getResLoc("infested_emerald_ore"));
        ListaItems.INFESTED_DEEPSLATE_EMERALD_ORE.setRegistryName(Util.getResLoc("infested_deepslate_emerald_ore"));
        ListaItems.INFESTED_NETHER_QUARTZ_ORE.setRegistryName(Util.getResLoc("infested_nether_quartz_ore"));
        ListaItems.INFESTED_ANCIENT_DEBRIS.setRegistryName(Util.getResLoc("infested_ancient_debris"));
        
        reg.getRegistry().register(ListaItems.INFESTED_COAL_ORE);
        reg.getRegistry().register(ListaItems.INFESTED_DEEPSLATE_COAL_ORE);
        reg.getRegistry().register(ListaItems.INFESTED_COPPER_ORE);
        reg.getRegistry().register(ListaItems.INFESTED_DEEPSLATE_COPPER_ORE);
        reg.getRegistry().register(ListaItems.INFESTED_LAPIS_ORE);
        reg.getRegistry().register(ListaItems.INFESTED_DEEPSLATE_LAPIS_ORE);
        reg.getRegistry().register(ListaItems.INFESTED_IRON_ORE);
        reg.getRegistry().register(ListaItems.INFESTED_DEEPSLATE_IRON_ORE);
        reg.getRegistry().register(ListaItems.INFESTED_GOLD_ORE);
        reg.getRegistry().register(ListaItems.INFESTED_DEEPSLATE_GOLD_ORE);
        reg.getRegistry().register(ListaItems.INFESTED_NETHER_GOLD_ORE);
        reg.getRegistry().register(ListaItems.INFESTED_REDSTONE_ORE);
        reg.getRegistry().register(ListaItems.INFESTED_DEEPSLATE_REDSTONE_ORE);
        reg.getRegistry().register(ListaItems.INFESTED_DIAMOND_ORE);
        reg.getRegistry().register(ListaItems.INFESTED_DEEPSLATE_DIAMOND_ORE);
        reg.getRegistry().register(ListaItems.INFESTED_EMERALD_ORE);
        reg.getRegistry().register(ListaItems.INFESTED_DEEPSLATE_EMERALD_ORE);
        reg.getRegistry().register(ListaItems.INFESTED_NETHER_QUARTZ_ORE);
        reg.getRegistry().register(ListaItems.INFESTED_ANCIENT_DEBRIS);

        ListaItems.SILVERFISHED_COAL.setRegistryName("silverfished_coal");
        ListaItems.SILVERFISHED_COPPER.setRegistryName("silverfished_copper");
        ListaItems.SILVERFISHED_LAPIS.setRegistryName("silverfished_lapis");
        ListaItems.SILVERFISHED_IRON.setRegistryName("silverfished_iron");
        ListaItems.SILVERFISHED_GOLD.setRegistryName("silverfished_gold");
        ListaItems.SILVERFISHED_REDSTONE.setRegistryName("silverfished_redstone");
        ListaItems.SILVERFISHED_DIAMOND.setRegistryName("silverfished_diamond");
        ListaItems.SILVERFISHED_EMERALD.setRegistryName("silverfished_emerald");
        ListaItems.SILVERFISHED_QUARTZ.setRegistryName("silverfished_quartz");
        ListaItems.SILVERFISHED_NETHERITE.setRegistryName("silverfished_netherite");

        reg.getRegistry().register(ListaItems.SILVERFISHED_COAL);
        reg.getRegistry().register(ListaItems.SILVERFISHED_COPPER);
        reg.getRegistry().register(ListaItems.SILVERFISHED_LAPIS);
        reg.getRegistry().register(ListaItems.SILVERFISHED_IRON);
        reg.getRegistry().register(ListaItems.SILVERFISHED_GOLD);
        reg.getRegistry().register(ListaItems.SILVERFISHED_REDSTONE);
        reg.getRegistry().register(ListaItems.SILVERFISHED_DIAMOND);
        reg.getRegistry().register(ListaItems.SILVERFISHED_EMERALD);
        reg.getRegistry().register(ListaItems.SILVERFISHED_QUARTZ);
        reg.getRegistry().register(ListaItems.SILVERFISHED_NETHERITE);
    }
}
