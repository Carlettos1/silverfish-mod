package com.carlettos.silverfishmod.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.carlettos.silverfishmod.SilverFishMod;
import com.carlettos.silverfishmod.listas.ListaItems;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class Util {
    private static final Logger LOG = LogManager.getLogger(SilverFishMod.class);
    public static final String MOD_ID = "silverfishmod";
    public static final CreativeModeTab GRUPO = new CreativeModeTab(-1, "silverfishmod") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ListaItems.DETECTOR);
        }
    };
    
    public static final void log(Object o) {
        LOG.info(o.toString());;
    }
    
    public static final ResourceLocation getResLoc(final String nombre) {
        return new ResourceLocation(MOD_ID, nombre);
    }
    
    public static final String tagToString(CompoundTag tag) {
        return tagToString(tag, "");
    }
    
    public static final String tagToString(CompoundTag tag, String base) {
        StringBuilder str = new StringBuilder();
        tag.getAllKeys().forEach((key) -> {
            str.append(base).append(key).append(' ').append(tag.get(key).getType().getPrettyName()).append("\n");
            if(tag.get(key) instanceof CompoundTag) {
                str.append(tagToString((CompoundTag)tag.get(key), base + "\t")).append("\n");
            }
        });
        return str.toString();
    }
}
