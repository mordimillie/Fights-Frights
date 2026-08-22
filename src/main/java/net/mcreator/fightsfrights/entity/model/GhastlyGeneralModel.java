package net.mcreator.fightsfrights.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.animation.AnimationState;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.fightsfrights.entity.GhastlyGeneralEntity;

public class GhastlyGeneralModel extends GeoModel<GhastlyGeneralEntity> {
	@Override
	public ResourceLocation getAnimationResource(GhastlyGeneralEntity entity) {
		return ResourceLocation.parse("fightsfrights:animations/ghastly_general.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GhastlyGeneralEntity entity) {
		return ResourceLocation.parse("fightsfrights:geo/ghastly_general.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GhastlyGeneralEntity entity) {
		return ResourceLocation.parse("fightsfrights:textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(GhastlyGeneralEntity animatable, long instanceId, AnimationState animationState) {
		GeoBone head = getAnimationProcessor().getBone("Head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
