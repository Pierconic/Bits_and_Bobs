package net.mcreator.superiorstructures.client.gui;

import net.neoforged.neoforge.network.PacketDistributor;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.superiorstructures.world.inventory.ArtificeMenu;
import net.mcreator.superiorstructures.procedures.Exp5SuccessDisplayProcedure;
import net.mcreator.superiorstructures.procedures.Exp5FailureDisplayProcedure;
import net.mcreator.superiorstructures.procedures.Exp4SuccessDisplayProcedure;
import net.mcreator.superiorstructures.procedures.Exp4FailureDisplayProcedure;
import net.mcreator.superiorstructures.procedures.Exp3SuccessDisplayProcedure;
import net.mcreator.superiorstructures.procedures.Exp3FailureDisplayProcedure;
import net.mcreator.superiorstructures.procedures.Exp2SuccessDisplayProcedure;
import net.mcreator.superiorstructures.procedures.Exp1FailureDisplayProcedure;
import net.mcreator.superiorstructures.procedures.EXP1SuccessDisplayProcedure;
import net.mcreator.superiorstructures.network.ArtificeButtonMessage;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class ArtificeScreen extends AbstractContainerScreen<ArtificeMenu> {
	private final static HashMap<String, Object> guistate = ArtificeMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_tinker;

	public ArtificeScreen(ArtificeMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("superiorstructures:textures/screens/artifice.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics, mouseX, mouseY, partialTicks);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (mouseX > leftPos + 103 && mouseX < leftPos + 127 && mouseY > topPos + 32 && mouseY < topPos + 56)
			guiGraphics.renderTooltip(font, Component.translatable("gui.superiorstructures.artifice.tooltip_insert_machinery_components"), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(ResourceLocation.parse("superiorstructures:textures/screens/arrows.png"), this.leftPos + 97, this.topPos + 11, 0, 0, 32, 64, 32, 64);

		if (Exp1FailureDisplayProcedure.execute(world, x, y, z, entity)) {
			guiGraphics.blit(ResourceLocation.parse("superiorstructures:textures/screens/explvl1missing.png"), this.leftPos + 19, this.topPos + 26, 0, 0, 32, 16, 32, 16);
		}
		if (EXP1SuccessDisplayProcedure.execute(world, x, y, z, entity)) {
			guiGraphics.blit(ResourceLocation.parse("superiorstructures:textures/screens/exp1lvl.png"), this.leftPos + 19, this.topPos + 26, 0, 0, 32, 16, 32, 16);
		}
		if (Exp2SuccessDisplayProcedure.execute(world, x, y, z, entity)) {
			guiGraphics.blit(ResourceLocation.parse("superiorstructures:textures/screens/explvl2missing.png"), this.leftPos + 19, this.topPos + 26, 0, 0, 32, 16, 32, 16);
		}
		if (Exp2SuccessDisplayProcedure.execute(world, x, y, z, entity)) {
			guiGraphics.blit(ResourceLocation.parse("superiorstructures:textures/screens/exp2lvls.png"), this.leftPos + 19, this.topPos + 26, 0, 0, 32, 16, 32, 16);
		}
		if (Exp3FailureDisplayProcedure.execute(world, x, y, z, entity)) {
			guiGraphics.blit(ResourceLocation.parse("superiorstructures:textures/screens/explvl4missing.png"), this.leftPos + 19, this.topPos + 26, 0, 0, 32, 16, 32, 16);
		}
		if (Exp3SuccessDisplayProcedure.execute(world, x, y, z, entity)) {
			guiGraphics.blit(ResourceLocation.parse("superiorstructures:textures/screens/explvl4.png"), this.leftPos + 19, this.topPos + 26, 0, 0, 32, 16, 32, 16);
		}
		if (Exp4FailureDisplayProcedure.execute(world, x, y, z, entity)) {
			guiGraphics.blit(ResourceLocation.parse("superiorstructures:textures/screens/explvl8missing.png"), this.leftPos + 19, this.topPos + 26, 0, 0, 32, 16, 32, 16);
		}
		if (Exp4SuccessDisplayProcedure.execute(world, x, y, z, entity)) {
			guiGraphics.blit(ResourceLocation.parse("superiorstructures:textures/screens/explvl8.png"), this.leftPos + 19, this.topPos + 26, 0, 0, 32, 16, 32, 16);
		}
		if (Exp5FailureDisplayProcedure.execute(world, x, y, z, entity)) {
			guiGraphics.blit(ResourceLocation.parse("superiorstructures:textures/screens/fail16.png"), this.leftPos + 19, this.topPos + 26, 0, 0, 32, 16, 32, 16);
		}
		if (Exp5SuccessDisplayProcedure.execute(world, x, y, z, entity)) {
			guiGraphics.blit(ResourceLocation.parse("superiorstructures:textures/screens/success16.png"), this.leftPos + 19, this.topPos + 26, 0, 0, 32, 16, 32, 16);
		}
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.superiorstructures.artifice.label_artificery"), 10, 10, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_tinker = Button.builder(Component.translatable("gui.superiorstructures.artifice.button_tinker"), e -> {
			if (true) {
				PacketDistributor.sendToServer(new ArtificeButtonMessage(0, x, y, z));
				ArtificeButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 9, this.topPos + 50, 56, 20).build();
		guistate.put("button:button_tinker", button_tinker);
		this.addRenderableWidget(button_tinker);
	}
}
