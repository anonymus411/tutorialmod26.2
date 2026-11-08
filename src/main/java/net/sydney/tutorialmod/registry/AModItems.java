package net.sydney.tutorialmod.registry;

import com.google.common.collect.Sets;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.references.BlockItemId;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.item.component.*;
import net.minecraft.world.level.block.Block;
import net.sydney.tutorialmod.FoodValues;
import net.sydney.tutorialmod.item.FuelBlockItem;
import net.sydney.tutorialmod.item.FuelItem;
import net.sydney.tutorialmod.item.KnifeItem;
import net.sydney.tutorialmod.item.PlaceableItem;
import net.sydney.tutorialmod.references.ModBlockItemIds;
import net.sydney.tutorialmod.references.ModItemIds;
import net.sydney.tutorialmod.tag.ModTags;
import org.jspecify.annotations.Nullable;


import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import static net.sydney.tutorialmod.refabricated.RegUtils.regItem;


@SuppressWarnings("unused")
public class AModItems
{
	public static LinkedHashSet<Supplier<Item>> CREATIVE_TAB_ITEMS = Sets.newLinkedHashSet();

	private static Supplier<Item> registerWithTab(final ResourceKey<Item> key, final Function<Item.Properties, Item> function, final Item.Properties properties) {
		properties.setId(key);
		Supplier<Item> item = regItem(key, () -> function.apply(properties));
		CREATIVE_TAB_ITEMS.add(item);
		return item;
	}

	public static Supplier<Item> registerHidden(final ResourceKey<Item> key, final Function<Item.Properties, Item> function, final Item.Properties properties) {
		properties.setId(key);
		return regItem(key, () -> function.apply(properties));
	}

	private static Supplier<Item> registerFuelWithTab(final ResourceKey<Item> key, final Item.Properties properties, final int burnTime) {
		properties.setId(key);
		Supplier<Item> item = regItem(key, () -> new FuelItem(properties, burnTime));
		CREATIVE_TAB_ITEMS.add(item);
		return item;
	}

	private static Supplier<Item> registerBlockWithTab(final BlockItemId id, final BiFunction<Block, Item.Properties, Item> function, final Block block, final Item.Properties properties) {
		properties.setId(id.item());
		properties.useBlockDescriptionPrefix();
		Supplier<Item> item = regItem(id.item(), () -> function.apply(block, properties));
		CREATIVE_TAB_ITEMS.add(item);
		return item;
	}

	private static Supplier<Item> registerItemNameBlockWithTab(final BlockItemId id, final BiFunction<Block, Item.Properties, Item> function, final Block block, final Item.Properties properties) {
		properties.setId(id.item());
		Supplier<Item> item = regItem(id.item(), () -> function.apply(block, properties));
		CREATIVE_TAB_ITEMS.add(item);
		return item;
	}

	private static Supplier<Item> registerFuelBlockWithTab(final BlockItemId id, final Block block, final Item.Properties properties, final int burnTime) {
		properties.setId(id.item());
		properties.useBlockDescriptionPrefix();
		Supplier<Item> item = regItem(id.item(), () -> new FuelBlockItem(block, properties, burnTime));
		CREATIVE_TAB_ITEMS.add(item);
		return item;
	}

	// Helper methods
	public static Item.Properties knifeItem(ToolMaterial material) {
		HolderGetter<Block> holderGetter = BuiltInRegistries.acquireBootstrapRegistrationLookup(BuiltInRegistries.BLOCK);
		return new Item.Properties()
				.durability(material.durability())
				.repairable(material.repairItems())
				.enchantable(material.enchantmentValue())
				.attributes(KnifeItem.createAttributes(material, 0.5F, -2.0F))
				.component(DataComponents.TOOL, new Tool(
						List.of(
								Tool.Rule.deniesDrops(holderGetter.getOrThrow(material.incorrectBlocksForDrops())),
								Tool.Rule.minesAndDrops(holderGetter.getOrThrow(ModTags.Blocks.MINEABLE_WITH_KNIFE), material.speed()),
								Tool.Rule.overrideSpeed(holderGetter.getOrThrow(FDRefabricatedTags.Blocks.KNIFE_INSTANTLY_MINES), Float.MAX_VALUE)
						), 1.0F, 1, false))
				.component(DataComponents.WEAPON, new Weapon(2));
	}


