package com.example.scpfacility.gui;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;

public class SCPGuiScreen extends AbstractContainerScreen<SCPGuiContainer> {
    private static final ResourceLocation TEXTURE = new ResourceLocation("scp-facility", "textures/gui/scp_gui.png");

    public SCPGuiScreen(SCPGuiContainer container, Inventory inventory, Component title) {
        super(container, inventory, title);
    }

    @Override
    protected void renderBg(PoseStack poseStack, float partialTicks, int mouseX, int mouseY) {
        renderBackground(poseStack);
        if (minecraft != null) {
            minecraft.getTextureManager().bindForSetup(TEXTURE);
            blit(poseStack, leftPos, topPos, 0, 0, imageWidth, imageHeight);
        }
    }

    @Override
    public void render(PoseStack poseStack, int mouseX, int mouseY, float partialTicks) {
        super.render(poseStack, mouseX, mouseY, partialTicks);
        renderTooltip(poseStack, mouseX, mouseY);
    }
}