package eu.novagames.gemstones.blocks.custom.wood;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class FlammableBlock extends Block {

    boolean flammable;
    int flammability;
    int firespread;

    public FlammableBlock(Properties properties, boolean flammable, int flammability, int firespread) {
        super(properties);
        this.flammability = flammability;
        this.flammable = flammable;
        this.firespread = firespread;
    }

    @Override
    public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return flammable;
    }

    @Override
    public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return flammability;
    }

    @Override
    public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return firespread;
    }
}
