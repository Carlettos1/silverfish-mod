package com.carlettos.silverfishmod.event.world;

import com.carlettos.silverfishmod.listas.ListaEntidades;
import com.carlettos.silverfishmod.util.Mineral;
import com.carlettos.silverfishmod.util.Util;
import com.carlettos.silverfishmod.world.entity.MineralEgg;
import com.carlettos.silverfishmod.world.entity.MineralSilverfish;

import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD, modid=Util.MOD_ID)
public class EntityEvents {

    @SubscribeEvent
    public static void putSilverfishAttributes(final EntityAttributeCreationEvent event) {
        event.put(ListaEntidades.COAL_SILVERFISH, MineralSilverfish.createAttributes(Mineral.COAL).build());
        event.put(ListaEntidades.DEEPSLATE_COAL_SILVERFISH, MineralSilverfish.createAttributes(Mineral.DEEPSLATE_COAL).build());
        event.put(ListaEntidades.COPPER_SILVERFISH, MineralSilverfish.createAttributes(Mineral.COPPER).build());
        event.put(ListaEntidades.DEEPSLATE_COPPER_SILVERFISH, MineralSilverfish.createAttributes(Mineral.DEEPSLATE_COPPER).build());
        event.put(ListaEntidades.LAPIS_SILVERFISH, MineralSilverfish.createAttributes(Mineral.LAPIS).build());
        event.put(ListaEntidades.DEEPSLATE_LAPIS_SILVERFISH, MineralSilverfish.createAttributes(Mineral.DEEPSLATE_LAPIS).build());
        event.put(ListaEntidades.IRON_SILVERFISH, MineralSilverfish.createAttributes(Mineral.IRON).build());
        event.put(ListaEntidades.DEEPSLATE_IRON_SILVERFISH, MineralSilverfish.createAttributes(Mineral.DEEPSLATE_IRON).build());
        event.put(ListaEntidades.GOLD_SILVERFISH, MineralSilverfish.createAttributes(Mineral.GOLD).build());
        event.put(ListaEntidades.DEEPSLATE_GOLD_SILVERFISH, MineralSilverfish.createAttributes(Mineral.DEEPSLATE_GOLD).build());
        event.put(ListaEntidades.NETHER_GOLD_SILVERFISH, MineralSilverfish.createAttributes(Mineral.NETHER_GOLD).build());
        event.put(ListaEntidades.REDSTONE_SILVERFISH, MineralSilverfish.createAttributes(Mineral.REDSTONE).build());
        event.put(ListaEntidades.DEEPSLATE_REDSTONE_SILVERFISH, MineralSilverfish.createAttributes(Mineral.DEEPSLATE_REDSTONE).build());
        event.put(ListaEntidades.DIAMOND_SILVERFISH, MineralSilverfish.createAttributes(Mineral.DIAMOND).build());
        event.put(ListaEntidades.DEEPSLATE_DIAMOND_SILVERFISH, MineralSilverfish.createAttributes(Mineral.DEEPSLATE_DIAMOND).build());
        event.put(ListaEntidades.EMERALD_SILVERFISH, MineralSilverfish.createAttributes(Mineral.EMERALD).build());
        event.put(ListaEntidades.DEEPSLATE_EMERALD_SILVERFISH, MineralSilverfish.createAttributes(Mineral.DEEPSLATE_EMERALD).build());
        event.put(ListaEntidades.QUARTZ_SILVERFISH, MineralSilverfish.createAttributes(Mineral.QUARTZ).build());
        event.put(ListaEntidades.NETHERITE_SILVERFISH, MineralSilverfish.createAttributes(Mineral.NETHERITE).build());
    }

    @SubscribeEvent
    public static void putEggAttributes(final EntityAttributeCreationEvent event) {
        event.put(ListaEntidades.COAL_SILVERFISH_EGG, MineralEgg.createAttributes(Mineral.COAL).build());
        event.put(ListaEntidades.DEEPSLATE_COAL_SILVERFISH_EGG, MineralEgg.createAttributes(Mineral.DEEPSLATE_COAL).build());
        event.put(ListaEntidades.COPPER_SILVERFISH_EGG, MineralEgg.createAttributes(Mineral.COPPER).build());
        event.put(ListaEntidades.DEEPSLATE_COPPER_SILVERFISH_EGG, MineralEgg.createAttributes(Mineral.DEEPSLATE_COPPER).build());
        event.put(ListaEntidades.LAPIS_SILVERFISH_EGG, MineralEgg.createAttributes(Mineral.LAPIS).build());
        event.put(ListaEntidades.DEEPSLATE_LAPIS_SILVERFISH_EGG, MineralEgg.createAttributes(Mineral.DEEPSLATE_LAPIS).build());
        event.put(ListaEntidades.IRON_SILVERFISH_EGG, MineralEgg.createAttributes(Mineral.IRON).build());
        event.put(ListaEntidades.DEEPSLATE_IRON_SILVERFISH_EGG, MineralEgg.createAttributes(Mineral.DEEPSLATE_IRON).build());
        event.put(ListaEntidades.GOLD_SILVERFISH_EGG, MineralEgg.createAttributes(Mineral.GOLD).build());
        event.put(ListaEntidades.DEEPSLATE_GOLD_SILVERFISH_EGG, MineralEgg.createAttributes(Mineral.DEEPSLATE_GOLD).build());
        event.put(ListaEntidades.NETHER_GOLD_SILVERFISH_EGG, MineralEgg.createAttributes(Mineral.NETHER_GOLD).build());
        event.put(ListaEntidades.REDSTONE_SILVERFISH_EGG, MineralEgg.createAttributes(Mineral.REDSTONE).build());
        event.put(ListaEntidades.DEEPSLATE_REDSTONE_SILVERFISH_EGG, MineralEgg.createAttributes(Mineral.DEEPSLATE_REDSTONE).build());
        event.put(ListaEntidades.DIAMOND_SILVERFISH_EGG, MineralEgg.createAttributes(Mineral.DIAMOND).build());
        event.put(ListaEntidades.DEEPSLATE_DIAMOND_SILVERFISH_EGG, MineralEgg.createAttributes(Mineral.DEEPSLATE_DIAMOND).build());
        event.put(ListaEntidades.EMERALD_SILVERFISH_EGG, MineralEgg.createAttributes(Mineral.EMERALD).build());
        event.put(ListaEntidades.DEEPSLATE_EMERALD_SILVERFISH_EGG, MineralEgg.createAttributes(Mineral.DEEPSLATE_EMERALD).build());
        event.put(ListaEntidades.QUARTZ_SILVERFISH_EGG, MineralEgg.createAttributes(Mineral.QUARTZ).build());
        event.put(ListaEntidades.NETHERITE_SILVERFISH_EGG, MineralEgg.createAttributes(Mineral.NETHERITE).build());
    }
}
