package net.sydney.tutorialmod.integration.modmenu;

import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;
import net.minecraft.network.chat.Component;
import net.sydney.tutorialmod.Configuration;
import net.sydney.tutorialmod.TutorialMod;


import net.sydney.tutorialmod.refabricated.mlconfigs.fabric.FabricConfigListScreen;



public class ModMenuCompat implements ModMenuApi {

    @Override
    public ConfigScreenFactory<?> getModConfigScreenFactory() {

        return null;
    }

}