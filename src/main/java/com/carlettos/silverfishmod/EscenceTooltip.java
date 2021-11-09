package com.carlettos.silverfishmod;

import net.minecraft.world.inventory.tooltip.TooltipComponent;
import net.minecraft.world.item.Item;

public class EscenceTooltip implements TooltipComponent {
    private Item item;
    
    public EscenceTooltip(Item item) {
        this.item = item;
    }
    
    public Item getItem() {
        return item;
    }
}
