package com.carlettos.silverfishmod.listas;

import com.carlettos.silverfishmod.world.item.crafting.EssenceRecipe;

import net.minecraft.world.item.crafting.RecipeType;

public class ListaRecipeTypes {
    public static final RecipeType<EssenceRecipe> ESSENCE;
    
    static {
        ESSENCE = new RecipeType<EssenceRecipe>() {
            @Override
            public String toString() {
                return "essence";
            }
        };
    }
}
