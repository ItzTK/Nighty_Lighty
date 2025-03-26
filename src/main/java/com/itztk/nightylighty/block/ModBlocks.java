package com.itztk.nightylighty.block;

import com.itztk.nightylighty.NightyLighty;
import com.itztk.nightylighty.block.custom.CeilingBlock;
import com.itztk.nightylighty.block.custom.FloorBlock;
import com.itztk.nightylighty.block.custom.TallBlock;
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
            new FloorBlock(AbstractBlock.Settings.create().nonOpaque().
                    sounds(BlockSoundGroup.GLASS).luminance(state -> state.get(FloorBlock.CLICKED) ? 8 : 0).
                    emissiveLighting((state, world, pos) -> state.get((FloorBlock.CLICKED)))));

    public static final Block FROG_BLUE = registerBlock("frog_blue", new FloorBlock(AbstractBlock.Settings.copy(FROG_BLACK)));
    public static final Block FROG_BROWN = registerBlock("frog_brown", new FloorBlock(AbstractBlock.Settings.copy(FROG_BLACK)));
    public static final Block FROG_CYAN = registerBlock("frog_cyan", new FloorBlock(AbstractBlock.Settings.copy(FROG_BLACK)));
    public static final Block FROG_GRAY = registerBlock("frog_gray", new FloorBlock(AbstractBlock.Settings.copy(FROG_BLACK)));
    public static final Block FROG_GREEN = registerBlock("frog_green", new FloorBlock(AbstractBlock.Settings.copy(FROG_BLACK)));
    public static final Block FROG_LIGHT_BLUE = registerBlock("frog_light_blue", new FloorBlock(AbstractBlock.Settings.copy(FROG_BLACK)));
    public static final Block FROG_LIGHT_GRAY = registerBlock("frog_light_gray", new FloorBlock(AbstractBlock.Settings.copy(FROG_BLACK)));
    public static final Block FROG_LIME = registerBlock("frog_lime", new FloorBlock(AbstractBlock.Settings.copy(FROG_BLACK)));
    public static final Block FROG_MAGENTA = registerBlock("frog_magenta", new FloorBlock(AbstractBlock.Settings.copy(FROG_BLACK)));
    public static final Block FROG_ORANGE = registerBlock("frog_orange", new FloorBlock(AbstractBlock.Settings.copy(FROG_BLACK)));
    public static final Block FROG_PINK = registerBlock("frog_pink", new FloorBlock(AbstractBlock.Settings.copy(FROG_BLACK)));
    public static final Block FROG_PURPLE = registerBlock("frog_purple", new FloorBlock(AbstractBlock.Settings.copy(FROG_BLACK)));
    public static final Block FROG_RED = registerBlock("frog_red", new FloorBlock(AbstractBlock.Settings.copy(FROG_BLACK)));
    public static final Block FROG_WHITE = registerBlock("frog_white", new FloorBlock(AbstractBlock.Settings.copy(FROG_BLACK)));
    public static final Block FROG_YELLOW = registerBlock("frog_yellow", new FloorBlock(AbstractBlock.Settings.copy(FROG_BLACK)));
    
    public static final Block MUSHROOM_BLACK = registerBlock("mushroom_black",
            new TallBlock(AbstractBlock.Settings.create().nonOpaque().
                    sounds(BlockSoundGroup.GLASS).luminance(state -> state.get(FloorBlock.CLICKED) ? 8 : 0).
                    emissiveLighting((state, world, pos) -> state.get((FloorBlock.CLICKED)))));
    public static final Block MUSHROOM_BLUE = registerBlock("mushroom_blue", new TallBlock(AbstractBlock.Settings.copy(MUSHROOM_BLACK)));
    public static final Block MUSHROOM_BROWN = registerBlock("mushroom_brown", new TallBlock(AbstractBlock.Settings.copy(MUSHROOM_BLACK)));
    public static final Block MUSHROOM_CYAN = registerBlock("mushroom_cyan", new TallBlock(AbstractBlock.Settings.copy(MUSHROOM_BLACK)));
    public static final Block MUSHROOM_GRAY = registerBlock("mushroom_gray", new TallBlock(AbstractBlock.Settings.copy(MUSHROOM_BLACK)));
    public static final Block MUSHROOM_GREEN = registerBlock("mushroom_green", new TallBlock(AbstractBlock.Settings.copy(MUSHROOM_BLACK)));
    public static final Block MUSHROOM_LIGHT_BLUE = registerBlock("mushroom_light_blue", new TallBlock(AbstractBlock.Settings.copy(MUSHROOM_BLACK)));
    public static final Block MUSHROOM_LIGHT_GRAY = registerBlock("mushroom_light_gray", new TallBlock(AbstractBlock.Settings.copy(MUSHROOM_BLACK)));
    public static final Block MUSHROOM_LIME = registerBlock("mushroom_lime", new TallBlock(AbstractBlock.Settings.copy(MUSHROOM_BLACK)));
    public static final Block MUSHROOM_MAGENTA = registerBlock("mushroom_magenta", new TallBlock(AbstractBlock.Settings.copy(MUSHROOM_BLACK)));
    public static final Block MUSHROOM_ORANGE = registerBlock("mushroom_orange", new TallBlock(AbstractBlock.Settings.copy(MUSHROOM_BLACK)));
    public static final Block MUSHROOM_PINK = registerBlock("mushroom_pink", new TallBlock(AbstractBlock.Settings.copy(MUSHROOM_BLACK)));
    public static final Block MUSHROOM_PURPLE = registerBlock("mushroom_purple", new TallBlock(AbstractBlock.Settings.copy(MUSHROOM_BLACK)));
    public static final Block MUSHROOM_RED = registerBlock("mushroom_red", new TallBlock(AbstractBlock.Settings.copy(MUSHROOM_BLACK)));
    public static final Block MUSHROOM_WHITE = registerBlock("mushroom_white", new TallBlock(AbstractBlock.Settings.copy(MUSHROOM_BLACK)));
    public static final Block MUSHROOM_YELLOW = registerBlock("mushroom_yellow", new TallBlock(AbstractBlock.Settings.copy(MUSHROOM_BLACK)));
    
    public static final Block OCTOPUS_BLACK = registerBlock("octopus_black",
            new FloorBlock(AbstractBlock.Settings.create().nonOpaque().
                    sounds(BlockSoundGroup.GLASS).luminance(state -> state.get(FloorBlock.CLICKED) ? 8 : 0).
                    emissiveLighting((state, world, pos) -> state.get((FloorBlock.CLICKED)))));
    public static final Block OCTOPUS_BLUE = registerBlock("octopus_blue", new FloorBlock(AbstractBlock.Settings.copy(OCTOPUS_BLACK)));
    public static final Block OCTOPUS_BROWN = registerBlock("octopus_brown", new FloorBlock(AbstractBlock.Settings.copy(OCTOPUS_BLACK)));
    public static final Block OCTOPUS_CYAN = registerBlock("octopus_cyan", new FloorBlock(AbstractBlock.Settings.copy(OCTOPUS_BLACK)));
    public static final Block OCTOPUS_GRAY = registerBlock("octopus_gray", new FloorBlock(AbstractBlock.Settings.copy(OCTOPUS_BLACK)));
    public static final Block OCTOPUS_GREEN = registerBlock("octopus_green", new FloorBlock(AbstractBlock.Settings.copy(OCTOPUS_BLACK)));
    public static final Block OCTOPUS_LIGHT_BLUE = registerBlock("octopus_light_blue", new FloorBlock(AbstractBlock.Settings.copy(OCTOPUS_BLACK)));
    public static final Block OCTOPUS_LIGHT_GRAY = registerBlock("octopus_light_gray", new FloorBlock(AbstractBlock.Settings.copy(OCTOPUS_BLACK)));
    public static final Block OCTOPUS_LIME = registerBlock("octopus_lime", new FloorBlock(AbstractBlock.Settings.copy(OCTOPUS_BLACK)));
    public static final Block OCTOPUS_MAGENTA = registerBlock("octopus_magenta", new FloorBlock(AbstractBlock.Settings.copy(OCTOPUS_BLACK)));
    public static final Block OCTOPUS_ORANGE = registerBlock("octopus_orange", new FloorBlock(AbstractBlock.Settings.copy(OCTOPUS_BLACK)));
    public static final Block OCTOPUS_PINK = registerBlock("octopus_pink", new FloorBlock(AbstractBlock.Settings.copy(OCTOPUS_BLACK)));
    public static final Block OCTOPUS_PURPLE = registerBlock("octopus_purple", new FloorBlock(AbstractBlock.Settings.copy(OCTOPUS_BLACK)));
    public static final Block OCTOPUS_RED = registerBlock("octopus_red", new FloorBlock(AbstractBlock.Settings.copy(OCTOPUS_BLACK)));
    public static final Block OCTOPUS_WHITE = registerBlock("octopus_white", new FloorBlock(AbstractBlock.Settings.copy(OCTOPUS_BLACK)));
    public static final Block OCTOPUS_YELLOW = registerBlock("octopus_yellow", new FloorBlock(AbstractBlock.Settings.copy(OCTOPUS_BLACK)));

    public static final Block HANGING_LIGHTS_BLACK = registerBlock("hanging_lights_black",
            new CeilingBlock(AbstractBlock.Settings.create().nonOpaque().noCollision().
                    sounds(BlockSoundGroup.GLASS).luminance(state -> state.get(CeilingBlock.CLICKED) ? 6 : 0).
                    emissiveLighting((state, world, pos) -> state.get((CeilingBlock.CLICKED)))));
    public static final Block HANGING_LIGHTS_BLUE = registerBlock("hanging_lights_blue", new CeilingBlock(AbstractBlock.Settings.copy(HANGING_LIGHTS_BLACK)));
    public static final Block HANGING_LIGHTS_BROWN = registerBlock("hanging_lights_brown", new CeilingBlock(AbstractBlock.Settings.copy(HANGING_LIGHTS_BLACK)));
    public static final Block HANGING_LIGHTS_CYAN = registerBlock("hanging_lights_cyan", new CeilingBlock(AbstractBlock.Settings.copy(HANGING_LIGHTS_BLACK)));
    public static final Block HANGING_LIGHTS_GRAY = registerBlock("hanging_lights_gray", new CeilingBlock(AbstractBlock.Settings.copy(HANGING_LIGHTS_BLACK)));
    public static final Block HANGING_LIGHTS_GREEN = registerBlock("hanging_lights_green", new CeilingBlock(AbstractBlock.Settings.copy(HANGING_LIGHTS_BLACK)));
    public static final Block HANGING_LIGHTS_LIGHT_BLUE = registerBlock("hanging_lights_light_blue", new CeilingBlock(AbstractBlock.Settings.copy(HANGING_LIGHTS_BLACK)));
    public static final Block HANGING_LIGHTS_LIGHT_GRAY = registerBlock("hanging_lights_light_gray", new CeilingBlock(AbstractBlock.Settings.copy(HANGING_LIGHTS_BLACK)));
    public static final Block HANGING_LIGHTS_LIME = registerBlock("hanging_lights_lime", new CeilingBlock(AbstractBlock.Settings.copy(HANGING_LIGHTS_BLACK)));
    public static final Block HANGING_LIGHTS_MAGENTA = registerBlock("hanging_lights_magenta", new CeilingBlock(AbstractBlock.Settings.copy(HANGING_LIGHTS_BLACK)));
    public static final Block HANGING_LIGHTS_ORANGE = registerBlock("hanging_lights_orange", new CeilingBlock(AbstractBlock.Settings.copy(HANGING_LIGHTS_BLACK)));
    public static final Block HANGING_LIGHTS_PINK = registerBlock("hanging_lights_pink", new CeilingBlock(AbstractBlock.Settings.copy(HANGING_LIGHTS_BLACK)));
    public static final Block HANGING_LIGHTS_PURPLE = registerBlock("hanging_lights_purple", new CeilingBlock(AbstractBlock.Settings.copy(HANGING_LIGHTS_BLACK)));
    public static final Block HANGING_LIGHTS_RED = registerBlock("hanging_lights_red", new CeilingBlock(AbstractBlock.Settings.copy(HANGING_LIGHTS_BLACK)));
    public static final Block HANGING_LIGHTS_WHITE = registerBlock("hanging_lights_white", new CeilingBlock(AbstractBlock.Settings.copy(HANGING_LIGHTS_BLACK)));
    public static final Block HANGING_LIGHTS_YELLOW = registerBlock("hanging_lights_yellow", new CeilingBlock(AbstractBlock.Settings.copy(HANGING_LIGHTS_BLACK)));
    public static final Block HANGING_LIGHTS_DEFAULT = registerBlock("hanging_lights_default", new CeilingBlock(AbstractBlock.Settings.copy(HANGING_LIGHTS_BLACK)));


    public static final Block FAIRY_LIGHTS_BLACK = registerBlock("fairy_lights_black",
            new CeilingBlock(AbstractBlock.Settings.create().nonOpaque().noCollision().
                    sounds(BlockSoundGroup.GLASS).luminance(state -> state.get(CeilingBlock.CLICKED) ? 6 : 0).
                    emissiveLighting((state, world, pos) -> state.get((CeilingBlock.CLICKED)))));
    public static final Block FAIRY_LIGHTS_BLUE = registerBlock("fairy_lights_blue", new CeilingBlock(AbstractBlock.Settings.copy(FAIRY_LIGHTS_BLACK)));
    public static final Block FAIRY_LIGHTS_BROWN = registerBlock("fairy_lights_brown", new CeilingBlock(AbstractBlock.Settings.copy(FAIRY_LIGHTS_BLACK)));
    public static final Block FAIRY_LIGHTS_CYAN = registerBlock("fairy_lights_cyan", new CeilingBlock(AbstractBlock.Settings.copy(FAIRY_LIGHTS_BLACK)));
    public static final Block FAIRY_LIGHTS_GRAY = registerBlock("fairy_lights_gray", new CeilingBlock(AbstractBlock.Settings.copy(FAIRY_LIGHTS_BLACK)));
    public static final Block FAIRY_LIGHTS_GREEN = registerBlock("fairy_lights_green", new CeilingBlock(AbstractBlock.Settings.copy(FAIRY_LIGHTS_BLACK)));
    public static final Block FAIRY_LIGHTS_LIGHT_BLUE = registerBlock("fairy_lights_light_blue", new CeilingBlock(AbstractBlock.Settings.copy(FAIRY_LIGHTS_BLACK)));
    public static final Block FAIRY_LIGHTS_LIGHT_GRAY = registerBlock("fairy_lights_light_gray", new CeilingBlock(AbstractBlock.Settings.copy(FAIRY_LIGHTS_BLACK)));
    public static final Block FAIRY_LIGHTS_LIME = registerBlock("fairy_lights_lime", new CeilingBlock(AbstractBlock.Settings.copy(FAIRY_LIGHTS_BLACK)));
    public static final Block FAIRY_LIGHTS_MAGENTA = registerBlock("fairy_lights_magenta", new CeilingBlock(AbstractBlock.Settings.copy(FAIRY_LIGHTS_BLACK)));
    public static final Block FAIRY_LIGHTS_ORANGE = registerBlock("fairy_lights_orange", new CeilingBlock(AbstractBlock.Settings.copy(FAIRY_LIGHTS_BLACK)));
    public static final Block FAIRY_LIGHTS_PINK = registerBlock("fairy_lights_pink", new CeilingBlock(AbstractBlock.Settings.copy(FAIRY_LIGHTS_BLACK)));
    public static final Block FAIRY_LIGHTS_PURPLE = registerBlock("fairy_lights_purple", new CeilingBlock(AbstractBlock.Settings.copy(FAIRY_LIGHTS_BLACK)));
    public static final Block FAIRY_LIGHTS_RED = registerBlock("fairy_lights_red", new CeilingBlock(AbstractBlock.Settings.copy(FAIRY_LIGHTS_BLACK)));
    public static final Block FAIRY_LIGHTS_WHITE = registerBlock("fairy_lights_white", new CeilingBlock(AbstractBlock.Settings.copy(FAIRY_LIGHTS_BLACK)));
    public static final Block FAIRY_LIGHTS_YELLOW = registerBlock("fairy_lights_yellow", new CeilingBlock(AbstractBlock.Settings.copy(FAIRY_LIGHTS_BLACK)));
    public static final Block FAIRY_LIGHTS_DEFAULT = registerBlock("fairy_lights_default", new CeilingBlock(AbstractBlock.Settings.copy(FAIRY_LIGHTS_BLACK)));

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

        });
    }
}