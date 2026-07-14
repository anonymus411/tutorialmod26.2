package net.sydney.tutorialmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagEntry;
import net.sydney.tutorialmod.TutorialMod;
import net.sydney.tutorialmod.block.ModBlocks;
import net.sydney.tutorialmod.world.level.block.TutorialBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends FabricTagsProvider.BlockTagsProvider {
    public ModBlockTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
       getOrCreateRawBuilder(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(TagEntry.element(Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID,"fluorite_block")))
               .add(TagEntry.element(Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID,"raw_fluorite_block")))
               .add(TagEntry.element(Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID,"fluorite_ore")))
               .add(TagEntry.element(Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID,"fluorite_deepslate_ore")));


        getOrCreateRawBuilder(BlockTags.FLOWERS)
                .add(TagEntry.element(Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID,"begonia")));
        getOrCreateRawBuilder(BlockTags.FLOWER_POTS)
                .add(TagEntry.element(Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID,"potted_begonia")));
        getOrCreateRawBuilder(BlockTags.FLOWERS)
                .add(TagEntry.element(Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID,"amaranth")));
        getOrCreateRawBuilder(BlockTags.FLOWER_POTS)
                .add(TagEntry.element(Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID,"potted_amaranth")));

                   getOrCreateRawBuilder(BlockTags.FLOWERS).add(TagEntry.element(Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID,"purple_amaranth")));
        getOrCreateRawBuilder(BlockTags.FLOWER_POTS)
                .add(TagEntry.element(Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID,"potted_purple_amaranth")));






        getOrCreateRawBuilder(BlockTags.FLOWERS)
                .add(TagEntry.element(Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID,"winter_cyclamen")));
        getOrCreateRawBuilder(BlockTags.FLOWER_POTS)
                .add(TagEntry.element(Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID,"potted_winter_cyclamen")));




        getOrCreateRawBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(TagEntry.element(Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID,"fluorite_deepslate_ore")));


        getOrCreateRawBuilder(BlockTags.NEEDS_DIAMOND_TOOL);


    }
}