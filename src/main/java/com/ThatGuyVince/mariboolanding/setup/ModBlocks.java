package com.ThatGuyVince.mariboolanding.setup;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

// Block not adding :(

public class ModBlocks {
    // This is the method shown in the documentation for forge
    public static final RegistryObject<Block> MARIBOO_BLOCK = Registration.BLOCKS.register("mariboo_block", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK).harvestLevel(2).sound(SoundType.GROUND)));

    public static <T extends Block> RegistryObject<T> registerNoItem(String name, Supplier<T> block){
        return Registration.BLOCKS.register(name, block);
    }

    public static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block){
        RegistryObject returnVal = registerNoItem(name, block);
        Registration.ITEMS.register(name, ()-> new BlockItem((Block) returnVal.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
        return returnVal;
    }
    static void register(){}
}
