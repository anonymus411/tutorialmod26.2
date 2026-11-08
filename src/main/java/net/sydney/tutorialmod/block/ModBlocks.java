package net.sydney.tutorialmod.block;

import com.google.common.base.Function;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.references.BlockIds;
import net.minecraft.references.BlockItemIds;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.sydney.tutorialmod.TutorialMod;

import static net.minecraft.world.level.block.Blocks.AIR;
import static net.minecraft.world.level.block.Blocks.flowerPotProperties;
import static net.sydney.tutorialmod.registry.ModEffects.register;

public class ModBlocks {

    public static final Block MINT_CAKE= registerBlock("mint_cake",
            properties -> new CustomCakeBlock(properties.strength(4f)
                    .requiresCorrectToolForDrops().sound(SoundType.WOOL)));
    public static final Block BANANA_CAKE= registerBlock("banana_cake",
            properties -> new CustomCakeBlock(properties.strength(4f)
                    .requiresCorrectToolForDrops().sound(SoundType.WOOL)));
    public static final Block STRAWBERRY_CAKE= registerBlock("strawberry_cake",
            properties -> new CustomCakeBlock(properties.strength(4f)
                    .requiresCorrectToolForDrops().sound(SoundType.WOOL)));

    public static final Block ADZUKI_CAKE= registerBlock("adzuki_cake",
            properties -> new CustomCakeBlock(properties.strength(4f)
                    .requiresCorrectToolForDrops().sound(SoundType.WOOL)));


