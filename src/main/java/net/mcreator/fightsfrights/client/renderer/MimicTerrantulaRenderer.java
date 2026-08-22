
package net.mcreator.fightsfrights.client.renderer;

import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.cache.object.BakedGeoModel;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fightsfrights.entity.model.MimicTerrantulaModel;
import net.mcreator.fightsfrights.entity.layer.MimicTerrantulaLayer;
import net.mcreator.fightsfrights.entity.MimicTerrantulaEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class MimicTerrantulaRenderer extends GeoEntityRenderer<MimicTerrantulaEntity> {
	public MimicTerrantulaRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new MimicTerrantulaModel());
		this.shadowRadius = 0f;
		this.addRenderLayer(new MimicTerrantulaLayer(this));
	}

	@Override
	public RenderType getRenderType(MimicTerrantulaEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, MimicTerrantulaEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, int color) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, color);
	}
}
