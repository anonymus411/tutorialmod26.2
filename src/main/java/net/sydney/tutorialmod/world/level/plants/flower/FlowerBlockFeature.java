package net.sydney.tutorialmod.world.level.plants.flower;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.sydney.tutorialmod.world.level.plants.PottedBlock;
import net.sydney.tutorialmod.world.levelgen.feature.configured.ConfiguredFeaturesUtil;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public class FlowerBlockFeature extends PottedBlock {
    private final ResourceKey<ConfiguredFeature<?, ?>> feature;

    public FlowerBlockFeature(String id, @NotNull Supplier<? extends Block> block) {
        super(id, block);
        this.feature = ConfiguredFeaturesUtil.createSimpleBlockConfiguredFeatureWithBlock(id, block);
    }

    public ResourceKey<ConfiguredFeature<?, ?>> getFeature() {
        return feature;
    }
}

