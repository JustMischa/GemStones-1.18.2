package eu.novagames.gemstones.register;

import eu.novagames.gemstones.blocks.ModBlocks;
import eu.novagames.gemstones.blocks.custom.blockentities.ModBlockEntities;
import eu.novagames.gemstones.enchantment.ModEnchantments;
import eu.novagames.gemstones.items.ModItems;
import eu.novagames.gemstones.recipe.ModRecipes;
import eu.novagames.gemstones.screen.ModMenuTypes;
import eu.novagames.gemstones.util.ModPOIs;
import eu.novagames.gemstones.world.biome.ModBiomes;
import eu.novagames.gemstones.world.dimension.ModDimensions;
import net.minecraftforge.eventbus.api.IEventBus;

public class Registration {

    public static void init(IEventBus eventBus) {
        ModItems.register(eventBus);
        ModBlocks.register(eventBus);
        ModBlockEntities.register(eventBus);
        ModMenuTypes.register(eventBus);
        ModRecipes.register(eventBus);
        ModEnchantments.register(eventBus);
        ModDimensions.register();
        ModPOIs.register(eventBus);
        ModBiomes.register(eventBus);
        ModBiomes.registerBiomes();
    }
}