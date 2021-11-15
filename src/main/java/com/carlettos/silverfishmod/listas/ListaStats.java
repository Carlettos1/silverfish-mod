package com.carlettos.silverfishmod.listas;

import com.carlettos.silverfishmod.util.Util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.stats.StatFormatter;
import net.minecraft.stats.Stats;

public class ListaStats {
    
    public static final ResourceLocation INTERACT_WITH_ESSENCE_TABLE;
    
    static {
        ResourceLocation loc = Util.getResLoc("interact_with_essence_table");
        Stats.CUSTOM.get(loc, StatFormatter.DEFAULT);
        INTERACT_WITH_ESSENCE_TABLE = loc;
    }
}
