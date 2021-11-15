package com.carlettos.silverfishmod.world.item.crafting;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.carlettos.silverfishmod.world.inventory.EssenceContainer;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;

import net.minecraft.core.NonNullList;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.ShapedRecipe;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.crafting.IShapedRecipe;
import net.minecraftforge.registries.ForgeRegistryEntry;

public class ShapedEssenceRecipe implements EssenceRecipe, IShapedRecipe<EssenceContainer>{
    final int width;
    final int height;
    final NonNullList<Ingredient> recipeItems;
    final ItemStack result;
    private final ResourceLocation id;
    final String group;
    
    public ShapedEssenceRecipe(ResourceLocation loc, String group, int width, int height, NonNullList<Ingredient> items, ItemStack result) {
        this.width = width;
        this.height = height;
        this.group = group;
        this.recipeItems = items;
        this.id = loc;
        this.result = result;
    }
    
    @Override
    public ResourceLocation getId() {
        return id;
    }
    
    @Override
    public RecipeSerializer<?> getSerializer() {
        return RecipeSerializer.SHAPED_RECIPE;
    }

    @Override
    public String getGroup() {
        return group;
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
        return x >= this.width && y >=this.height;
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
    
    public int getWidth() {
        return width;
    }
    
    @Override
    public int getRecipeWidth() {
        return this.getWidth();
    }
    
    public int getHeight() {
        return height;
    }
    
    @Override
    public int getRecipeHeight() {
        return this.getHeight();
    }

    static NonNullList<Ingredient> dissolvePattern(String[] letras, Map<String, Ingredient> map, int x, int y) {
       NonNullList<Ingredient> nonnulllist = NonNullList.withSize(x * y, Ingredient.EMPTY);
       Set<String> set = Sets.newHashSet(map.keySet());
       set.remove(" ");

       for(int i = 0; i < letras.length; ++i) {
          for(int j = 0; j < letras[i].length(); ++j) {
             String s = letras[i].substring(j, j + 1);
             Ingredient ingredient = map.get(s);
             if (ingredient == null) {
                throw new JsonSyntaxException("Pattern references symbol '" + s + "' but it's not defined in the key");
             }

             set.remove(s);
             nonnulllist.set(j + x * i, ingredient);
          }
       }

       if (!set.isEmpty()) {
          throw new JsonSyntaxException("Key defines symbols that aren't used in pattern: " + set);
       } else {
          return nonnulllist;
       }
    }
    
    static String[] shrink(String... p_44187_) {
        int i = Integer.MAX_VALUE;
        int j = 0;
        int k = 0;
        int l = 0;

        for(int i1 = 0; i1 < p_44187_.length; ++i1) {
           String s = p_44187_[i1];
           i = Math.min(i, firstNonSpace(s));
           int j1 = lastNonSpace(s);
           j = Math.max(j, j1);
           if (j1 < 0) {
              if (k == i1) {
                 ++k;
              }

              ++l;
           } else {
              l = 0;
           }
        }

        if (p_44187_.length == l) {
           return new String[0];
        } else {
           String[] astring = new String[p_44187_.length - l - k];

           for(int k1 = 0; k1 < astring.length; ++k1) {
              astring[k1] = p_44187_[k1 + k].substring(i, j + 1);
           }

           return astring;
        }
     }

    private static int firstNonSpace(String p_44185_) {
       int i;
       for(i = 0; i < p_44185_.length() && p_44185_.charAt(i) == ' '; ++i) {
       }

       return i;
    }

    private static int lastNonSpace(String p_44201_) {
       int i;
       for(i = p_44201_.length() - 1; i >= 0 && p_44201_.charAt(i) == ' '; --i) {
       }

       return i;
    }

    static String[] patternFromJson(JsonArray p_44197_) {
       String[] astring = new String[p_44197_.size()];
       if (astring.length > 2) {
          throw new JsonSyntaxException("Invalid pattern: too many rows, " + 2 + " is maximum");
       } else if (astring.length == 0) {
          throw new JsonSyntaxException("Invalid pattern: empty pattern not allowed");
       } else {
          for(int i = 0; i < astring.length; ++i) {
             String s = GsonHelper.convertToString(p_44197_.get(i), "pattern[" + i + "]");
             if (s.length() > 2) {
                throw new JsonSyntaxException("Invalid pattern: too many columns, " + 2 + " is maximum");
             }

             if (i > 0 && astring[0].length() != s.length()) {
                throw new JsonSyntaxException("Invalid pattern: each row must be the same width");
             }

             astring[i] = s;
          }

          return astring;
       }
    }

    static Map<String, Ingredient> keyFromJson(JsonObject p_44211_) {
       Map<String, Ingredient> map = Maps.newHashMap();

       for(Entry<String, JsonElement> entry : p_44211_.entrySet()) {
          if (entry.getKey().length() != 1) {
             throw new JsonSyntaxException("Invalid key entry: '" + (String)entry.getKey() + "' is an invalid symbol (must be 1 character only).");
          }

          if (" ".equals(entry.getKey())) {
             throw new JsonSyntaxException("Invalid key entry: ' ' is a reserved symbol.");
          }

          map.put(entry.getKey(), Ingredient.fromJson(entry.getValue()));
       }

       map.put(" ", Ingredient.EMPTY);
       return map;
    }
    
    public static class Serializer extends ForgeRegistryEntry<RecipeSerializer<?>> implements RecipeSerializer<ShapedEssenceRecipe> {
        @Override
        public ShapedEssenceRecipe fromJson(ResourceLocation loc, JsonObject json) {
            String s = GsonHelper.getAsString(json, "group", "");
            Map<String, Ingredient> map = ShapedEssenceRecipe.keyFromJson(GsonHelper.getAsJsonObject(json, "key"));
            String[] astring = ShapedEssenceRecipe.shrink(ShapedEssenceRecipe.patternFromJson(GsonHelper.getAsJsonArray(json, "pattern")));
            int i = astring[0].length();
            int j = astring.length;
            NonNullList<Ingredient> nonnulllist = ShapedEssenceRecipe.dissolvePattern(astring, map, i, j);
            ItemStack itemstack = ShapedRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(json, "result"));
            return new ShapedEssenceRecipe(loc, s, i, j, nonnulllist, itemstack);
        }
        
        @Override
        public ShapedEssenceRecipe fromNetwork(ResourceLocation loc, FriendlyByteBuf buffer) {
            int i = buffer.readVarInt();
            int j = buffer.readVarInt();
            String s = buffer.readUtf();
            NonNullList<Ingredient> nonnulllist = NonNullList.withSize(i * j, Ingredient.EMPTY);

            for(int k = 0; k < nonnulllist.size(); ++k) {
               nonnulllist.set(k, Ingredient.fromNetwork(buffer));
            }

            ItemStack itemstack = buffer.readItem();
            return new ShapedEssenceRecipe(loc, s, i, j, nonnulllist, itemstack);
        }

        @Override
        public void toNetwork(FriendlyByteBuf buffer, ShapedEssenceRecipe recipe) {
           buffer.writeVarInt(recipe.width);
           buffer.writeVarInt(recipe.height);
           buffer.writeUtf(recipe.group);

           for(Ingredient ingredient : recipe.recipeItems) {
              ingredient.toNetwork(buffer);
           }

           buffer.writeItem(recipe.result);
        }
    }
}
