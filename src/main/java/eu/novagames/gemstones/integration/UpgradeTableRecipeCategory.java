package eu.novagames.gemstones.integration;

import eu.novagames.gemstones.GemStones;
import eu.novagames.gemstones.blocks.ModBlocks;
import eu.novagames.gemstones.items.ModItems;
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

public class UpgradeTableRecipeCategory implements IRecipeCategory<UpgradeTableRecipe> {

    public final static ResourceLocation UID = new ResourceLocation(GemStones.MOD_ID, "upgrade_table");
    public final static ResourceLocation TEXTURE =
            new ResourceLocation(GemStones.MOD_ID, "textures/gui/upgrade_table.png");

    private final IDrawable background;
    private final IDrawable icon;

    public UpgradeTableRecipeCategory(IGuiHelper helper) {
        this.background = helper.createDrawable(TEXTURE, 0, 0, 175, 108);
        this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM, new ItemStack(ModBlocks.UPGRADE_TABLE.get()));
    }

    @Override
    public ResourceLocation getUid() {
        return UID;
    }

    @Override
    public Class<? extends UpgradeTableRecipe> getRecipeClass() {
        return UpgradeTableRecipe.class;
    }

    @Override
    public Component getTitle() {
        return new TextComponent("Upgrade Table");
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
    public void setRecipe(@Nonnull IRecipeLayoutBuilder builder, @Nonnull UpgradeTableRecipe recipe, @Nonnull IFocusGroup focusGroup) {
        builder.addSlot(RecipeIngredientRole.INPUT, 17, 21).addIngredients(Ingredient.of(ModItems.BUNDLE.get(), ModItems.HAMMER.get()));
        if(recipe.getIngredients().size() == 1) {
            builder.addSlot(RecipeIngredientRole.INPUT, 25, 48).addIngredients(Ingredient.of(recipe.getIngredients().get(0).getItems()));
            builder.addSlot(RecipeIngredientRole.INPUT, 60, 48).addIngredients(Ingredient.of((recipe.getIngredients().get(0).getItems())));
            builder.addSlot(RecipeIngredientRole.INPUT, 95, 48).addIngredients(Ingredient.of((recipe.getIngredients().get(0).getItems())));
        } else if(recipe.getIngredients().size() == 2) {
            builder.addSlot(RecipeIngredientRole.INPUT, 25, 48).addIngredients(Ingredient.of(recipe.getIngredients().get(0).getItems()));
            builder.addSlot(RecipeIngredientRole.INPUT, 60, 48).addIngredients(Ingredient.of((recipe.getIngredients().get(1).getItems())));
            builder.addSlot(RecipeIngredientRole.INPUT, 95, 48).addIngredients(Ingredient.of((recipe.getIngredients().get(2).getItems())));
        } else if(recipe.getIngredients().size() == 3) {
            builder.addSlot(RecipeIngredientRole.INPUT, 25, 48).addIngredients(Ingredient.of(recipe.getIngredients().get(0).getItems()));
            builder.addSlot(RecipeIngredientRole.INPUT, 60, 48).addIngredients(Ingredient.of((recipe.getIngredients().get(1).getItems())));
            builder.addSlot(RecipeIngredientRole.INPUT, 95, 48).addIngredients(Ingredient.of((recipe.getIngredients().get(2).getItems())));
        }
        builder.addSlot(RecipeIngredientRole.OUTPUT, 140, 48).addItemStack(recipe.getResultItem());
    }
}