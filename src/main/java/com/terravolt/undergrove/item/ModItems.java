package com.terravolt.undergrove.item;

import com.terravolt.undergrove.TestSurfaceRuleData;
import com.terravolt.undergrove.Undergrove;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Undergrove.MOD_ID);

//    public static final DeferredItem<Item> LUMENSHROOM  = ITEMS.register("lumenshroom",
//            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}