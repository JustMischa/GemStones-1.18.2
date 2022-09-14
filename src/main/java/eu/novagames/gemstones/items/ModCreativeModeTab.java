package eu.novagames.gemstones.items;

import eu.novagames.gemstones.blocks.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {

    public static final CreativeModeTab FOOD_GEMSTONES_TAB = new CreativeModeTab("gemstonesfood") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.BLUE_BERRIES.get());
        }
    };

    public static final CreativeModeTab ITEM_GEMSTONES_TAB = new CreativeModeTab("gemstonesitems") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.PEARL.get());
        }
    };

    public static final CreativeModeTab BLOCK_GEMSTONES_TAB = new CreativeModeTab("gemstonesblocks") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.TENEBRIS_WOOD.get());
        }
    };
}
