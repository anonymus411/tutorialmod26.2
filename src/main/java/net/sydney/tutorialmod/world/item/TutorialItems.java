package net.sydney.tutorialmod.world.item;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SpawnEggItem;
import net.sydney.tutorialmod.PlatformHandler;
import net.sydney.tutorialmod.TutorialMod;
import net.sydney.tutorialmod.world.level.block.TutorialBlocks;


import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Supplier;



public class TutorialItems {
    public static final ArrayList<Supplier<? extends Item>> ITEMS = new ArrayList<>();
    public static final ArrayList<Supplier<? extends Item>> NO_LANG_ITEMS = new ArrayList<>();
    public static final ArrayList<Supplier<? extends Item>> SIMPLE_ITEMS = new ArrayList<>();

public static <I extends Item> Supplier<I> registerSimpleItem(String id, Function<Item.Properties, I> item, Item.Properties properties) {
    Supplier<I> supplier = registerItem(id, item, properties);
    if (PlatformHandler.PLATFORM_HANDLER.isDatagen()) SIMPLE_ITEMS.add(supplier);
    return supplier;
}

public static <I extends Item> Supplier<I> registerItem(String id, Function<Item.Properties, I> item, Item.Properties properties) {
    Supplier<I> supplier = register(id, item, properties);
    ITEMS.add(supplier);
    return supplier;
}

public static <I extends Item> Supplier<I> registerItemNoLang(String id, Function<Item.Properties, I> item, Item.Properties properties) {
    Supplier<I> supplier = register(id, item, properties);
    NO_LANG_ITEMS.add(supplier);
    return supplier;
}

public static <I extends Item> Supplier<I> register(String id, Function<Item.Properties, I> item, Item.Properties properties) {
    return PlatformHandler.PLATFORM_HANDLER.register(BuiltInRegistries.ITEM, id, () -> item.apply(properties.setId(key(id))));
}

private static <E extends Entity> Supplier<SpawnEggItem> registerSpawnEgg(String id, Supplier<EntityType<E>> entity) {
    Supplier<SpawnEggItem> egg = PlatformHandler.PLATFORM_HANDLER.register(BuiltInRegistries.ITEM, id, () -> new SpawnEggItem(new Item.Properties().setId(key(id)).spawnEgg(entity.get())));
    SIMPLE_ITEMS.add(egg);
    ITEMS.add(egg);
    return egg;
}

private static ResourceKey<Item> key(String id) {
    return TutorialMod.key(Registries.ITEM, id);
}

public static void items() {
    TutorialMod.LOGGER.info("Registering Tutorial Mod items");
}
}

