package eu.novagames.gemstones.integration;

import eu.novagames.gemstones.GemStones;
import eu.novagames.gemstones.recipe.CrusherRecipe;
import eu.novagames.gemstones.recipe.InfesterRecipe;
import eu.novagames.gemstones.recipe.UpgradeTableRecipe;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeManager;

import java.util.List;
import java.util.Objects;

@JeiPlugin
public class JEIGemStonesPlugin implements IModPlugin {

    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(GemStones.MOD_ID, "jei_plugin");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        registration.addRecipeCategories(new UpgradeTableRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
        registration.addRecipeCategories(new InfesterRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
        registration.addRecipeCategories(new CrusherRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        RecipeManager rm = Objects.requireNonNull(Minecraft.getInstance().level).getRecipeManager();
        List<UpgradeTableRecipe> UpgradeTableRecipes = rm.getAllRecipesFor(UpgradeTableRecipe.Type.INSTANCE);
        List<InfesterRecipe> InfesterRecipes = rm.getAllRecipesFor(InfesterRecipe.Type.INSTANCE);
        List<CrusherRecipe> CrusherRecipes = rm.getAllRecipesFor(CrusherRecipe.Type.INSTANCE);
        registration.addRecipes(new RecipeType<>(UpgradeTableRecipeCategory.UID, UpgradeTableRecipe.class), UpgradeTableRecipes);
        registration.addRecipes(new RecipeType<>(InfesterRecipeCategory.UID, InfesterRecipe.class), InfesterRecipes);
        registration.addRecipes(new RecipeType<>(CrusherRecipeCategory.UID, CrusherRecipe.class), CrusherRecipes);
    }
}