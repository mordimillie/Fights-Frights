
package net.mcreator.fightsfrights.client.renderer;

import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.cache.object.BakedGeoModel;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fightsfrights.entity.model.GhastlyGeneralModel;
import net.mcreator.fightsfrights.entity.layer.GhastlyGeneralLayer;
import net.mcreator.fightsfrights.entity.GhastlyGeneralEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class GhastlyGeneralRenderer extends GeoEntityRenderer<GhastlyGeneralEntity> {
	public GhastlyGeneralRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new GhastlyGeneralModel());
		this.shadowRadius = 0.5f;
		this.addRenderLayer(new GhastlyGeneralLayer(this));
	}

	@Override
	public RenderType getRenderType(GhastlyGeneralEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, GhastlyGeneralEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	protected float getDeathMaxRotation(GhastlyGeneralEntity entityLivingBaseIn) {
		return 0.0F;
	}
}
