package net.mcreator.fightsfrights.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fightsfrights.entity.GrimmsquitoEntity;

public class GrimmsquitoModel extends GeoModel<GrimmsquitoEntity> {
	@Override
	public ResourceLocation getAnimationResource(GrimmsquitoEntity entity) {
		return ResourceLocation.parse("fightsfrights:animations/grimmsquito.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GrimmsquitoEntity entity) {
		return ResourceLocation.parse("fightsfrights:geo/grimmsquito.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GrimmsquitoEntity entity) {
		return ResourceLocation.parse("fightsfrights:textures/entities/" + entity.getTexture() + ".png");
	}

}
