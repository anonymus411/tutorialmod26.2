package net.sydney.tutorialmod.world.level.plants.flower;

import net.minecraft.core.BlockPos;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.TallFlowerBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class TutTallFlowerBlock extends TallFlowerBlock {

    /** The block that the flower can be placed on. */
    private final TagKey<Block> validGround;

    /**
     * Creates a Tall flower block that can only be placed on the given block.
     * @param properties The properties of the block.
     * @param validGround The block that the flower can be placed on.
     */
    public TutTallFlowerBlock(Properties properties, TagKey<Block> validGround) {
        super(properties);
        this.validGround = validGround;
    }

    /**
     * Creates a Tall flower block that can only be placed on dirt.
     * @see BlockTags#DIRT
     * @param properties The properties of the block.
     */
    public TutTallFlowerBlock(Properties properties) {
        this(properties, BlockTags.DIRT);
    }

    /**
     * Checks if the block can be placed on the given block.
     * @param state The state of the block.
     * @param worldIn The world the block is in.
     * @param pos The position of the block.
     * @return If the block can be placed on the given block.
     */
    @Override
    protected boolean mayPlaceOn(BlockState state, @NotNull BlockGetter worldIn, @NotNull BlockPos pos) {
        return state.is(validGround);
    }
}

