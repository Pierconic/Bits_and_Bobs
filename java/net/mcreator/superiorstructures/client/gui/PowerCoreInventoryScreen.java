package net.mcreator.superiorstructures.client.gui;

import net.neoforged.neoforge.network.PacketDistributor;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.WidgetSprites;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.superiorstructures.world.inventory.PowerCoreInventoryMenu;
import net.mcreator.superiorstructures.procedures.PowerCoreBoltDisplayProcedure;
import net.mcreator.superiorstructures.procedures.CoreStateProviderProcedure;
import net.mcreator.superiorstructures.procedures.CoreSlot3ChargingProcedure;
import net.mcreator.superiorstructures.procedures.CoreSlot3ChargedProcedure;
import net.mcreator.superiorstructures.procedures.CoreSlot2ChargingProcedure;
import net.mcreator.superiorstructures.procedures.CoreSlot2ChargedProcedure;
import net.mcreator.superiorstructures.procedures.CoreSlot1ChargingProcedure;
import net.mcreator.superiorstructures.procedures.CoreSlot1ChargedProcedure;
import net.mcreator.superiorstructures.procedures.CoreButton3DisplayProcedure;
import net.mcreator.superiorstructures.procedures.CoreButton2DisplayProcedure;
import net.mcreator.superiorstructures.procedures.CoreButton1DisplayProcedure;
import net.mcreator.superiorstructures.procedures.Charge9Procedure;
import net.mcreator.superiorstructures.procedures.Charge8Procedure;
import net.mcreator.superiorstructures.procedures.Charge7Procedure;
import net.mcreator.superiorstructures.procedures.Charge6Procedure;
import net.mcreator.superiorstructures.procedures.Charge5Procedure;
import net.mcreator.superiorstructures.procedures.Charge4Procedure;
import net.mcreator.superiorstructures.procedures.Charge3Procedure;
import net.mcreator.superiorstructures.procedures.Charge2Procedure;
import net.mcreator.superiorstructures.procedures.Charge1Procedure;
import net.mcreator.superiorstructures.procedures.Charge10Procedure;
import net.mcreator.superiorstructures.procedures.CellEmptyDisplayProcedure;
import net.mcreator.superiorstructures.procedures.Bolt9DisplayProcedure;
import net.mcreator.superiorstructures.procedures.Bolt8DisplayProcedure;
import net.mcreator.superiorstructures.procedures.Bolt7DisplayProcedure;
import net.mcreator.superiorstructures.procedures.Bolt6DisplayProcedure;
import net.mcreator.superiorstructures.procedures.Bolt5DisplayProcedure;
import net.mcreator.superiorstructures.procedures.Bolt4DisplayProcedure;
import net.mcreator.superiorstructures.procedures.Bolt3DisplayProcedure;
import net.mcreator.superiorstructures.procedures.Bolt2DisplayProcedure;
import net.mcreator.superiorstructures.procedures.Bolt1DisplayProcedure;
import net.mcreator.superiorstructures.procedures.Bolt16DisplayProcedure;
import net.mcreator.superiorstructures.procedures.Bolt15DisplayProcedure;
import net.mcreator.superiorstructures.procedures.Bolt14DisplayProcedure;
import net.mcreator.superiorstructures.procedures.Bolt13DisplayProcedure;
import net.mcreator.superiorstructures.procedures.Bolt12DisplayProcedure;
import net.mcreator.superiorstructures.procedures.Bolt11DisplayProcedure;
import net.mcreator.superiorstructures.procedures.Bolt10DisplayProcedure;
import net.mcreator.superiorstructures.procedures.Bolt0DisplayProcedure;
import net.mcreator.superiorstructures.network.PowerCoreInventoryButtonMessage;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class PowerCoreInventoryScreen extends AbstractContainerScreen<PowerCoreInventoryMenu> {
	private final static HashMap<String, Object> guistate = PowerCoreInventoryMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_exp_insert_1;
	ImageButton imagebutton_exp_insert_5;
	ImageButton imagebutton_exp_insert_x;

	public PowerCoreInventoryScreen(PowerCoreInventoryMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("superiorstructures:textures/screens/power_core_inventory.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics, mouseX, mouseY, partialTicks);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (mouseX > leftPos + 11 && mouseX < leftPos + 35 && mouseY > topPos + 40 && mouseY < topPos + 64)
			guiGraphics.renderTooltip(font, Component.translatable("gui.superiorstructures.power_core_inventory.tooltip_electrify_the_power_core_to_over"), mouseX, mouseY);
		if (mouseX > leftPos + 90 && mouseX < leftPos + 114 && mouseY > topPos + 12 && mouseY < topPos + 36)
			guiGraphics.renderTooltip(font, Component.translatable("gui.superiorstructures.power_core_inventory.tooltip_power_artificery_items_using_exp"), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(ResourceLocation.parse("superiorstructures:textures/screens/power_core_inventory_charged.png"), this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);

		if (CoreStateProviderProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("superiorstructures:textures/screens/power_core_bolts.png"), this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		}

		guiGraphics.blit(ResourceLocation.parse("superiorstructures:textures/screens/exp_insert_empty_1.png"), this.leftPos + 114, this.topPos + 16, 0, 0, 17, 15, 17, 15);

		guiGraphics.blit(ResourceLocation.parse("superiorstructures:textures/screens/exp_insert_empty_5.png"), this.leftPos + 134, this.topPos + 16, 0, 0, 17, 15, 17, 15);

		guiGraphics.blit(ResourceLocation.parse("superiorstructures:textures/screens/exp_insert_empty_x.png"), this.leftPos + 154, this.topPos + 16, 0, 0, 17, 15, 17, 15);

		guiGraphics.blit(ResourceLocation.parse("superiorstructures:textures/screens/charge_slot_empty.png"), this.leftPos + 53, this.topPos + 65, 0, 0, 14, 6, 14, 6);

		guiGraphics.blit(ResourceLocation.parse("superiorstructures:textures/screens/charge_slot_empty.png"), this.leftPos + 81, this.topPos + 65, 0, 0, 14, 6, 14, 6);

		guiGraphics.blit(ResourceLocation.parse("superiorstructures:textures/screens/charge_slot_empty.png"), this.leftPos + 109, this.topPos + 65, 0, 0, 14, 6, 14, 6);

		if (PowerCoreBoltDisplayProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("superiorstructures:textures/screens/bolt_right.png"), this.leftPos + 7, this.topPos + 43, 0, 0, 40, 17, 40, 17);
		}
		if (PowerCoreBoltDisplayProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("superiorstructures:textures/screens/bolt_left.png"), this.leftPos + 129, this.topPos + 43, 0, 0, 40, 17, 40, 17);
		}
		if (Charge1Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("superiorstructures:textures/screens/power_bar_start.png"), this.leftPos + 37, this.topPos + 36, 0, 0, 11, 5, 11, 5);
		}
		if (Charge2Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("superiorstructures:textures/screens/power_bar_middle.png"), this.leftPos + 48, this.topPos + 36, 0, 0, 10, 5, 10, 5);
		}
		if (Charge3Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("superiorstructures:textures/screens/power_bar_middle.png"), this.leftPos + 58, this.topPos + 36, 0, 0, 10, 5, 10, 5);
		}
		if (Charge4Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("superiorstructures:textures/screens/power_bar_middle.png"), this.leftPos + 68, this.topPos + 36, 0, 0, 10, 5, 10, 5);
		}
		if (Charge5Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("superiorstructures:textures/screens/power_bar_middle.png"), this.leftPos + 78, this.topPos + 36, 0, 0, 10, 5, 10, 5);
		}
		if (Charge6Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("superiorstructures:textures/screens/power_bar_middle.png"), this.leftPos + 88, this.topPos + 36, 0, 0, 10, 5, 10, 5);
		}
		if (Charge7Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("superiorstructures:textures/screens/power_bar_middle.png"), this.leftPos + 98, this.topPos + 36, 0, 0, 10, 5, 10, 5);
		}
		if (Charge8Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("superiorstructures:textures/screens/power_bar_middle.png"), this.leftPos + 108, this.topPos + 36, 0, 0, 10, 5, 10, 5);
		}
		if (Charge9Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("superiorstructures:textures/screens/power_bar_middle.png"), this.leftPos + 118, this.topPos + 36, 0, 0, 10, 5, 10, 5);
		}
		if (Charge10Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("superiorstructures:textures/screens/power_bar_end.png"), this.leftPos + 128, this.topPos + 36, 0, 0, 10, 5, 10, 5);
		}
		if (Bolt0DisplayProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("superiorstructures:textures/screens/charge_bar_0.png"), this.leftPos + 9, this.topPos + 18, 0, 0, 102, 11, 102, 11);
		}
		if (Bolt1DisplayProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("superiorstructures:textures/screens/charge_bar_1.png"), this.leftPos + 9, this.topPos + 18, 0, 0, 82, 11, 82, 11);
		}
		if (Bolt2DisplayProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("superiorstructures:textures/screens/charge_bar_2.png"), this.leftPos + 9, this.topPos + 18, 0, 0, 82, 11, 82, 11);
		}
		if (Bolt3DisplayProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("superiorstructures:textures/screens/charge_bar_3.png"), this.leftPos + 9, this.topPos + 18, 0, 0, 82, 11, 82, 11);
		}
		if (Bolt4DisplayProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("superiorstructures:textures/screens/charge_bar_4.png"), this.leftPos + 9, this.topPos + 18, 0, 0, 82, 11, 82, 11);
		}
		if (Bolt5DisplayProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("superiorstructures:textures/screens/charge_bar_5.png"), this.leftPos + 9, this.topPos + 18, 0, 0, 82, 11, 82, 11);
		}
		if (Bolt6DisplayProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("superiorstructures:textures/screens/charge_bar_6.png"), this.leftPos + 9, this.topPos + 18, 0, 0, 82, 11, 82, 11);
		}
		if (Bolt7DisplayProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("superiorstructures:textures/screens/charge_bar_7.png"), this.leftPos + 9, this.topPos + 18, 0, 0, 82, 11, 82, 11);
		}
		if (Bolt8DisplayProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("superiorstructures:textures/screens/charge_bar_8.png"), this.leftPos + 9, this.topPos + 18, 0, 0, 82, 11, 82, 11);
		}
		if (Bolt9DisplayProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("superiorstructures:textures/screens/charge_bar_9.png"), this.leftPos + 9, this.topPos + 18, 0, 0, 82, 11, 82, 11);
		}
		if (Bolt10DisplayProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("superiorstructures:textures/screens/charge_bar_10.png"), this.leftPos + 9, this.topPos + 18, 0, 0, 82, 11, 82, 11);
		}
		if (Bolt11DisplayProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("superiorstructures:textures/screens/charge_bar_11.png"), this.leftPos + 9, this.topPos + 18, 0, 0, 82, 11, 82, 11);
		}
		if (Bolt12DisplayProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("superiorstructures:textures/screens/charge_bar_12.png"), this.leftPos + 9, this.topPos + 18, 0, 0, 82, 11, 82, 11);
		}
		if (Bolt13DisplayProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("superiorstructures:textures/screens/charge_bar_13.png"), this.leftPos + 9, this.topPos + 18, 0, 0, 82, 11, 82, 11);
		}
		if (Bolt14DisplayProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("superiorstructures:textures/screens/charge_bar_14.png"), this.leftPos + 9, this.topPos + 18, 0, 0, 82, 11, 82, 11);
		}
		if (Bolt15DisplayProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("superiorstructures:textures/screens/charge_bar_15.png"), this.leftPos + 9, this.topPos + 18, 0, 0, 82, 11, 82, 11);
		}
		if (Bolt16DisplayProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("superiorstructures:textures/screens/charge_bar_16.png"), this.leftPos + 9, this.topPos + 18, 0, 0, 82, 11, 82, 11);
		}
		if (CellEmptyDisplayProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("superiorstructures:textures/screens/charge_cell_empty.png"), this.leftPos + -126, this.topPos + -37, 0, 0, -1, -1, -1, -1);
		}
		if (CellEmptyDisplayProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("superiorstructures:textures/screens/bolt_right-1.png.png"), this.leftPos + 93, this.topPos + 19, 0, 0, 18, 10, 18, 10);
		}
		if (Bolt12DisplayProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("superiorstructures:textures/screens/bolt_right-2.png.png"), this.leftPos + 93, this.topPos + 19, 0, 0, 18, 10, 18, 10);
		}
		if (Bolt13DisplayProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("superiorstructures:textures/screens/bolt_right-3.png.png"), this.leftPos + 93, this.topPos + 19, 0, 0, 18, 10, 18, 10);
		}
		if (Bolt14DisplayProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("superiorstructures:textures/screens/bolt_right-4.png.png"), this.leftPos + 93, this.topPos + 19, 0, 0, 18, 10, 18, 10);
		}
		if (Bolt15DisplayProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("superiorstructures:textures/screens/bolt_right-5.png.png"), this.leftPos + 93, this.topPos + 19, 0, 0, 18, 10, 18, 10);
		}
		if (Bolt16DisplayProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("superiorstructures:textures/screens/bolt_right-6.png.png"), this.leftPos + 93, this.topPos + 19, 0, 0, 18, 10, 18, 10);
		}
		if (CoreSlot1ChargingProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("superiorstructures:textures/screens/charge_slot_charging.png"), this.leftPos + 53, this.topPos + 65, 0, 0, 14, 6, 14, 6);
		}
		if (CoreSlot2ChargingProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("superiorstructures:textures/screens/charge_slot_charging.png"), this.leftPos + 81, this.topPos + 65, 0, 0, 14, 6, 14, 6);
		}
		if (CoreSlot3ChargingProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("superiorstructures:textures/screens/charge_slot_charging.png"), this.leftPos + 109, this.topPos + 65, 0, 0, 14, 6, 14, 6);
		}
		if (CoreSlot1ChargedProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("superiorstructures:textures/screens/charge_slot_complete.png"), this.leftPos + 53, this.topPos + 65, 0, 0, 14, 6, 14, 6);
		}
		if (CoreSlot2ChargedProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("superiorstructures:textures/screens/charge_slot_complete.png"), this.leftPos + 81, this.topPos + 65, 0, 0, 14, 6, 14, 6);
		}
		if (CoreSlot3ChargedProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("superiorstructures:textures/screens/charge_slot_complete.png"), this.leftPos + 109, this.topPos + 65, 0, 0, 14, 6, 14, 6);
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
		guiGraphics.drawString(this.font, Component.translatable("gui.superiorstructures.power_core_inventory.label_recharge_artificery"), 41, 4, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_exp_insert_1 = new ImageButton(this.leftPos + 114, this.topPos + 16, 17, 15,
				new WidgetSprites(ResourceLocation.parse("superiorstructures:textures/screens/exp_insert_1.png"), ResourceLocation.parse("superiorstructures:textures/screens/exp_insert_1.png")), e -> {
					if (CoreButton1DisplayProcedure.execute(entity)) {
						PacketDistributor.sendToServer(new PowerCoreInventoryButtonMessage(0, x, y, z));
						PowerCoreInventoryButtonMessage.handleButtonAction(entity, 0, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (CoreButton1DisplayProcedure.execute(entity))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		guistate.put("button:imagebutton_exp_insert_1", imagebutton_exp_insert_1);
		this.addRenderableWidget(imagebutton_exp_insert_1);
		imagebutton_exp_insert_5 = new ImageButton(this.leftPos + 134, this.topPos + 16, 17, 15,
				new WidgetSprites(ResourceLocation.parse("superiorstructures:textures/screens/exp_insert_5.png"), ResourceLocation.parse("superiorstructures:textures/screens/exp_insert_5.png")), e -> {
					if (CoreButton2DisplayProcedure.execute(entity)) {
						PacketDistributor.sendToServer(new PowerCoreInventoryButtonMessage(1, x, y, z));
						PowerCoreInventoryButtonMessage.handleButtonAction(entity, 1, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (CoreButton2DisplayProcedure.execute(entity))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		guistate.put("button:imagebutton_exp_insert_5", imagebutton_exp_insert_5);
		this.addRenderableWidget(imagebutton_exp_insert_5);
		imagebutton_exp_insert_x = new ImageButton(this.leftPos + 154, this.topPos + 16, 17, 15,
				new WidgetSprites(ResourceLocation.parse("superiorstructures:textures/screens/exp_insert_x.png"), ResourceLocation.parse("superiorstructures:textures/screens/exp_insert_x.png")), e -> {
					if (CoreButton3DisplayProcedure.execute(world, x, y, z, entity)) {
						PacketDistributor.sendToServer(new PowerCoreInventoryButtonMessage(2, x, y, z));
						PowerCoreInventoryButtonMessage.handleButtonAction(entity, 2, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				if (CoreButton3DisplayProcedure.execute(world, x, y, z, entity))
					guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		guistate.put("button:imagebutton_exp_insert_x", imagebutton_exp_insert_x);
		this.addRenderableWidget(imagebutton_exp_insert_x);
	}
}
