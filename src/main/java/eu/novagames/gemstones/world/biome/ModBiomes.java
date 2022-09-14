package eu.novagames.gemstones.world.biome;

import eu.novagames.gemstones.GemStones;
import eu.novagames.gemstones.world.biome.custom.ModOverworldBiomes;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModBiomes
{
    protected static DeferredRegister<Biome> BIOME_REGISTER = DeferredRegister.create(Registry.BIOME_REGISTRY, GemStones.MOD_ID);

    public static void registerBiomes()
    {
        register(Biomes.GARDEN, ModOverworldBiomes::Garden);
    }

    public static void register(IEventBus eventBus) {
        BIOME_REGISTER.register(eventBus);
    }

    public static RegistryObject<Biome> register(ResourceKey<Biome> key, Supplier<Biome> biomeSupplier)
    {
        return BIOME_REGISTER.register(key.location().getPath(), biomeSupplier);
    }
}
