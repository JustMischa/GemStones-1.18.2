package eu.novagames.gemstones.blocks.custom;

import eu.novagames.gemstones.items.ModItems;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.CropBlock;

public class BlueBerryBlock extends CropBlock {

    public BlueBerryBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return ModItems.BLUE_BERRIES_SEEDS.get();
    }
}
