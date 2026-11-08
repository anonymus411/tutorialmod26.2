package net.sydney.tutorialmod;

import net.minecraft.world.entity.npc.villager.Villager;
import net.minecraft.world.item.Item;

import java.util.HashMap;

public class CommonSetup
{
	public static void init() {
		registerDispenserBehaviors();
		registerItemSetAdditions();
	}

	public static void registerDispenserBehaviors() {

	}

	/**
	 * Allows Villagers to actually use Farmer's Delight crops.
	 */
	public static void registerItemSetAdditions() {
//		Set<Item> newWantedItems = Sets.newHashSet(
//				ModItems.CABBAGE.get(),
//				ModItems.TOMATO.get(),
//				ModItems.ONION.get(),
//				ModItems.RICE.get(),
//				ModItems.CABBAGE_SEEDS.get(),
//				ModItems.TOMATO_SEEDS.get(),
//				ModItems.RICE_PANICLE.get());
//		newWantedItems.addAll(Villager.WANTED_ITEMS);
//		Villager.WANTED_ITEMS = ImmutableSet.copyOf(newWantedItems);
		HashMap<Item, Integer> foodPoints = new HashMap<>(Villager.FOOD_POINTS);

	}
}
