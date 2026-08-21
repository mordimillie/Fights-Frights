package net.mcreator.fightsfrights.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.fightsfrights.entity.CallousCommander1Entity;

public class CallousCommander1Model extends GeoModel<CallousCommander1Entity> {
	@Override
	public ResourceLocation getAnimationResource(CallousCommander1Entity entity) {
		return new ResourceLocation("fightsfrights", "animations/ghastly_general.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CallousCommander1Entity entity) {
		return new ResourceLocation("fightsfrights", "geo/ghastly_general.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CallousCommander1Entity entity) {
		return new ResourceLocation("fightsfrights", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(CallousCommander1Entity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("Head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
