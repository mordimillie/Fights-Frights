package net.mcreator.fightsfrights.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.fightsfrights.entity.WickeWarmongerEntity;

public class WickeWarmongerModel extends GeoModel<WickeWarmongerEntity> {
	@Override
	public ResourceLocation getAnimationResource(WickeWarmongerEntity entity) {
		return new ResourceLocation("fightsfrights", "animations/piglin_prosecutor.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WickeWarmongerEntity entity) {
		return new ResourceLocation("fightsfrights", "geo/piglin_prosecutor.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WickeWarmongerEntity entity) {
		return new ResourceLocation("fightsfrights", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(WickeWarmongerEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
