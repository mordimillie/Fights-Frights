
package net.mcreator.fightsfrights.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.CreeperModel;

import net.mcreator.fightsfrights.entity.FireSwarmEntity;

public class FireSwarmRenderer extends MobRenderer<FireSwarmEntity, CreeperModel<FireSwarmEntity>> {
	public FireSwarmRenderer(EntityRendererProvider.Context context) {
		super(context, new CreeperModel<FireSwarmEntity>(context.bakeLayer(ModelLayers.CREEPER)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(FireSwarmEntity entity) {
		return new ResourceLocation("fightsfrights:textures/entities/fireflyer_texture_empty.png");
	}
}
