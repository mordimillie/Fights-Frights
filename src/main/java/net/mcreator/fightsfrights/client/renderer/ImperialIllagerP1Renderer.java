
package net.mcreator.fightsfrights.client.renderer;

import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.cache.object.BakedGeoModel;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fightsfrights.entity.model.ImperialIllagerP1Model;
import net.mcreator.fightsfrights.entity.layer.ImperialIllagerP1Layer;
import net.mcreator.fightsfrights.entity.ImperialIllagerP1Entity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class ImperialIllagerP1Renderer extends GeoEntityRenderer<ImperialIllagerP1Entity> {
	public ImperialIllagerP1Renderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new ImperialIllagerP1Model());
		this.shadowRadius = 0.7f;
		this.addRenderLayer(new ImperialIllagerP1Layer(this));
	}

	@Override
	public RenderType getRenderType(ImperialIllagerP1Entity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, ImperialIllagerP1Entity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, int color) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, color);
	}
}
