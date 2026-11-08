package net.sydney.tutorialmod.registry;


import net.sydney.tutorialmod.advancement.CuttingBoardTrigger;

import java.util.function.Supplier;

import static net.sydney.tutorialmod.refabricated.RegUtils.regTrigger;


public class ModAdvancements
{
	public static final Supplier<CuttingBoardTrigger> USE_CUTTING_BOARD = regTrigger("use_cutting_board", CuttingBoardTrigger::new);

	public static void touch() {
	}
}
