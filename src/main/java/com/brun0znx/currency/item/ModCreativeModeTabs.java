package com.brun0znx.currency.item;

import com.brun0znx.currency.CurrencyModUpdate;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import javax.swing.*;
import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CurrencyModUpdate.MOD_ID);

    public static final Supplier<CreativeModeTab> CURRENCY_ITEMS_TAB = CREATIVE_MODE_TAB.register("currency_items_tab",
        () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.WALLET.get()))
                .title(Component.translatable("creativetab.currency.currency_items"))
                .displayItems((itemDisplayParameters, output) -> {
                    output.accept(ModItems.WALLET);
                    output.accept(ModItems.CURRENCY1);
                    output.accept(ModItems.CURRENCY2);
                    output.accept(ModItems.CURRENCY3);
                    output.accept(ModItems.CURRENCY4);
                    output.accept(ModItems.CURRENCY5);
                    output.accept(ModItems.CURRENCY6);
                }).build());
    
    public static void register (IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }

}
