package net.sydney.tutorialmod.client;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;



import java.util.Arrays;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class TutorialModClient {
    public static void onInitialize(){}

        public static void registerEntityRenderers(BiConsumer<EntityType<? extends Entity>, EntityRendererProvider> consumer) {

        }
}

