package eu.novagames.gemstones.world.gen;

import eu.novagames.gemstones.world.feature.ModPlacedFeatures;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.List;

public class ModOreGeneration {

    public static void generateOres(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        List<Holder<PlacedFeature>> base =
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES);

        List<Holder<PlacedFeature>> end_base =
                event.getGeneration().getFeatures(GenerationStep.Decoration.RAW_GENERATION);
        base.add(ModPlacedFeatures.AMETHYST_ORE_PLACED);
        base.add(ModPlacedFeatures.RUBY_ORE_PLACED);
        base.add(ModPlacedFeatures.SAPPHIRE_ORE_PLACED);
        base.add(ModPlacedFeatures.CAERULA_ORE_PLACED);
        end_base.add(ModPlacedFeatures.END_AMETHYST_ORE_PLACED);
    }
}
