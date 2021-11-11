package com.carlettos.silverfishmod.registry;

import com.carlettos.silverfishmod.listas.ListaEntidades;
import com.carlettos.silverfishmod.util.Util;

import net.minecraft.world.entity.EntityType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD, modid=Util.MOD_ID)
public class RegistryEntity {
    @SubscribeEvent
    public static void registerEntities(final RegistryEvent.Register<EntityType<?>> reg) {
        ListaEntidades.COAL_SILVERFISH.setRegistryName(Util.getResLoc("coal_silverfish"));
        ListaEntidades.DEEPSLATE_COAL_SILVERFISH.setRegistryName(Util.getResLoc("deepslate_coal_silverfish"));
        ListaEntidades.COPPER_SILVERFISH.setRegistryName(Util.getResLoc("copper_silverfish"));
        ListaEntidades.DEEPSLATE_COPPER_SILVERFISH.setRegistryName(Util.getResLoc("deepslate_copper_silverfish"));
        ListaEntidades.LAPIS_SILVERFISH.setRegistryName(Util.getResLoc("lapis_silverfish"));
        ListaEntidades.DEEPSLATE_LAPIS_SILVERFISH.setRegistryName(Util.getResLoc("deepslate_lapis_silverfish"));
        ListaEntidades.IRON_SILVERFISH.setRegistryName(Util.getResLoc("iron_silverfish"));
        ListaEntidades.DEEPSLATE_IRON_SILVERFISH.setRegistryName(Util.getResLoc("deepslate_iron_silverfish"));
        ListaEntidades.GOLD_SILVERFISH.setRegistryName(Util.getResLoc("gold_silverfish"));
        ListaEntidades.DEEPSLATE_GOLD_SILVERFISH.setRegistryName(Util.getResLoc("deepslate_gold_silverfish"));
        ListaEntidades.NETHER_GOLD_SILVERFISH.setRegistryName(Util.getResLoc("nether_gold_silverfish"));
        ListaEntidades.REDSTONE_SILVERFISH.setRegistryName(Util.getResLoc("redstone_silverfish"));
        ListaEntidades.DEEPSLATE_REDSTONE_SILVERFISH.setRegistryName(Util.getResLoc("deepslate_redstone_silverfish"));
        ListaEntidades.DIAMOND_SILVERFISH.setRegistryName(Util.getResLoc("diamond_silverfish"));
        ListaEntidades.DEEPSLATE_DIAMOND_SILVERFISH.setRegistryName(Util.getResLoc("deepslate_diamond_silverfish"));
        ListaEntidades.EMERALD_SILVERFISH.setRegistryName(Util.getResLoc("emerald_silverfish"));
        ListaEntidades.DEEPSLATE_EMERALD_SILVERFISH.setRegistryName(Util.getResLoc("deepslate_emerald_silverfish"));
        ListaEntidades.QUARTZ_SILVERFISH.setRegistryName(Util.getResLoc("quartz_silverfish"));
        ListaEntidades.NETHERITE_SILVERFISH.setRegistryName(Util.getResLoc("netherite_silverfish"));
        
        reg.getRegistry().register(ListaEntidades.COAL_SILVERFISH);
        reg.getRegistry().register(ListaEntidades.DEEPSLATE_COAL_SILVERFISH);
        reg.getRegistry().register(ListaEntidades.COPPER_SILVERFISH);
        reg.getRegistry().register(ListaEntidades.DEEPSLATE_COPPER_SILVERFISH);
        reg.getRegistry().register(ListaEntidades.LAPIS_SILVERFISH);
        reg.getRegistry().register(ListaEntidades.DEEPSLATE_LAPIS_SILVERFISH);
        reg.getRegistry().register(ListaEntidades.IRON_SILVERFISH);
        reg.getRegistry().register(ListaEntidades.DEEPSLATE_IRON_SILVERFISH);
        reg.getRegistry().register(ListaEntidades.GOLD_SILVERFISH);
        reg.getRegistry().register(ListaEntidades.DEEPSLATE_GOLD_SILVERFISH);
        reg.getRegistry().register(ListaEntidades.NETHER_GOLD_SILVERFISH);
        reg.getRegistry().register(ListaEntidades.REDSTONE_SILVERFISH);
        reg.getRegistry().register(ListaEntidades.DEEPSLATE_REDSTONE_SILVERFISH);
        reg.getRegistry().register(ListaEntidades.DIAMOND_SILVERFISH);
        reg.getRegistry().register(ListaEntidades.DEEPSLATE_DIAMOND_SILVERFISH);
        reg.getRegistry().register(ListaEntidades.EMERALD_SILVERFISH);
        reg.getRegistry().register(ListaEntidades.DEEPSLATE_EMERALD_SILVERFISH);
        reg.getRegistry().register(ListaEntidades.QUARTZ_SILVERFISH);
        reg.getRegistry().register(ListaEntidades.NETHERITE_SILVERFISH);
        
        ListaEntidades.COAL_SILVERFISH_EGG.setRegistryName(Util.getResLoc("coal_silverfish_egg"));
        ListaEntidades.DEEPSLATE_COAL_SILVERFISH_EGG.setRegistryName(Util.getResLoc("deepslate_coal_silverfish_egg"));
        ListaEntidades.COPPER_SILVERFISH_EGG.setRegistryName(Util.getResLoc("copper_silverfish_egg"));
        ListaEntidades.DEEPSLATE_COPPER_SILVERFISH_EGG.setRegistryName(Util.getResLoc("deepslate_copper_silverfish_egg"));
        ListaEntidades.LAPIS_SILVERFISH_EGG.setRegistryName(Util.getResLoc("lapis_silverfish_egg"));
        ListaEntidades.DEEPSLATE_LAPIS_SILVERFISH_EGG.setRegistryName(Util.getResLoc("deepslate_lapis_silverfish_egg"));
        ListaEntidades.IRON_SILVERFISH_EGG.setRegistryName(Util.getResLoc("iron_silverfish_egg"));
        ListaEntidades.DEEPSLATE_IRON_SILVERFISH_EGG.setRegistryName(Util.getResLoc("deepslate_iron_silverfish_egg"));
        ListaEntidades.GOLD_SILVERFISH_EGG.setRegistryName(Util.getResLoc("gold_silverfish_egg"));
        ListaEntidades.DEEPSLATE_GOLD_SILVERFISH_EGG.setRegistryName(Util.getResLoc("deepslate_gold_silverfish_egg"));
        ListaEntidades.NETHER_GOLD_SILVERFISH_EGG.setRegistryName(Util.getResLoc("nether_gold_silverfish_egg"));
        ListaEntidades.REDSTONE_SILVERFISH_EGG.setRegistryName(Util.getResLoc("redstone_silverfish_egg"));
        ListaEntidades.DEEPSLATE_REDSTONE_SILVERFISH_EGG.setRegistryName(Util.getResLoc("deepslate_redstone_silverfish_egg"));
        ListaEntidades.DIAMOND_SILVERFISH_EGG.setRegistryName(Util.getResLoc("diamond_silverfish_egg"));
        ListaEntidades.DEEPSLATE_DIAMOND_SILVERFISH_EGG.setRegistryName(Util.getResLoc("deepslate_diamond_silverfish_egg"));
        ListaEntidades.EMERALD_SILVERFISH_EGG.setRegistryName(Util.getResLoc("emerald_silverfish_egg"));
        ListaEntidades.DEEPSLATE_EMERALD_SILVERFISH_EGG.setRegistryName(Util.getResLoc("deepslate_emerald_silverfish_egg"));
        ListaEntidades.QUARTZ_SILVERFISH_EGG.setRegistryName(Util.getResLoc("quartz_silverfish_egg"));
        ListaEntidades.NETHERITE_SILVERFISH_EGG.setRegistryName(Util.getResLoc("netherite_silverfish_egg"));
        
        reg.getRegistry().register(ListaEntidades.COAL_SILVERFISH_EGG);
        reg.getRegistry().register(ListaEntidades.DEEPSLATE_COAL_SILVERFISH_EGG);
        reg.getRegistry().register(ListaEntidades.COPPER_SILVERFISH_EGG);
        reg.getRegistry().register(ListaEntidades.DEEPSLATE_COPPER_SILVERFISH_EGG);
        reg.getRegistry().register(ListaEntidades.LAPIS_SILVERFISH_EGG);
        reg.getRegistry().register(ListaEntidades.DEEPSLATE_LAPIS_SILVERFISH_EGG);
        reg.getRegistry().register(ListaEntidades.IRON_SILVERFISH_EGG);
        reg.getRegistry().register(ListaEntidades.DEEPSLATE_IRON_SILVERFISH_EGG);
        reg.getRegistry().register(ListaEntidades.GOLD_SILVERFISH_EGG);
        reg.getRegistry().register(ListaEntidades.DEEPSLATE_GOLD_SILVERFISH_EGG);
        reg.getRegistry().register(ListaEntidades.NETHER_GOLD_SILVERFISH_EGG);
        reg.getRegistry().register(ListaEntidades.REDSTONE_SILVERFISH_EGG);
        reg.getRegistry().register(ListaEntidades.DEEPSLATE_REDSTONE_SILVERFISH_EGG);
        reg.getRegistry().register(ListaEntidades.DIAMOND_SILVERFISH_EGG);
        reg.getRegistry().register(ListaEntidades.DEEPSLATE_DIAMOND_SILVERFISH_EGG);
        reg.getRegistry().register(ListaEntidades.EMERALD_SILVERFISH_EGG);
        reg.getRegistry().register(ListaEntidades.DEEPSLATE_EMERALD_SILVERFISH_EGG);
        reg.getRegistry().register(ListaEntidades.QUARTZ_SILVERFISH_EGG);
        reg.getRegistry().register(ListaEntidades.NETHERITE_SILVERFISH_EGG);
    }
}
