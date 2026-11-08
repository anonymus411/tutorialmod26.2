package net.sydney.tutorialmod.item;

import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.sydney.tutorialmod.TutorialMod;

import net.sydney.tutorialmod.ModItems;
import net.sydney.tutorialmod.block.ModBlocks;
import net.sydney.tutorialmod.init.McbvBlockInit;
import net.sydney.tutorialmod.init.MoreBarrelBlocks;


public class ModCreativeModeTabs {
    public static final CreativeModeTab TUTORIAL_ITEM_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID, "tutorial_items"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RAW_FLUORITE))
                    .title(Component.translatable("creativemodetab.tutorialmod.fluorite_items"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.FLUORITE);
                        output.accept(ModItems.RAW_FLUORITE);
                        output.accept(ModBlocks.PETUNIA);
                        output.accept(ModBlocks.AMARANTH);
                        output.accept(ModBlocks.CALLA_LILY);
                        output.accept(ModBlocks.PURPLE_AMARANTH);
                        output.accept(ModBlocks.WINTER_CYCLAMEN);
                        output.accept(ModBlocks.CYAN_HYACINTH);
output.accept(ModBlocks.CHRYSANTHENUM);
output.accept(ModBlocks.SEASHELL);


output.accept(McbvBlockInit.ACACIA_CHISELED_BOOKSHELF);
output.accept(McbvBlockInit.BAMBOO_CHISELED_BOOKSHELF);
output.accept(McbvBlockInit.BIRCH_CHISELED_BOOKSHELF);
output.accept(McbvBlockInit.CHERRY_CHISELED_BOOKSHELF);
output.accept(McbvBlockInit.JUNGLE_CHISELED_BOOKSHELF);
output.accept(McbvBlockInit.CRIMSON_CHISELED_BOOKSHELF);
output.accept(McbvBlockInit.MANGROVE_CHISELED_BOOKSHELF);
output.accept(McbvBlockInit.DARK_OAK_CHISELED_BOOKSHELF);
output.accept(McbvBlockInit.WARPED_CHISELED_BOOKSHELF);
output.accept(McbvBlockInit.PALE_OAK_CHISELED_BOOKSHELF);
output.accept(McbvBlockInit.SPRUCE_CHISELED_BOOKSHELF);


output.accept(MoreBarrelBlocks.ACACIA_BARREL);
                        output.accept(MoreBarrelBlocks.BIRCH_BARREL);
                        output.accept(MoreBarrelBlocks.BAMBOO_BARREL);
                        output.accept(MoreBarrelBlocks.CHERRY_BARREL);
                        output.accept(MoreBarrelBlocks.CRIMSON_BARREL);
                        output.accept(MoreBarrelBlocks.MANGROVE_BARREL);
                        output.accept(MoreBarrelBlocks.DARK_OAK_BARREL);
                        output.accept(MoreBarrelBlocks.OAK_BARREL);
                        output.accept(MoreBarrelBlocks.WARPED_BARREL);
                        output.accept(MoreBarrelBlocks.JUNGLE_BARREL);






                    }).build());
    public static final CreativeModeTab TUTORIAL_BLOCK_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID, "tutorial_blocks"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.AMARANTH))
                    .title(Component.translatable("creativemodetab.tutorialmod.fluorite_blocks"))
                    .displayItems((parameters, output) -> {
                       ;          output.accept(ModBlocks.SEASHELL);
output.accept(ModBlocks.MINT_CAKE);
output.accept(ModBlocks.ADZUKI_CAKE);
output.accept(ModBlocks.BANANA_CAKE);
output.accept(ModBlocks.STRAWBERRY_CAKE);
output.accept(ModBlocks.ANGELICA);
output.accept(ModBlocks.CROCUS);
output.accept(ModBlocks.FAIRY_SLIPPER);
output.accept(ModBlocks.GUZMANIA);
output.accept(ModBlocks.BLUE_ROSE_BUSH);
output.accept(ModBlocks.DELPHINIUM);
                    }).build());

    public static void registerModCreativeModeTabs() {
        TutorialMod.LOGGER.info("Registering Creative Mode Tabs for " + TutorialMod.MOD_ID);
    }
}

