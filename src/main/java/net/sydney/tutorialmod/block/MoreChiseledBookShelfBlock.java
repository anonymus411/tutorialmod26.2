package net.sydney.tutorialmod.block;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ChiseledBookShelfBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.sydney.tutorialmod.TutorialMod;

public class MoreChiseledBookShelfBlock  extends ChiseledBookShelfBlock {
    public final String chiseledBookshelfWoodType;

    public MoreChiseledBookShelfBlock(MapColor colour, String chiseledBookshelfWoodType) {
        super(Properties.ofFullCopy(Blocks.CHISELED_BOOKSHELF).mapColor(colour).setId(ResourceKey.create(Registries.BLOCK, TutorialMod.asId(chiseledBookshelfWoodType + "_chiseled_bookshelf"))));
        this.chiseledBookshelfWoodType = chiseledBookshelfWoodType;
    }

    public MoreChiseledBookShelfBlock(MapColor colour, SoundType soundType, String chiseledBookshelfWoodType) {
        super(Properties.ofFullCopy(Blocks.CHISELED_BOOKSHELF).mapColor(colour).setId(ResourceKey.create(Registries.BLOCK, TutorialMod.asId(chiseledBookshelfWoodType + "_chiseled_bookshelf"))).sound(soundType));
        this.chiseledBookshelfWoodType = chiseledBookshelfWoodType;
    }

}