package eu.novagames.gemstones.items.tools;

import eu.novagames.gemstones.items.ModItems;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {

    public static final ForgeTier RUBY = new ForgeTier(3, 1600, 8.2f, 3f, 22, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ModItems.RUBY_GEM.get()));
    public static final ForgeTier SAPPHIRE = new ForgeTier(3, 1600, 8.2f, 3f, 22, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ModItems.SAPPHIRE_GEM.get()));
    public static final ForgeTier AMETHYST = new ForgeTier(3, 1600, 8.2f, 3f, 22, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ModItems.AMETHYST_GEM.get()));

}
