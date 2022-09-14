package eu.novagames.gemstones.blocks.custom;

import eu.novagames.gemstones.util.Resource;
import eu.novagames.gemstones.items.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.OreBlock;
import net.minecraft.world.level.block.state.BlockState;

import java.util.Random;

public class CaerulaOreBlock extends OreBlock {

    public CaerulaOreBlock(Properties properties) {
        super(properties);
    }

    @Override
    public void spawnAfterBreak(BlockState pState, ServerLevel pLevel, BlockPos pPos, ItemStack pStack) {
        int chanceOfCaerulaShard = new Random().nextInt(100);
        if (chanceOfCaerulaShard > 50) {
            Resource.popResource(pLevel, pPos, new ItemStack(ModItems.CAERULA_SHARD.get(), new Random().nextInt(3)));
        }
        super.spawnAfterBreak(pState, pLevel, pPos, pStack);
    }
}