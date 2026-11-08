package net.sydney.tutorialmod.mixin.refabricated;

import net.minecraft.world.inventory.RecipeBookType;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(RecipeBookType.class)
public enum RecipeBookTypeMixin {
	FARMERSDELIGHT_COOKING
}
