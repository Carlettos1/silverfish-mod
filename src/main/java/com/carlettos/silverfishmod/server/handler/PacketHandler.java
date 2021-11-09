package com.carlettos.silverfishmod.server.handler;

import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.fmllegacy.network.NetworkRegistry;
import net.minecraftforge.fmllegacy.network.simple.SimpleChannel;

public class PacketHandler {
    public static final SimpleChannel INSTANCE;
    static {
        INSTANCE = NetworkRegistry.newSimpleChannel(new ResourceLocation("silverfishmod"), () -> "1", "1"::equals, "1"::equals);
    }
}
