package net.sydney.tutorialmod.registries;

import net.minecraft.core.registries.Registries;
import net.minecraft.references.BlockItemId;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.storage.loot.LootTable;
import net.sydney.tutorialmod.TutorialMod;
import net.sydney.tutorialmod.block.BasketBlock;
import net.sydney.tutorialmod.block.CabinetBlock;

import net.sydney.tutorialmod.references.ModBlockItemIds;
import net.sydney.tutorialmod.fabric.RegUtils;

import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;

public class TTModBlocks {


	private static ToIntFunction<BlockState> litBlockEmission(int lightValue) {
		return (state) -> state.getValue(BlockStateProperties.LIT) ? lightValue : 0;
	}


	private static ResourceKey<LootTable> lootTableKey(String path) {
		return ResourceKey.create(Registries.LOOT_TABLE, TutorialMod.id("blocks/" + path));
	}


	private static Supplier<Block> regBlock(final ResourceKey<Block> key, final Function<BlockBehaviour.Properties, Block> function, final BlockBehaviour.Properties properties) {
		properties.setId(key);
		return RegUtils.regBlock(key, () -> function.apply(properties));
	}

	private static Supplier<Block> regBlock(final BlockItemId id, final Function<BlockBehaviour.Properties, Block> function, final BlockBehaviour.Properties properties) {
		return regBlock(id.block(), function, properties);
	}

	public static final Supplier<Block> WOODEN_BASKET = regBlock(ModBlockItemIds.WOODEN_BASKET,
			BasketBlock::new, Block.Properties.of().strength(1.5F).sound(SoundType.WOOD));
	public static final Supplier<Block> BAMBOO_BASKET = regBlock(ModBlockItemIds.BAMBOO_BASKET,
			BasketBlock::new, Block.Properties.of().strength(1.5F).sound(SoundType.BAMBOO_WOOD));
	/**
	 * Deprecated reference added for backwards compatibility. Use BAMBOO_BASKET instead.
	 */
	@Deprecated(forRemoval = true)
	public static final Supplier<Block> BASKET = BAMBOO_BASKET;


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
	public static final Supplier<Block> CRIMSON_CABINET = regBlock(ModBlockItemIds.CRIMSON_CABINET,
			CabinetBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.NETHER_WOOD));
	public static final Supplier<Block> WARPED_CABINET = regBlock(ModBlockItemIds.WARPED_CABINET,
			CabinetBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.NETHER_WOOD));
	public static final Supplier<Block> BAMBOO_CABINET = regBlock(ModBlockItemIds.BAMBOO_CABINET,
			CabinetBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.BAMBOO_WOOD));


	public static final Supplier<Block> DARK_OAK_CABINET = regBlock(ModBlockItemIds.DARK_OAK_CABINET,
			CabinetBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL));
	public static final Supplier<Block> MANGROVE_CABINET = regBlock(ModBlockItemIds.MANGROVE_CABINET,
			CabinetBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL));

	public static final Supplier<Block> PALE_OAK_CABINET = regBlock(ModBlockItemIds.PALE_OAK_CABINET,
			CabinetBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL));
	public static final Supplier<Block> CHERRY_CABINET = regBlock(ModBlockItemIds.CHERRY_CABINET,
			CabinetBlock::new, Block.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.CHERRY_WOOD));

	public static void touch() {

	}
}

