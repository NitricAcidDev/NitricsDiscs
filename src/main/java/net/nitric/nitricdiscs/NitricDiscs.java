package net.nitric.nitricdiscs;

import net.fabricmc.api.ModInitializer;

import net.nitric.nitricdiscs.Item.ModItemGroup;
import net.nitric.nitricdiscs.Item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NitricDiscs implements ModInitializer {
	public static final String MOD_ID = "nitricdiscs";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.initialize(); // Likely already present
		ModItemGroup.initialize(); // Add this to register the item group
		LOGGER.info("Nitric Discs initialized!");
	}
}