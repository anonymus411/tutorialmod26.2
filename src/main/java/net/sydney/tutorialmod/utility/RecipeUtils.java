package net.sydney.tutorialmod.utility;

import net.minecraft.resources.Identifier;
import net.sydney.tutorialmod.TutorialMod;


public class RecipeUtils
{
	public static Identifier FDLocation(String name) {
		return Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID, name);
	}
}
