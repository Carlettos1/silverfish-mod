package com.carlettos.silverfishmod.tooltip.client;

import com.carlettos.silverfishmod.tooltip.EscenceTooltip;

import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.screens.inventory.tooltip.ClientTooltipComponent;
import net.minecraft.world.item.Item;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class EscenceClientTooltip implements ClientTooltipComponent{
    private Item item;
    
    public EscenceClientTooltip(EscenceTooltip tooltip) {
        this.item = tooltip.getItem();
    }
    
    public Item getItem() {
        return item;
    }

    @Override
    public int getHeight() {
        return 0;
    }

    @Override
    public int getWidth(Font font) {
        return 0;
    }

}
