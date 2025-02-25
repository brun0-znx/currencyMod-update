package com.brun0znx.currency.item;

import com.brun0znx.currency.CurrencyModUpdate;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CurrencyModUpdate.MOD_ID);

    public static final DeferredItem<Item> WALLET = ITEMS.register("wallet",
            () -> new Item(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(CurrencyModUpdate.MOD_ID, "wallet")))));

    public static final DeferredItem<Item> CURRENCY1 = ITEMS.register("currency1",
            () -> new Item(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(CurrencyModUpdate.MOD_ID, "currency1")))));

    public static final DeferredItem<Item> CURRENCY2 = ITEMS.register("currency2",
            () -> new Item(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(CurrencyModUpdate.MOD_ID, "currency2")))));

    public static final DeferredItem<Item> CURRENCY3 = ITEMS.register("currency3",
            () -> new Item(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(CurrencyModUpdate.MOD_ID, "currency3")))));

    public static final DeferredItem<Item> CURRENCY4 = ITEMS.register("currency4",
            () -> new Item(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(CurrencyModUpdate.MOD_ID, "currency4")))));

    public static final DeferredItem<Item> CURRENCY5 = ITEMS.register("currency5",
            () -> new Item(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(CurrencyModUpdate.MOD_ID, "currency5")))));

    public static final DeferredItem<Item> CURRENCY6 = ITEMS.register("currency6",
            () -> new Item(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(CurrencyModUpdate.MOD_ID, "currency6")))));


    public static void register (IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
