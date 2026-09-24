
package net.mcreator.fightsfrights.client.renderer;

import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.cache.object.BakedGeoModel;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fightsfrights.entity.model.PioneerHeadModel;
import net.mcreator.fightsfrights.entity.layer.PioneerHeadLayer;
import net.mcreator.fightsfrights.entity.PioneerHeadEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class PioneerHeadRenderer extends GeoEntityRenderer<PioneerHeadEntity> {
	public PioneerHeadRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new PioneerHeadModel());
		this.shadowRadius = 0.3f;
		this.addRenderLayer(new PioneerHeadLayer(this));
	}

	@Override
	public RenderType getRenderType(PioneerHeadEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, PioneerHeadEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	protected float getDeathMaxRotation(PioneerHeadEntity entityLivingBaseIn) {
		return 0.0F;
	}
}
