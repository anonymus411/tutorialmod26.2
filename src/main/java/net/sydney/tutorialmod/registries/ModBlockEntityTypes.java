package net.sydney.tutorialmod.registries;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.sydney.tutorialmod.block.entity.*;

import java.util.function.Supplier;

import static net.sydney.tutorialmod.fabric.RegUtils.regBlockEntity;


public class ModBlockEntityTypes
{
	public static final Supplier<BlockEntityType<BasketBlockEntity>> BASKET = regBlockEntity("basket",
			() -> FabricBlockEntityTypeBuilder.create(BasketBlockEntity::new, TTModBlocks.WOODEN_BASKET.get(), TTModBlocks.BAMBOO_BASKET.get()).build());
	public static final Supplier<BlockEntityType<CabinetBlockEntity>> CABINET = regBlockEntity("cabinet",
			() -> FabricBlockEntityTypeBuilder.create(CabinetBlockEntity::new,
							TTModBlocks.OAK_CABINET.get(),
							TTModBlocks.BIRCH_CABINET.get(),
							TTModBlocks.SPRUCE_CABINET.get(),
							TTModBlocks.JUNGLE_CABINET.get(),
							TTModBlocks.ACACIA_CABINET.get(),
							TTModBlocks.DARK_OAK_CABINET.get(),
							TTModBlocks.MANGROVE_CABINET.get(),
							TTModBlocks.BAMBOO_CABINET.get(),
							TTModBlocks.CHERRY_CABINET.get(),
							TTModBlocks.PALE_OAK_CABINET.get(),
							TTModBlocks.CRIMSON_CABINET.get(),
							TTModBlocks.WARPED_CABINET.get())
					.build());


	@SafeVarargs
	private static void addSupportedBlocks(BlockEntityType<?> type, Supplier<Block>... blocks) {
		for (Supplier<Block> block : blocks) {
			type.addValidBlock(block.get());
		}
	}


    public static void touch() {

    }
}
