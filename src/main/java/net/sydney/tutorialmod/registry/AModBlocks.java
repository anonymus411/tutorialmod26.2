package net.sydney.tutorialmod.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.references.BlockItemId;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.storage.loot.LootTable;
import net.sydney.tutorialmod.ModItems;
import net.sydney.tutorialmod.TutorialMod;
import net.sydney.tutorialmod.block.*;
import net.sydney.tutorialmod.refabricated.RegUtils;
import net.sydney.tutorialmod.references.ModBlockItemIds;
import org.jspecify.annotations.Nullable;


import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;

public class AModBlocks
{
	private static ToIntFunction<BlockState> litBlockEmission(int lightValue) {
		return (state) -> state.getValue(BlockStateProperties.LIT) ? lightValue : 0;
	}

	private static ResourceKey<LootTable> lootTableKey(String path) {
		return ResourceKey.create(Registries.LOOT_TABLE, TutorialMod.id("blocks/"+path));
	}


	private static Supplier<Block> regBlock(final ResourceKey<Block> key, final Function<BlockBehaviour.Properties, Block> function, final BlockBehaviour.Properties properties) {
		properties.setId(key);
		return RegUtils.regBlock(key, () -> function.apply(properties));
	}

	private static Supplier<Block> regBlock(final BlockItemId id, final Function<BlockBehaviour.Properties, Block> function, final BlockBehaviour.Properties properties) {
		return regBlock(id.block(), function, properties);
	}

	// Workstatio

	// Crop Storage


	// Building

	public static final Supplier<Block> OAK_CABINET = regBlock(ModBlockItemIds.OAK_CABINET,
			CabinetBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL));
	public static final Supplier<Block> SPRUCE_CABINET = regBlock(ModBlockItemIds.SPRUCE_CABINET,
			CabinetBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL));
	public static final Supplier<Block> BIRCH_CABINET = regBlock(ModBlockItemIds.BIRCH_CABINET,
			CabinetBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL));
	public static final Supplier<Block> JUNGLE_CABINET = regBlock(ModBlockItemIds.JUNGLE_CABINET,
			CabinetBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL));
	public static final Supplier<Block> ACACIA_CABINET = regBlock(ModBlockItemIds.ACACIA_CABINET,
			CabinetBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL));
	public static final Supplier<Block> DARK_OAK_CABINET = regBlock(ModBlockItemIds.DARK_OAK_CABINET,
			CabinetBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL));
	public static final Supplier<Block> MANGROVE_CABINET = regBlock(ModBlockItemIds.MANGROVE_CABINET,
			CabinetBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL));
	public static final Supplier<Block> CHERRY_CABINET = regBlock(ModBlockItemIds.CHERRY_CABINET,
			CabinetBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.CHERRY_WOOD));
	public static final Supplier<Block> BAMBOO_CABINET = regBlock(ModBlockItemIds.BAMBOO_CABINET,
			CabinetBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.BAMBOO_WOOD));
	public static final Supplier<Block> PALE_OAK_CABINET = regBlock(ModBlockItemIds.PALE_OAK_CABINET,
			CabinetBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL));
	public static final Supplier<Block> CRIMSON_CABINET = regBlock(ModBlockItemIds.CRIMSON_CABINET,
			CabinetBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.NETHER_WOOD));
	public static final Supplier<Block> WARPED_CABINET = regBlock(ModBlockItemIds.WARPED_CABINET,
			CabinetBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.NETHER_WOOD));



	// Pastries
	public static final Supplier<Block> APPLE_PIE = regBlock(ModBlockItemIds.APPLE_PIE,
			(properties) -> new PieBlock(properties, () -> AModItems.APPLE_PIE_SLICE.get()), //dont kill double lambda
			Block.Properties.ofFullCopy(Blocks.CAKE));
	public static final Supplier<Block> SWEET_BERRY_CHEESECAKE = regBlock(ModBlockItemIds.SWEET_BERRY_CHEESECAKE,
			(properties) -> new PieBlock(properties, () -> AModItems.SWEET_BERRY_CHEESECAKE_SLICE.get()),
			Block.Properties.ofFullCopy(Blocks.CAKE));
	public static final Supplier<Block> CHOCOLATE_PIE = regBlock(ModBlockItemIds.CHOCOLATE_PIE,
			(properties) -> new PieBlock(properties, () -> AModItems.CHOCOLATE_PIE_SLICE.get()),
			Block.Properties.ofFullCopy(Blocks.CAKE));
	// Wild Crops


	// Crops
	public static final Supplier<Block> CABBAGE_CROP = regBlock(ModBlockItemIds.CABBAGE_CROP,
			CabbageBlock::new, Block.Properties.ofFullCopy(Blocks.WHEAT));
	// Feasts

	public static void touch() {

	}
}
