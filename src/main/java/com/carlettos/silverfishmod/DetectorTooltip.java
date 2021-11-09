package com.carlettos.silverfishmod;

import net.minecraft.world.inventory.tooltip.TooltipComponent;

public class DetectorTooltip implements TooltipComponent{
	private int z;
	public DetectorTooltip(int z) {
		this.z = z;
	}
	
	public int getZ() {
		return z;
	}
}
