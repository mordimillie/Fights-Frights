package net.mcreator.fightsfrights.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fightsfrights.item.ScreenHeadItem;

public class ScreenHeadModel extends GeoModel<ScreenHeadItem> {
	@Override
	public ResourceLocation getAnimationResource(ScreenHeadItem object) {
		return new ResourceLocation("fightsfrights", "animations/screenhead.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ScreenHeadItem object) {
		return new ResourceLocation("fightsfrights", "geo/screenhead.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ScreenHeadItem object) {
		return new ResourceLocation("fightsfrights", "textures/item/screenhead.png");
	}
}
