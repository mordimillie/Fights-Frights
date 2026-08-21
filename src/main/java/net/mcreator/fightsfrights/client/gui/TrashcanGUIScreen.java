package net.mcreator.fightsfrights.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.fightsfrights.world.inventory.TrashcanGUIMenu;
import net.mcreator.fightsfrights.network.TrashcanGUIButtonMessage;
import net.mcreator.fightsfrights.FightsfrightsMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class TrashcanGUIScreen extends AbstractContainerScreen<TrashcanGUIMenu> {
	private final static HashMap<String, Object> guistate = TrashcanGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_trash;

	public TrashcanGUIScreen(TrashcanGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("fightsfrights:textures/screens/trashcan_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("fightsfrights:textures/screens/trashgui.png"), this.leftPos + 0, this.topPos + -1, 0, 0, 176, 166, 176, 166);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.fightsfrights.trashcan_gui.label_empty"), 66, 7, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_trash = Button.builder(Component.translatable("gui.fightsfrights.trashcan_gui.button_trash"), e -> {
			if (true) {
				FightsfrightsMod.PACKET_HANDLER.sendToServer(new TrashcanGUIButtonMessage(0, x, y, z));
				TrashcanGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 63, this.topPos + 34, 51, 20).build();
		guistate.put("button:button_trash", button_trash);
		this.addRenderableWidget(button_trash);
	}
}
