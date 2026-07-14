package net.sydney.tutorialmod.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplate;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.sydney.tutorialmod.block.ModBlocks;
import net.sydney.tutorialmod.item.ModItems;
import net.sydney.tutorialmod.world.item.TutorialItems;
import net.sydney.tutorialmod.world.level.block.TutorialBlocks;


public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {

        // blockModelGenerators.createTrivialCube(ModBlocks.FLUORITE_BLOCK);
        blockModelGenerators.createTrivialCube(ModBlocks.RAW_FLUORITE_BLOCK);
        blockModelGenerators.createTrivialCube(ModBlocks.FLUORITE_ORE);
        blockModelGenerators.createTrivialCube(ModBlocks.FLUORITE_DEEPSLATE_ORE);
        blockModelGenerators.createTrivialCube(ModBlocks.BLACK_OPAL_BLOCK);
        blockModelGenerators.createTrivialCube(ModBlocks.FLUORITE_BLOCK);

        blockModelGenerators.createPlantWithDefaultItem(ModBlocks.BEGONIA, ModBlocks.POTTED_BEGONIA, BlockModelGenerators.PlantType.TINTED);
        blockModelGenerators.createPlantWithDefaultItem(ModBlocks.AMARANTH, ModBlocks.POTTED_AMARANTH, BlockModelGenerators.PlantType.TINTED);
        blockModelGenerators.createPlantWithDefaultItem(ModBlocks.PURPLE_AMARANTH, ModBlocks.POTTED_PURPLE_AMARANTH, BlockModelGenerators.PlantType.TINTED);



        blockModelGenerators.createPlantWithDefaultItem(ModBlocks.WINTER_CYCLAMEN, ModBlocks.POTTED_WINTER_CYCLAMEN, BlockModelGenerators.PlantType.TINTED);

    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        itemModelGenerators.generateFlatItem(ModItems.FLUORITE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.RAW_FLUORITE, ModelTemplates.FLAT_ITEM);

    }
}

