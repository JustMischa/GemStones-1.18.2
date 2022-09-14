package eu.novagames.gemstones.world.feature;

import eu.novagames.gemstones.blocks.ModBlocks;
import eu.novagames.gemstones.world.feature.tree.PalmTrunkPlacer;
import eu.novagames.gemstones.world.feature.tree.TenebrisTrunkPlacer;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.*;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.FancyTrunkPlacer;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;

import java.util.List;
import java.util.OptionalInt;

import static net.minecraft.data.worldgen.features.OreFeatures.NATURAL_STONE;

public class ModConfiguredFeatures {

    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_RUBY_ORES = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.RUBY_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_RUBY_ORE.get().defaultBlockState()));
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_SAPPHIRE_ORES = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.SAPPHIRE_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get().defaultBlockState()));
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_CAERULA_ORES = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.CAERULA_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_CAERULA_ORE.get().defaultBlockState()));
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_AMETHYST_ORES = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.AMETHYST_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_AMETHYST_ORE.get().defaultBlockState()));
    public static final List<OreConfiguration.TargetBlockState> END_AMETHYST_ORES = List.of(OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE), ModBlocks.END_AMETHYST_ORE.get().defaultBlockState()));

    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> TENEBRIS_TREE = FeatureUtils.register("tenebris", Feature.TREE, createFancyTenebris().ignoreVines().build());
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> PALM_TREE = FeatureUtils.register("palm", Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.PALM_LOG.get()), new TenebrisTrunkPlacer(5, 2, 2), BlockStateProvider.simple(ModBlocks.PALM_LEAVES.get()), new AcaciaFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0)), new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());
    public static final Holder<PlacedFeature> TENEBRIS_CHECKED = PlacementUtils.register("tenebris_checked", TENEBRIS_TREE, PlacementUtils.filteredByBlockSurvival(ModBlocks.TENEBRIS_SAPLING.get()));
    //   public static final Holder<PlacedFeature> PALM_CHECKED = PlacementUtils.register("palm_checked", PALM_TREE, );
    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> TENEBRIS_SPAWN = FeatureUtils.register("tenebris_spawn", Feature.RANDOM_SELECTOR, new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(TENEBRIS_CHECKED, 0.5F)), TENEBRIS_CHECKED));
    //  public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> PALM_SPAWN = FeatureUtils.register("palm_spawn", Feature.RANDOM_SELECTOR, new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(PALM_CHECKED, 0.5F)), PALM_CHECKED));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> RUBY_ORE = FeatureUtils.register("ruby_ore", Feature.ORE, new OreConfiguration(OVERWORLD_RUBY_ORES, 8));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> SAPPHIRE_ORE = FeatureUtils.register("sapphire_ore", Feature.ORE, new OreConfiguration(OVERWORLD_SAPPHIRE_ORES, 8));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> AMETHYST_ORE = FeatureUtils.register("amethyst_ore", Feature.ORE, new OreConfiguration(OVERWORLD_AMETHYST_ORES, 5));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> CAERULA_ORE = FeatureUtils.register("caerula_ore", Feature.ORE, new OreConfiguration(OVERWORLD_CAERULA_ORES, 4));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> END_AMETHYST_ORE = FeatureUtils.register("end_amethyst_ore", Feature.ORE, new OreConfiguration(END_AMETHYST_ORES, 5));

    private static TreeConfiguration.TreeConfigurationBuilder createFancyTenebris() {
        return new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.TENEBRIS_LOG.get()), new TenebrisTrunkPlacer(5, 2, 2), BlockStateProvider.simple(ModBlocks.TENEBRIS_LEAVES.get()), new AcaciaFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0)), new TwoLayersFeatureSize(1, 0, 2));
    }
}
