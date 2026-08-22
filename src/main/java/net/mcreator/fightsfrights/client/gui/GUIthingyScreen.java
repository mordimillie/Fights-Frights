package net.mcreator.fightsfrights.client.gui;

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

import net.mcreator.fightsfrights.world.inventory.GUIthingyMenu;
import net.mcreator.fightsfrights.network.GUIthingyButtonMessage;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class GUIthingyScreen extends AbstractContainerScreen<GUIthingyMenu> {
	private final static HashMap<String, Object> guistate = GUIthingyMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_experience_orb_value_17361_1;
	ImageButton imagebutton_zombeloton;

	public GUIthingyScreen(GUIthingyMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("fightsfrights:textures/screens/crusher_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics, mouseX, mouseY, partialTicks);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(ResourceLocation.parse("fightsfrights:textures/screens/rotenfleshicongui.png"), this.leftPos + 79, this.topPos + 38, 0, 0, 16, 16, 16, 16);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.fightsfrights.crusher_gui.label_crush_remains"), 6, 7, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_experience_orb_value_17361_1 = new ImageButton(this.leftPos + 114, this.topPos + 22, 48, 48,
				new WidgetSprites(ResourceLocation.parse("fightsfrights:textures/screens/experience_orb_value_17-36-1_1.png"), ResourceLocation.parse("fightsfrights:textures/screens/experience_orb_value_17-36-1_1_-_copy.png")), e -> {
					if (true) {
						PacketDistributor.sendToServer(new GUIthingyButtonMessage(0, x, y, z));
						GUIthingyButtonMessage.handleButtonAction(entity, 0, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		guistate.put("button:imagebutton_experience_orb_value_17361_1", imagebutton_experience_orb_value_17361_1);
		this.addRenderableWidget(imagebutton_experience_orb_value_17361_1);
		imagebutton_zombeloton = new ImageButton(this.leftPos + 24, this.topPos + 31, 32, 32,
				new WidgetSprites(ResourceLocation.parse("fightsfrights:textures/screens/zombeloton.png"), ResourceLocation.parse("fightsfrights:textures/screens/crepider.png")), e -> {
					if (true) {
						PacketDistributor.sendToServer(new GUIthingyButtonMessage(1, x, y, z));
						GUIthingyButtonMessage.handleButtonAction(entity, 1, x, y, z);
					}
				}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int x, int y, float partialTicks) {
				guiGraphics.blit(sprites.get(isActive(), isHoveredOrFocused()), getX(), getY(), 0, 0, width, height, width, height);
			}
		};
		guistate.put("button:imagebutton_zombeloton", imagebutton_zombeloton);
		this.addRenderableWidget(imagebutton_zombeloton);
	}
}
