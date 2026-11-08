package net.sydney.tutorialmod.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;

import net.sydney.tutorialmod.block.ModBlocks;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {
        blockModelGenerators.createPlantWithDefaultItem(ModBlocks.PETUNIA, ModBlocks.POTTED_PETUNIA, BlockModelGenerators.PlantType.TINTED);
        blockModelGenerators.createPlantWithDefaultItem(ModBlocks.AMARANTH, ModBlocks.POTTED_AMARANTH, BlockModelGenerators.PlantType.TINTED);
        blockModelGenerators.createPlantWithDefaultItem(ModBlocks.CALLA_LILY, ModBlocks.POTTED_CALLA_LILY, BlockModelGenerators.PlantType.TINTED);
        blockModelGenerators.createPlantWithDefaultItem(ModBlocks.PURPLE_AMARANTH, ModBlocks.POTTED_PURPLE_AMARANTH, BlockModelGenerators.PlantType.TINTED);
blockModelGenerators.createPlantWithDefaultItem(ModBlocks.WINTER_CYCLAMEN, ModBlocks.POTTED_WINTER_CYCLAMEN,BlockModelGenerators.PlantType.TINTED);
blockModelGenerators.createPlantWithDefaultItem(ModBlocks.CYAN_HYACINTH,ModBlocks.POTTED_CYAN_HYACINTH,BlockModelGenerators.PlantType.TINTED);
        blockModelGenerators.createPlantWithDefaultItem(ModBlocks.CHRYSANTHENUM, ModBlocks.POTTED_CHRYSANTHENUM, BlockModelGenerators.PlantType.TINTED);


        blockModelGenerators.createPlantWithDefaultItem(ModBlocks.ANGELICA, ModBlocks.POTTED_ANGELICA, BlockModelGenerators.PlantType.TINTED);
        blockModelGenerators.createPlantWithDefaultItem(ModBlocks.CROCUS, ModBlocks.POTTED_CROCUS, BlockModelGenerators.PlantType.TINTED);
        blockModelGenerators.createPlantWithDefaultItem(ModBlocks.FAIRY_SLIPPER, ModBlocks.POTTED_FAIRY_SLIPPER, BlockModelGenerators.PlantType.TINTED);
        blockModelGenerators.createPlantWithDefaultItem(ModBlocks.GUZMANIA, ModBlocks.POTTED_GUZMANIA, BlockModelGenerators.PlantType.TINTED);
blockModelGenerators.createDoublePlantWithDefaultItem(ModBlocks.BLUE_ROSE_BUSH, BlockModelGenerators.PlantType.TINTED);
        blockModelGenerators.createDoublePlantWithDefaultItem(ModBlocks.POTTED_BLUE_ROSE_BUSH, BlockModelGenerators.PlantType.TINTED);
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators){}
    }
