package net.sydney.tutorialmod.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.TallFlowerBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

public class TallFlowerCustom extends TallFlowerBlock {
    public TallFlowerCustom(Properties properties) {
        super(properties);
    }

    public static final MapCodec<TallFlowerBlock> CODEC = simpleCodec(TallFlowerBlock::new);

    @Override
    public MapCodec<TallFlowerBlock> codec() {
        return CODEC;
    }


    @Override
    public boolean isValidBonemealTarget(final LevelReader level, final BlockPos pos, final BlockState state) {
        return true;
    }

    @Override
    public boolean isBonemealSuccess(final Level level, final RandomSource random, final BlockPos pos, final BlockState state) {
        return true;
    }

    @Override
    public void performBonemeal(final ServerLevel level, final RandomSource random, final BlockPos pos, final BlockState state) {
        popResource(level, pos, new ItemStack(this));
    }
}


