package net.mcreator.fightsfrights.client.renderer;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fightsfrights.entity.BluntjavelinproyectileEntity;
import net.mcreator.fightsfrights.client.model.Modelblunt_javelin;

import com.mojang.math.Axis;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class BluntjavelinproyectileRenderer extends EntityRenderer<BluntjavelinproyectileEntity> {
	private static final ResourceLocation texture = ResourceLocation.parse("fightsfrights:textures/entities/blunt_javelin_proyectile.png");
	private final Modelblunt_javelin model;

	public BluntjavelinproyectileRenderer(EntityRendererProvider.Context context) {
		super(context);
		model = new Modelblunt_javelin(context.bakeLayer(Modelblunt_javelin.LAYER_LOCATION));
	}

	@Override
	public void render(BluntjavelinproyectileEntity entityIn, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource bufferIn, int packedLightIn) {
		VertexConsumer vb = bufferIn.getBuffer(RenderType.entityCutout(this.getTextureLocation(entityIn)));
		poseStack.pushPose();
		poseStack.mulPose(Axis.YP.rotationDegrees(Mth.lerp(partialTicks, entityIn.yRotO, entityIn.getYRot()) - 90));
		poseStack.mulPose(Axis.ZP.rotationDegrees(90 + Mth.lerp(partialTicks, entityIn.xRotO, entityIn.getXRot())));
		model.renderToBuffer(poseStack, vb, packedLightIn, OverlayTexture.NO_OVERLAY);
		poseStack.popPose();
		super.render(entityIn, entityYaw, partialTicks, poseStack, bufferIn, packedLightIn);
	}

	@Override
	public ResourceLocation getTextureLocation(BluntjavelinproyectileEntity entity) {
		return texture;
	}
}
