
package net.mcreator.fightsfrights.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SpiderModel;

import net.mcreator.fightsfrights.entity.NethercavespiderEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class NethercavespiderRenderer extends MobRenderer<NethercavespiderEntity, SpiderModel<NethercavespiderEntity>> {
	public NethercavespiderRenderer(EntityRendererProvider.Context context) {
		super(context, new SpiderModel<NethercavespiderEntity>(context.bakeLayer(ModelLayers.SPIDER)), 0.3f);
		this.addLayer(new RenderLayer<NethercavespiderEntity, SpiderModel<NethercavespiderEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("fightsfrights:textures/entities/nether_cave_spider_eyes.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, NethercavespiderEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
	}

	@Override
	protected void scale(NethercavespiderEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(0.5f, 0.5f, 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(NethercavespiderEntity entity) {
		return ResourceLocation.parse("fightsfrights:textures/entities/nether_cave_spider.png");
	}

	@Override
	protected boolean isShaking(NethercavespiderEntity entity) {
		return true;
	}
}
