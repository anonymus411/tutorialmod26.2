package net.sydney.tutorialmod.integration.jei;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.constants.RecipeTypes;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.registration.*;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.ItemStack;

import net.sydney.tutorialmod.TutorialMod;









@JeiPlugin
public class JEIPlugin implements IModPlugin
{
	private static final Identifier ID = Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID, "jei_plugin");

	@Override
	public void registerCategories(IRecipeCategoryRegistration registry) {

	}

	@Override
	public void registerRecipes(IRecipeRegistration registration) {

        FDRecipes modRecipes = new FDRecipes();






	}

	@Override
	public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {



	}

	@Override
	public void registerGuiHandlers(IGuiHandlerRegistration registration) {

	}

	@Override
	public void registerRecipeTransferHandlers(IRecipeTransferRegistration registration) {

	}

	@Override
	public Identifier getPluginUid() {
		return ID;
	}
}
