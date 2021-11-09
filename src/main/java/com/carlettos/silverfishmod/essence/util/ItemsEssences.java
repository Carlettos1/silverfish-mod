package com.carlettos.silverfishmod.essence.util;

import java.util.HashMap;
import java.util.Map;

import com.carlettos.silverfishmod.util.Mineral;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

public class ItemsEssences {
    public static Map<Mineral, Integer> getMineralesFromBasicRawMineral(Item item) {
        Map<Mineral, Integer> minerales = new HashMap<>();
        if (item == Items.RAW_IRON) {
            minerales.put(Mineral.COAL, 9);
        } else if (item == Items.RAW_COPPER) {
            minerales.put(Mineral.COPPER, 9);
        } else if (item == Items.LAPIS_LAZULI) {
            minerales.put(Mineral.LAPIS, 9);
        } else if (item == Items.RAW_GOLD) {
            minerales.put(Mineral.GOLD, 9);
        } else if (item == Items.REDSTONE) {
            minerales.put(Mineral.REDSTONE, 9);
        } else if (item == Items.DIAMOND) {
            minerales.put(Mineral.DIAMOND, 9);
        } else if (item == Items.EMERALD) {
            minerales.put(Mineral.EMERALD, 9);
        } else if (item == Items.QUARTZ) {
            minerales.put(Mineral.QUARTZ, 9);
        } else if (item == Items.ANCIENT_DEBRIS) {
            minerales.put(Mineral.NETHERITE, 9);
        }
        return minerales;
    }
}
