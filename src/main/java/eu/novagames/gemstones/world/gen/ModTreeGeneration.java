package eu.novagames.gemstones.world.gen;

import eu.novagames.gemstones.world.biome.Biomes;
import eu.novagames.gemstones.world.feature.ModPlacedFeatures;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.List;
import java.util.Set;

public class ModTreeGeneration {

    public static void generateTrees(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);
        if (key.equals(Biomes.GARDEN)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            if (!types.contains(BiomeDictionary.Type.SAVANNA)){
                base.add(ModPlacedFeatures.TENEBRIS_PLACED);
            }
        }
        /*
        if(types.contains(BiomeDictionary.Type.PLAINS)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            if (!types.contains(BiomeDictionary.Type.SAVANNA)){
                base.add(ModPlacedFeatures.TENEBRIS_PLACED);
            }
        }
        if (key.equals("tenebris")) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(ModPlacedFeatures.TENEBRIS_PLACED);
        }
        if (types.contains(BiomeDictionary.Type.BEACH)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(ModPlacedFeatures.PALM_PLACED);
        }
         */
    }
}