	public static Item.Properties foodItem(FoodProperties food) {
		return foodItem(food, null);
	}

	public static Item.Properties foodItem(FoodProperties food, @Nullable Consumable consumable) {
		return new Item.Properties().food(food)
				.component(DataComponents.CONSUMABLE, consumable != null ? consumable : Consumables.DEFAULT_FOOD);
	}

	public static Item.Properties bowlFoodItem(FoodProperties food) {
		return bowlFoodItem(food, null);
	}

	public static Item.Properties bowlFoodItem(FoodProperties food, @Nullable Consumable consumable) {
		return new Item.Properties().food(food)
				.component(DataComponents.CONSUMABLE, consumable != null ? consumable : Consumables.DEFAULT_FOOD)
				.craftRemainder(Items.BOWL)
				.stacksTo(16);
	}

	public static Item.Properties drinkItem() {
		return drinkItem(null);
	}

	public static Item.Properties drinkItem(@Nullable Consumable consumable) {
		return new Item.Properties().craftRemainder(Items.GLASS_BOTTLE)
				.component(DataComponents.CONSUMABLE, consumable != null ? consumable : Consumables.DEFAULT_DRINK)
				.stacksTo(16);
	}

		// Canvas Signs...


		// Tool

		public static final Supplier<Item> FLINT_KNIFE = registerWithTab(ModItemIds.FLINT_KNIFE,
				KnifeItem::new, knifeItem(ModToolMaterials.FLINT));
		public static final Supplier<Item> COPPER_KNIFE = registerWithTab(ModItemIds.COPPER_KNIFE,
				KnifeItem::new, knifeItem(ToolMaterial.COPPER));
		public static final Supplier<Item> IRON_KNIFE = registerWithTab(ModItemIds.IRON_KNIFE,
				KnifeItem::new, knifeItem(ToolMaterial.IRON));
		public static final Supplier<Item> DIAMOND_KNIFE = registerWithTab(ModItemIds.DIAMOND_KNIFE,
				KnifeItem::new, knifeItem(ToolMaterial.DIAMOND));
		public static final Supplier<Item> NETHERITE_KNIFE = registerWithTab(ModItemIds.NETHERITE_KNIFE,
				KnifeItem::new, knifeItem(ToolMaterial.NETHERITE).fireResistant());
		public static final Supplier<Item> GOLDEN_KNIFE = registerWithTab(ModItemIds.GOLDEN_KNIFE,
				KnifeItem::new, knifeItem(ToolMaterial.GOLD));

	// Wild Crops

	public static final Supplier<Item> CABBAGE_LEAF = registerWithTab(ModItemIds.CABBAGE_LEAF,
			Item::new, foodItem(FoodValues.CABBAGE_LEAF, FoodValues.ConsumableValues.FAST_FOOD));
	// Basic Crops


	public static final Supplier<Item> CABBAGE_SEEDS = registerItemNameBlockWithTab(ModBlockItemIds.CABBAGE_CROP,
			BlockItem::new, AModBlocks.CABBAGE_CROP.get(), basicItem());

	// Helper methods
	public static Item.Properties basicItem() {
		return new Item.Properties();
    }

	public static final Supplier<Item> CABBAGE = registerWithTab(ModItemIds.CABBAGE,
			Item::new, foodItem(FoodValues.CABBAGE));

	

	// Foodstuffs




