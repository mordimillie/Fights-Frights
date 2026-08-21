package net.mcreator.fightsfrights.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fightsfrights.entity.NetherBanshaaEntity;

public class NetherBanshaaModel extends GeoModel<NetherBanshaaEntity> {
	@Override
	public ResourceLocation getAnimationResource(NetherBanshaaEntity entity) {
		return new ResourceLocation("fightsfrights", "animations/banshaa.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NetherBanshaaEntity entity) {
		return new ResourceLocation("fightsfrights", "geo/banshaa.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NetherBanshaaEntity entity) {
		return new ResourceLocation("fightsfrights", "textures/entities/" + entity.getTexture() + ".png");
	}

}
