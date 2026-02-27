package com.leo.startool.item;

import com.leo.startool.StartoolMod;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tiers;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(StartoolMod.MOD_ID);


    public static final DeferredItem<Item>STARPICk = ITEMS.register("starpick",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> STAR_PICKAXE = ITEMS.register("star_pickaxe",
            () -> new PickaxeItem(
                    Tiers.NETHERITE, // material
                    new Item.Properties()
                            .fireResistant()
            ));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);

    }

}
