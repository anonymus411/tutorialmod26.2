package net.sydney.tutorialmod.data;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.enchantment.Enchantment;

import java.util.concurrent.CompletableFuture;

public class EnchantmentTags extends FabricTagsProvider<Enchantment>
{
	public EnchantmentTags(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> provider) {
		super(output, Registries.ENCHANTMENT, provider);
	}

	@Override
	protected void addTags(HolderLookup.Provider provider) {

	}
}
