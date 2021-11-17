package com.carlettos.silverfishmod.listas;

import com.carlettos.silverfishmod.util.Util;

import net.minecraft.tags.ItemTags;
import net.minecraft.tags.Tag;
import net.minecraft.world.item.Item;

public class ListaTags {
    
    static {
        Items.init();
    }
    
    public static class Items{
        private static void init() {}
        public static final Tag.Named<Item> SILVERFISHED = ItemTags.createOptional(Util.getResLoc("silverfished"));
    }
}
