package com.itztk.nightylighty.block;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public final class ModBlocks1 {
    public static final Block EXAMPLE_BLOCK = register("example_block", new Block(Block.Settings.create().strength(4.0f)));

    private static <T extends Block> T register(String path, T block) {
        Registry.register(Registries.BLOCK, Identifier.of("tutorial", path), block);
        Registry.register(Registries.ITEM, Identifier.of("tutorial", path), new BlockItem(block, new Item.Settings()));
        return block;
    }



    public static void initialize() {
    }
}

