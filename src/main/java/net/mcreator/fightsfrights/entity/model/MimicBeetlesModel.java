package net.mcreator.fightsfrights.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fightsfrights.entity.MimicBeetlesEntity;

public class MimicBeetlesModel extends GeoModel<MimicBeetlesEntity> {
	@Override
	public ResourceLocation getAnimationResource(MimicBeetlesEntity entity) {
		return ResourceLocation.parse("fightsfrights:animations/mimiciron.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MimicBeetlesEntity entity) {
		return ResourceLocation.parse("fightsfrights:geo/mimiciron.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MimicBeetlesEntity entity) {
		return ResourceLocation.parse("fightsfrights:textures/entities/" + entity.getTexture() + ".png");
	}

}