    public static final Block ANGELICA = registerBlock("angelica",
            properties -> new FlowerBlock(MobEffects.BLINDNESS, 12, properties.instabreak().mapColor(MapColor.PLANT)
                    .sound(SoundType.GRASS).noCollision().offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final Block POTTED_ANGELICA = registerBlockWithoutBlockItem("potted_angelica",
            properties -> new FlowerPotBlock(ANGELICA, properties.instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));

    public static final Block CROCUS = registerBlock("crocus",
            properties -> new FlowerBlock(MobEffects.REGENERATION, 12, properties.instabreak().mapColor(MapColor.PLANT)
                    .sound(SoundType.GRASS).noCollision().offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final Block POTTED_CROCUS = registerBlockWithoutBlockItem("potted_crocus",
            properties -> new FlowerPotBlock(CROCUS, properties.instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));

    public static final Block AMARANTH = registerBlock("amaranth",
            properties -> new FlowerBlock(MobEffects.BLINDNESS, 12, properties.instabreak().mapColor(MapColor.PLANT)
                    .sound(SoundType.GRASS).noCollision().offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final Block POTTED_AMARANTH = registerBlockWithoutBlockItem("potted_amaranth",
            properties -> new FlowerPotBlock(AMARANTH, properties.instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));


    public static final Block SEASHELL= registerBlock("seashell",
            properties -> new SeashellBlock(properties.strength(4f)
                    .requiresCorrectToolForDrops().sound(SoundType.BONE_BLOCK)));


    public static final Block GUZMANIA = registerBlock("guzmania",
            properties -> new FlowerBlock(MobEffects.BLINDNESS, 12, properties.instabreak().mapColor(MapColor.PLANT)
                    .sound(SoundType.GRASS).noCollision().offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final Block POTTED_GUZMANIA = registerBlockWithoutBlockItem("potted_guzmania",
            properties -> new FlowerPotBlock(GUZMANIA, properties.instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));



    public static final Block BLUE_ROSE_BUSH = registerBlock("blue_rose_bush",
            properties -> new TallFlowerCustom(properties.instabreak().mapColor(MapColor.PLANT)
                    .sound(SoundType.GRASS).noCollision().offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));


    public static final Block DELPHINIUM = registerBlock("delphinium",
            properties -> new TallFlowerCustom(properties.instabreak().mapColor(MapColor.PLANT)
                    .sound(SoundType.GRASS).noCollision().offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));




    public static final Block FAIRY_SLIPPER = registerBlock("fairy_slipper",
            properties -> new FlowerBlock(MobEffects.BLINDNESS, 12, properties.instabreak().mapColor(MapColor.PLANT)
                    .sound(SoundType.GRASS).noCollision().offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final Block POTTED_FAIRY_SLIPPER = registerBlockWithoutBlockItem("potted_fairy_slipper",
            properties -> new FlowerPotBlock(FAIRY_SLIPPER, properties.instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));

    public static final Block CALLA_LILY = registerBlock("calla_lily",
            properties -> new FlowerBlock(MobEffects.BLINDNESS, 12, properties.instabreak().mapColor(MapColor.PLANT)
                    .sound(SoundType.GRASS).noCollision().offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final Block POTTED_CALLA_LILY = registerBlockWithoutBlockItem("potted_calla_lily",
            properties -> new FlowerPotBlock(CALLA_LILY, properties.instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));



    public static final Block PURPLE_AMARANTH = registerBlock("purple_amaranth",
            properties -> new FlowerBlock(MobEffects.BLINDNESS, 12, properties.instabreak().mapColor(MapColor.PLANT)
                    .sound(SoundType.GRASS).noCollision().offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final Block     POTTED_PURPLE_AMARANTH = registerBlockWithoutBlockItem("potted_purple_amaranth",
            properties -> new FlowerPotBlock(PURPLE_AMARANTH, properties.instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));

    public static final Block     WINTER_CYCLAMEN = registerBlock("winter_cyclamen",
            properties -> new FlowerBlock(MobEffects.BLINDNESS, 12, properties.instabreak().mapColor(MapColor.PLANT)
                    .sound(SoundType.GRASS).noCollision().offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final Block     POTTED_WINTER_CYCLAMEN = registerBlockWithoutBlockItem("potted_winter_cyclamen",
            properties -> new FlowerPotBlock(WINTER_CYCLAMEN, properties.instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));


    public static final Block     POTTED_BLUE_ROSE_BUSH = registerBlockWithoutBlockItem("potted_blue_rose_bush",
            properties -> new FlowerPotBlock(BLUE_ROSE_BUSH, properties.instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));


    public static final Block PETUNIA = registerBlock("petunia",
            properties -> new FlowerBlock(MobEffects.BLINDNESS, 12, properties.instabreak().mapColor(MapColor.PLANT)
                    .sound(SoundType.GRASS).noCollision().offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final Block POTTED_PETUNIA = registerBlockWithoutBlockItem("potted_petunia",
            properties -> new FlowerPotBlock(PETUNIA, properties.instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));

    public static final Block CHRYSANTHENUM = registerBlock("chrysanthenum",
            properties -> new FlowerBlock(MobEffects.BLINDNESS, 12, properties.instabreak().mapColor(MapColor.PLANT)
                    .sound(SoundType.GRASS).noCollision().offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final Block POTTED_CHRYSANTHENUM = registerBlockWithoutBlockItem("potted_chrysanthenum",
            properties -> new FlowerPotBlock(PETUNIA, properties.instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));


    public static final Block CYAN_HYACINTH = registerBlock("cyan_hyacinth",
            properties -> new FlowerBlock(MobEffects.BLINDNESS, 12, properties.instabreak().mapColor(MapColor.PLANT)
                    .sound(SoundType.GRASS).noCollision().offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final Block POTTED_CYAN_HYACINTH = registerBlockWithoutBlockItem("potted_cyan_hyacinth",
            properties -> new FlowerPotBlock(PETUNIA, properties.instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));



    private static Block registerBlockWithoutBlockItem(String name, Function<BlockBehaviour.Properties, Block> function) {
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID, name), function.apply(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID, name)))));
    }

    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> function) {
        Block toRegister = function.apply(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID, name))));
        registerBlockItem(name, toRegister);
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID, name), toRegister);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID, name),
                new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix()
                        .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID, name)))));
    }

    public static void registerModBlocks() {
        TutorialMod.LOGGER.info("Registering Mod Blocks for " + TutorialMod.MOD_ID);
    }
}

