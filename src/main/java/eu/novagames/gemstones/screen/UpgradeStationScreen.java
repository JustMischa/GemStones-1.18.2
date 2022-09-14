package eu.novagames.gemstones.screen;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import eu.novagames.gemstones.GemStones;
import eu.novagames.gemstones.blocks.custom.blockentities.UpgradeStationEntity;
import eu.novagames.gemstones.recipe.UpgradeTableRecipe;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;

import java.util.Optional;

public class UpgradeStationScreen extends AbstractContainerScreen<UpgradeStationMenu> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(GemStones.MOD_ID, "textures/gui/upgrade_table.png");

    public UpgradeStationScreen(UpgradeStationMenu pMenu, Inventory pPlayerInventory, Component pTitle) {
        super(pMenu, pPlayerInventory, pTitle);
        this.imageHeight = 196;
    }

    @Override
    protected void renderBg(PoseStack pPoseStack, float pPartialTick, int pMouseX, int pMouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, TEXTURE);
        int x = (width - imageWidth) / 2;
        int y = (height - imageHeight) / 2;

        this.blit(pPoseStack, x, y, 0, 0, imageWidth, imageHeight);

        if (menu.isCrafting()) {
            blit(pPoseStack, x + 116, y + 51, 177, 2, menu.getScaledProgress(), 16);
        }
    }

    @Override
    public void render(PoseStack pPoseStack, int pMouseX, int pMouseY, float pPartialTick) {
        renderBackground(pPoseStack);
        super.render(pPoseStack, pMouseX, pMouseY, pPartialTick);
        renderTooltip(pPoseStack, pMouseX, pMouseY);
        this.inventoryLabelX = 12;
        this.inventoryLabelY = 95;
        this.titleLabelX = 12;
        this.titleLabelY = 10;
    }
}
