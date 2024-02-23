package net.joe.mod.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.joe.mod.JoeMod;
import net.joe.mod.ModBlocks;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
    public static final BlockEntityType<flaskentity> GEM_POLISHING_STATION_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(JoeMod.MOD_ID, "flask"),
                    FabricBlockEntityTypeBuilder.create(flaskentity::new,
                            ModBlocks.flask).build());

    public static void registerBlockEntities() {
        JoeMod.LOGGER.info("Registering Block Entities for " + JoeMod.MOD_ID);
    }
}