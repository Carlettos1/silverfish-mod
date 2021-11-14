package com.carlettos.silverfishmod.event.client;

import com.carlettos.silverfishmod.client.handler.HudHandler;
import com.carlettos.silverfishmod.util.Util;
import com.carlettos.silverfishmod.world.item.Detector;

import net.minecraft.client.Minecraft;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid=Util.MOD_ID)
public class GuiEvents {
    @SubscribeEvent
    public static void onRenderTick(TickEvent.RenderTickEvent event) {
        if(Minecraft.getInstance().getCameraEntity() instanceof Player) {
            Player player = (Player) Minecraft.getInstance().getCameraEntity();
            if(player.getMainHandItem().getItem() instanceof Detector 
                    || player.getOffhandItem().getItem() instanceof Detector) {
                HudHandler.renderDetector(player);
            }
        }
    }
}