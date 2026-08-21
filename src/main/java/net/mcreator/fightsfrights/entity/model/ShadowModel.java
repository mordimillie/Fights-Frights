package net.mcreator.fightsfrights.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fightsfrights.entity.ShadowEntity;

public class ShadowModel extends GeoModel<ShadowEntity> {
	@Override
	public ResourceLocation getAnimationResource(ShadowEntity entity) {
		return new ResourceLocation("fightsfrights", "animations/shadow.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ShadowEntity entity) {
		return new ResourceLocation("fightsfrights", "geo/shadow.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ShadowEntity entity) {
		return new ResourceLocation("fightsfrights", "textures/entities/" + entity.getTexture() + ".png");
	}

}
