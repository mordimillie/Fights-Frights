package net.mcreator.fightsfrights.client.renderer;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fightsfrights.entity.BlindnessProboscisEntity;
import net.mcreator.fightsfrights.client.model.Modelblunt_javelin;

import com.mojang.math.Axis;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class BlindnessProboscisRenderer extends EntityRenderer<BlindnessProboscisEntity> {
	private static final ResourceLocation texture = new ResourceLocation("fightsfrights:textures/entities/proboscisproyectile.png");
	private final Modelblunt_javelin model;

	public BlindnessProboscisRenderer(EntityRendererProvider.Context context) {
		super(context);
		model = new Modelblunt_javelin(context.bakeLayer(Modelblunt_javelin.LAYER_LOCATION));
	}

	@Override
	public void render(BlindnessProboscisEntity entityIn, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource bufferIn, int packedLightIn) {
		VertexConsumer vb = bufferIn.getBuffer(RenderType.entityCutout(this.getTextureLocation(entityIn)));
		poseStack.pushPose();
		poseStack.mulPose(Axis.YP.rotationDegrees(Mth.lerp(partialTicks, entityIn.yRotO, entityIn.getYRot()) - 90));
		poseStack.mulPose(Axis.ZP.rotationDegrees(90 + Mth.lerp(partialTicks, entityIn.xRotO, entityIn.getXRot())));
		model.renderToBuffer(poseStack, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		poseStack.popPose();
		super.render(entityIn, entityYaw, partialTicks, poseStack, bufferIn, packedLightIn);
	}

	@Override
	public ResourceLocation getTextureLocation(BlindnessProboscisEntity entity) {
		return texture;
	}
}
