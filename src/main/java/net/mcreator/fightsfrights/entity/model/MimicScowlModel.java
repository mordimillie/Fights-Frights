package net.mcreator.fightsfrights.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fightsfrights.entity.MimicScowlEntity;

public class MimicScowlModel extends GeoModel<MimicScowlEntity> {
	@Override
	public ResourceLocation getAnimationResource(MimicScowlEntity entity) {
		return ResourceLocation.parse("fightsfrights:animations/scowl.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MimicScowlEntity entity) {
		return ResourceLocation.parse("fightsfrights:geo/scowl.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MimicScowlEntity entity) {
		return ResourceLocation.parse("fightsfrights:textures/entities/" + entity.getTexture() + ".png");
	}

}
