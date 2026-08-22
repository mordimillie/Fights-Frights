package net.mcreator.duelsdread.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.duelsdread.item.GazingHoodItem;

public class GazingHoodModel extends GeoModel<GazingHoodItem> {
	@Override
	public ResourceLocation getAnimationResource(GazingHoodItem object) {
		return new ResourceLocation("duelsdread", "animations/gazinghood.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GazingHoodItem object) {
		return new ResourceLocation("duelsdread", "geo/gazinghood.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GazingHoodItem object) {
		return new ResourceLocation("duelsdread", "textures/item/gazinghood.png");
	}
}
