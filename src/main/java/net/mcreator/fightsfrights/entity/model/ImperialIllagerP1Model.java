package net.mcreator.fightsfrights.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fightsfrights.entity.ImperialIllagerP1Entity;

public class ImperialIllagerP1Model extends GeoModel<ImperialIllagerP1Entity> {
	@Override
	public ResourceLocation getAnimationResource(ImperialIllagerP1Entity entity) {
		return ResourceLocation.parse("fightsfrights:animations/imperial_illagerphase1.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ImperialIllagerP1Entity entity) {
		return ResourceLocation.parse("fightsfrights:geo/imperial_illagerphase1.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ImperialIllagerP1Entity entity) {
		return ResourceLocation.parse("fightsfrights:textures/entities/" + entity.getTexture() + ".png");
	}

}
