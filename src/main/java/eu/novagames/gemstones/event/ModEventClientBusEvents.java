package eu.novagames.gemstones.event;

import eu.novagames.gemstones.GemStones;
import eu.novagames.gemstones.items.custom.armor.AmethystAmorItem;
import eu.novagames.gemstones.items.custom.armor.AmethystArmorRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

@Mod.EventBusSubscriber(modid = GemStones.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventClientBusEvents {
    @SubscribeEvent
    public static void registerArmorRenderers(final EntityRenderersEvent.AddLayers event) {
        GeoArmorRenderer.registerArmorRenderer(AmethystAmorItem.class, new AmethystArmorRenderer());
    }
}