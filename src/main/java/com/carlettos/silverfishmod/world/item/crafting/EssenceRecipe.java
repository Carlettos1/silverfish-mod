package com.carlettos.silverfishmod.world.item.crafting;

import com.carlettos.silverfishmod.listas.ListaRecipeTypes;
import com.carlettos.silverfishmod.world.inventory.EssenceContainer;

import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeType;

public interface EssenceRecipe extends Recipe<EssenceContainer>{
    @Override
    default RecipeType<?> getType() {
        return ListaRecipeTypes.ESSENCE;
    }
}
