package net.joe.mod;

import net.fabricmc.api.ModInitializer;
import net.joe.mod.block.entity.ModBlockEntities;
import net.joe.mod.screen.ModScreenHandlers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JoeMod implements ModInitializer {
	public static final String MOD_ID = "joe-mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModBlockEntities.registerBlockEntities();
		ModScreenHandlers.registerScreenHandlers();
	}
}