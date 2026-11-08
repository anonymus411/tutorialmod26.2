package net.sydney.tutorialmod.item.component.consumable;

import com.mojang.serialization.MapCodec;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.consume_effects.ConsumeEffect;
import net.minecraft.world.level.Level;


public record ExtinguishConsumeEffect() implements ConsumeEffect {
	public static final MapCodec<ExtinguishConsumeEffect> CODEC = MapCodec.unit(new ExtinguishConsumeEffect());
	public static final StreamCodec<RegistryFriendlyByteBuf, ExtinguishConsumeEffect> STREAM_CODEC = StreamCodec.unit(new ExtinguishConsumeEffect());


	@Override
	public Type<? extends ConsumeEffect> getType() {
		return null;
	}

	@Override
	public boolean apply(Level level, ItemStack stack, LivingEntity entity) {
		entity.extinguishFire();
		return true;
	}
}