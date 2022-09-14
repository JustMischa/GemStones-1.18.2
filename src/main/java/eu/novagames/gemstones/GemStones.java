package eu.novagames.gemstones;

import com.mojang.logging.LogUtils;
import eu.novagames.gemstones.blocks.ModBlocks;
import eu.novagames.gemstones.config.GemStonesClientConfigs;
import eu.novagames.gemstones.networking.ModMessages;
import eu.novagames.gemstones.register.Registration;
import eu.novagames.gemstones.screen.*;
import eu.novagames.gemstones.world.biome.ModRegion;
import eu.novagames.gemstones.world.biome.ModSurfaceRuleData;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import software.bernie.geckolib3.GeckoLib;
import terrablender.api.Regions;
import terrablender.api.SurfaceRuleManager;

import static eu.novagames.gemstones.GemStones.MOD_ID;

@Mod(MOD_ID)
public class GemStones {

    public static final String MOD_ID = "gemstones";
    private static final Logger LOGGER = LogUtils.getLogger();

    public GemStones() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        Registration.init(eventBus);
        GeckoLib.initialize();
        registerSetups(eventBus);
        registerConfigs();
        MinecraftForge.EVENT_BUS.register(this);

    }

    private void setupClient(final FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLUE_BERRIES_PLANT.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.TENEBRIS_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.TENEBRIS_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PALM_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PALM_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.INFESTER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.TENEBRIS_PORTAL_BLOCK.get(), RenderType.translucent());
        MenuScreens.register(ModMenuTypes.UPGRADE_TABLE_MENU.get(), UpgradeStationScreen::new);
        MenuScreens.register(ModMenuTypes.INFESTER_MENU.get(), InfesterScreen::new);
        MenuScreens.register(ModMenuTypes.CRUSHER_MENU.get(), CrusherScreen::new);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        event.enqueueWork(() ->
        {
            // Given we only add two biomes, we should keep our weight relatively low.
            Regions.register(new ModRegion(new ResourceLocation(MOD_ID, "overworld"), 2));

            // Register our surface rules
            SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, MOD_ID, ModSurfaceRuleData.makeRules());
        });
    }

    private void setup(final FMLCommonSetupEvent event) {
        ModMessages.register();
    }

    private void registerConfigs() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, GemStonesClientConfigs.SPEC, "gemstones-client.toml");
        // ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, GemStonesClientConfigs.SPEC, "gemstones-common.toml");
    }

    private void registerSetups(IEventBus eventBus) {
        eventBus.addListener(this::setup);
        eventBus.addListener(this::setupClient);
        eventBus.addListener(this::commonSetup);
    }
}