package net.sydney.tutorialmod.util;


import net.minecraft.resources.Identifier;

import java.util.function.Function;

public interface RegisterFunction<T> {
    T register(Identifier id, Function<Identifier, T> object);
}
