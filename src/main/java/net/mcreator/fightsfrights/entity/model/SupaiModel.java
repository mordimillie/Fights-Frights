package net.mcreator.fightsfrights.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fightsfrights.entity.SupaiEntity;

public class SupaiModel extends GeoModel<SupaiEntity> {
	@Override
	public ResourceLocation getAnimationResource(SupaiEntity entity) {
		return ResourceLocation.parse("fightsfrights:animations/supai.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SupaiEntity entity) {
		return ResourceLocation.parse("fightsfrights:geo/supai.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SupaiEntity entity) {
		return ResourceLocation.parse("fightsfrights:textures/entities/" + entity.getTexture() + ".png");
	}

}
