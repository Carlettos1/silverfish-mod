package com.carlettos.silverfishmod.event.registry;

import com.carlettos.silverfishmod.listas.ListaBloques;
import com.carlettos.silverfishmod.util.Util;

import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD, modid=Util.MOD_ID)
public class RegistryBlock {
    @SubscribeEvent
    public static void registerBlocks(final RegistryEvent.Register<Block> reg) {
        ListaBloques.COAL.setRegistryName(Util.getResLoc("coal"));
        ListaBloques.COPPER.setRegistryName(Util.getResLoc("copper"));
        ListaBloques.LAPIS.setRegistryName(Util.getResLoc("lapis"));
        ListaBloques.IRON.setRegistryName(Util.getResLoc("iron"));
        ListaBloques.GOLD.setRegistryName(Util.getResLoc("gold"));
        ListaBloques.REDSTONE.setRegistryName(Util.getResLoc("redstone"));
        ListaBloques.DIAMOND.setRegistryName(Util.getResLoc("diamond"));
        ListaBloques.EMERALD.setRegistryName(Util.getResLoc("emerald"));
        ListaBloques.QUARTZ.setRegistryName(Util.getResLoc("quartz"));
        ListaBloques.NETHERITE.setRegistryName(Util.getResLoc("netherite"));
        
        ListaBloques.INFESTED_COAL_ORE.setRegistryName(Util.getResLoc("infested_coal_ore"));
        ListaBloques.INFESTED_DEEPSLATE_COAL_ORE.setRegistryName(Util.getResLoc("infested_deepslate_coal_ore"));
        ListaBloques.INFESTED_COPPER_ORE.setRegistryName(Util.getResLoc("infested_copper_ore"));
        ListaBloques.INFESTED_DEEPSLATE_COPPER_ORE.setRegistryName(Util.getResLoc("infested_deepslate_copper_ore"));
        ListaBloques.INFESTED_LAPIS_ORE.setRegistryName(Util.getResLoc("infested_lapis_ore"));
        ListaBloques.INFESTED_DEEPSLATE_LAPIS_ORE.setRegistryName(Util.getResLoc("infested_deepslate_lapis_ore"));
        ListaBloques.INFESTED_IRON_ORE.setRegistryName(Util.getResLoc("infested_iron_ore"));
        ListaBloques.INFESTED_DEEPSLATE_IRON_ORE.setRegistryName(Util.getResLoc("infested_deepslate_iron_ore"));
        ListaBloques.INFESTED_GOLD_ORE.setRegistryName(Util.getResLoc("infested_gold_ore"));
        ListaBloques.INFESTED_DEEPSLATE_GOLD_ORE.setRegistryName(Util.getResLoc("infested_deepslate_gold_ore"));
        ListaBloques.INFESTED_NETHER_GOLD_ORE.setRegistryName(Util.getResLoc("infested_nether_gold_ore"));
        ListaBloques.INFESTED_REDSTONE_ORE.setRegistryName(Util.getResLoc("infested_redstone_ore"));
        ListaBloques.INFESTED_DEEPSLATE_REDSTONE_ORE.setRegistryName(Util.getResLoc("infested_deepslate_redstone_ore"));
        ListaBloques.INFESTED_DIAMOND_ORE.setRegistryName(Util.getResLoc("infested_diamond_ore"));
        ListaBloques.INFESTED_DEEPSLATE_DIAMOND_ORE.setRegistryName(Util.getResLoc("infested_deepslate_diamond_ore"));
        ListaBloques.INFESTED_EMERALD_ORE.setRegistryName(Util.getResLoc("infested_emerald_ore"));
        ListaBloques.INFESTED_DEEPSLATE_EMERALD_ORE.setRegistryName(Util.getResLoc("infested_deepslate_emerald_ore"));
        ListaBloques.INFESTED_NETHER_QUARTZ_ORE.setRegistryName(Util.getResLoc("infested_nether_quartz_ore"));
        ListaBloques.INFESTED_ANCIENT_DEBRIS.setRegistryName(Util.getResLoc("infested_ancient_debris"));

        reg.getRegistry().register(ListaBloques.COAL);
        reg.getRegistry().register(ListaBloques.COPPER);
        reg.getRegistry().register(ListaBloques.LAPIS);
        reg.getRegistry().register(ListaBloques.IRON);
        reg.getRegistry().register(ListaBloques.GOLD);
        reg.getRegistry().register(ListaBloques.REDSTONE);
        reg.getRegistry().register(ListaBloques.DIAMOND);
        reg.getRegistry().register(ListaBloques.EMERALD);
        reg.getRegistry().register(ListaBloques.QUARTZ);
        reg.getRegistry().register(ListaBloques.NETHERITE);
        
        reg.getRegistry().register(ListaBloques.INFESTED_COAL_ORE);
        reg.getRegistry().register(ListaBloques.INFESTED_DEEPSLATE_COAL_ORE);
        reg.getRegistry().register(ListaBloques.INFESTED_COPPER_ORE);
        reg.getRegistry().register(ListaBloques.INFESTED_DEEPSLATE_COPPER_ORE);
        reg.getRegistry().register(ListaBloques.INFESTED_LAPIS_ORE);
        reg.getRegistry().register(ListaBloques.INFESTED_DEEPSLATE_LAPIS_ORE);
        reg.getRegistry().register(ListaBloques.INFESTED_IRON_ORE);
        reg.getRegistry().register(ListaBloques.INFESTED_DEEPSLATE_IRON_ORE);
        reg.getRegistry().register(ListaBloques.INFESTED_GOLD_ORE);
        reg.getRegistry().register(ListaBloques.INFESTED_DEEPSLATE_GOLD_ORE);
        reg.getRegistry().register(ListaBloques.INFESTED_NETHER_GOLD_ORE);
        reg.getRegistry().register(ListaBloques.INFESTED_REDSTONE_ORE);
        reg.getRegistry().register(ListaBloques.INFESTED_DEEPSLATE_REDSTONE_ORE);
        reg.getRegistry().register(ListaBloques.INFESTED_DIAMOND_ORE);
        reg.getRegistry().register(ListaBloques.INFESTED_DEEPSLATE_DIAMOND_ORE);
        reg.getRegistry().register(ListaBloques.INFESTED_EMERALD_ORE);
        reg.getRegistry().register(ListaBloques.INFESTED_DEEPSLATE_EMERALD_ORE);
        reg.getRegistry().register(ListaBloques.INFESTED_NETHER_QUARTZ_ORE);
        reg.getRegistry().register(ListaBloques.INFESTED_ANCIENT_DEBRIS);
    }
}
