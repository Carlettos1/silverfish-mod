package com.carlettos.silverfishmod.client.handler;

import com.carlettos.silverfishmod.essence.EssenceChunk;
import com.carlettos.silverfishmod.essence.util.EssenceLevel;
import com.carlettos.silverfishmod.util.Util;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class HudHandler {
    private final static ResourceLocation GUI = Util.getResLoc("textures/gui/hud.png");
    public static EssenceChunk currentChunk = new EssenceChunk(null, new EssenceLevel(0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
    
    @SuppressWarnings("resource")
    @OnlyIn(Dist.CLIENT)
    public static void renderDetector(Player player) {
        //Gui.blit(pose, xscreen, yscreen, blitoffset, ximg, yimg, wimg, himg, 256, 256)
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderTexture(0, GUI);

        float pcoal = HudHandler.currentChunk.getCoal() / HudHandler.currentChunk.getEscenciaTotal();
        float pcopper= HudHandler.currentChunk.getCopper() / HudHandler.currentChunk.getEscenciaTotal();
        float plapis = HudHandler.currentChunk.getLapis() / HudHandler.currentChunk.getEscenciaTotal();
        float piron = HudHandler.currentChunk.getIron() / HudHandler.currentChunk.getEscenciaTotal();
        float pgold= HudHandler.currentChunk.getGold() / HudHandler.currentChunk.getEscenciaTotal();
        float predstone= HudHandler.currentChunk.getRedstone() / HudHandler.currentChunk.getEscenciaTotal();
        float pdiamond= HudHandler.currentChunk.getDiamond() / HudHandler.currentChunk.getEscenciaTotal();
        float pemerald= HudHandler.currentChunk.getEmerald() / HudHandler.currentChunk.getEscenciaTotal();
        float pquartz= HudHandler.currentChunk.getQuartz() / HudHandler.currentChunk.getEscenciaTotal();
        float pnetherita= HudHandler.currentChunk.getNetherita() / HudHandler.currentChunk.getEscenciaTotal();
        int blitoffset = -90;
        PoseStack pose = new PoseStack();
        float p = 0;
        int x = 10;
        int y = 10;
        int xpos = 73;
        int ypos = 50;
        int xposfin = 86;
        int yposfin = 125;
        int dx = 2;
        int dy = 6;
        int xpose = 87;
        int ypose = 55;
        int xposefin = 96;
        int yposefin = 120;
        int largo = yposefin-ypose;
        
        RenderSystem.setShaderColor(0, 0, 0, 1F); //coal
        p += pcoal;
        Gui.blit(pose, x + dx, y + dy + (int)Math.ceil((1 - p) * largo), blitoffset, xpose, ypose, xposefin-xpose, (int)Math.ceil(pcoal * largo) +1, 256, 256);
        RenderSystem.setShaderColor(203F/255F, 109F/255F, 81F/255F, 1F); //copper
        p += pcopper;
        Gui.blit(pose, x + dx, y + dy + (int)Math.ceil((1 - p) * largo), blitoffset, xpose, ypose, xposefin-xpose, (int)Math.ceil(pcopper * largo) +1, 256, 256);
        RenderSystem.setShaderColor(0, 0, 1F, 1F); //lapis
        p += plapis;
        Gui.blit(pose, x + dx, y + dy + (int)Math.ceil((1 - p) * largo), blitoffset, xpose, ypose, xposefin-xpose, (int)Math.ceil(plapis * largo) +1, 256, 256);
        RenderSystem.setShaderColor(216F/255F, 216F/255F, 216F/255F, 1F); //iron
        p += piron;
        Gui.blit(pose, x + dx, y + dy + (int)Math.ceil((1 - p) * largo), blitoffset, xpose, ypose, xposefin-xpose, (int)Math.ceil(piron * largo) +1, 256, 256);
        RenderSystem.setShaderColor(253F/255F, 245F/255F, 94F/255F, 1F); //gold
        p += pgold;
        Gui.blit(pose, x + dx, y + dy + (int)Math.ceil((1 - p) * largo), blitoffset, xpose, ypose, xposefin-xpose, (int)Math.ceil(pgold * largo) +1, 256, 256);
        RenderSystem.setShaderColor(1, 0, 0, 1F); //redstone
        p += predstone;
        Gui.blit(pose, x + dx, y + dy + (int)Math.ceil((1 - p) * largo), blitoffset, xpose, ypose, xposefin-xpose, (int)Math.ceil(predstone * largo) +1, 256, 256);
        RenderSystem.setShaderColor(74F/255F, 237F/255F, 217F/255F, 1F); //diamond
        p += pdiamond;
        Gui.blit(pose, x + dx, y + dy + (int)Math.ceil((1 - p) * largo), blitoffset, xpose, ypose, xposefin-xpose, (int)Math.ceil(pdiamond * largo) +1, 256, 256);
        RenderSystem.setShaderColor(0, 1, 0, 1F); //emerald
        p += pemerald;
        Gui.blit(pose, x + dx, y + dy + (int)Math.ceil((1 - p) * largo), blitoffset, xpose, ypose, xposefin-xpose, (int)Math.ceil(pemerald * largo) +1, 256, 256);
        RenderSystem.setShaderColor(1, 1, 1, 1F); //quartz
        p += pquartz;
        Gui.blit(pose, x + dx, y + dy + (int)Math.ceil((1 - p) * largo), blitoffset, xpose, ypose, xposefin-xpose, (int)Math.ceil(pquartz * largo) +1, 256, 256);
        RenderSystem.setShaderColor(77F/255F, 77F/255F, 77F/255F, 1F); //netherita
        p += pnetherita;
        Gui.blit(pose, x + dx, y + dy + (int)Math.ceil((1 - p) * largo), blitoffset, xpose, ypose, xposefin-xpose, (int)Math.ceil(pnetherita * largo) +1, 256, 256);

        RenderSystem.setShaderColor(1, 1, 1, 1);
        Gui.blit(pose, x, y, blitoffset, xpos, ypos, xposfin-xpos, yposfin-ypos, 256, 256);
        
        if(player.isShiftKeyDown()) { 
            pose.scale(0.5F, 0.5F, 0.5F);
            Gui.drawString(pose, Minecraft.getInstance().gui.getFont(), "Total Essence: " + (int)HudHandler.currentChunk.getEscenciaTotal(), 2*(2*x + dx), 2*(y + dy), blitoffset);
        }
    }
}
