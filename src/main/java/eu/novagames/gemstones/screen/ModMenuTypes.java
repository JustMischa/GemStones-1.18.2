package eu.novagames.gemstones.screen;

import eu.novagames.gemstones.GemStones;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModMenuTypes {

    public static final DeferredRegister<MenuType<?>> MENUS =
            DeferredRegister.create(ForgeRegistries.CONTAINERS, GemStones.MOD_ID);

    public static final RegistryObject<MenuType<UpgradeStationMenu>> UPGRADE_TABLE_MENU =
            registryMenuType(UpgradeStationMenu::new, "upgrade_station_menu");

    public static final RegistryObject<MenuType<InfesterMenu>> INFESTER_MENU =
            registryMenuType(InfesterMenu::new, "infester_menu");

    public static final RegistryObject<MenuType<CrusherMenu>> CRUSHER_MENU =
            registryMenuType(CrusherMenu::new, "crusher_menu");

    private static <T extends AbstractContainerMenu>RegistryObject<MenuType<T>> registryMenuType(IContainerFactory<T> factory, String name) {
        return MENUS.register(name, () -> IForgeMenuType.create(factory));
    }

    public static void register(IEventBus eventBus) {
        MENUS.register(eventBus);
    }
}
