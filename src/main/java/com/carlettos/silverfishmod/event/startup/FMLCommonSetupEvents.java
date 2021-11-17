package com.carlettos.silverfishmod.event.startup;

import com.carlettos.silverfishmod.client.handler.HudHandler;
import com.carlettos.silverfishmod.connection.PacketHandler;
import com.carlettos.silverfishmod.essence.connection.EssencePacket;
import com.carlettos.silverfishmod.essence.util.EssenceLevel;
import com.carlettos.silverfishmod.essence.world.EssenceChunk;
import com.carlettos.silverfishmod.util.Util;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD, modid=Util.MOD_ID)
public class FMLCommonSetupEvents {

    @SubscribeEvent
    public static void registerMessages(final FMLCommonSetupEvent event) {
        PacketHandler.INSTANCE.registerMessage(1, EssencePacket.class, (packet, buffer) -> {
            packet.essences.toNetwork(buffer);
        }, (buffer) -> {
            return new EssencePacket(EssenceLevel.fromNetwork(buffer));
        }, (packet, supplier) -> {
            supplier.get().enqueueWork(() -> {
                HudHandler.currentChunk = new EssenceChunk(null, packet.essences);
            });
            supplier.get().setPacketHandled(true);
        });
    }
}
