package net.mcreator.fightsfrights.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fightsfrights.entity.MimicAllmanEntity;

public class MimicAllmanModel extends GeoModel<MimicAllmanEntity> {
	@Override
	public ResourceLocation getAnimationResource(MimicAllmanEntity entity) {
		return new ResourceLocation("fightsfrights", "animations/allman.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MimicAllmanEntity entity) {
		return new ResourceLocation("fightsfrights", "geo/allman.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MimicAllmanEntity entity) {
		return new ResourceLocation("fightsfrights", "textures/entities/" + entity.getTexture() + ".png");
	}

}
