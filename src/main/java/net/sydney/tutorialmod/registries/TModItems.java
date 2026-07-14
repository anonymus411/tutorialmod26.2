package net.sydney.tutorialmod.registries;

import com.google.common.collect.Sets;
import net.minecraft.core.component.DataComponents;
import net.minecraft.references.BlockItemId;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.item.component.*;
import net.minecraft.world.level.block.Block;
import net.sydney.tutorialmod.item.FuelBlockItem;
import net.sydney.tutorialmod.references.ModBlockItemIds;
import net.sydney.tutorialmod.world.level.block.TutorialBlocks;
import org.jspecify.annotations.Nullable;


import java.util.LinkedHashSet;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

import static net.sydney.tutorialmod.fabric.RegUtils.regItem;


@SuppressWarnings("unused")
public class TModItems
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
	public static Item.Properties basicItem() {
		return new Item.Properties();
	}

	public static Item.Properties knifeItem(ToolMaterial material) {

        return null;
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

	// Blocks
	public static final Supplier<Item> WOODEN_BASKET = registerFuelBlockWithTab(ModBlockItemIds.WOODEN_BASKET,
			TTModBlocks.WOODEN_BASKET.get(), basicItem(), 300);
	public static final Supplier<Item> BAMBOO_BASKET = registerFuelBlockWithTab(ModBlockItemIds.BAMBOO_BASKET,
			TTModBlocks.BAMBOO_BASKET.get(), basicItem(), 300);

	public static final Supplier<Item> ACACIA_CABINET = registerFuelBlockWithTab(ModBlockItemIds.ACACIA_CABINET,
			TTModBlocks.ACACIA_CABINET.get(), basicItem(), 300);


	public static final Supplier<Item> CHERRY_CABINET = registerFuelBlockWithTab(ModBlockItemIds.CHERRY_CABINET,
			TTModBlocks.CHERRY_CABINET.get(), basicItem(), 300);
;
	public static final Supplier<Item> PALE_OAK_CABINET = registerFuelBlockWithTab(ModBlockItemIds.PALE_OAK_CABINET,
			TTModBlocks.PALE_OAK_CABINET.get(), basicItem(), 300);

	;
	public static final Supplier<Item> BAMBOO_CABINET = registerFuelBlockWithTab(ModBlockItemIds.BAMBOO_CABINET,
			TTModBlocks.BAMBOO_CABINET.get(), basicItem(), 300);

	;
	public static final Supplier<Item> BLUE_SAGE = registerFuelBlockWithTab(ModBlockItemIds.BLUE_SAGE,
			TutorialBlocks.BLUE_SAGE.get(), basicItem(), 300);
	public static void touch() {

	}
}
