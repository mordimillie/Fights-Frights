
package net.mcreator.fightsfrights.client.renderer;

import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.cache.object.BakedGeoModel;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fightsfrights.entity.model.EffigyModel;
import net.mcreator.fightsfrights.entity.layer.EffigyLayer;
import net.mcreator.fightsfrights.entity.EffigyEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class EffigyRenderer extends GeoEntityRenderer<EffigyEntity> {
	public EffigyRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new EffigyModel());
		this.shadowRadius = 0.2f;
		this.addRenderLayer(new EffigyLayer(this));
	}

	@Override
	public RenderType getRenderType(EffigyEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, EffigyEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, int color) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, color);
	}

	@Override
	protected float getDeathMaxRotation(EffigyEntity entityLivingBaseIn) {
		return 0.0F;
	}
}
