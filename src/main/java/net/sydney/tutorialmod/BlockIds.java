package net.sydney.tutorialmod;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ColorCollection;

public class BlockIds {


    public static final ResourceKey<Block> POTTED_BLUE_ROSE_BUSH= create("potted_blue_rose_bush");
    private static ResourceKey<Block> create(final String name) {
        return ResourceKey.create(Registries.BLOCK, Identifier.withDefaultNamespace(name));
    }


    }




