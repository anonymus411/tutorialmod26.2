package net.sydney.tutorialmod.registry;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.sydney.tutorialmod.block.entity.CabinetBlockEntity;


import java.util.function.Supplier;

import static net.sydney.tutorialmod.refabricated.RegUtils.regBlockEntity;


public class ModBlockEntityTypes {

	public static final Supplier<BlockEntityType<CabinetBlockEntity>> CABINET = regBlockEntity("cabinet",
			() -> FabricBlockEntityTypeBuilder.create(CabinetBlockEntity::new,
							AModBlocks.OAK_CABINET.get(),
							AModBlocks.BIRCH_CABINET.get(),
							AModBlocks.SPRUCE_CABINET.get(),
							AModBlocks.JUNGLE_CABINET.get(),
							AModBlocks.ACACIA_CABINET.get(),
							AModBlocks.DARK_OAK_CABINET.get(),
							AModBlocks.MANGROVE_CABINET.get(),
							AModBlocks.BAMBOO_CABINET.get(),
							AModBlocks.CHERRY_CABINET.get(),
							AModBlocks.PALE_OAK_CABINET.get(),
							AModBlocks.CRIMSON_CABINET.get(),
							AModBlocks.WARPED_CABINET.get())
					.build());



	public static void touch() {


	}

}
