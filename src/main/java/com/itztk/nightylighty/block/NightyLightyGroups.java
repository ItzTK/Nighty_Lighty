package com.itztk.nightylighty.block;

import com.itztk.nightylighty.NightyLighty;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class NightyLightyGroups {
    private static final ItemGroup NIGHTY_LIGHTY_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(NightyLighty.MOD_ID, "nightylighty"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.HANGING_LIGHTS_WHITE))
                    .displayName(Text.translatable("itemgroup.nightylighty.nightylighty"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.FROG_BLACK);
                        entries.add(ModBlocks.FROG_BLUE);
                        entries.add(ModBlocks.FROG_BROWN);
                        entries.add(ModBlocks.FROG_CYAN);
                        entries.add(ModBlocks.FROG_GRAY);
                        entries.add(ModBlocks.FROG_GREEN);
                        entries.add(ModBlocks.FROG_LIGHT_BLUE);
                        entries.add(ModBlocks.FROG_LIGHT_GRAY);
                        entries.add(ModBlocks.FROG_LIME);
                        entries.add(ModBlocks.FROG_MAGENTA);
                        entries.add(ModBlocks.FROG_ORANGE);
                        entries.add(ModBlocks.FROG_PINK);
                        entries.add(ModBlocks.FROG_PURPLE);
                        entries.add(ModBlocks.FROG_RED);
                        entries.add(ModBlocks.FROG_WHITE);
                        entries.add(ModBlocks.FROG_YELLOW);
                        entries.add(ModBlocks.MUSHROOM_BLACK);
                        entries.add(ModBlocks.MUSHROOM_BLUE);
                        entries.add(ModBlocks.MUSHROOM_BROWN);
                        entries.add(ModBlocks.MUSHROOM_CYAN);
                        entries.add(ModBlocks.MUSHROOM_GRAY);
                        entries.add(ModBlocks.MUSHROOM_GREEN);
                        entries.add(ModBlocks.MUSHROOM_LIGHT_BLUE);
                        entries.add(ModBlocks.MUSHROOM_LIGHT_GRAY);
                        entries.add(ModBlocks.MUSHROOM_LIME);
                        entries.add(ModBlocks.MUSHROOM_MAGENTA);
                        entries.add(ModBlocks.MUSHROOM_ORANGE);
                        entries.add(ModBlocks.MUSHROOM_PINK);
                        entries.add(ModBlocks.MUSHROOM_PURPLE);
                        entries.add(ModBlocks.MUSHROOM_RED);
                        entries.add(ModBlocks.MUSHROOM_WHITE);
                        entries.add(ModBlocks.MUSHROOM_YELLOW);
                        entries.add(ModBlocks.OCTOPUS_BLACK);
                        entries.add(ModBlocks.OCTOPUS_BLUE);
                        entries.add(ModBlocks.OCTOPUS_BROWN);
                        entries.add(ModBlocks.OCTOPUS_CYAN);
                        entries.add(ModBlocks.OCTOPUS_GRAY);
                        entries.add(ModBlocks.OCTOPUS_GREEN);
                        entries.add(ModBlocks.OCTOPUS_LIGHT_BLUE);
                        entries.add(ModBlocks.OCTOPUS_LIGHT_GRAY);
                        entries.add(ModBlocks.OCTOPUS_LIME);
                        entries.add(ModBlocks.OCTOPUS_MAGENTA);
                        entries.add(ModBlocks.OCTOPUS_ORANGE);
                        entries.add(ModBlocks.OCTOPUS_PINK);
                        entries.add(ModBlocks.OCTOPUS_PURPLE);
                        entries.add(ModBlocks.OCTOPUS_RED);
                        entries.add(ModBlocks.OCTOPUS_WHITE);
                        entries.add(ModBlocks.OCTOPUS_YELLOW);
                        entries.add(ModBlocks.HANGING_LIGHTS_BLACK);
                        entries.add(ModBlocks.HANGING_LIGHTS_BLUE);
                        entries.add(ModBlocks.HANGING_LIGHTS_BROWN);
                        entries.add(ModBlocks.HANGING_LIGHTS_CYAN);
                        entries.add(ModBlocks.HANGING_LIGHTS_GRAY);
                        entries.add(ModBlocks.HANGING_LIGHTS_GREEN);
                        entries.add(ModBlocks.HANGING_LIGHTS_LIGHT_BLUE);
                        entries.add(ModBlocks.HANGING_LIGHTS_LIGHT_GRAY);
                        entries.add(ModBlocks.HANGING_LIGHTS_LIME);
                        entries.add(ModBlocks.HANGING_LIGHTS_MAGENTA);
                        entries.add(ModBlocks.HANGING_LIGHTS_ORANGE);
                        entries.add(ModBlocks.HANGING_LIGHTS_PINK);
                        entries.add(ModBlocks.HANGING_LIGHTS_PURPLE);
                        entries.add(ModBlocks.HANGING_LIGHTS_RED);
                        entries.add(ModBlocks.HANGING_LIGHTS_WHITE);
                        entries.add(ModBlocks.HANGING_LIGHTS_YELLOW);
                        entries.add(ModBlocks.HANGING_LIGHTS_DEFAULT);
                        entries.add(ModBlocks.FAIRY_LIGHTS_BLACK);
                        entries.add(ModBlocks.FAIRY_LIGHTS_BLUE);
                        entries.add(ModBlocks.FAIRY_LIGHTS_BROWN);
                        entries.add(ModBlocks.FAIRY_LIGHTS_CYAN);
                        entries.add(ModBlocks.FAIRY_LIGHTS_GRAY);
                        entries.add(ModBlocks.FAIRY_LIGHTS_GREEN);
                        entries.add(ModBlocks.FAIRY_LIGHTS_LIGHT_BLUE);
                        entries.add(ModBlocks.FAIRY_LIGHTS_LIGHT_GRAY);
                        entries.add(ModBlocks.FAIRY_LIGHTS_LIME);
                        entries.add(ModBlocks.FAIRY_LIGHTS_MAGENTA);
                        entries.add(ModBlocks.FAIRY_LIGHTS_ORANGE);
                        entries.add(ModBlocks.FAIRY_LIGHTS_PINK);
                        entries.add(ModBlocks.FAIRY_LIGHTS_PURPLE);
                        entries.add(ModBlocks.FAIRY_LIGHTS_RED);
                        entries.add(ModBlocks.FAIRY_LIGHTS_WHITE);
                        entries.add(ModBlocks.FAIRY_LIGHTS_YELLOW);
                        entries.add(ModBlocks.FAIRY_LIGHTS_DEFAULT);

                    }).build());


    public static void registerItemGroups() {
        NightyLighty.LOGGER.info("Registering Item Groups for " + NightyLighty.MOD_ID);
    }
}
