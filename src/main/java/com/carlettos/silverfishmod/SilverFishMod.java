package com.carlettos.silverfishmod;

import com.carlettos.silverfishmod.client.handler.HudHandler;
import com.carlettos.silverfishmod.essence.EssenceChunk;
import com.carlettos.silverfishmod.essence.connection.EssencePacket;
import com.carlettos.silverfishmod.essence.util.EssenceLevel;
import com.carlettos.silverfishmod.listas.ListaEntidades;
import com.carlettos.silverfishmod.mob.egg.MineralEgg;
import com.carlettos.silverfishmod.mob.egg.MineralEggModel;
import com.carlettos.silverfishmod.mob.egg.MineralEggRenderer;
import com.carlettos.silverfishmod.mob.silverfish.MineralSilverfish;
import com.carlettos.silverfishmod.mob.silverfish.MineralSilverfishRenderer;
import com.carlettos.silverfishmod.server.handler.PacketHandler;
import com.carlettos.silverfishmod.tooltip.test.DetectorClientTooltip;
import com.carlettos.silverfishmod.tooltip.test.DetectorTooltip;
import com.carlettos.silverfishmod.util.Mineral;
import com.carlettos.silverfishmod.util.Util;

import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.client.ForgeHooksClient;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fmlserverevents.FMLServerStartingEvent;

@Mod(Util.MOD_ID)
public class SilverFishMod {
    
	public SilverFishMod() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::commonSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::crearAtributos);

		MinecraftForge.EVENT_BUS.register(this);
	}
	
	private void commonSetup(final FMLCommonSetupEvent event) {
	    PacketHandler.INSTANCE.registerMessage(1, EssencePacket.class, (msg, packet) -> {
            packet.writeFloat(msg.escencias.getCoal());
            packet.writeFloat(msg.escencias.getCopper());
            packet.writeFloat(msg.escencias.getLapis());
            packet.writeFloat(msg.escencias.getIron());
            packet.writeFloat(msg.escencias.getGold());
            packet.writeFloat(msg.escencias.getRedstone());
            packet.writeFloat(msg.escencias.getDiamond());
            packet.writeFloat(msg.escencias.getEmerald());
            packet.writeFloat(msg.escencias.getQuartz());
            packet.writeFloat(msg.escencias.getNetherita());
        }, (packet) -> {
            return new EssencePacket(new EssenceLevel(
                    packet.readFloat(),
                    packet.readFloat(),
                    packet.readFloat(),
                    packet.readFloat(),
                    packet.readFloat(),
                    packet.readFloat(),
                    packet.readFloat(),
                    packet.readFloat(),
                    packet.readFloat(),
                    packet.readFloat()));
        }, (msg, sup) -> {
            sup.get().enqueueWork(() -> {
                HudHandler.currentChunk = new EssenceChunk(null, msg.escencias);
            });
            sup.get().setPacketHandled(true);
        });
	}
	
	private void clientSetup(final FMLClientSetupEvent event) {
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
        
        MinecraftForgeClient.registerTooltipComponentFactory(DetectorTooltip.class, (tooltip) -> new DetectorClientTooltip(tooltip));
	}
    
    private void crearAtributos(final EntityAttributeCreationEvent event) {
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

	public void enqueueIMC(final InterModEnqueueEvent event){
    }

    public void processIMC(final InterModProcessEvent event){
    }
    
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
    }
}
