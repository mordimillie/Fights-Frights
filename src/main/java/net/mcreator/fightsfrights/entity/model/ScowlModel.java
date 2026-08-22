package net.mcreator.fightsfrights.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fightsfrights.entity.ScowlEntity;

public class ScowlModel extends GeoModel<ScowlEntity> {
	@Override
	public ResourceLocation getAnimationResource(ScowlEntity entity) {
		return ResourceLocation.parse("fightsfrights:animations/scowl.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ScowlEntity entity) {
		return ResourceLocation.parse("fightsfrights:geo/scowl.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ScowlEntity entity) {
		return ResourceLocation.parse("fightsfrights:textures/entities/" + entity.getTexture() + ".png");
	}

}
