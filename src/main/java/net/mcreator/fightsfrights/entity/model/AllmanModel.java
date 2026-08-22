package net.mcreator.fightsfrights.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fightsfrights.entity.AllmanEntity;

public class AllmanModel extends GeoModel<AllmanEntity> {
	@Override
	public ResourceLocation getAnimationResource(AllmanEntity entity) {
		return ResourceLocation.parse("fightsfrights:animations/allman.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AllmanEntity entity) {
		return ResourceLocation.parse("fightsfrights:geo/allman.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AllmanEntity entity) {
		return ResourceLocation.parse("fightsfrights:textures/entities/" + entity.getTexture() + ".png");
	}

}
