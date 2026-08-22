package net.mcreator.fightsfrights.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fightsfrights.entity.ShadowcompanioncompanionEntity;

public class ShadowcompanioncompanionModel extends GeoModel<ShadowcompanioncompanionEntity> {
	@Override
	public ResourceLocation getAnimationResource(ShadowcompanioncompanionEntity entity) {
		return ResourceLocation.parse("fightsfrights:animations/shadow.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ShadowcompanioncompanionEntity entity) {
		return ResourceLocation.parse("fightsfrights:geo/shadow.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ShadowcompanioncompanionEntity entity) {
		return ResourceLocation.parse("fightsfrights:textures/entities/" + entity.getTexture() + ".png");
	}

}
