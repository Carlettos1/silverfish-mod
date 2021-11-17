package com.carlettos.silverfishmod.event.client;

import java.util.ArrayList;
import java.util.List;

import com.carlettos.silverfishmod.client.helper.TooltipHelper;
import com.carlettos.silverfishmod.listas.ListaTags;
import com.carlettos.silverfishmod.util.Par;
import com.carlettos.silverfishmod.util.Util;
import com.mojang.datafixers.util.Either;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.FormattedText;
import net.minecraft.network.chat.Style;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.Container;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.RecipesUpdatedEvent;
import net.minecraftforge.client.event.RenderTooltipEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid=Util.MOD_ID)
public class TooltipEvents {
    
    @OnlyIn(Dist.CLIENT)
    @SubscribeEvent
    public static void onTooltipRender(RenderTooltipEvent.GatherComponents event) {
        List<Par<Integer, Recipe<?>>> jerarquia = new ArrayList<>();
        List<Item> listaItems = new ArrayList<>();
        List<Item> lista = new ArrayList<>();
        List<Recipe<?>> arbol = new ArrayList<>() {
            private static final long serialVersionUID = -3327040777848815729L;
            public void add(int i, Recipe<?> recipe) {
                if(recipe.getType() == RecipeType.SMITHING) {
                    return;
                }
                if(recipe.getIngredients().stream().allMatch(ingredient -> {
                    return List.of(ingredient.getItems()).stream().map(stack -> stack.getItem()).allMatch(item -> !listaItems.contains(item) && !lista.contains(item));
                })) {
                    recipe.getIngredients().stream().forEach(ingredient -> {
                        List.of(ingredient.getItems()).stream().map(stack -> stack.getItem()).forEach(item -> lista.add(item));
                    });
                    jerarquia.add(new Par<Integer, Recipe<?>>(i, recipe));
                    super.add(recipe);
                }
            };
        };
        Item item = event.getStack().getItem();
        listaItems.add(item);
        for(int i = 1; i < 100; i++) {
            int size = arbol.size();
            for (Item item1 : listaItems) {
                for (Recipe<?> recipe : getRecetas(item1)) {
                    arbol.add(i, recipe);
                }
            }
            listaItems.addAll(lista);
            lista.clear();
            if(size == arbol.size()) {
                break;
            }
        }
        ItemTags.getAllTags().getAvailableTags().forEach(System.out::println);;
        boolean hasany = jerarquia.stream().map(par -> par.y.getIngredients().stream().map(ingr -> ingr.getItems()).toList()).anyMatch(listastacks -> {
            return listastacks.stream().map(stacks -> List.of(stacks).stream().map(stack -> stack.getItem()).toList()).anyMatch(items -> {
                return items.stream().anyMatch(item1 -> ListaTags.Items.SILVERFISHED.contains(item1));
            });
        });
        if (hasany) {
            event.getTooltipElements().add(Either.left(FormattedText.of("Be aware...", Style.EMPTY.withColor(ChatFormatting.DARK_RED))));
        }
    }
    
    @SubscribeEvent
    public static void onRecipesUpdatedEvent(RecipesUpdatedEvent event) {
        TooltipHelper.recetas = event.getRecipeManager().getRecipes();
    }
    
    public static String recipeToString(Recipe<?> recipe) {
        return recipe.getType() + ": " + recipe.getResultItem().getItem() + ": " + recipe.getIngredients().stream().map(ingredient -> ingredient.toJson()).toList();
    }
    
    public static List<Recipe<?>> getRecetas(Item item){
        return TooltipHelper.recetas.stream().filter(recipe -> recipe.getResultItem().getItem().equals(item)).toList();
    }

    @Deprecated(since = "0.1", forRemoval = false)
    public static List<Item> getingredientes(Item item) {
        List<Item> ingredientes = new ArrayList<>();
        TooltipHelper.recetas.forEach(recipe -> {
            if(recipe.getResultItem().getItem().equals(item)) {
                recipe.getIngredients().stream().map(ingrediente -> ingrediente.getItems()).forEach(items -> List.of(items).forEach(item1 -> ingredientes.add(item1.getItem())));
            }
        });
        return ingredientes;
    }
    
    @Deprecated(since = "0.1", forRemoval = false)
    public static void addRecetas(List<? extends Recipe<? extends Container>> recetas, List<Item> ingredientes, List<Item> resultados) {
        recetas.forEach((receta) -> {
            resultados.add(receta.getResultItem().getItem());
            receta.getIngredients().stream().map(ing -> List.of(ing.getItems())).toList().forEach(list -> list.forEach(ing -> ingredientes.add(ing.getItem())));
        });
    }
}
