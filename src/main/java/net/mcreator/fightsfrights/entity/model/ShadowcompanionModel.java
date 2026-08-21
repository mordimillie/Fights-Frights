package net.mcreator.fightsfrights.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fightsfrights.entity.ShadowcompanionEntity;

public class ShadowcompanionModel extends GeoModel<ShadowcompanionEntity> {
	@Override
	public ResourceLocation getAnimationResource(ShadowcompanionEntity entity) {
		return new ResourceLocation("fightsfrights", "animations/shadow.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ShadowcompanionEntity entity) {
		return new ResourceLocation("fightsfrights", "geo/shadow.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ShadowcompanionEntity entity) {
		return new ResourceLocation("fightsfrights", "textures/entities/" + entity.getTexture() + ".png");
	}

}
