package eu.novagames.gemstones.blocks;

import eu.novagames.gemstones.GemStones;
import eu.novagames.gemstones.blocks.custom.*;
import eu.novagames.gemstones.blocks.custom.wood.FlammableBlock;
import eu.novagames.gemstones.blocks.custom.wood.FlammableLeavesBlock;
import eu.novagames.gemstones.blocks.custom.wood.FlammableRotatedPillarBlock;
import eu.novagames.gemstones.items.ModCreativeModeTab;
import eu.novagames.gemstones.items.ModItems;
import eu.novagames.gemstones.world.feature.tree.PalmTreeGrower;
import eu.novagames.gemstones.world.feature.tree.TenebrisTreeGrower;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, GemStones.MOD_ID);

    public static final RegistryObject<Block> BLUE_BERRIES_PLANT = BLOCKS.register("blue_berries_plant", () -> new BlueBerryBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));
    public static final RegistryObject<Block> TENEBRIS_LOG = registerBlock("tenebris_log", () -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG)), ModCreativeModeTab.BLOCK_GEMSTONES_TAB);
    public static final RegistryObject<Block> STRIPPED_TENEBRIS_LOG = registerBlock("stripped_tenebris_log", () -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_SPRUCE_LOG)), ModCreativeModeTab.BLOCK_GEMSTONES_TAB);
    public static final RegistryObject<Block> TENEBRIS_WOOD = registerBlock("tenebris_wood", () -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_WOOD)), ModCreativeModeTab.BLOCK_GEMSTONES_TAB);
    public static final RegistryObject<Block> STRIPPED_TENEBRIS_WOOD = registerBlock("stripped_tenebris_wood", () -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_SPRUCE_WOOD)), ModCreativeModeTab.BLOCK_GEMSTONES_TAB);
    public static final RegistryObject<Block> TENEBRIS_PLANKS = registerBlock("tenebris_planks", () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS), true, 20, 5), ModCreativeModeTab.BLOCK_GEMSTONES_TAB);
    public static final RegistryObject<Block> TENEBRIS_STAIRS = registerBlock("tenebris_stairs", () -> new StairBlock(() -> TENEBRIS_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SPRUCE_STAIRS)), ModCreativeModeTab.BLOCK_GEMSTONES_TAB);
    public static final RegistryObject<Block> TENEBRIS_SLAB = registerBlock("tenebris_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_STAIRS)), ModCreativeModeTab.BLOCK_GEMSTONES_TAB);
    public static final RegistryObject<Block> TENEBRIS_FENCE = registerBlock("tenebris_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_STAIRS)), ModCreativeModeTab.BLOCK_GEMSTONES_TAB);
    public static final RegistryObject<Block> TENEBRIS_FENCE_GATE = registerBlock("tenebris_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_STAIRS)), ModCreativeModeTab.BLOCK_GEMSTONES_TAB);
    public static final RegistryObject<Block> TENEBRIS_LEAVES = registerBlock("tenebris_leaves", () -> new FlammableLeavesBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LEAVES), true, 60, 30), ModCreativeModeTab.BLOCK_GEMSTONES_TAB);
    public static final RegistryObject<Block> TENEBRIS_SAPLING = registerBlock("tenebris_sapling", () -> new SaplingBlock(new TenebrisTreeGrower(),BlockBehaviour.Properties.copy(Blocks.SPRUCE_SAPLING)), ModCreativeModeTab.BLOCK_GEMSTONES_TAB);
    public static final RegistryObject<Block> UPGRADE_TABLE = registerBlock("upgrade_table", () -> new UpgradeStationBlock(BlockBehaviour.Properties.copy(Blocks.CRAFTING_TABLE).noOcclusion()), ModCreativeModeTab.BLOCK_GEMSTONES_TAB);
    public static final RegistryObject<Block> RUBY_ORE = registerBlock("ruby_ore", () -> new OreBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTab.BLOCK_GEMSTONES_TAB);
    public static final RegistryObject<Block> DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore", () -> new OreBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTab.BLOCK_GEMSTONES_TAB);
    public static final RegistryObject<Block> SAPPHIRE_ORE = registerBlock("sapphire_ore", () -> new OreBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTab.BLOCK_GEMSTONES_TAB);
    public static final RegistryObject<Block> DEEPSLATE_SAPPHIRE_ORE = registerBlock("deepslate_sapphire_ore", () -> new OreBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTab.BLOCK_GEMSTONES_TAB);
    public static final RegistryObject<Block> AMETHYST_ORE = registerBlock("amethyst_ore", () -> new OreBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTab.BLOCK_GEMSTONES_TAB);
    public static final RegistryObject<Block> DEEPSLATE_AMETHYST_ORE = registerBlock("deepslate_amethyst_ore", () -> new OreBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTab.BLOCK_GEMSTONES_TAB);
    public static final RegistryObject<Block> END_AMETHYST_ORE = registerBlock("end_amethyst_ore", () -> new OreBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTab.BLOCK_GEMSTONES_TAB);
    public static final RegistryObject<Block> CAERULA_ORE = registerBlock("caerula_ore", () -> new CaerulaOreBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE).requiresCorrectToolForDrops()), ModCreativeModeTab.BLOCK_GEMSTONES_TAB);
    public static final RegistryObject<Block> DEEPSLATE_CAERULA_ORE = registerBlock("deepslate_caerula_ore", () -> new CaerulaOreBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE).requiresCorrectToolForDrops()), ModCreativeModeTab.BLOCK_GEMSTONES_TAB);
    public static final RegistryObject<Block> AMETHYST_BLOCK = registerBlock("amethyst_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).requiresCorrectToolForDrops()), ModCreativeModeTab.BLOCK_GEMSTONES_TAB);
    public static final RegistryObject<Block> RUBY_BLOCK = registerBlock("ruby_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).requiresCorrectToolForDrops()), ModCreativeModeTab.BLOCK_GEMSTONES_TAB);
    public static final RegistryObject<Block> SAPPHIRE_BLOCK = registerBlock("sapphire_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).requiresCorrectToolForDrops()), ModCreativeModeTab.BLOCK_GEMSTONES_TAB);
    public static final RegistryObject<Block> CAERULA_BLOCK = registerBlock("caerula_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).requiresCorrectToolForDrops()), ModCreativeModeTab.BLOCK_GEMSTONES_TAB);
    public static final RegistryObject<Block> RAW_CAERULA_BLOCK = registerBlock("raw_caerula_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).requiresCorrectToolForDrops()), ModCreativeModeTab.BLOCK_GEMSTONES_TAB);
    public static final RegistryObject<Block> PEARL_BLOCK = registerBlock("pearl_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).strength(0.3f)), ModCreativeModeTab.BLOCK_GEMSTONES_TAB);
    public static final RegistryObject<Block> PEARL_INFESTED_OBISIDIAN = registerBlock("pearl_infested_obsidian", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN).requiresCorrectToolForDrops()), ModCreativeModeTab.BLOCK_GEMSTONES_TAB);
    public static final RegistryObject<Block> PALM_LOG = registerBlock("palm_log", () -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG)), ModCreativeModeTab.BLOCK_GEMSTONES_TAB);
    public static final RegistryObject<Block> STRIPPED_PALM_LOG = registerBlock("stripped_palm_log", () -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_SPRUCE_LOG)), ModCreativeModeTab.BLOCK_GEMSTONES_TAB);
    public static final RegistryObject<Block> PALM_WOOD = registerBlock("palm_wood", () -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_WOOD)), ModCreativeModeTab.BLOCK_GEMSTONES_TAB);
    public static final RegistryObject<Block> STRIPPED_PALM_WOOD = registerBlock("stripped_palm_wood", () -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_SPRUCE_WOOD)), ModCreativeModeTab.BLOCK_GEMSTONES_TAB);
    public static final RegistryObject<Block> PALM_PLANKS = registerBlock("palm_planks", () -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS), true, 20, 5), ModCreativeModeTab.BLOCK_GEMSTONES_TAB);
    public static final RegistryObject<Block> PALM_STAIRS = registerBlock("palm_stairs", () -> new StairBlock(() -> PALM_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SPRUCE_STAIRS)), ModCreativeModeTab.BLOCK_GEMSTONES_TAB);
    public static final RegistryObject<Block> PALM_SLAB = registerBlock("palm_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_STAIRS)), ModCreativeModeTab.BLOCK_GEMSTONES_TAB);
    public static final RegistryObject<Block> PALM_FENCE = registerBlock("palm_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_STAIRS)), ModCreativeModeTab.BLOCK_GEMSTONES_TAB);
    public static final RegistryObject<Block> PALM_FENCE_GATE = registerBlock("palm_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_STAIRS)), ModCreativeModeTab.BLOCK_GEMSTONES_TAB);
    public static final RegistryObject<Block> PALM_LEAVES = registerBlock("palm_leaves", () -> new FlammableLeavesBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LEAVES), true, 60, 30), ModCreativeModeTab.BLOCK_GEMSTONES_TAB);
    public static final RegistryObject<Block> PALM_SAPLING = registerBlock("palm_sapling", () -> new SaplingBlock(new PalmTreeGrower(),BlockBehaviour.Properties.copy(Blocks.SPRUCE_SAPLING)), ModCreativeModeTab.BLOCK_GEMSTONES_TAB);
    public static final RegistryObject<Block> TENEBRIS_PORTAL_BLOCK = registerBlockWithoutBlockItem("tenebris_portal_block", KJPortalBlock::new);
    public static final RegistryObject<Block> INFESTER = registerBlock("infester", () -> new InfesterBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)), ModCreativeModeTab.BLOCK_GEMSTONES_TAB);
    public static final RegistryObject<Block> CRUSHER = registerBlock("crusher", () -> new CrusherBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)), ModCreativeModeTab.BLOCK_GEMSTONES_TAB);
    public static final RegistryObject<Block> MACHINE_FRAME = registerBlock("machine_frame", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)), ModCreativeModeTab.BLOCK_GEMSTONES_TAB);
    public static final RegistryObject<Block> SAPPHIRE_MACHINE_FRAME = registerBlock("sapphire_machine_frame", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)), ModCreativeModeTab.BLOCK_GEMSTONES_TAB);
    public static final RegistryObject<Block> AMETHYST_MACHINE_FRAME = registerBlock("amethyst_machine_frame", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)), ModCreativeModeTab.BLOCK_GEMSTONES_TAB);

    private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }

    private static <T extends Block> RegistryObject registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registryBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject registryBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}