package com.carlettos.silverfishmod.world.inventory;

import java.util.Optional;

import com.carlettos.silverfishmod.listas.ListaBloques;
import com.carlettos.silverfishmod.listas.ListaMenuTypes;
import com.carlettos.silverfishmod.listas.ListaRecipeTypes;
import com.carlettos.silverfishmod.world.item.crafting.EssenceRecipe;

import net.minecraft.network.protocol.game.ClientboundContainerSetSlotPacket;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.StackedContents;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.RecipeBookMenu;
import net.minecraft.world.inventory.RecipeBookType;
import net.minecraft.world.inventory.ResultContainer;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.level.Level;

public class EssenceMenu extends RecipeBookMenu<EssenceContainer>{
    public static final int RESULT_SLOT = 0;
    private static final int CRAFT_SLOT_START = 1;
    private static final int CRAFT_SLOT_END = 5;
    private static final int INV_SLOT_START = 5;
    private static final int INV_SLOT_END = 32;
    private static final int USE_ROW_SLOT_START = 32;
    private static final int USE_ROW_SLOT_END = 41;
    private final EssenceContainer craftContainer = new EssenceContainer(this);
    private final ResultContainer resultContainer = new ResultContainer();
    private final ContainerLevelAccess access;
    private final Player player;
    
    public EssenceMenu(int id, Inventory inventory) {
        this(id, inventory, ContainerLevelAccess.NULL);
    }

    public EssenceMenu(int id, Inventory inventory, ContainerLevelAccess access) {
        super(ListaMenuTypes.ESSENCE, id);
        this.access = access;
        this.player = inventory.player;
        this.addSlot(new EssenceResultSlot(inventory.player, this.craftContainer, this.resultContainer, 0, 124, 35));

        this.addSlot(new Slot(this.craftContainer, 0, 18, 18));
        this.addSlot(new Slot(this.craftContainer, 1, 57, 18));
        this.addSlot(new Slot(this.craftContainer, 2, 18, 50));
        this.addSlot(new Slot(this.craftContainer, 3, 57, 50));

        for(int k = 0; k < 3; ++k) {
           for(int i1 = 0; i1 < 9; ++i1) {
              this.addSlot(new Slot(inventory, i1 + k * 9 + 9, 8 + i1 * 18, 84 + k * 18));
           }
        }

        for(int l = 0; l < 9; ++l) {
           this.addSlot(new Slot(inventory, l, 8 + l * 18, 142));
        }
    }
    
    @Override
    public void slotsChanged(Container container) {
        this.access.execute((level, pos) ->  slotChangedCraftingGrid(this, level, this.player, this.craftContainer, this.resultContainer));
    }
    
    @Override
    public void fillCraftSlotsStackedContents(StackedContents contents) {
        this.craftContainer.fillStackedContents(contents);
    }
    
    @Override
    public void clearCraftingContent() {
        this.craftContainer.clearContent();
        this.resultContainer.clearContent();
    }
    
    @Override
    public boolean recipeMatches(Recipe<? super EssenceContainer> recipe) {
        return recipe.matches(this.craftContainer, this.player.level);
    }
    
    @Override
    public void removed(Player player) {
        super.removed(player);
        this.access.execute((level, pos) -> this.clearContainer(player, this.craftContainer));
    }
    
    @Override
    public boolean stillValid(Player player) {
        return stillValid(this.access, player, ListaBloques.ESSENCE_TABLE);
    }
    
    @Override
    public ItemStack quickMoveStack(Player player, int id) {
        ItemStack stack = ItemStack.EMPTY;
        Slot slot = this.slots.get(id);
        if (slot != null && slot.hasItem()) {
            ItemStack stack1 = slot.getItem();
            stack = stack1.copy();
            if (id == RESULT_SLOT) {
                this.access.execute((level, pos) -> stack1.getItem().onCraftedBy(stack1, level, player));
                if (!this.moveItemStackTo(stack1, CRAFT_SLOT_END, USE_ROW_SLOT_END, false)) {
                    return ItemStack.EMPTY;
                }
                slot.onQuickCraft(stack1, stack);
                
            } else if (id >= INV_SLOT_START && id < USE_ROW_SLOT_END) {
                if (!this.moveItemStackTo(stack1, CRAFT_SLOT_START, CRAFT_SLOT_END, false)) {
                    if (id < INV_SLOT_END) {
                        if (!this.moveItemStackTo(stack1, USE_ROW_SLOT_START, USE_ROW_SLOT_END, false)) {
                            return ItemStack.EMPTY;
                        }
                    } else if (!this.moveItemStackTo(stack1, INV_SLOT_START, INV_SLOT_END, false)) {
                        return ItemStack.EMPTY;
                    }
                }
            } else if (!this.moveItemStackTo(stack1, INV_SLOT_START, USE_ROW_SLOT_END, false)) {
                return ItemStack.EMPTY;
            }
            
            if (stack1.isEmpty()) {
                slot.set(ItemStack.EMPTY);
            } else {
                slot.setChanged();
            }
            
            if (stack1.getCount() == stack.getCount()) {
                return ItemStack.EMPTY;
            }
            
            slot.onTake(player, stack1);
            if (id == 0) {
                player.drop(stack1, false);
            }
        }
        return stack;
    }
    
    @Override
    public boolean canTakeItemForPickAll(ItemStack stack, Slot slot) {
        return slot.container != this.resultContainer && super.canTakeItemForPickAll(stack, slot);
    }
    
    @Override
    public int getResultSlotIndex() {
        return RESULT_SLOT;
    }
    
    @Override
    public int getGridHeight() {
        return this.craftContainer.getHeight();
    }

    public int getGridWidth() {
       return this.craftContainer.getWidth();
    }
    
    @Override
    public int getSize() {
        return 5;
    }
    
    @Override
    public RecipeBookType getRecipeBookType() {
        return RecipeBookType.CRAFTING;
    }
    
    @Override
    public boolean shouldMoveToInventory(int id) {
        return id != this.getResultSlotIndex();
    }
    
    protected static void slotChangedCraftingGrid(AbstractContainerMenu menu, Level level, Player player, EssenceContainer container, ResultContainer result) {
        if (!level.isClientSide) {
            ServerPlayer serverplayer = (ServerPlayer)player;
            ItemStack itemstack = ItemStack.EMPTY;
            Optional<EssenceRecipe> optional = level.getServer().getRecipeManager().getRecipeFor(ListaRecipeTypes.ESSENCE, container, level);
            if (optional.isPresent()) {
               EssenceRecipe essencerecipe = optional.get();
               if (result.setRecipeUsed(level, serverplayer, essencerecipe)) {
                  itemstack = essencerecipe.assemble(container);
               }
            }

            result.setItem(0, itemstack);
            menu.setRemoteSlot(0, itemstack);
            serverplayer.connection.send(new ClientboundContainerSetSlotPacket(menu.containerId, menu.incrementStateId(), 0, itemstack));
         }
    }
}
