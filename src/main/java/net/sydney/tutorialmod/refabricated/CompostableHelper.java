package net.sydney.tutorialmod.refabricated;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import net.fabricmc.fabric.api.registry.CompostableRegistry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Item;

//This is hacky and tbh not even needed but hey
public class CompostableHelper {

    public static void apply() {
        JsonElement je = new Gson().fromJson(COMPOSTABLES, JsonElement.class);
        if (je != null) {
            var j = je.getAsJsonObject().get("values");
            for (var v : j.getAsJsonObject().asMap().entrySet()) {
                Item i = BuiltInRegistries.ITEM.getValue(Identifier.tryParse(v.getKey().toString()));
                CompostableRegistry.INSTANCE.add(i, v.getValue().getAsJsonObject().get("chance").getAsFloat());
            }
        }
    }

    //just here so we can copy paste FD one here
    private static final String COMPOSTABLES = """
            
            {
              "values": {
                "TutorialMod:apple_pie": {
                  "chance": 1.0
                },
                "TutorialMod:apple_pie_slice": {
                  "chance": 0.85
                },
                "TutorialMod:brown_mushroom_colony": {
                  "chance": 1.0
                },
                "TutorialMod:cabbage": {
                  "chance": 0.65
                },
                "TutorialMod:cabbage_leaf": {
                  "chance": 0.5
                },
                "TutorialMod:cabbage_seeds": {
                  "chance": 0.3
                },
                "TutorialMod:cake_slice": {
                  "chance": 0.85
                },
                "TutorialMod:chocolate_pie": {
                  "chance": 1.0
                },
                "TutorialMod:chocolate_pie_slice": {
                  "chance": 0.85
                },
                "TutorialMod:dumplings": {
                  "chance": 1.0
                },
                "TutorialMod:honey_cookie": {
                  "chance": 0.85
                },
                "TutorialMod:kelp_roll": {
                  "chance": 0.85
                },
                "TutorialMod:kelp_roll_slice": {
                  "chance": 0.5
                },
                "TutorialMod:onion": {
                  "chance": 0.65
                },
                "TutorialMod:pie_crust": {
                  "chance": 0.65
                },
                "TutorialMod:pumpkin_slice": {
                  "chance": 0.5
                },
                "TutorialMod:raw_pasta": {
                  "chance": 0.85
                },
                "TutorialMod:red_mushroom_colony": {
                  "chance": 1.0
                },
                "TutorialMod:rice": {
                  "chance": 0.3
                },
                "TutorialMod:rice_bale": {
                  "chance": 0.85
                },
                "TutorialMod:rice_panicle": {
                  "chance": 0.3
                },
                "TutorialMod:rotten_tomato": {
                  "chance": 0.85
                },
                "TutorialMod:sandy_shrub": {
                  "chance": 0.3
                },
                "TutorialMod:straw": {
                  "chance": 0.3
                },
                "TutorialMod:stuffed_pumpkin_block": {
                  "chance": 1.0
                },
                "TutorialMod:sweet_berry_cheesecake": {
                  "chance": 1.0
                },
                "TutorialMod:sweet_berry_cheesecake_slice": {
                  "chance": 0.85
                },
                "TutorialMod:sweet_berry_cookie": {
                  "chance": 0.85
                },
                "TutorialMod:tomato": {
                  "chance": 0.65
                },
                "TutorialMod:tomato_seeds": {
                  "chance": 0.3
                },
                "TutorialMod:tree_bark": {
                  "chance": 0.3
                },
                "TutorialMod:wild_beetroots": {
                  "chance": 0.65
                },
                "TutorialMod:wild_cabbages": {
                  "chance": 0.65
                },
                "TutorialMod:wild_carrots": {
                  "chance": 0.65
                },
                "TutorialMod:wild_onions": {
                  "chance": 0.65
                },
                "TutorialMod:wild_potatoes": {
                  "chance": 0.65
                },
                "TutorialMod:wild_rice": {
                  "chance": 0.65
                },
                "TutorialMod:wild_tomatoes": {
                  "chance": 0.65
                }
              }
            }
            """;

}
