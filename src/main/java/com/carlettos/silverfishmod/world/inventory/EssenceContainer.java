package com.carlettos.silverfishmod.world.inventory;

import net.minecraft.core.NonNullList;
import net.minecraft.world.Container;
import net.minecraft.world.ContainerHelper;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.StackedContents;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.StackedContentsCompatible;
import net.minecraft.world.item.ItemStack;

public class EssenceContainer implements Container, StackedContentsCompatible {
    private final NonNullList<ItemStack> items;
    private final int width;
    private final int height;
    private final AbstractContainerMenu menu;
    
    public EssenceContainer(AbstractContainerMenu menu) {
        this.menu = menu;
        this.height = 2;
        this.width = 2;
        this.items = NonNullList.withSize(this.height * this.width, ItemStack.EMPTY);
    }
    
    @Override
    public int getContainerSize() {
        return this.items.size();
    }
    
    @Override
    public boolean isEmpty() {
        return this.items.stream().allMatch(stack -> stack.isEmpty());
    }
    
    @Override
    public ItemStack getItem(int idx) {
        return idx >= this.getContainerSize() ? ItemStack.EMPTY : this.items.get(idx);
    }
    
    @Override
    public ItemStack removeItemNoUpdate(int idx) {
        return ContainerHelper.takeItem(items, idx);
    }
    
    @Override
    public ItemStack removeItem(int i1, int i2) {
        ItemStack stack = ContainerHelper.removeItem(items, i1, i2);
        if(!stack.isEmpty()) {
            this.menu.slotsChanged(this);
        }
        return stack;
    }
    
    @Override
    public void setItem(int idx, ItemStack stack) {
        this.items.set(idx, stack);
        this.menu.slotsChanged(this);
    }
    
    @Override
    public void setChanged() {
    }
    
    @Override
    public boolean stillValid(Player player) {
        return true;
    }
    
    @Override
    public void clearContent() {
        this.items.clear();
    }
    
    public int getHeight() {
        return height;
    }
    
    public int getWidth() {
        return width;
    }
    
    @Override
    public void fillStackedContents(StackedContents contents) {
        this.items.forEach(stack -> contents.accountSimpleStack(stack));
    }
}
