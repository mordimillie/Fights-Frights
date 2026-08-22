
package net.mcreator.fightsfrights.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SilverfishModel;

import net.mcreator.fightsfrights.entity.NethersilverfishEntity;

public class NethersilverfishRenderer extends MobRenderer<NethersilverfishEntity, SilverfishModel<NethersilverfishEntity>> {
	public NethersilverfishRenderer(EntityRendererProvider.Context context) {
		super(context, new SilverfishModel<NethersilverfishEntity>(context.bakeLayer(ModelLayers.SILVERFISH)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(NethersilverfishEntity entity) {
		return ResourceLocation.parse("fightsfrights:textures/entities/nether_silverfish.png");
	}
}
