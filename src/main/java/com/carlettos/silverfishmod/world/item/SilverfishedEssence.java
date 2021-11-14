package com.carlettos.silverfishmod.world.item;

import com.carlettos.silverfishmod.util.Essence;
import com.carlettos.silverfishmod.util.Util;

import net.minecraft.world.item.Item;

public class SilverfishedEssence extends Item{
    public final Essence essence;
    
    public SilverfishedEssence(Essence essence) {
        super(new Item.Properties().tab(Util.GRUPO).stacksTo(16));
        this.essence = essence;
    }
}
