package net.mcreator.fightsfrights.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fightsfrights.entity.ImperialIllagerP2Entity;

public class ImperialIllagerP2Model extends GeoModel<ImperialIllagerP2Entity> {
	@Override
	public ResourceLocation getAnimationResource(ImperialIllagerP2Entity entity) {
		return ResourceLocation.parse("fightsfrights:animations/imperial_illagerphase2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ImperialIllagerP2Entity entity) {
		return ResourceLocation.parse("fightsfrights:geo/imperial_illagerphase2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ImperialIllagerP2Entity entity) {
		return ResourceLocation.parse("fightsfrights:textures/entities/" + entity.getTexture() + ".png");
	}

}
