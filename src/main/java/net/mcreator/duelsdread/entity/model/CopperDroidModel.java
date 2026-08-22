package net.mcreator.duelsdread.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.duelsdread.entity.CopperDroidEntity;

public class CopperDroidModel extends GeoModel<CopperDroidEntity> {
	@Override
	public ResourceLocation getAnimationResource(CopperDroidEntity entity) {
		return new ResourceLocation("duelsdread", "animations/copperdroid.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CopperDroidEntity entity) {
		return new ResourceLocation("duelsdread", "geo/copperdroid.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CopperDroidEntity entity) {
		return new ResourceLocation("duelsdread", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(CopperDroidEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("Head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
