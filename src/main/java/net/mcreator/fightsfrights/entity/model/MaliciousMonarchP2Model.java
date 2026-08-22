package net.mcreator.fightsfrights.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fightsfrights.entity.MaliciousMonarchP2Entity;

public class MaliciousMonarchP2Model extends GeoModel<MaliciousMonarchP2Entity> {
	@Override
	public ResourceLocation getAnimationResource(MaliciousMonarchP2Entity entity) {
		return ResourceLocation.parse("fightsfrights:animations/imperial_illagerphase2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MaliciousMonarchP2Entity entity) {
		return ResourceLocation.parse("fightsfrights:geo/imperial_illagerphase2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MaliciousMonarchP2Entity entity) {
		return ResourceLocation.parse("fightsfrights:textures/entities/" + entity.getTexture() + ".png");
	}

}
