package com.carlettos.silverfishmod.event.registry;

import com.carlettos.silverfishmod.util.Util;

import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD, modid=Util.MOD_ID)
public class RegistryFeature {
    @SubscribeEvent
    public static void registerFeatures(final RegistryEvent.Register<Feature<?>> event) {
    }
}
