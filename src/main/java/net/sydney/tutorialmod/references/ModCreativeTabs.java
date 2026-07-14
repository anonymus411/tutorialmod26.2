package net.sydney.tutorialmod.references;

import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.sydney.tutorialmod.TutorialMod;
import net.sydney.tutorialmod.registries.TModItems;
import net.sydney.tutorialmod.registries.TTModBlocks;

import java.util.function.Supplier;

import static net.sydney.tutorialmod.fabric.RegUtils.regTab;

public class ModCreativeTabs {
    public static final Supplier<CreativeModeTab> TAB_TUTORIAL_MOD = regTab(TutorialMod.MOD_ID,
            () -> FabricCreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.tutorialmod"))
                    .icon(() -> new ItemStack(TTModBlocks.PALE_OAK_CABINET.get()))
                    .displayItems((parameters, output) -> TModItems.CREATIVE_TAB_ITEMS.forEach((item) -> output.accept(item.get())))
                    .build());

    public static void touch() {

    }
}
