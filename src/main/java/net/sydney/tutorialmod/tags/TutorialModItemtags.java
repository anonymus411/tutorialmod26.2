package net.sydney.tutorialmod.tags;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.sydney.tutorialmod.TutorialMod;

public class TutorialModItemtags {
    public static final TagKey<Item> SHEARS = create("shears");

    public static final TagKey<Item> AMARANTH = create("flowers/amaranth");
    private static TagKey<Item> create(String name) {
        return TagKey.create(Registries.ITEM, TutorialMod.id(name));
    }

    private static TagKey<Item> createCommon(String name) {
        return TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("c", name));
    }
}
