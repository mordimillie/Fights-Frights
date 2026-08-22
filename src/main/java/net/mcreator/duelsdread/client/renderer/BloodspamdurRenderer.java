
package net.mcreator.duelsdread.client.renderer;

import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.cache.object.BakedGeoModel;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.duelsdread.entity.model.BloodspamdurModel;
import net.mcreator.duelsdread.entity.layer.BloodspamdurLayer;
import net.mcreator.duelsdread.entity.BloodspamdurEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class BloodspamdurRenderer extends GeoEntityRenderer<BloodspamdurEntity> {
	public BloodspamdurRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new BloodspamdurModel());
		this.shadowRadius = 0f;
		this.addRenderLayer(new BloodspamdurLayer(this));
	}

	@Override
	public RenderType getRenderType(BloodspamdurEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, BloodspamdurEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	protected float getDeathMaxRotation(BloodspamdurEntity entityLivingBaseIn) {
		return 0.0F;
	}
}
