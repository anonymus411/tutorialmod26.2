package net.sydney.tutorialmod.integration.rei.client;

import me.shedaniel.math.Rectangle;
import me.shedaniel.rei.api.client.plugins.REIClientPlugin;
import me.shedaniel.rei.api.client.registry.category.CategoryRegistry;
import me.shedaniel.rei.api.client.registry.display.DisplayRegistry;
import me.shedaniel.rei.api.client.registry.screen.ScreenRegistry;
import me.shedaniel.rei.api.client.registry.transfer.TransferHandlerRegistry;
import me.shedaniel.rei.api.client.registry.transfer.simple.SimpleTransferHandler;
import me.shedaniel.rei.api.common.util.EntryIngredients;
import me.shedaniel.rei.api.common.util.EntryStacks;

import me.shedaniel.rei.plugin.common.displays.DefaultInformationDisplay;
import net.minecraft.network.chat.Component;



import net.sydney.tutorialmod.utility.TextUtils;
import net.sydney.tutorialmod.integration.rei.REICategoryIdentifiers;




;

public class ClientREIPlugin implements REIClientPlugin  {

    @Override
    public void registerDisplays(DisplayRegistry registry) {

	}

    @Override
    public void registerScreens(ScreenRegistry registry) {

    }

    @Override
    public void registerCategories(CategoryRegistry registry) {
        registry.add(


        );

    }

    @Override
    public void registerTransferHandlers(TransferHandlerRegistry registry) {

    }
}
