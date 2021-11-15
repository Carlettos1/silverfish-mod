package com.carlettos.silverfishmod.event.registry;

import com.carlettos.silverfishmod.listas.ListaMenuTypes;
import com.carlettos.silverfishmod.util.Util;

import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD, modid=Util.MOD_ID)
public class RegistryMenuType {
    @SubscribeEvent
    public static final void registerMenuTypes(final RegistryEvent.Register<MenuType<?>> reg) {
        ListaMenuTypes.ESSENCE.setRegistryName(Util.getResLoc("essence"));
        reg.getRegistry().register(ListaMenuTypes.ESSENCE);
    }
}
