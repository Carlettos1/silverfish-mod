package com.carlettos.silverfishmod.world.inventory;

import net.minecraft.network.chat.Style;
import net.minecraft.world.inventory.tooltip.TooltipComponent;

public class TextTooltip implements TooltipComponent{
    public final String text;
    public final Style style;
	public TextTooltip(String text, Style style) {
	    this.text = text;
	    this.style = style;
	}
}
