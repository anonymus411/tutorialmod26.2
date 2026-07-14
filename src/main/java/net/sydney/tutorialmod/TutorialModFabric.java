package net.sydney.tutorialmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerEntityEvents;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.world.entity.SpawnPlacements;


public class TutorialModFabric implements ModInitializer {

    private static String firstInitializedFrom = null;

    @Override
    public void onInitialize() {
        initializeTutorialMod("TutorialMod Initializer");
    }

    public static void initializeTutorialMod(String initializedFrom) {
        if (firstInitializedFrom != null) {
            TutorialMod.LOGGER.debug("Attempted to Initialize TutorialMod (TutorialMod) from \"{}\" but TutorialMod already was initialized from \"{}\", this should not be a problem.", initializedFrom, firstInitializedFrom);
            return;
        }
        firstInitializedFrom = initializedFrom;


    }
}
