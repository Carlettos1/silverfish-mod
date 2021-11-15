package com.carlettos.silverfishmod.listas;

import com.carlettos.silverfishmod.client.gui.screens.inventory.EssenceScreen;
import com.carlettos.silverfishmod.world.inventory.EssenceMenu;

import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.world.inventory.MenuType;

public class ListaMenuTypes {
    public static final MenuType<EssenceMenu> ESSENCE = new MenuType<>(EssenceMenu::new);
    
    static {
        MenuScreens.register(ESSENCE, EssenceScreen::new);
    }
}
