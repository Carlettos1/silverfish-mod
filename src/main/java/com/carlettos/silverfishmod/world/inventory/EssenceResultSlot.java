package com.carlettos.silverfishmod.world.inventory;

import com.carlettos.silverfishmod.listas.ListaRecipeTypes;

import net.minecraft.core.NonNullList;
import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.RecipeHolder;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.fmllegacy.hooks.BasicEventHooks;

public class EssenceResultSlot extends Slot{
    private final EssenceContainer craftContainer;
    private final Player player;
    private int removeCount;

    public EssenceResultSlot(Player player, EssenceContainer craftContainer, Container container, int id, int x, int y) {
        super(container, id, x, y);
        this.player = player;
        this.craftContainer = craftContainer;
    }
    
    @Override
    public boolean mayPlace(ItemStack stack) {
        return false;
    }
    
    @Override
    public ItemStack remove(int cantidad) {
        if(this.hasItem()) {
            this.removeCount += Math.min(cantidad, this.getItem().getCount());
        }
        return super.remove(cantidad);
    }
    
    @Override
    protected void onQuickCraft(ItemStack stack, int cantidad) {
        this.removeCount += cantidad;
        this.checkTakeAchievements(stack);
    }
    
    @Override
    protected void onSwapCraft(int cantidad) {
        this.removeCount += cantidad;
    }
    
    @Override
    protected void checkTakeAchievements(ItemStack stack) {
        if(this.removeCount > 0) {
            stack.onCraftedBy(this.player.level, this.player, this.removeCount);
            BasicEventHooks.firePlayerCraftingEvent(this.player, stack, this.craftContainer);
        }
        if (this.container instanceof RecipeHolder) {
            ((RecipeHolder)this.container).awardUsedRecipes(this.player);
        }
        this.removeCount = 0;
    }
    
    @Override
    public void onTake(Player player, ItemStack stack) {
        this.checkTakeAchievements(stack);
        ForgeHooks.setCraftingPlayer(player);
        NonNullList<ItemStack> list = player.level.getRecipeManager().getRemainingItemsFor(ListaRecipeTypes.ESSENCE, this.craftContainer, player.level);
        ForgeHooks.setCraftingPlayer(null);
        for (int i = 0; i < list.size(); i++) {
            ItemStack stack1 = this.craftContainer.getItem(i);
            ItemStack stack2 = list.get(i);
            if (!stack1.isEmpty()) {
                this.craftContainer.removeItem(i, 1);
                stack1 = this.craftContainer.getItem(i);
            }
            
            if (!stack2.isEmpty()) {
                if(stack1.isEmpty()) {
                    this.craftContainer.setItem(i, stack2);
                } else if (ItemStack.isSame(stack1, stack2) && ItemStack.tagMatches(stack1, stack2)) {
                    stack2.grow(stack1.getCount());
                    this.craftContainer.setItem(i, stack2);
                } else if (!this.player.getInventory().add(stack2)) {
                    this.player.drop(stack2, false);
                }
            }
        }
    }
}
