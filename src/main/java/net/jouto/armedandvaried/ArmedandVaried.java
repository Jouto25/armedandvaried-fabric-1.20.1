package net.jouto.armedandvaried;

import net.fabricmc.api.ModInitializer;

import net.jouto.armedandvaried.block.ModBlocks;
import net.jouto.armedandvaried.item.ModItemGroups;
import net.jouto.armedandvaried.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArmedandVaried implements ModInitializer {
	public static final String MOD_ID = "armedandvaried";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}