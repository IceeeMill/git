package net.joe.mod;

import net.fabricmc.api.ClientModInitializer;
import net.joe.mod.screen.ModScreenHandlers;
import net.joe.mod.screen.flaskscreen;
import net.minecraft.client.gui.screen.ingame.HandledScreens;

public class JoeModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        HandledScreens.register(ModScreenHandlers.GEM_POLISHING_SCREEN_HANDLER, flaskscreen::new);
    }
}