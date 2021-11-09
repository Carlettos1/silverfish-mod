package com.carlettos.silverfishmod;

import com.carlettos.silverfishmod.util.Util;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;

import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.GuiComponent;
import net.minecraft.client.gui.screens.inventory.tooltip.ClientTooltipComponent;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.resources.ResourceLocation;

public class DetectorClientTooltip implements ClientTooltipComponent{
	public static final ResourceLocation TEXTURE_LOCATION1 = Util.getResLoc("textures/item/lapis_bucket.png");
	public static final ResourceLocation TEXTURE_LOCATION2 = Util.getResLoc("textures/item/diamond_bucket.png");
	public static final ResourceLocation TEXTURE_LOCATION3 = Util.getResLoc("textures/item/emerald_bucket.png");
	public static final ResourceLocation TEXTURE_LOCATION4 = Util.getResLoc("textures/item/gold_bucket.png");
	private static final int MARGEN = 4;
	private final int z;
	
	public DetectorClientTooltip(DetectorTooltip tooltip) {
		this.z = tooltip.getZ();
	}

	@Override
	public int getHeight() {
		return 16 + MARGEN * 2;
	}

	@Override
	public int getWidth(Font p_169952_) {
		return 16 + MARGEN * 2;
	}
	
	@Override
	public void renderImage(Font font, int x, int y, PoseStack pose, ItemRenderer renderer, int i, TextureManager manager) {
		int largo = x + MARGEN;
		int alto = y + MARGEN;
		this.blit(pose, largo, alto, i, manager);
	}
	
	private void blit(PoseStack pose, int i1, int i2, int i3, TextureManager manager) {
		RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
    	switch((this.z / 20) % 4) {
	    	case 1:
	            RenderSystem.setShaderTexture(0, TEXTURE_LOCATION2);
	    		break;
	    	case 2:
	            RenderSystem.setShaderTexture(0, TEXTURE_LOCATION3);
	    		break;
	    	case 3:
	            RenderSystem.setShaderTexture(0, TEXTURE_LOCATION4);
	    		break;
	    	default:
	            RenderSystem.setShaderTexture(0, TEXTURE_LOCATION1);
	            break;
        }
        GuiComponent.blit(pose, i1, i2, i3, 0, 0, 16, 16, 16, 16);
    }
}
