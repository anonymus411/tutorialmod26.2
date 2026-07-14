package net.sydney.tutorialmod.registries;

import net.minecraft.resources.Identifier;
import net.minecraft.sounds.SoundEvent;
import net.sydney.tutorialmod.TutorialMod;


import java.util.function.Supplier;

import static net.sydney.tutorialmod.fabric.RegUtils.regSound;


public class ModSounds
{
	public static final Supplier<SoundEvent> BLOCK_CUTTING_BOARD_PLACE = regSound("block.cutting_board.place_item",
			() -> SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID, "block.cutting_board.place_item")));
	public static final Supplier<SoundEvent> BLOCK_CUTTING_BOARD_REMOVE = regSound("block.cutting_board.remove_item",
			() -> SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID, "block.cutting_board.remove_item")));
	public static final Supplier<SoundEvent> BLOCK_CUTTING_BOARD_CARVE = regSound("block.cutting_board.carve_tool",
			() -> SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID, "block.cutting_board.carve_tool")));
	public static final Supplier<SoundEvent> BLOCK_CUTTING_BOARD_KNIFE = regSound("block.cutting_board.knife_cut",
			() -> SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID, "block.cutting_board.knife_cut")));
	// Cabinet
	public static final Supplier<SoundEvent> BLOCK_CABINET_OPEN = regSound("block.cabinet.open",
		() -> SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID, "block.cabinet.open")));
	public static final Supplier<SoundEvent> BLOCK_CABINET_CLOSE = regSound("block.cabinet.close",
		() -> SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID, "block.cabinet.close")));

	// Skillet

	public static void touch() {

	}
}
