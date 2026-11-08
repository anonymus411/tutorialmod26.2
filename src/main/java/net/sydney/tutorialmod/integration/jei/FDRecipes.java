package net.sydney.tutorialmod.integration.jei;

import net.fabricmc.fabric.api.recipe.v1.sync.SynchronizedRecipes;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.world.item.crafting.RecipeHolder;




import java.util.List;

public class FDRecipes
{

    private final SynchronizedRecipes synchronizedRecipes;

    public FDRecipes() {
        Minecraft minecraft = Minecraft.getInstance();
		ClientLevel level = minecraft.level;

		if (level != null) {
            synchronizedRecipes = level.recipeAccess().getSynchronizedRecipes();
		} else {
			throw new NullPointerException("Minecraft level must not be null.");
		}
	}




	}

