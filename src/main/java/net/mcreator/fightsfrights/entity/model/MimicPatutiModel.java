package net.mcreator.fightsfrights.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fightsfrights.entity.MimicPatutiEntity;

public class MimicPatutiModel extends GeoModel<MimicPatutiEntity> {
	@Override
	public ResourceLocation getAnimationResource(MimicPatutiEntity entity) {
		return new ResourceLocation("fightsfrights", "animations/patuti.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MimicPatutiEntity entity) {
		return new ResourceLocation("fightsfrights", "geo/patuti.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MimicPatutiEntity entity) {
		return new ResourceLocation("fightsfrights", "textures/entities/" + entity.getTexture() + ".png");
	}

}
