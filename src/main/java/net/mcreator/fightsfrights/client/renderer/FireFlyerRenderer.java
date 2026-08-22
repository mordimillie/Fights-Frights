
package net.mcreator.fightsfrights.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.CreeperModel;

import net.mcreator.fightsfrights.entity.FireFlyerEntity;

public class FireFlyerRenderer extends MobRenderer<FireFlyerEntity, CreeperModel<FireFlyerEntity>> {
	public FireFlyerRenderer(EntityRendererProvider.Context context) {
		super(context, new CreeperModel<FireFlyerEntity>(context.bakeLayer(ModelLayers.CREEPER)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(FireFlyerEntity entity) {
		return ResourceLocation.parse("fightsfrights:textures/entities/fireflytexture_empty.png");
	}
}
