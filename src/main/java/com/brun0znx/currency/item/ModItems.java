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


    public static void register (IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
