package net.mcreator.fightsfrights.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fightsfrights.entity.MimicBanshaaEntity;

public class MimicBanshaaModel extends GeoModel<MimicBanshaaEntity> {
	@Override
	public ResourceLocation getAnimationResource(MimicBanshaaEntity entity) {
		return ResourceLocation.parse("fightsfrights:animations/banshaa.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MimicBanshaaEntity entity) {
		return ResourceLocation.parse("fightsfrights:geo/banshaa.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MimicBanshaaEntity entity) {
		return ResourceLocation.parse("fightsfrights:textures/entities/" + entity.getTexture() + ".png");
	}

}
