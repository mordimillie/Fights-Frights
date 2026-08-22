package net.mcreator.duelsdread.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.duelsdread.entity.SavagerEntity;

public class SavagerModel extends GeoModel<SavagerEntity> {
	@Override
	public ResourceLocation getAnimationResource(SavagerEntity entity) {
		return new ResourceLocation("duelsdread", "animations/undeadhound.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SavagerEntity entity) {
		return new ResourceLocation("duelsdread", "geo/undeadhound.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SavagerEntity entity) {
		return new ResourceLocation("duelsdread", "textures/entities/" + entity.getTexture() + ".png");
	}

}
