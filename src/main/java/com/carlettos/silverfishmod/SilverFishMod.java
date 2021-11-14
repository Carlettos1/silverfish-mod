package com.carlettos.silverfishmod;

import com.carlettos.silverfishmod.util.Util;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod(Util.MOD_ID)
public class SilverFishMod {
	public SilverFishMod() {
        MinecraftForge.EVENT_BUS.register(this);
	}
}
