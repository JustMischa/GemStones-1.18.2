package eu.novagames.gemstones.items.custom;

import eu.novagames.gemstones.util.Resource;
import eu.novagames.gemstones.blocks.ModBlocks;
import eu.novagames.gemstones.items.ModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Random;

public class BundleItem extends Item {

    public BundleItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
        if (!pLevel.isClientSide()) {
            if (pPlayer.getMainHandItem().hurt(1, new Random(), null)) {
                pPlayer.getMainHandItem().shrink(1);
            }
            int chanceOfHammer = new Random().nextInt(100);
            int chanceOfPalmSapling = new Random().nextInt(100);
            int chanceOfTenebrisSapling = new Random().nextInt(100);
            int chanceOfWood = new Random().nextInt(100);
            boolean isPlanks = new Random().nextBoolean();
            boolean isStripped = new Random().nextBoolean();
            boolean both = new Random().nextBoolean();
            int chanceOfRubys = new Random().nextInt(100);
            int chanceOfSapphires = new Random().nextInt(100);

            if (chanceOfHammer < 25) {
                Resource.popResource(pLevel, pPlayer.getOnPos(), new ItemStack(ModItems.HAMMER.get()));
            }
            if (chanceOfPalmSapling < 30) {
                Resource.popResource(pLevel, pPlayer.getOnPos(), new ItemStack(ModBlocks.PALM_SAPLING.get(), new Random().nextInt(3)));
            }
            if (chanceOfTenebrisSapling < 30) {
                Resource.popResource(pLevel, pPlayer.getOnPos(), new ItemStack(ModBlocks.TENEBRIS_SAPLING.get(), new Random().nextInt(3)));
            }
            if (chanceOfWood < 45) {
                if (isPlanks) {
                    if (both) {
                        Resource.popResource(pLevel, pPlayer.getOnPos(), new ItemStack(ModBlocks.PALM_PLANKS.get(), new Random().nextInt(20)));
                        Resource.popResource(pLevel, pPlayer.getOnPos(), new ItemStack(ModBlocks.TENEBRIS_PLANKS.get(), new Random().nextInt(20)));
                    } else {
                        int what = new Random().nextInt(100);
                        if (what > 50) {
                            Resource.popResource(pLevel, pPlayer.getOnPos(), new ItemStack(ModBlocks.PALM_PLANKS.get(), new Random().nextInt(20)));
                        } else {
                            Resource.popResource(pLevel, pPlayer.getOnPos(), new ItemStack(ModBlocks.TENEBRIS_PLANKS.get(), new Random().nextInt(20)));
                        }
                    }
                } else {
                    if (isStripped) {
                        if (both) {
                            Resource.popResource(pLevel, pPlayer.getOnPos(), new ItemStack(ModBlocks.STRIPPED_PALM_LOG.get(), new Random().nextInt(20)));
                            Resource.popResource(pLevel, pPlayer.getOnPos(), new ItemStack(ModBlocks.STRIPPED_TENEBRIS_LOG.get(), new Random().nextInt(20)));
                        } else {
                            int what = new Random().nextInt(100);
                            if (what > 50) {
                                Resource.popResource(pLevel, pPlayer.getOnPos(), new ItemStack(ModBlocks.STRIPPED_PALM_LOG.get(), new Random().nextInt(20)));
                            } else {
                                Resource.popResource(pLevel, pPlayer.getOnPos(), new ItemStack(ModBlocks.STRIPPED_TENEBRIS_LOG.get(), new Random().nextInt(20)));
                            }
                        }
                    } else {
                        if (both) {
                            Resource.popResource(pLevel, pPlayer.getOnPos(), new ItemStack(ModBlocks.PALM_LOG.get(), new Random().nextInt(20)));
                            Resource.popResource(pLevel, pPlayer.getOnPos(), new ItemStack(ModBlocks.TENEBRIS_LOG.get(), new Random().nextInt(20)));
                        } else {
                            int what = new Random().nextInt(100);
                            if (what > 50) {
                                Resource.popResource(pLevel, pPlayer.getOnPos(), new ItemStack(ModBlocks.PALM_LOG.get(), new Random().nextInt(20)));
                            } else {
                                Resource.popResource(pLevel, pPlayer.getOnPos(), new ItemStack(ModBlocks.TENEBRIS_LOG.get(), new Random().nextInt(20)));
                            }
                        }
                    }
                }
            }
            if (chanceOfRubys < 15) {
                Resource.popResource(pLevel, pPlayer.getOnPos(), new ItemStack(ModItems.RUBY_GEM.get(), new Random().nextInt(10)));
            }
            if (chanceOfSapphires < 15) {
                Resource.popResource(pLevel, pPlayer.getOnPos(), new ItemStack(ModItems.SAPPHIRE_GEM.get(), new Random().nextInt(8)));
            }
            // noch mehr random Loot... z.B Rüstung, Schwerter usw.
        }
        return super.use(pLevel, pPlayer, pUsedHand);
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(new TextComponent("press §eRight Click§r for random loot!"));
    }
}