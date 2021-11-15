package com.carlettos.silverfishmod.client.gui.screens.inventory;

import com.carlettos.silverfishmod.util.Util;
import com.carlettos.silverfishmod.world.inventory.EssenceMenu;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;

import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class EssenceScreen extends AbstractContainerScreen<EssenceMenu>{
    private static final ResourceLocation ESSENCE_TABLE_LOCATION = Util.getResLoc("textures/gui/container/essence_table.png");
    
    public EssenceScreen(EssenceMenu menu, Inventory inventory, Component component) {
        super(menu, inventory, component);
    }
    
    @Override
    protected void init() {
        super.init();
        this.titleLabelX = 29;
    }
    
    @Override
    public void render(PoseStack pose, int mouseX, int mouseY, float a) {
        this.renderBackground(pose);
        super.render(pose, mouseX, mouseY, a);
        this.renderTooltip(pose, mouseX, mouseY);
    }
    
    @Override
    protected void renderBg(PoseStack pose, float f1, int i1, int i2) {
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1, 1, 1, 1);
        RenderSystem.setShaderTexture(0, ESSENCE_TABLE_LOCATION);
        int i = this.leftPos;
        int j = (this.height - this.imageHeight) / 2;
        this.blit(pose, i, j, 0, 0, this.imageWidth, this.imageHeight);
    }
}
