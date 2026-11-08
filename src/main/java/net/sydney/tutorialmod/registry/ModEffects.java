package net.sydney.tutorialmod.registry;

import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.effect.MobEffect;
import net.sydney.tutorialmod.TutorialMod;
import net.sydney.tutorialmod.effect.ComfortEffect;
import net.sydney.tutorialmod.effect.NourishmentEffect;

public class ModEffects
{
	public static final Holder<MobEffect> NOURISHMENT = Registry.registerForHolder(BuiltInRegistries.MOB_EFFECT, TutorialMod.id("nourishment"), new NourishmentEffect());
	public static final Holder<MobEffect> COMFORT = Registry.registerForHolder(BuiltInRegistries.MOB_EFFECT, TutorialMod.id("comfort"), new ComfortEffect());

	public static void register() {
	}

	public static void touch() {

	}
}
