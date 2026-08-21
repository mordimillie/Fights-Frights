package net.mcreator.fightsfrights.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fightsfrights.entity.MimicGrimmsquitoEntity;

public class MimicGrimmsquitoModel extends GeoModel<MimicGrimmsquitoEntity> {
	@Override
	public ResourceLocation getAnimationResource(MimicGrimmsquitoEntity entity) {
		return new ResourceLocation("fightsfrights", "animations/grimmsquito.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MimicGrimmsquitoEntity entity) {
		return new ResourceLocation("fightsfrights", "geo/grimmsquito.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MimicGrimmsquitoEntity entity) {
		return new ResourceLocation("fightsfrights", "textures/entities/" + entity.getTexture() + ".png");
	}

}
