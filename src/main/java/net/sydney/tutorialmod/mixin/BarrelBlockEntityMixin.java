package net.sydney.tutorialmod.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;

import net.minecraft.network.chat.Component;
import net.minecraft.world.level.block.entity.BarrelBlockEntity;
import net.sydney.tutorialmod.block.MoreBarrelBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static net.sydney.tutorialmod.TutorialMod.MOD_ID;
import static net.sydney.tutorialmod.init.MoreBarrelItems.more_barrels;


@Mixin(BarrelBlockEntity.class)
public class BarrelBlockEntityMixin {
    @ModifyReturnValue(method = "getDefaultName", at = @At("RETURN"))
    private Component modifiedGetDefaultNameAtReturn(Component original) {
        if (((BarrelBlockEntity) (Object) this).getBlockState().getBlock() instanceof MoreBarrelBlock moreBarrelBlock) {
            if (more_barrels.contains(moreBarrelBlock)) {
                return Component.translatable("container." + MOD_ID + "." + moreBarrelBlock.barrelWoodType + "_barrel");
            } else {
                return Component.translatable(moreBarrelBlock.getDescriptionId());
            }
        }
        return original;
    }
}
