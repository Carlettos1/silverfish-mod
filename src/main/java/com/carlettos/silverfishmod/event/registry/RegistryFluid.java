package com.carlettos.silverfishmod.event.registry;

import com.carlettos.silverfishmod.listas.ListaFluidos;
import com.carlettos.silverfishmod.util.Util;

import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD, modid=Util.MOD_ID)
public class RegistryFluid {
    @SubscribeEvent
    public static void registerFluids(final RegistryEvent.Register<Fluid> reg) {
        ListaFluidos.COAL.setRegistryName(Util.getResLoc("coal"));
        ListaFluidos.FLOWING_COAL.setRegistryName(Util.getResLoc("flowing_coal"));
        ListaFluidos.COPPER.setRegistryName(Util.getResLoc("coppper"));
        ListaFluidos.FLOWING_COPPER.setRegistryName(Util.getResLoc("flowing_copper"));
        ListaFluidos.LAPIS.setRegistryName(Util.getResLoc("lapis"));
        ListaFluidos.FLOWING_LAPIS.setRegistryName(Util.getResLoc("flowing_lapis"));
        ListaFluidos.IRON.setRegistryName(Util.getResLoc("iron"));
        ListaFluidos.FLOWING_IRON.setRegistryName(Util.getResLoc("flowing_iron"));
        ListaFluidos.GOLD.setRegistryName(Util.getResLoc("gold"));
        ListaFluidos.FLOWING_GOLD.setRegistryName(Util.getResLoc("flowing_gold"));
        ListaFluidos.REDSTONE.setRegistryName(Util.getResLoc("redstone"));
        ListaFluidos.FLOWING_REDSTONE.setRegistryName(Util.getResLoc("flowing_redstone"));
        ListaFluidos.DIAMOND.setRegistryName(Util.getResLoc("diamond"));
        ListaFluidos.FLOWING_DIAMOND.setRegistryName(Util.getResLoc("flowing_diamond"));
        ListaFluidos.EMERALD.setRegistryName(Util.getResLoc("emerald"));
        ListaFluidos.FLOWING_EMERALD.setRegistryName(Util.getResLoc("flowing_emerald"));
        ListaFluidos.QUARTZ.setRegistryName(Util.getResLoc("quartz"));
        ListaFluidos.FLOWING_QUARTZ.setRegistryName(Util.getResLoc("flowing_quartz"));
        ListaFluidos.NETHERITE.setRegistryName(Util.getResLoc("netherite"));
        ListaFluidos.FLOWING_NETHERITE.setRegistryName(Util.getResLoc("flowing_netherite"));

        reg.getRegistry().register(ListaFluidos.COAL);
        reg.getRegistry().register(ListaFluidos.FLOWING_COAL);
        reg.getRegistry().register(ListaFluidos.COPPER);
        reg.getRegistry().register(ListaFluidos.FLOWING_COPPER);
        reg.getRegistry().register(ListaFluidos.LAPIS);
        reg.getRegistry().register(ListaFluidos.FLOWING_LAPIS);
        reg.getRegistry().register(ListaFluidos.IRON);
        reg.getRegistry().register(ListaFluidos.FLOWING_IRON);
        reg.getRegistry().register(ListaFluidos.GOLD);
        reg.getRegistry().register(ListaFluidos.FLOWING_GOLD);
        reg.getRegistry().register(ListaFluidos.REDSTONE);
        reg.getRegistry().register(ListaFluidos.FLOWING_REDSTONE);
        reg.getRegistry().register(ListaFluidos.DIAMOND);
        reg.getRegistry().register(ListaFluidos.FLOWING_DIAMOND);
        reg.getRegistry().register(ListaFluidos.EMERALD);
        reg.getRegistry().register(ListaFluidos.FLOWING_EMERALD);
        reg.getRegistry().register(ListaFluidos.QUARTZ);
        reg.getRegistry().register(ListaFluidos.FLOWING_QUARTZ);
        reg.getRegistry().register(ListaFluidos.NETHERITE);
        reg.getRegistry().register(ListaFluidos.FLOWING_NETHERITE);
    }
}
