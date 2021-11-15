package com.carlettos.silverfishmod.event.registry;

import com.carlettos.silverfishmod.listas.ListaRecipeSerializers;
import com.carlettos.silverfishmod.util.Util;

import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD, modid=Util.MOD_ID)
public class RegistryRecipeSerializer {
    @SubscribeEvent
    public static final void registerMenuTypes(final RegistryEvent.Register<RecipeSerializer<?>> reg) {
        ListaRecipeSerializers.SHAPED_ESSENCE_RECIPE.setRegistryName(Util.getResLoc("essence_shaped"));
        reg.getRegistry().register(ListaRecipeSerializers.SHAPED_ESSENCE_RECIPE);
    }
}
