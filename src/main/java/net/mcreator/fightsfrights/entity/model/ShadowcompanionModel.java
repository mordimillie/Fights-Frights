package net.mcreator.fightsfrights.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fightsfrights.entity.ShadowcompanionEntity;

public class ShadowcompanionModel extends GeoModel<ShadowcompanionEntity> {
	@Override
	public ResourceLocation getAnimationResource(ShadowcompanionEntity entity) {
		return ResourceLocation.parse("fightsfrights:animations/shadow.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ShadowcompanionEntity entity) {
		return ResourceLocation.parse("fightsfrights:geo/shadow.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ShadowcompanionEntity entity) {
		return ResourceLocation.parse("fightsfrights:textures/entities/" + entity.getTexture() + ".png");
	}

}
