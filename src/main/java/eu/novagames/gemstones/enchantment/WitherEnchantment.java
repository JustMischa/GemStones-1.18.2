package eu.novagames.gemstones.enchantment;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.monster.Blaze;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraft.world.entity.monster.Skeleton;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

import java.util.Random;

public class WitherEnchantment extends Enchantment {

    protected WitherEnchantment(Rarity pRarity, EnchantmentCategory pCategory, EquipmentSlot pApplicableSlots) {
        super(pRarity, EnchantmentCategory.WEAPON, new EquipmentSlot[]{pApplicableSlots});
    }

    @Override
    public void doPostAttack(LivingEntity pAttacker, Entity pTarget, int pLevel) {
        if (!pAttacker.level.isClientSide()) {
            ServerLevel level = ((ServerLevel) pAttacker.level);
            ServerPlayer player = ((ServerPlayer) pAttacker);
            if (pTarget instanceof ServerPlayer) {
                ServerPlayer target = (ServerPlayer) pTarget;
                int chance = new Random().nextInt(100);
                switch (pLevel) {
                    case 1 -> {
                        if (chance > 60) {
                            target.addEffect(new MobEffectInstance(MobEffects.WITHER, 20*4, 1));
                        }
                    }
                    case 2 -> {
                        if (chance > 30) {
                            target.addEffect(new MobEffectInstance(MobEffects.WITHER, 20*4, 1));
                        }
                    }
                }
            } else {
                if (pTarget instanceof Zombie) {
                    Zombie target = (Zombie) pTarget;
                    int chance = new Random().nextInt(100);
                    switch (pLevel) {
                        case 1 -> {
                            if (chance > 60) {
                                target.addEffect(new MobEffectInstance(MobEffects.WITHER, 20*4, 1));
                            }
                        }
                        case 2 -> {
                            if (chance > 30) {
                                target.addEffect(new MobEffectInstance(MobEffects.WITHER, 20*4, 1));
                            }
                        }
                    }
                } else if (pTarget instanceof Skeleton) {
                    Skeleton target = (Skeleton) pTarget;
                    int chance = new Random().nextInt(100);
                    switch (pLevel) {
                        case 1 -> {
                            if (chance > 60) {
                                target.addEffect(new MobEffectInstance(MobEffects.WITHER, 20*4, 1));
                            }
                        }
                        case 2 -> {
                            if (chance > 30) {
                                target.addEffect(new MobEffectInstance(MobEffects.WITHER, 20*4, 1));
                            }
                        }
                    }
                } else if (pTarget instanceof Creeper) {
                    Creeper target = (Creeper) pTarget;
                    int chance = new Random().nextInt(100);
                    switch (pLevel) {
                        case 1 -> {
                            if (chance > 60) {
                                target.addEffect(new MobEffectInstance(MobEffects.WITHER, 20*4, 1));
                            }
                        }
                        case 2 -> {
                            if (chance > 30) {
                                target.addEffect(new MobEffectInstance(MobEffects.WITHER, 20*4, 1));
                            }
                        }
                    }
                } else if (pTarget instanceof Blaze) {
                    Blaze   target = (Blaze) pTarget;
                    int chance = new Random().nextInt(100);
                    switch (pLevel) {
                        case 1 -> {
                            if (chance > 60) {
                                target.addEffect(new MobEffectInstance(MobEffects.WITHER, 20*4, 1));
                            }
                        }
                        case 2 -> {
                            if (chance > 30) {
                                target.addEffect(new MobEffectInstance(MobEffects.WITHER, 20*4, 1));
                            }
                        }
                    }
                }
            }
        }
    }

    @Override
    public int getMaxLevel() {
        return 2;
    }
}
