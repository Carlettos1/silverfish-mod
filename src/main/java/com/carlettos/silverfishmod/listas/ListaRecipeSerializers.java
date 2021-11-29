package com.carlettos.silverfishmod.listas;

import com.carlettos.silverfishmod.world.item.crafting.PorcentualEssenceRecipe;
import com.carlettos.silverfishmod.world.item.crafting.ShapedEssenceRecipe;

import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.SimpleRecipeSerializer;

public class ListaRecipeSerializers {
    public static final RecipeSerializer<ShapedEssenceRecipe> SHAPED_ESSENCE_RECIPE;
    public static final SimpleRecipeSerializer<PorcentualEssenceRecipe> PORCENTUAL_ESSENCE_RECIPE;
    
    static {
        SHAPED_ESSENCE_RECIPE = new ShapedEssenceRecipe.Serializer();
        PORCENTUAL_ESSENCE_RECIPE = new SimpleRecipeSerializer<>(PorcentualEssenceRecipe::new);
    }
}
