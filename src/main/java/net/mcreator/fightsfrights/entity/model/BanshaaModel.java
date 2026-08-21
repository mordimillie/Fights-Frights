package net.mcreator.fightsfrights.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fightsfrights.entity.BanshaaEntity;

public class BanshaaModel extends GeoModel<BanshaaEntity> {
	@Override
	public ResourceLocation getAnimationResource(BanshaaEntity entity) {
		return new ResourceLocation("fightsfrights", "animations/banshaa.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BanshaaEntity entity) {
		return new ResourceLocation("fightsfrights", "geo/banshaa.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BanshaaEntity entity) {
		return new ResourceLocation("fightsfrights", "textures/entities/" + entity.getTexture() + ".png");
	}

}
