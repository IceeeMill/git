package net.joe.mod;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(JoeMod.MOD_ID, "joemod"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.joemod"))
                    .icon(() -> new ItemStack(ModItems.c)).entries((displayContext, entries) -> {
                        entries.add(ModItems.c);
                        entries.add(ModItems.m_c);

                        entries.add(ModBlocks.RAW_RUBY_BLOCK);
                        entries.add(ModBlocks.flask);


                    }).build());


    public static void registerItemGroups() {
        JoeMod.LOGGER.info("Registering Item Groups for " + JoeMod.MOD_ID);
    }
}