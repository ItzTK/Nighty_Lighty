package com.itztk.nightylighty.block;

import com.itztk.nightylighty.NightyLighty;
import com.itztk.nightylighty.block.custom.FloorBlock;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block FROG_BLACK = registerBlock("frog_black",
            new FloorBlock(AbstractBlock.Settings.create()
                    .nonOpaque().strength(1f).requiresTool().luminance(state -> state.get(FloorBlock.CLICKED) ? 15 : 0)));
    // Note to self, you were registering a frog block, after creating the floor block class.

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(NightyLighty.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(NightyLighty.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        NightyLighty.LOGGER.info("Registering Mod Blocks for " + NightyLighty.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.FROG_BLACK);
        });
    }
}