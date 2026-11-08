package net.sydney.tutorialmod.data;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.tags.BlockItemTagAppender;
import net.minecraft.references.BlockItemId;
import net.minecraft.references.BlockItemIds;
import net.minecraft.references.ItemIds;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockItemTags;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagBuilder;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.ColorCollection;
import org.jspecify.annotations.NonNull;


import java.util.concurrent.CompletableFuture;

public class ItemTags extends FabricTagsProvider.ItemTagsProvider
{
	public ItemTags(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> provider, BlockTagsProvider blockTagProvider) {
		super(output, provider, blockTagProvider);
	}

	@Override
	protected void addTags(HolderLookup.@NonNull Provider provider) {



		this.registerMinecraftTags();
		this.registerModTags();

		this.registerConventionalTags();

	}

	private void registerMinecraftTags() {


	}


	private void registerModTags() {





	}

	private void registerConventionalTags() {
		// Add our custom tags to "common" tag groups


	}

	private RefabricatedTagBuilder tagBuilder(TagKey<Item> tagKey) {
		return new RefabricatedTagBuilder(tagKey);
	}

	public class RefabricatedTagBuilder {
		private BlockItemTagAppender<Item> builder;

		private TagBuilder rawBuilder;

		public RefabricatedTagBuilder(TagKey<Item> tag) {
			this.builder = builder(tag);

			this.rawBuilder = getOrCreateRawBuilder(tag);
		}

		public RefabricatedTagBuilder addOptionalTag(TagKey<Item> itemTagKey) {
			builder = builder.addOptionalTag(itemTagKey);
			return this;
		}

		public RefabricatedTagBuilder add(BlockItemId... items) {
			builder.add(items);
			return this;
		}

		@SafeVarargs
		public final RefabricatedTagBuilder add(ResourceKey<Item>... items) {
			builder.add(items);
			return this;
		}

		public RefabricatedTagBuilder addColorKey(ColorCollection<ResourceKey<Item>> items) {
			builder.addAll(items);
			return this;
		}

		public RefabricatedTagBuilder addColorId(ColorCollection<BlockItemId> items) {
			builder.addAll(items.map(BlockItemId::item));
			return this;
		}

		public RefabricatedTagBuilder addOptional(Identifier item) {
			rawBuilder = rawBuilder.addOptionalElement(item);
			return this;
		}

		@SafeVarargs
		public final void addTags(TagKey<Item>... tags) {
			for (TagKey<Item> tag : tags) {
				builder.forceAddTag(tag);
			}
		}

		public RefabricatedTagBuilder addTag(TagKey<Item> tagKey) {
			builder.forceAddTag(tagKey);
			return this;
		}
	}
}
