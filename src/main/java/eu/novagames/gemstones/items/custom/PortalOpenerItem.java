package eu.novagames.gemstones.items.custom;

import eu.novagames.gemstones.blocks.ModBlocks;
import eu.novagames.gemstones.blocks.custom.KJPortalBlock;
import eu.novagames.gemstones.items.ModCreativeModeTab;
import eu.novagames.gemstones.world.dimension.ModDimensions;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;

public class PortalOpenerItem extends Item {

    public PortalOpenerItem() {
        super(new Properties().tab(ModCreativeModeTab.ITEM_GEMSTONES_TAB).stacksTo(1).rarity(Rarity.RARE));
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        if(context.getPlayer() != null) {
            if(context.getPlayer().level.dimension() == ModDimensions.TENEBRIS_KEY
                    || context.getPlayer().level.dimension() == Level.OVERWORLD) {
                for(Direction direction : Direction.Plane.VERTICAL) {
                    BlockPos framePos = context.getClickedPos().relative(direction);
                    if(((KJPortalBlock) ModBlocks.TENEBRIS_PORTAL_BLOCK.get()).trySpawnPortal(context.getLevel(), framePos)) {
                        context.getLevel().playSound(context.getPlayer(), framePos, SoundEvents.FLINTANDSTEEL_USE,
                                SoundSource.BLOCKS, 1.0F, context.getLevel().getRandom().nextFloat() * 0.4F + 0.8F);
                        return InteractionResult.CONSUME;
                    }
                    else return InteractionResult.FAIL;
                }
            }
        }
        return InteractionResult.FAIL;
    }
}