package net.sydney.tutorialmod;

import com.ibm.icu.impl.number.Properties;
import net.fabricmc.api.ModInitializer;
import net.minecraft.core.Registry;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;


import net.minecraft.world.level.block.Block;
import net.sydney.tutorialmod.block.ModBlocks;
import net.sydney.tutorialmod.init.MoreBarrelBlocks;
import net.sydney.tutorialmod.init.MoreBarrelItems;
import net.sydney.tutorialmod.init.MoreBarrelPointOfInterestTypes;
import net.sydney.tutorialmod.init.McbvItemInit;
import net.sydney.tutorialmod.init.McbvBlockInit;

import net.sydney.tutorialmod.item.ModCreativeModeTabs;


import net.sydney.tutorialmod.registry.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.terraformersmc.modmenu.ModMenu.MOD_ID;

public class TutorialMod  implements ModInitializer   {
        public static final String MOD_ID = "tutorialmod";
        public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
        public static final String LEGACY_MOD_ID = "lolmblv";


    public static Identifier getId(String id) {
        return Identifier.fromNamespaceAndPath(MOD_ID, id);
    }

        @Override
        public void onInitialize () {
            MoreBarrelBlocks.registerBlocks();
            MoreBarrelItems.registerItems();
            MoreBarrelPointOfInterestTypes.init();
            ModSounds.touch();
            McbvBlockInit.registerBlocks();
            McbvItemInit.registerItems();

            ModCreativeModeTabs.registerModCreativeModeTabs();
            ModDataComponents.touch();

            ModBlocks.registerModBlocks();
            ModParticleTypes.touch();


            AModBlocks.touch();
            AModItems.touch();
            ModItems.registerModItems();
            AModCreativeTabs.touch();

            // new stuff

            ModEffects.touch();

            CommonSetup.init();
            ModAdvancements.touch();
            ModItems.registerModItems();

            // Synchronize recipe serializers for JEI/RRV/other recipe viewers

        }
        public static Identifier withMOD_ID (String path){
            return withMOD_ID(path, false);
        }

        public static Identifier withMOD_ID (String path,boolean legacy){
            return Identifier.fromNamespaceAndPath(legacy ? TutorialMod.LEGACY_MOD_ID : MOD_ID, path);
        }


        public static Identifier asId (String path){
            return Identifier.fromNamespaceAndPath(MOD_ID, path);
        }

        public static Identifier id (String name){
            return Identifier.fromNamespaceAndPath(MOD_ID, name);
        }

        public static <T > ResourceKey < T > key(ResourceKey < ? extends Registry<T>>registryKey, String name){
            return ResourceKey.create(registryKey, id(name));
        }

    }