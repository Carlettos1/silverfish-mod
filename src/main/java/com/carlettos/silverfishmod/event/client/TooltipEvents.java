package com.carlettos.silverfishmod.event.client;

import java.util.ArrayList;
import java.util.List;

import com.carlettos.silverfishmod.client.helper.TooltipHelper;
import com.carlettos.silverfishmod.tooltip.test.DetectorTooltip;
import com.carlettos.silverfishmod.util.Util;
import com.mojang.datafixers.util.Either;

import net.minecraft.network.chat.FormattedText;
import net.minecraft.world.Container;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Recipe;
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
        event.getTooltipElements().add(Either.right(new DetectorTooltip(0)));
        event.getTooltipElements().add(Either.left(FormattedText.of(getingredientes(event.getStack().getItem()).toString())));
    }
    
    @SubscribeEvent
    public static void onRecipesUpdatedEvent(RecipesUpdatedEvent event) {
        TooltipHelper.recetas = event.getRecipeManager().getRecipes();
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
