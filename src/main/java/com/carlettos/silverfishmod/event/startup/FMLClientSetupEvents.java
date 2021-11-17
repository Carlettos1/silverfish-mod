package com.carlettos.silverfishmod.event.startup;

import com.carlettos.silverfishmod.client.model.MineralEggModel;
import com.carlettos.silverfishmod.client.renderer.MineralEggRenderer;
import com.carlettos.silverfishmod.client.renderer.MineralSilverfishRenderer;
import com.carlettos.silverfishmod.listas.ListaEntidades;
import com.carlettos.silverfishmod.tooltip.test.DetectorTooltip;
import com.carlettos.silverfishmod.util.Util;
import com.carlettos.silverfishmod.world.entity.MineralEgg;
import com.carlettos.silverfishmod.world.entity.MineralSilverfish;

import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.inventory.tooltip.ClientTextTooltip;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.network.chat.Style;
import net.minecraft.util.FormattedCharSequence;
import net.minecraftforge.client.ForgeHooksClient;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD, modid=Util.MOD_ID)
public class FMLClientSetupEvents {
    
    @SubscribeEvent
    public static void registerSilverfishRenderers(FMLClientSetupEvent event) {
        EntityRenderers.<MineralSilverfish>register(ListaEntidades.COAL_SILVERFISH, MineralSilverfishRenderer::new);
        EntityRenderers.<MineralSilverfish>register(ListaEntidades.DEEPSLATE_COAL_SILVERFISH, MineralSilverfishRenderer::new);
        EntityRenderers.<MineralSilverfish>register(ListaEntidades.COPPER_SILVERFISH, MineralSilverfishRenderer::new);
        EntityRenderers.<MineralSilverfish>register(ListaEntidades.DEEPSLATE_COPPER_SILVERFISH, MineralSilverfishRenderer::new);
        EntityRenderers.<MineralSilverfish>register(ListaEntidades.LAPIS_SILVERFISH, MineralSilverfishRenderer::new);
        EntityRenderers.<MineralSilverfish>register(ListaEntidades.DEEPSLATE_LAPIS_SILVERFISH, MineralSilverfishRenderer::new);
        EntityRenderers.<MineralSilverfish>register(ListaEntidades.IRON_SILVERFISH, MineralSilverfishRenderer::new);
        EntityRenderers.<MineralSilverfish>register(ListaEntidades.DEEPSLATE_IRON_SILVERFISH, MineralSilverfishRenderer::new);
        EntityRenderers.<MineralSilverfish>register(ListaEntidades.GOLD_SILVERFISH, MineralSilverfishRenderer::new);
        EntityRenderers.<MineralSilverfish>register(ListaEntidades.DEEPSLATE_GOLD_SILVERFISH, MineralSilverfishRenderer::new);
        EntityRenderers.<MineralSilverfish>register(ListaEntidades.NETHER_GOLD_SILVERFISH, MineralSilverfishRenderer::new);
        EntityRenderers.<MineralSilverfish>register(ListaEntidades.REDSTONE_SILVERFISH, MineralSilverfishRenderer::new);
        EntityRenderers.<MineralSilverfish>register(ListaEntidades.DEEPSLATE_REDSTONE_SILVERFISH, MineralSilverfishRenderer::new);
        EntityRenderers.<MineralSilverfish>register(ListaEntidades.DIAMOND_SILVERFISH, MineralSilverfishRenderer::new);
        EntityRenderers.<MineralSilverfish>register(ListaEntidades.DEEPSLATE_DIAMOND_SILVERFISH, MineralSilverfishRenderer::new);
        EntityRenderers.<MineralSilverfish>register(ListaEntidades.EMERALD_SILVERFISH, MineralSilverfishRenderer::new);
        EntityRenderers.<MineralSilverfish>register(ListaEntidades.DEEPSLATE_EMERALD_SILVERFISH, MineralSilverfishRenderer::new);
        EntityRenderers.<MineralSilverfish>register(ListaEntidades.QUARTZ_SILVERFISH, MineralSilverfishRenderer::new);
        EntityRenderers.<MineralSilverfish>register(ListaEntidades.NETHERITE_SILVERFISH, MineralSilverfishRenderer::new);
    }
    
