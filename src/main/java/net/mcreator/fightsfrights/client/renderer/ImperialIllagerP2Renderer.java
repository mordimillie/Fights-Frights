
package net.mcreator.fightsfrights.client.renderer;

import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.cache.object.BakedGeoModel;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fightsfrights.entity.model.ImperialIllagerP2Model;
import net.mcreator.fightsfrights.entity.layer.ImperialIllagerP2Layer;
import net.mcreator.fightsfrights.entity.ImperialIllagerP2Entity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class ImperialIllagerP2Renderer extends GeoEntityRenderer<ImperialIllagerP2Entity> {
	public ImperialIllagerP2Renderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new ImperialIllagerP2Model());
		this.shadowRadius = 0.7f;
		this.addRenderLayer(new ImperialIllagerP2Layer(this));
	}

	@Override
	public RenderType getRenderType(ImperialIllagerP2Entity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, ImperialIllagerP2Entity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, int color) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, color);
	}
}
