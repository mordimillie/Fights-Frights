package net.mcreator.fightsfrights.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.animation.AnimationState;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.fightsfrights.entity.MimentisEntity;

public class MimentisModel extends GeoModel<MimentisEntity> {
	@Override
	public ResourceLocation getAnimationResource(MimentisEntity entity) {
		return ResourceLocation.parse("fightsfrights:animations/mimentis.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MimentisEntity entity) {
		return ResourceLocation.parse("fightsfrights:geo/mimentis.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MimentisEntity entity) {
		return ResourceLocation.parse("fightsfrights:textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(MimentisEntity animatable, long instanceId, AnimationState animationState) {
		GeoBone head = getAnimationProcessor().getBone("Head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
