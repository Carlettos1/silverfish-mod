package com.carlettos.silverfishmod.world.item.crafting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.carlettos.silverfishmod.essence.util.EssenceLevel;
import com.carlettos.silverfishmod.listas.ListaRecipeSerializers;
import com.carlettos.silverfishmod.world.inventory.EssenceContainer;
import com.google.common.collect.Sets;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;

import net.minecraft.core.NonNullList;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.common.crafting.IShapedRecipe;
import net.minecraftforge.registries.ForgeRegistryEntry;

public class ShapedEssenceRecipe implements EssenceRecipe, IShapedRecipe<EssenceContainer>{
    private final NonNullList<Ingredient> recipeItems;
    private final ResourceLocation id;
    private final ItemStack result;
    private final EssenceLevel essences;
    
    public ShapedEssenceRecipe(ResourceLocation loc, NonNullList<Ingredient> items, ItemStack result, EssenceLevel essences) {
        this.recipeItems = items;
        this.id = loc;
        this.result = result;
        this.essences = essences;
    }
    
    @Override
    public EssenceLevel getEssences() {
        return essences;
    }
    
    @Override
    public ResourceLocation getId() {
        return id;
    }
    
    @Override
    public RecipeSerializer<?> getSerializer() {
        return ListaRecipeSerializers.SHAPED_ESSENCE_RECIPE;
    }

    @Override
    public ItemStack getResultItem() {
        return result;
    }
    
    @Override
    public NonNullList<Ingredient> getIngredients() {
        return this.recipeItems;
    }
    
    @Override
    public boolean canCraftInDimensions(int x, int y) {
        return x * y >= this.getIngredients().size();
    }
    
    @Override
    public boolean matches(EssenceContainer container, Level level) {
        for (int i = 0; i < this.getIngredients().size(); i++) {
            if (!this.getIngredients().get(i).test(container.getItem(i))) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public ItemStack assemble(EssenceContainer container) {
        return this.getResultItem().copy();
    }
    
    @Override
    public int getRecipeWidth() {
        return 2;
    }
    
    @Override
    public int getRecipeHeight() {
        return 2;
    }

    private static NonNullList<Ingredient> getIngredients(List<String> pattern, Map<String, Ingredient> keys) {
       NonNullList<Ingredient> ingredientes = NonNullList.withSize(4, Ingredient.EMPTY);
       Set<String> set = Sets.newHashSet(keys.keySet());
       set.remove(" ");
       
       for (int i = 0; i < 4; i++) {
           String key = pattern.get(i);
           Ingredient ingredient = keys.get(key);
           if (ingredient == null) {
              throw new JsonSyntaxException("Pattern references symbol '" + key + "' but it's not defined in the key");
           }
           set.remove(key);
           ingredientes.set(i, ingredient);
       }

       if (!set.isEmpty()) {
          throw new JsonSyntaxException("Key defines symbols that aren't used in pattern: " + set);
       } else {
          return ingredientes;
       }
    }
    
    public static class Serializer extends ForgeRegistryEntry<RecipeSerializer<?>> implements RecipeSerializer<ShapedEssenceRecipe> {
        @Override
        public ShapedEssenceRecipe fromJson(ResourceLocation loc, JsonObject json) {
            List<String> pattern = new ArrayList<>();
            Map<String, Ingredient> keys = new HashMap<>();
            ItemStack resultado = CraftingHelper.getItemStack(GsonHelper.getAsJsonObject(json, "result"), true);
            
            GsonHelper.getAsJsonArray(json, "pattern").forEach(linea -> {
                pattern.addAll(List.of(linea.getAsString().split("")));
            });
            GsonHelper.getAsJsonObject(json, "key").entrySet().forEach(entry -> {
                keys.put(entry.getKey(), Ingredient.fromJson(entry.getValue()));
            });
            keys.put(" ", Ingredient.EMPTY);

            EssenceLevel essenceLevel = EssenceLevel.fromJson(json);
            NonNullList<Ingredient> ingredientes = ShapedEssenceRecipe.getIngredients(pattern, keys);
            return new ShapedEssenceRecipe(loc, ingredientes, resultado, essenceLevel);
        }
        
        @Override
        public ShapedEssenceRecipe fromNetwork(ResourceLocation loc, FriendlyByteBuf buffer) {
            NonNullList<Ingredient> ingredientes = NonNullList.withSize(4, Ingredient.EMPTY);
            for(int k = 0; k < ingredientes.size(); ++k) {
               ingredientes.set(k, Ingredient.fromNetwork(buffer));
            }
            EssenceLevel essenceLevel = EssenceLevel.fromNetwork(buffer);
            ItemStack itemstack = buffer.readItem();
            return new ShapedEssenceRecipe(loc, ingredientes, itemstack, essenceLevel);
        }

        @Override
        public void toNetwork(FriendlyByteBuf buffer, ShapedEssenceRecipe recipe) {
            for(Ingredient ingredient : recipe.recipeItems) {
                ingredient.toNetwork(buffer);
            }
            recipe.essences.toNetwork(buffer);
            buffer.writeItem(recipe.result);
        }
    }
}