	// Sweets
	public static final Supplier<Item> APPLE_PIE = registerBlockWithTab(ModBlockItemIds.APPLE_PIE,
			PlaceableItem::new, AModBlocks.APPLE_PIE.get(), basicItem());
	public static final Supplier<Item> APPLE_PIE_SLICE = registerWithTab(ModItemIds.APPLE_PIE_SLICE,
			Item::new, foodItem(FoodValues.PIE_SLICE, FoodValues.ConsumableValues.PIE_SLICE));
	public static final Supplier<Item> SWEET_BERRY_CHEESECAKE = registerBlockWithTab(ModBlockItemIds.SWEET_BERRY_CHEESECAKE,
			PlaceableItem::new, AModBlocks.SWEET_BERRY_CHEESECAKE.get(), basicItem());
	public static final Supplier<Item> SWEET_BERRY_CHEESECAKE_SLICE = registerWithTab(ModItemIds.SWEET_BERRY_CHEESECAKE_SLICE,
			Item::new, foodItem(FoodValues.PIE_SLICE, FoodValues.ConsumableValues.PIE_SLICE));
	public static final Supplier<Item> CHOCOLATE_PIE = registerBlockWithTab(ModBlockItemIds.CHOCOLATE_PIE,
			PlaceableItem::new, AModBlocks.CHOCOLATE_PIE.get(), basicItem());
	public static final Supplier<Item> CAKE_SLICE = registerWithTab(ModItemIds.CAKE_SLICE,
			Item::new, foodItem(FoodValues.CAKE_SLICE, FoodValues.ConsumableValues.CAKE_SLICE));
	public static final Supplier<Item> CHOCOLATE_PIE_SLICE = registerWithTab(ModItemIds.CHOCOLATE_PIE_SLICE,
			Item::new, foodItem(FoodValues.PIE_SLICE, FoodValues.ConsumableValues.PIE_SLICE));
	public static final Supplier<Item> PUMPKIN_PIE_SLICE = registerWithTab(ModItemIds.PUMPKIN_PIE_SLICE,
			Item::new, foodItem(FoodValues.PIE_SLICE, FoodValues.ConsumableValues.PIE_SLICE));
	// Basic Meals



	// Soups and Stews

	public static final Supplier<Item> OAK_CABINET = registerFuelBlockWithTab(ModBlockItemIds.OAK_CABINET,
			AModBlocks.OAK_CABINET.get(), basicItem(), 300);
	public static final Supplier<Item> SPRUCE_CABINET = registerFuelBlockWithTab(ModBlockItemIds.SPRUCE_CABINET,
			AModBlocks.SPRUCE_CABINET.get(), basicItem(), 300);
	public static final Supplier<Item> BIRCH_CABINET = registerFuelBlockWithTab(ModBlockItemIds.BIRCH_CABINET,
			AModBlocks.BIRCH_CABINET.get(), basicItem(), 300);
	public static final Supplier<Item> JUNGLE_CABINET = registerFuelBlockWithTab(ModBlockItemIds.JUNGLE_CABINET,
			AModBlocks.JUNGLE_CABINET.get(), basicItem(), 300);
	public static final Supplier<Item> ACACIA_CABINET = registerFuelBlockWithTab(ModBlockItemIds.ACACIA_CABINET,
			AModBlocks.ACACIA_CABINET.get(), basicItem(), 300);
	public static final Supplier<Item> DARK_OAK_CABINET = registerFuelBlockWithTab(ModBlockItemIds.DARK_OAK_CABINET,
			AModBlocks.DARK_OAK_CABINET.get(), basicItem(), 300);
	public static final Supplier<Item> MANGROVE_CABINET = registerFuelBlockWithTab(ModBlockItemIds.MANGROVE_CABINET,
			AModBlocks.MANGROVE_CABINET.get(), basicItem(), 300);
	public static final Supplier<Item> CHERRY_CABINET = registerFuelBlockWithTab(ModBlockItemIds.CHERRY_CABINET,
			AModBlocks.CHERRY_CABINET.get(), basicItem(), 300);
	public static final Supplier<Item> BAMBOO_CABINET = registerFuelBlockWithTab(ModBlockItemIds.BAMBOO_CABINET,
			AModBlocks.BAMBOO_CABINET.get(), basicItem(), 300);
	public static final Supplier<Item> PALE_OAK_CABINET = registerFuelBlockWithTab(ModBlockItemIds.PALE_OAK_CABINET,
			AModBlocks.PALE_OAK_CABINET.get(), basicItem(), 300);
	public static final Supplier<Item> CRIMSON_CABINET = registerBlockWithTab(ModBlockItemIds.CRIMSON_CABINET,
			BlockItem::new, AModBlocks.CRIMSON_CABINET.get(), basicItem());
	public static final Supplier<Item> WARPED_CABINET = registerBlockWithTab(ModBlockItemIds.WARPED_CABINET,
			BlockItem::new, AModBlocks.WARPED_CABINET.get(), basicItem());

	// Plated Meals

	// Feasts




	public static void touch() {

	}
}
