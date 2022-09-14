package eu.novagames.gemstones.world.biome;

import eu.novagames.gemstones.GemStones;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;

public class Biomes {

    public static final ResourceKey<Biome> GARDEN = register("garden");

    private static ResourceKey<Biome> register(String name)
    {
        return ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation(GemStones.MOD_ID, name));
    }
}