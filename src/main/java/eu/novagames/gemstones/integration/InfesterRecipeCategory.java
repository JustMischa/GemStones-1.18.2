package eu.novagames.gemstones.integration;

import eu.novagames.gemstones.GemStones;
import eu.novagames.gemstones.blocks.ModBlocks;
import eu.novagames.gemstones.items.ModItems;
import eu.novagames.gemstones.recipe.InfesterRecipe;
import eu.novagames.gemstones.recipe.UpgradeTableRecipe;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import javax.annotation.Nonnull;

public class InfesterRecipeCategory implements IRecipeCategory<InfesterRecipe> {

    public final static ResourceLocation UID = new ResourceLocation(GemStones.MOD_ID, "infester");
    public final static ResourceLocation TEXTURE =
            new ResourceLocation(GemStones.MOD_ID, "textures/gui/infester.png");

    private final IDrawable background;
    private final IDrawable icon;

    public InfesterRecipeCategory(IGuiHelper helper) {
        this.background = helper.createDrawable(TEXTURE, 0, 0, 175, 99);
        this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM, new ItemStack(ModBlocks.INFESTER.get()));
    }

    @Override
    public ResourceLocation getUid() {
        return UID;
    }

    @Override
    public Class<? extends InfesterRecipe> getRecipeClass() {
        return InfesterRecipe.class;
    }

    @Override
    public Component getTitle() {
        return new TextComponent("Infester");
    }

    @Override
    public IDrawable getBackground() {
        return this.background;
    }

    @Override
    public IDrawable getIcon() {
        return this.icon;
    }

    @Override
    public void setRecipe(@Nonnull IRecipeLayoutBuilder builder, @Nonnull InfesterRecipe recipe, @Nonnull IFocusGroup focusGroup) {
        if(recipe.getIngredients().size() == 2) {
            builder.addSlot(RecipeIngredientRole.INPUT, 62, 25).addIngredients(Ingredient.of(recipe.getIngredients().get(0).getItems()));
            builder.addSlot(RecipeIngredientRole.INPUT, 62, 58).addIngredients(Ingredient.of((recipe.getIngredients().get(1).getItems())));
        }
        builder.addSlot(RecipeIngredientRole.OUTPUT, 135, 47).addItemStack(recipe.getResultItem());
    }
}