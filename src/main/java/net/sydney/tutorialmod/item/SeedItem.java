package net.sydney.tutorialmod.item;


import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.TagKey;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FarmlandBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.sydney.tutorialmod.block.CroptopiaCropBlock;


public class SeedItem extends BlockItem {

    private TagKey<Biome> category;

    public SeedItem(Block block, Properties settings, TagKey<Biome> category) {
        super(block, settings);
        if (block instanceof CroptopiaCropBlock crop) {
            crop.setSeed(this);
        }
        this.category = category;
    }



    public TagKey<Biome> getCategory() {
        return category;
    }
}
