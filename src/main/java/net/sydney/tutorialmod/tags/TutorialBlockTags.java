package net.sydney.tutorialmod.tags;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.sydney.tutorialmod.TutorialMod;

public class TutorialBlockTags {
    public static final TagKey<Block> HYDRANGEA_BUSH_PLACEABLE = create("hydrangea_bush_placeable");

    public static final TagKey<Block> AMARANTH = create("flowers/amaranth");

    private static TagKey<Block> create(String name) {
        return TagKey.create(Registries.BLOCK, TutorialMod.id(name));
    }

    private static TagKey<Block> createCommon(String name) {
        return TagKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("c", name));
    }
}


