package com.carlettos.silverfishmod.listas;

import com.carlettos.silverfishmod.world.item.crafting.ShapedEssenceRecipe;

import net.minecraft.world.item.crafting.RecipeSerializer;

public class ListaRecipeSerializers {
    public static final RecipeSerializer<ShapedEssenceRecipe> SHAPED_ESSENCE_RECIPE;
    
    static {
        SHAPED_ESSENCE_RECIPE = new ShapedEssenceRecipe.Serializer();
    }
}
