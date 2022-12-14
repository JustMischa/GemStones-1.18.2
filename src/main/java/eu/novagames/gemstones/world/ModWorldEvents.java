package eu.novagames.gemstones.world;

import eu.novagames.gemstones.GemStones;
import eu.novagames.gemstones.world.gen.ModOreGeneration;
import eu.novagames.gemstones.world.gen.ModTreeGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = GemStones.MOD_ID)
public class ModWorldEvents {
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        ModTreeGeneration.generateTrees(event);
        ModOreGeneration.generateOres(event);
    }
}