    @SubscribeEvent
    public static void registerEggRenderers(FMLClientSetupEvent event) {
        ForgeHooksClient.registerLayerDefinition(MineralEggModel.LAYER_LOCATION, () -> MineralEggModel.createBodyLayer());
        
        EntityRenderers.<MineralEgg>register(ListaEntidades.COAL_SILVERFISH_EGG, MineralEggRenderer::new);
        EntityRenderers.<MineralEgg>register(ListaEntidades.DEEPSLATE_COAL_SILVERFISH_EGG, MineralEggRenderer::new);
        EntityRenderers.<MineralEgg>register(ListaEntidades.COPPER_SILVERFISH_EGG, MineralEggRenderer::new);
        EntityRenderers.<MineralEgg>register(ListaEntidades.DEEPSLATE_COPPER_SILVERFISH_EGG, MineralEggRenderer::new);
        EntityRenderers.<MineralEgg>register(ListaEntidades.LAPIS_SILVERFISH_EGG, MineralEggRenderer::new);
        EntityRenderers.<MineralEgg>register(ListaEntidades.DEEPSLATE_LAPIS_SILVERFISH_EGG, MineralEggRenderer::new);
        EntityRenderers.<MineralEgg>register(ListaEntidades.IRON_SILVERFISH_EGG, MineralEggRenderer::new);
        EntityRenderers.<MineralEgg>register(ListaEntidades.DEEPSLATE_IRON_SILVERFISH_EGG, MineralEggRenderer::new);
        EntityRenderers.<MineralEgg>register(ListaEntidades.GOLD_SILVERFISH_EGG, MineralEggRenderer::new);
        EntityRenderers.<MineralEgg>register(ListaEntidades.DEEPSLATE_GOLD_SILVERFISH_EGG, MineralEggRenderer::new);
        EntityRenderers.<MineralEgg>register(ListaEntidades.NETHER_GOLD_SILVERFISH_EGG, MineralEggRenderer::new);
        EntityRenderers.<MineralEgg>register(ListaEntidades.REDSTONE_SILVERFISH_EGG, MineralEggRenderer::new);
        EntityRenderers.<MineralEgg>register(ListaEntidades.DEEPSLATE_REDSTONE_SILVERFISH_EGG, MineralEggRenderer::new);
        EntityRenderers.<MineralEgg>register(ListaEntidades.DIAMOND_SILVERFISH_EGG, MineralEggRenderer::new);
        EntityRenderers.<MineralEgg>register(ListaEntidades.DEEPSLATE_DIAMOND_SILVERFISH_EGG, MineralEggRenderer::new);
        EntityRenderers.<MineralEgg>register(ListaEntidades.EMERALD_SILVERFISH_EGG, MineralEggRenderer::new);
        EntityRenderers.<MineralEgg>register(ListaEntidades.DEEPSLATE_EMERALD_SILVERFISH_EGG, MineralEggRenderer::new);
        EntityRenderers.<MineralEgg>register(ListaEntidades.QUARTZ_SILVERFISH_EGG, MineralEggRenderer::new);
        EntityRenderers.<MineralEgg>register(ListaEntidades.NETHERITE_SILVERFISH_EGG, MineralEggRenderer::new);
    }
    
    @SubscribeEvent
    public static void registerTooltipComponentFactory(FMLClientSetupEvent event) {
        MinecraftForgeClient.registerTooltipComponentFactory(DetectorTooltip.class, (tooltip) -> new ClientTextTooltip(FormattedCharSequence.forward(tooltip.essenceLevel, Style.EMPTY.withColor(ChatFormatting.DARK_PURPLE).withItalic(true))));
    }
}
