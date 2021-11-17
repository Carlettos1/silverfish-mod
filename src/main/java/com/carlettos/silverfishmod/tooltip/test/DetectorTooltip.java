package com.carlettos.silverfishmod.tooltip.test;

import net.minecraft.world.inventory.tooltip.TooltipComponent;

public class DetectorTooltip implements TooltipComponent{
    public final String essenceLevel;
	public DetectorTooltip(float essenceLevel) {
	    this.essenceLevel = "Essence: " + essenceLevel;
	}
}
