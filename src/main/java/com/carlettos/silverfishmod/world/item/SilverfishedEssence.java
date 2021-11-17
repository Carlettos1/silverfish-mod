package com.carlettos.silverfishmod.world.item;

import java.util.Optional;

import com.carlettos.silverfishmod.util.Essence;
import com.carlettos.silverfishmod.util.Util;
import com.carlettos.silverfishmod.world.inventory.TextTooltip;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Style;
import net.minecraft.world.inventory.tooltip.TooltipComponent;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class SilverfishedEssence extends Item{
    public final Essence essence;
    
    public SilverfishedEssence(Essence essence) {
        super(new Item.Properties().tab(Util.GRUPO).stacksTo(16));
        this.essence = essence;
    }
    
    @Override
    public Optional<TooltipComponent> getTooltipImage(ItemStack stack) {
        return Optional.of(new TextTooltip("Silverfished...", Style.EMPTY.withColor(ChatFormatting.DARK_AQUA)));
    }
}
