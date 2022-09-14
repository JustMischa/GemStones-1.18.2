package eu.novagames.gemstones.recipe;

import eu.novagames.gemstones.GemStones;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModRecipes {

    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, GemStones.MOD_ID);

    public static final RegistryObject<RecipeSerializer<UpgradeTableRecipe>> UPGRADE_SERIALIZER = SERIALIZERS.register("upgrade_table", () -> UpgradeTableRecipe.Serializer.INSTANCE);
    public static final RegistryObject<RecipeSerializer<InfesterRecipe>> INFESTER_SERIALIZER = SERIALIZERS.register("infester", () -> InfesterRecipe.Serializer.INSTANCE);
    public static final RegistryObject<RecipeSerializer<CrusherRecipe>> CRUSHER_SERIALIZER = SERIALIZERS.register("crusher", () -> CrusherRecipe.Serializer.INSTANCE);

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }
}