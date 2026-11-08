package net.sydney.tutorialmod.data;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalBlockTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.tags.BlockItemTagAppender;
import net.minecraft.references.BlockItemId;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.TagBuilder;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ColorCollection;
import org.jspecify.annotations.NonNull;

import net.sydney.tutorialmod.references.ModBlockIds;
import net.sydney.tutorialmod.references.ModBlockItemIds;



import java.util.concurrent.CompletableFuture;

public class BlockTags extends FabricTagsProvider.BlockTagsProvider {
	public BlockTags(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
		super(output, lookupProvider);
	}

	@Override
	protected void addTags(HolderLookup.@NonNull Provider provider) {

		this.registerRefabricatedTags();
		this.registerMinecraftTags();
		this.registerNeoForgeTags();
		this.registerCommonTags();
		this.registerCompatibilityTags();

		this.registerBlockMineables();
	}

	protected void registerBlockMineables() {
	}

	protected void registerMinecraftTags() {


	}

	protected void registerNeoForgeTags() {



	}

	protected void registerCommonTags() {

	}

	private void registerRefabricatedTags() {
	}

	private void registerCompatibilityTags() {


	}

	private RefabricatedTagBuilder tagBuilder(TagKey<Block> tagKey) {
		return new RefabricatedTagBuilder(tagKey);
	}

	public class RefabricatedTagBuilder {
		private final BlockItemTagAppender<Block> builder;

		private TagBuilder rawBuilder;

		public RefabricatedTagBuilder(TagKey<Block> tag) {
			this.builder = builder(tag);

			this.rawBuilder = getOrCreateRawBuilder(tag);
		}

		public RefabricatedTagBuilder addOptionalTag(TagKey<Block> itemTagKey) {
			builder.addOptionalTag(itemTagKey);
			return this;
		}

		public RefabricatedTagBuilder add(BlockItemId... items) {
			builder.add(items);
			return this;
		}

		@SafeVarargs
		public final RefabricatedTagBuilder add(ResourceKey<Block>... items) {
			builder.add(items);
			return this;
		}

		public RefabricatedTagBuilder addColorKey(ColorCollection<ResourceKey<Block>> items) {
			builder.addAll(items);
			return this;
		}

		public RefabricatedTagBuilder addColorId(ColorCollection<BlockItemId> items) {
			builder.addAll(items.map(BlockItemId::block));
			return this;
		}

		public RefabricatedTagBuilder addOptional(Identifier item) {
			rawBuilder = rawBuilder.addOptionalElement(item);
			return this;
		}

		@SafeVarargs
		public final void addTags(TagKey<Block>... tags) {
			for (TagKey<Block> tag : tags) {
				builder.addTag(tag);
			}


			}
		}

	}



