package net.mcreator.fightsfrights.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fightsfrights.entity.MimicScowlEntity;

public class MimicScowlModel extends GeoModel<MimicScowlEntity> {
	@Override
	public ResourceLocation getAnimationResource(MimicScowlEntity entity) {
		return new ResourceLocation("fightsfrights", "animations/scowl.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MimicScowlEntity entity) {
		return new ResourceLocation("fightsfrights", "geo/scowl.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MimicScowlEntity entity) {
		return new ResourceLocation("fightsfrights", "textures/entities/" + entity.getTexture() + ".png");
	}

}
