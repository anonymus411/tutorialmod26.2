package net.sydney.tutorialmod.registry;

import net.minecraft.resources.Identifier;
import net.minecraft.sounds.SoundEvent;
import net.sydney.tutorialmod.TutorialMod;

import java.util.function.Supplier;

import static net.sydney.tutorialmod.refabricated.RegUtils.regSound;


public class ModSounds
{
	// Stove
	public static final Supplier<SoundEvent> BLOCK_STOVE_CRACKLE = regSound("block.stove.crackle",
		() -> SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID, "block.stove.crackle")));

	// Cooking Pot
	public static final Supplier<SoundEvent> BLOCK_COOKING_POT_BOIL = regSound("block.cooking_pot.boil",
		() -> SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID, "block.cooking_pot.boil")));
	public static final Supplier<SoundEvent> BLOCK_COOKING_POT_BOIL_SOUP = regSound("block.cooking_pot.boil_soup",
		() -> SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID, "block.cooking_pot.boil_soup")));

	// Cutting Board
	public static final Supplier<SoundEvent> BLOCK_CUTTING_BOARD_PLACE = regSound("block.cutting_board.place_item",
		() -> SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID, "block.cutting_board.place_item")));
	public static final Supplier<SoundEvent> BLOCK_CUTTING_BOARD_REMOVE = regSound("block.cutting_board.remove_item",
		() -> SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID, "block.cutting_board.remove_item")));
	public static final Supplier<SoundEvent> BLOCK_CUTTING_BOARD_CARVE = regSound("block.cutting_board.carve_tool",
		() -> SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID, "block.cutting_board.carve_tool")));
	public static final Supplier<SoundEvent> BLOCK_CUTTING_BOARD_KNIFE = regSound("block.cutting_board.knife_cut",
		() -> SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID, "block.cutting_board.knife_cut")));

	// Rope Fence Gate
	public static final Supplier<SoundEvent> BLOCK_ROPE_FENCE_GATE_OPEN = regSound("block.rope_fence_gate.open",
		() -> SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID, "block.rope_fence_gate.open")));
	public static final Supplier<SoundEvent> BLOCK_ROPE_FENCE_GATE_CLOSE = regSound("block.rope_fence_gate.close",
		() -> SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID, "block.rope_fence_gate.close")));

	// Cabinet
	public static final Supplier<SoundEvent> BLOCK_CABINET_OPEN = regSound("block.cabinet.open",
		() -> SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID, "block.cabinet.open")));
	public static final Supplier<SoundEvent> BLOCK_CABINET_CLOSE = regSound("block.cabinet.close",
		() -> SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID, "block.cabinet.close")));

	// Skillet
	public static final Supplier<SoundEvent> BLOCK_SKILLET_SIZZLE = regSound("block.skillet.sizzle",
		() -> SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID, "block.skillet.sizzle")));
	public static final Supplier<SoundEvent> BLOCK_SKILLET_ADD_FOOD = regSound("block.skillet.add_food",
		() -> SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID, "block.skillet.add_food")));
	public static final Supplier<SoundEvent> ITEM_SKILLET_ATTACK_STRONG = regSound("item.skillet.attack.strong",
		() -> SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID, "item.skillet.attack.strong")));
	public static final Supplier<SoundEvent> ITEM_SKILLET_ATTACK_WEAK = regSound("item.skillet.attack.weak",
		() -> SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID, "item.skillet.attack.weak")));

	// Tomato Bush
	public static final Supplier<SoundEvent> BLOCK_TOMATOES_PICK_TOMATOES = regSound("block.tomatoes.pick_tomatoes",
		() -> SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID, "block.tomatoes.pick_tomatoes")));

	// Food
	public static final Supplier<SoundEvent> BLOCK_FOOD_TAKE_PORTION = regSound("block.food.take_portion",
		() -> SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID, "block.food.take_portion")));
	public static final Supplier<SoundEvent> BLOCK_FOOD_SLICE = regSound("block.food.slice",
		() -> SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID, "block.food.slice")));

	public static final Supplier<SoundEvent> ENTITY_ROTTEN_TOMATO_THROW = regSound("entity.rotten_tomato.throw",
		() -> SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID, "entity.rotten_tomato.throw")));
	public static final Supplier<SoundEvent> ENTITY_ROTTEN_TOMATO_HIT = regSound("entity.rotten_tomato.hit",
		() -> SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID, "entity.rotten_tomato.hit")));

	public static void touch() {

	}
}
