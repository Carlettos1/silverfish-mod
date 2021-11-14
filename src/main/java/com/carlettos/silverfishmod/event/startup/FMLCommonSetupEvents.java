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
}
