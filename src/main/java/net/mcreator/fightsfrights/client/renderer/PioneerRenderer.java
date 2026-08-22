
package net.mcreator.fightsfrights.client.renderer;

import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.cache.object.BakedGeoModel;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fightsfrights.entity.model.PioneerModel;
import net.mcreator.fightsfrights.entity.layer.PioneerLayer;
import net.mcreator.fightsfrights.entity.PioneerEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class PioneerRenderer extends GeoEntityRenderer<PioneerEntity> {
	public PioneerRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new PioneerModel());
		this.shadowRadius = 0.4f;
		this.addRenderLayer(new PioneerLayer(this));
	}

	@Override
	public RenderType getRenderType(PioneerEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, PioneerEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, int color) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, color);
	}

	@Override
	protected float getDeathMaxRotation(PioneerEntity entityLivingBaseIn) {
		return 0.0F;
	}
}
