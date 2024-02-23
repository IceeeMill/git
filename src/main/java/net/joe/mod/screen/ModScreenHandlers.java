package net.joe.mod.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.joe.mod.JoeMod;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandlers {
    public static final ScreenHandlerType<flaskscreenhandler> GEM_POLISHING_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, new Identifier(JoeMod.MOD_ID, "flask"),
                    new ExtendedScreenHandlerType<>(flaskscreenhandler::new));

    public static void registerScreenHandlers() {
        JoeMod.LOGGER.info("Registering Screen Handlers for " + JoeMod.MOD_ID);
    }
}