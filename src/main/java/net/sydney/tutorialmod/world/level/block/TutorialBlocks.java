package net.sydney.tutorialmod.world.level.block;

import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.ColorRGBA;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.equipment.Equippable;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.grower.TreeGrower;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.sydney.tutorialmod.TutorialMod;
import net.sydney.tutorialmod.PlatformHandler;

import net.sydney.tutorialmod.tags.TutorialBlockTags;
import net.sydney.tutorialmod.world.item.TutorialItems;
import net.sydney.tutorialmod.world.level.plants.PottedBlock;
import net.sydney.tutorialmod.world.level.plants.flower.*;


import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * The blocks for Oh The Biomes We've Gone.
 * This class is used for registering blocks and blockitems.
 * @see Registries#BLOCK
 * @author Joseph T. McQuigg
 */
@SuppressWarnings("unused")


public class TutorialBlocks {

    public static final ArrayList<Supplier<? extends Block>> cubeAllBlocks = new ArrayList<>();

    public static final ArrayList<Supplier<? extends Block>> BLOCKS = new ArrayList<>();
    public static final ArrayList<Supplier<? extends Item>> BLOCK_ITEMS = new ArrayList<>();

    public static final FlowerBlockFeature BLUE_SAGE = registerFlower("blue_sage", Block.box(4.0, 0.0, 4.0, 12.0, 13.0, 12.0));


    private static FlowerBlockFeature registerFlower(String key) {
        Supplier<? extends Block> flower = registerBlockItem(key, TutTallFlowerBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_TULIP).noOcclusion());
        return new FlowerBlockFeature(key, flower);
    }

    private static FlowerBlockFeature registerFlower(String key, VoxelShape shape) {
        Supplier<? extends Block> flower = registerBlockItem(key, properties -> new TutFlowerBlock(properties, BlockTags.DIRT, shape), BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_TULIP).noOcclusion());
        return new FlowerBlockFeature(key, flower);
    }

    private static FlowerBlockFeature registerFlower(String key, VoxelShape shape, Supplier<? extends Block> growAble) {
        Supplier<? extends Block> flower = registerBlockItem(key, properties -> new TutBonemealableFlowerBlock(properties, BlockTags.DIRT, shape, growAble), BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_TULIP).noOcclusion());
        return new FlowerBlockFeature(key, flower);
    }

    private static FlowerBlockFeature registerFlower(String key, BlockBehaviour.Properties properties, VoxelShape shape) {
        Supplier<? extends Block> flower = registerBlockItem(key, properties1 -> new TutFlowerBlock(properties1, BlockTags.DIRT, shape), properties);
        return new FlowerBlockFeature(key, flower);
    }

    private static Supplier<TallFlowerBlock> registerTallFlower(String key) {
        return registerBlockItem(key, TutTallFlowerBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.SUNFLOWER).noOcclusion());
    }

    private static Supplier<TallFlowerBlock> registerTallFlower(String key, Supplier<TreeGrower> treeGrower) {
        return registerBlockItem(key, properties -> new TutTallFlowerBlockTreeGrower(properties, treeGrower), BlockBehaviour.Properties.ofFullCopy(Blocks.SUNFLOWER).noOcclusion());
    }

    private static Supplier<TallFlowerBlock> registerTallGlowingFlower(String key) {
        return registerBlockItem(key, TutTallFlowerBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.SUNFLOWER).lightLevel(state -> 10).noOcclusion());
    }

    public static Supplier<Block> registerBasicBlockWithItem(String key, BlockBehaviour.Properties properties) {
        return registerCubeAllBlockItem(key, Block::new, properties);
    }

    public static <B extends Block> Supplier<B> registerBlockItem(String key, Function<BlockBehaviour.Properties, B> block, BlockBehaviour.Properties properties) {
        Supplier<B> holder = registerBlock(key, block, properties);
        Supplier<Item> item = TutorialItems.register(key, properties1 -> new BlockItem(holder.get(), properties1), new Item.Properties().useBlockDescriptionPrefix());
        BLOCK_ITEMS.add(item);
        return holder;
    }

    public static <B extends Block> Supplier<B> registerBlockItem(String key, Function<BlockBehaviour.Properties, B> block, BlockBehaviour.Properties properties, Item.Properties itemProperties) {
        Supplier<B> holder = registerBlock(key, block, properties);
        Supplier<Item> item = TutorialItems.register(key, properties1 -> new BlockItem(holder.get(), properties1), itemProperties);
        BLOCK_ITEMS.add(item);
        return holder;
    }

    public static <B extends Block> Supplier<B> registerBlockItemNoTab(String key, Function<BlockBehaviour.Properties, B> block, BlockBehaviour.Properties properties) {
        Supplier<B> holder = registerBlock(key, block, properties);
        TutorialItems.register(key, properties1 -> new BlockItem(holder.get(), properties1), new Item.Properties().useBlockDescriptionPrefix());
        return holder;
    }

    public static <B extends Block> Supplier<B> registerCubeAllBlockItem(String key, Function<BlockBehaviour.Properties, B> block, BlockBehaviour.Properties properties) {
        Supplier<B> holder = registerBlockItem(key, block, properties);
        if (PlatformHandler.PLATFORM_HANDLER.isDatagen()) cubeAllBlocks.add(holder);
        return holder;
    }

    public static <B extends Block> PottedBlock createPottedVariant(String key, Function<BlockBehaviour.Properties, B> block, BlockBehaviour.Properties properties) {
        Supplier<B> holder = registerBlockItem(key, block, properties);
        return new PottedBlock(key, holder);
    }

    public static <B extends Block> PottedBlock createPottedVariantWithoutItem(String key, Function<BlockBehaviour.Properties, B> block, BlockBehaviour.Properties properties) {
        Supplier<B> holder = registerBlock(key, block, properties);
        return new PottedBlock(key, holder);
    }

    public static <B extends Block> Supplier<B> registerBlock(String id, Function<BlockBehaviour.Properties, B> block, BlockBehaviour.Properties properties) {
        Supplier<B> blockSupplier = register(id, block, properties);
        BLOCKS.add(blockSupplier);
        return blockSupplier;
    }

    public static <B extends Block> Supplier<B> registerBlock(String id, Supplier<B> block) {
        Supplier<B> blockSupplier = register(id, block);
        BLOCKS.add(blockSupplier);
        return blockSupplier;
    }

    public static <B extends Block> Supplier<B> register(String id, Function<BlockBehaviour.Properties, B> block, BlockBehaviour.Properties properties) {
        return PlatformHandler.PLATFORM_HANDLER.register(BuiltInRegistries.BLOCK, id, () -> block.apply(properties.setId(key(id))));
    }

    public static <B extends Block> Supplier<B> register(String id, Supplier<B> block) {
        return PlatformHandler.PLATFORM_HANDLER.register(BuiltInRegistries.BLOCK, id, block);
    }

    private static ResourceKey<Block> key(String id) {
        return TutorialMod.key(Registries.BLOCK, id);
    }

    public static void blocks() {
        TutorialMod.LOGGER.info("Registering  Tutorial Mod Blocks");

    }
}
