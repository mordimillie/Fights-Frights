package net.mcreator.fightsfrights.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fightsfrights.entity.MaliciousMonarchP1Entity;

public class MaliciousMonarchP1Model extends GeoModel<MaliciousMonarchP1Entity> {
	@Override
	public ResourceLocation getAnimationResource(MaliciousMonarchP1Entity entity) {
		return new ResourceLocation("fightsfrights", "animations/imperial_illagerphase1.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MaliciousMonarchP1Entity entity) {
		return new ResourceLocation("fightsfrights", "geo/imperial_illagerphase1.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MaliciousMonarchP1Entity entity) {
		return new ResourceLocation("fightsfrights", "textures/entities/" + entity.getTexture() + ".png");
	}

}
