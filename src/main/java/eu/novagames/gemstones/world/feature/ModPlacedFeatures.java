package eu.novagames.gemstones.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class ModPlacedFeatures {

    public static final Holder<PlacedFeature> TENEBRIS_PLACED = PlacementUtils.register("tenebris_placed", ModConfiguredFeatures.TENEBRIS_SPAWN, VegetationPlacements.treePlacement(PlacementUtils.countExtra(4, 0.1f, 2)));
  //  public static final Holder<PlacedFeature> PALM_PLACED = PlacementUtils.register("palm_placed", ModConfiguredFeatures.PALM_SPAWN, VegetationPlacements.treePlacement(PlacementUtils.countExtra(2, 0.1f, 2)));
    public static final Holder<PlacedFeature> RUBY_ORE_PLACED = PlacementUtils.register("ruby_ore_placed", ModConfiguredFeatures.RUBY_ORE, ModOrePlacement.commonOrePlacement(7, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
    public static final Holder<PlacedFeature> SAPPHIRE_ORE_PLACED = PlacementUtils.register("sapphire_ore_placed", ModConfiguredFeatures.SAPPHIRE_ORE, ModOrePlacement.commonOrePlacement(7, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
    public static final Holder<PlacedFeature> AMETHYST_ORE_PLACED = PlacementUtils.register("amethyst_ore_placed", ModConfiguredFeatures.AMETHYST_ORE, ModOrePlacement.commonOrePlacement(7, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
    public static final Holder<PlacedFeature> CAERULA_ORE_PLACED = PlacementUtils.register("caerula_ore_placed", ModConfiguredFeatures.CAERULA_ORE, ModOrePlacement.commonOrePlacement(4, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
    public static final Holder<PlacedFeature> END_AMETHYST_ORE_PLACED = PlacementUtils.register("end_amethyst_ore_placed", ModConfiguredFeatures.END_AMETHYST_ORE, ModOrePlacement.commonOrePlacement(10, HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
}
