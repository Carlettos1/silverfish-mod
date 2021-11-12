package com.carlettos.silverfishmod.event;

import com.carlettos.silverfishmod.listas.ListaFeatures;

import net.minecraft.world.level.levelgen.GenerationStep.Decoration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class BiomeEvents {
    @SubscribeEvent 
    public static void onBiomeLoadingEvent(BiomeLoadingEvent event) {
        event.getGeneration().addFeature(Decoration.UNDERGROUND_ORES, ListaFeatures.ORE_COAL_INFESTED);
        event.getGeneration().addFeature(Decoration.UNDERGROUND_ORES, ListaFeatures.ORE_COPPER_INFESTED);
        event.getGeneration().addFeature(Decoration.UNDERGROUND_ORES, ListaFeatures.ORE_LAPIS_INFESTED);
        event.getGeneration().addFeature(Decoration.UNDERGROUND_ORES, ListaFeatures.ORE_IRON_INFESTED);
        event.getGeneration().addFeature(Decoration.UNDERGROUND_ORES, ListaFeatures.ORE_GOLD_INFESTED);
        event.getGeneration().addFeature(Decoration.UNDERGROUND_ORES, ListaFeatures.ORE_REDSTONE_INFESTED);
        event.getGeneration().addFeature(Decoration.UNDERGROUND_ORES, ListaFeatures.ORE_DIAMOND_INFESTED);
        event.getGeneration().addFeature(Decoration.UNDERGROUND_ORES, ListaFeatures.ORE_EMERALD_INFESTED);
    }
}
