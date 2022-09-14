package eu.novagames.gemstones.integration;

import eu.novagames.gemstones.GemStones;
import eu.novagames.gemstones.blocks.ModBlocks;
import eu.novagames.gemstones.recipe.CrusherRecipe;
import eu.novagames.gemstones.recipe.InfesterRecipe;
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
import net.minecraft.world.item.crafting.Ingredient;

import javax.annotation.Nonnull;

public class CrusherRecipeCategory implements IRecipeCategory<CrusherRecipe> {

    public final static ResourceLocation UID = new ResourceLocation(GemStones.MOD_ID, "crusher");
    public final static ResourceLocation TEXTURE = new ResourceLocation(GemStones.MOD_ID, "textures/gui/crusher.png");
    private final IDrawable background;
    private final IDrawable icon;

    public CrusherRecipeCategory(IGuiHelper helper) {
        this.background = helper.createDrawable(TEXTURE, 0, 0, 175, 99);
        this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM, new ItemStack(ModBlocks.CRUSHER.get()));
    }

    @Override
    public ResourceLocation getUid() {
        return UID;
    }

    @Override
    public Class<? extends CrusherRecipe> getRecipeClass() {
        return CrusherRecipe.class;
    }

    @Override
    public Component getTitle() {
        return new TextComponent("Crusher");
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
    public void setRecipe(@Nonnull IRecipeLayoutBuilder builder, @Nonnull CrusherRecipe recipe, @Nonnull IFocusGroup focusGroup) {
        builder.addSlot(RecipeIngredientRole.INPUT, 80, 18).addIngredients(Ingredient.of(recipe.getIngredients().get(0).getItems()));
        builder.addSlot(RecipeIngredientRole.OUTPUT, 80, 54).addIngredients(Ingredient.of((recipe.getResultItem())));
    }
}