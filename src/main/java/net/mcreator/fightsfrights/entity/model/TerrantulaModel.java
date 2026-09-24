package net.mcreator.fightsfrights.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fightsfrights.entity.TerrantulaEntity;

public class TerrantulaModel extends GeoModel<TerrantulaEntity> {
	@Override
	public ResourceLocation getAnimationResource(TerrantulaEntity entity) {
		return new ResourceLocation("fightsfrights", "animations/terrantula.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TerrantulaEntity entity) {
		return new ResourceLocation("fightsfrights", "geo/terrantula.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TerrantulaEntity entity) {
		return new ResourceLocation("fightsfrights", "textures/entities/" + entity.getTexture() + ".png");
	}

}
