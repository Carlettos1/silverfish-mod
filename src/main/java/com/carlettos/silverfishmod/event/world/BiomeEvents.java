package com.carlettos.silverfishmod.event.world;

import com.carlettos.silverfishmod.listas.ListaFeatures;
import com.carlettos.silverfishmod.util.Util;

import net.minecraft.world.level.levelgen.GenerationStep.Decoration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid=Util.MOD_ID)
public class BiomeEvents {
    @SubscribeEvent(priority = EventPriority.HIGH)
    public static void onBiomeLoadingEvent(BiomeLoadingEvent event) {
        event.getGeneration().addFeature(Decoration.UNDERGROUND_ORES, ListaFeatures.ORE_COAL_INFESTED);
        event.getGeneration().addFeature(Decoration.UNDERGROUND_ORES, ListaFeatures.ORE_COPPER_INFESTED);
        event.getGeneration().addFeature(Decoration.UNDERGROUND_ORES, ListaFeatures.ORE_LAPIS_INFESTED);
        event.getGeneration().addFeature(Decoration.UNDERGROUND_ORES, ListaFeatures.ORE_IRON_INFESTED);
        event.getGeneration().addFeature(Decoration.UNDERGROUND_ORES, ListaFeatures.ORE_GOLD_INFESTED);
        event.getGeneration().addFeature(Decoration.UNDERGROUND_ORES, ListaFeatures.ORE_REDSTONE_INFESTED);
        event.getGeneration().addFeature(Decoration.UNDERGROUND_ORES, ListaFeatures.ORE_DIAMOND_INFESTED);
        event.getGeneration().addFeature(Decoration.UNDERGROUND_ORES, ListaFeatures.ORE_EMERALD_INFESTED);
        event.getGeneration().addFeature(Decoration.UNDERGROUND_DECORATION, ListaFeatures.ORE_ANCIENT_DEBRIS_INFESTED_LARGE);
        event.getGeneration().addFeature(Decoration.UNDERGROUND_DECORATION, ListaFeatures.ORE_ANCIENT_DEBRIS_INFESTED_SMALL);

        if(event.getName().toString().toLowerCase().contains("delta")) {
            event.getGeneration().addFeature(Decoration.UNDERGROUND_DECORATION, ListaFeatures.ORE_GOLD_DELTAS_INFESTED);
            event.getGeneration().addFeature(Decoration.UNDERGROUND_DECORATION, ListaFeatures.ORE_QUARTZ_DELTAS_INFESTED);
        } else {
            event.getGeneration().addFeature(Decoration.UNDERGROUND_DECORATION, ListaFeatures.ORE_GOLD_NETHER_INFESTED);
            event.getGeneration().addFeature(Decoration.UNDERGROUND_DECORATION, ListaFeatures.ORE_QUARTZ_NETHER_INFESTED);
        }
    }
}
