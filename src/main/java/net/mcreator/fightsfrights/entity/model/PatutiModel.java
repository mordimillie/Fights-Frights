package net.mcreator.fightsfrights.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fightsfrights.entity.PatutiEntity;

public class PatutiModel extends GeoModel<PatutiEntity> {
	@Override
	public ResourceLocation getAnimationResource(PatutiEntity entity) {
		return new ResourceLocation("fightsfrights", "animations/patuti.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PatutiEntity entity) {
		return new ResourceLocation("fightsfrights", "geo/patuti.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PatutiEntity entity) {
		return new ResourceLocation("fightsfrights", "textures/entities/" + entity.getTexture() + ".png");
	}

}
