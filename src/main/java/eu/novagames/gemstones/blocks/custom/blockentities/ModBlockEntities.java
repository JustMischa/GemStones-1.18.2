package eu.novagames.gemstones.blocks.custom.blockentities;

import eu.novagames.gemstones.GemStones;
import eu.novagames.gemstones.blocks.ModBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, GemStones.MOD_ID);

    public static final RegistryObject<BlockEntityType<UpgradeStationEntity>> UPGRADE_ENTITY =
            BLOCK_ENTITIES.register("upgrade_station_block_entity",
                    () -> BlockEntityType.Builder.of(UpgradeStationEntity::new,
                            ModBlocks.UPGRADE_TABLE.get()).build(null));

    public static final RegistryObject<BlockEntityType<InfesterEntity>> INFESTER_ENTITY =
            BLOCK_ENTITIES.register("infester_block_entity",
                    () -> BlockEntityType.Builder.of(InfesterEntity::new,
                            ModBlocks.INFESTER.get()).build(null));

    public static final RegistryObject<BlockEntityType<CrusherEntity>> CRUSHER_ENTITY =
            BLOCK_ENTITIES.register("crusher_block_entity",
                    () -> BlockEntityType.Builder.of(CrusherEntity::new,
                            ModBlocks.CRUSHER.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}