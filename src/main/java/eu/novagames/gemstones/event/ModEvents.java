package eu.novagames.gemstones.event;

import eu.novagames.gemstones.GemStones;
import eu.novagames.gemstones.config.GemStonesClientConfigs;
import eu.novagames.gemstones.util.GemStonesTitleScreen;
import net.minecraft.client.gui.screens.TitleScreen;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.ScreenOpenEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = GemStones.MOD_ID)
public class ModEvents {

    @SubscribeEvent
    @OnlyIn(Dist.CLIENT)
    public static void openGui(ScreenOpenEvent event) {
        if (GemStonesClientConfigs.CUSTOM_TITLE_SCREEN.get() && event.getScreen() instanceof TitleScreen && !(event.getScreen() instanceof GemStonesTitleScreen)) {
            event.setScreen(new GemStonesTitleScreen());
        }
    }
}