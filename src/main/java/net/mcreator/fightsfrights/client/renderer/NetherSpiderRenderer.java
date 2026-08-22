
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

import net.mcreator.fightsfrights.entity.NetherSpiderEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class NetherSpiderRenderer extends MobRenderer<NetherSpiderEntity, SpiderModel<NetherSpiderEntity>> {
	public NetherSpiderRenderer(EntityRendererProvider.Context context) {
		super(context, new SpiderModel<NetherSpiderEntity>(context.bakeLayer(ModelLayers.SPIDER)), 0.8f);
		this.addLayer(new RenderLayer<NetherSpiderEntity, SpiderModel<NetherSpiderEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("fightsfrights:textures/entities/nether_spider_eyes.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, NetherSpiderEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
	}

	@Override
	protected void scale(NetherSpiderEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(1.25f, 1.25f, 1.25f);
	}

	@Override
	public ResourceLocation getTextureLocation(NetherSpiderEntity entity) {
		return ResourceLocation.parse("fightsfrights:textures/entities/nether_spider.png");
	}
}
