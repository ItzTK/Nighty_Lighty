package com.itztk.nightylighty;

import com.itztk.nightylighty.block.ModBlocks;
import com.itztk.nightylighty.block.NightyLightyGroups;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NightyLighty implements ModInitializer {
	public static final String MOD_ID = "nightylighty";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		NightyLightyGroups.registerItemGroups();
		ModBlocks.registerModBlocks();
	}
}