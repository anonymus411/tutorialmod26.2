package net.sydney.tutorialmod.references;

import net.minecraft.references.BlockItemId;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.ColorCollection;
import net.sydney.tutorialmod.TutorialMod;


public class ModBlockItemIds {

	public static final BlockItemId WOODEN_BASKET = id("wooden_basket");
	public static final BlockItemId BAMBOO_BASKET = id("bamboo_basket");
	public static final BlockItemId BLUE_SAGE = id("blue_sage");
	public static final BlockItemId OAK_CABINET = id("oak_cabinet");
	public static final BlockItemId SPRUCE_CABINET = id("spruce_cabinet");
	public static final BlockItemId BIRCH_CABINET = id("birch_cabinet");
	public static final BlockItemId JUNGLE_CABINET = id("jungle_cabinet");
	public static final BlockItemId ACACIA_CABINET = id("acacia_cabinet");
	public static final BlockItemId DARK_OAK_CABINET = id("dark_oak_cabinet");
	public static final BlockItemId MANGROVE_CABINET = id("mangrove_cabinet");
	public static final BlockItemId CHERRY_CABINET = id("cherry_cabinet");
	public static final BlockItemId BAMBOO_CABINET = id("bamboo_cabinet");
	public static final BlockItemId PALE_OAK_CABINET = id("pale_oak_cabinet");
	public static final BlockItemId CRIMSON_CABINET = id("crimson_cabinet");
	public static final BlockItemId WARPED_CABINET = id("warped_cabinet");

private static ColorCollection<BlockItemId> createSimpleColored(final String baseName) {
		return ColorCollection.prefixWithColor(ColorCollection.create(baseName)).map(ModBlockItemIds::id);
	}

	private static BlockItemId id(final String blockName, final String itemName) {
		Identifier blockId = TutorialMod.id(blockName);
		Identifier itemId = TutorialMod.id(itemName);
		return BlockItemId.create(blockId, itemId);
	}

	private static BlockItemId id(final String name) {
		return id(name, name);
	}
}
