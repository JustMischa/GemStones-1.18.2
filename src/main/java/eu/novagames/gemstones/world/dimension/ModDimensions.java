package eu.novagames.gemstones.world.dimension;

import eu.novagames.gemstones.GemStones;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.dimension.DimensionType;

public class ModDimensions {

    public static final ResourceKey<Level> TENEBRIS_KEY = ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation(GemStones.MOD_ID, "tenebris"));
    public static final ResourceKey<DimensionType> TENEBRIS_TYPE = ResourceKey.create(Registry.DIMENSION_TYPE_REGISTRY, new ResourceLocation(GemStones.MOD_ID, "tenebris"));

    public static void register() {
        System.out.println("Registering ModDimensions for " + GemStones.MOD_ID);
    }
}
