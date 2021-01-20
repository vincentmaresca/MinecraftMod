package com.ThatGuyVince.mariboolanding.setup;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {
    public static final RegistryObject<Item> MARIBOO_INGOT = Registration.ITEMS.register("mariboo_ingot", () ->
            new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    static void register(){}
}
