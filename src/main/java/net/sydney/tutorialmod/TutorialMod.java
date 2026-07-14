package net.sydney.tutorialmod;

import net.fabricmc.api.ModInitializer;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.core.Registry;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.sydney.tutorialmod.block.ModBlocks;

import net.sydney.tutorialmod.creativemodetab.ModCreativeModeTabs;
import net.sydney.tutorialmod.item.FuelBlockItem;
import net.sydney.tutorialmod.item.FuelItem;
import net.sydney.tutorialmod.item.ModItems;


import net.sydney.tutorialmod.references.ModCreativeTabs;
import net.sydney.tutorialmod.registries.ModBlockEntityTypes;
import net.sydney.tutorialmod.registries.ModSounds;
import net.sydney.tutorialmod.registries.TModItems;
import net.sydney.tutorialmod.registries.TTModBlocks;
import net.sydney.tutorialmod.world.item.TutorialItems;

import net.sydney.tutorialmod.world.level.block.TutorialBlocks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

    public class TutorialMod implements ModInitializer {
        public static final String MOD_ID = "tutorialmod";
        public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
public static Identifier getId(String id) {
    return Identifier.fromNamespaceAndPath(MOD_ID, id);



}





        @Override
        public void onInitialize() {
            ModBlocks.registerModBlocks();
            ModItems.registerModItems();
            TutorialItems.items();
            TutorialBlocks.blocks();
            ModBlockEntityTypes.touch();
            ModSounds.touch();
            ModBlocks.touch();
            ModCreativeTabs.touch();
            TModItems.touch();
            TTModBlocks.touch();

            ModCreativeModeTabs.registerModCreativeModeTabs();

        }
        public static Identifier id(String name) {
            return Identifier.fromNamespaceAndPath(MOD_ID, name);
        }

        public static <T> ResourceKey<T> key(ResourceKey<? extends Registry<T>> registryKey, String name) {
            return ResourceKey.create(registryKey, id(name));
        }
    }



