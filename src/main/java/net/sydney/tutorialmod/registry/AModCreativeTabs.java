package net.sydney.tutorialmod.registry;

import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.sydney.tutorialmod.TutorialMod;


import java.util.function.Supplier;

import static net.sydney.tutorialmod.refabricated.RegUtils.regTab;


public class AModCreativeTabs {
    public static final Supplier<CreativeModeTab> TAB_FARMERS_DELIGHT = regTab(TutorialMod.MOD_ID,
            () -> FabricCreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.tutorialmod"))
                    .icon(() -> new ItemStack(AModBlocks.APPLE_PIE.get()))
                    .displayItems((parameters, output) -> AModItems.CREATIVE_TAB_ITEMS.forEach((item) -> output.accept(item.get())))
                    .build());

    public static void touch() {

    }
}
