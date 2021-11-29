package com.carlettos.silverfishmod.world.item.crafting;

import com.carlettos.silverfishmod.essence.util.EssenceLevel;
import com.carlettos.silverfishmod.world.inventory.EssenceContainer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.Level;

public class PorcentualEssenceRecipe implements EssenceRecipe{
    private final ResourceLocation id;
    
    public PorcentualEssenceRecipe(ResourceLocation id) {
        this.id = id;
    }

    @Override
    public ResourceLocation getId() {
        return this.id;
    }

    @Override
    public ItemStack getResultItem() {
        return ItemStack.EMPTY;
    }
    
    @Override
    public boolean isSpecial() {
        return true;
    }

    @Override
    public boolean matches(EssenceContainer container, Level level) {
        return false;
    }

    @Override
    public ItemStack assemble(EssenceContainer p_44001_) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean canCraftInDimensions(int p_43999_, int p_44000_) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public EssenceLevel getEssences() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
