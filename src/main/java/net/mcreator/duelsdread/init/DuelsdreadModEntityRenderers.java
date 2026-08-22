
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.duelsdread.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.duelsdread.client.renderer.WoodenConstructRenderer;
import net.mcreator.duelsdread.client.renderer.WeedWroughtRenderer;
import net.mcreator.duelsdread.client.renderer.WeedWraithRenderer;
import net.mcreator.duelsdread.client.renderer.SpamdurRenderer;
import net.mcreator.duelsdread.client.renderer.SavagerRenderer;
import net.mcreator.duelsdread.client.renderer.NetheriteDroidRenderer;
import net.mcreator.duelsdread.client.renderer.HANDRenderer;
import net.mcreator.duelsdread.client.renderer.CrudeDroidRenderer;
import net.mcreator.duelsdread.client.renderer.CopperDroidRenderer;
import net.mcreator.duelsdread.client.renderer.BloodspamdurRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class DuelsdreadModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(DuelsdreadModEntities.WEED_WRAITH.get(), WeedWraithRenderer::new);
		event.registerEntityRenderer(DuelsdreadModEntities.WEED_WROUGHT.get(), WeedWroughtRenderer::new);
		event.registerEntityRenderer(DuelsdreadModEntities.COPPER_DROID.get(), CopperDroidRenderer::new);
		event.registerEntityRenderer(DuelsdreadModEntities.NETHERITE_DROID.get(), NetheriteDroidRenderer::new);
		event.registerEntityRenderer(DuelsdreadModEntities.SPAMDUR.get(), SpamdurRenderer::new);
		event.registerEntityRenderer(DuelsdreadModEntities.BLOODSPAMDUR.get(), BloodspamdurRenderer::new);
		event.registerEntityRenderer(DuelsdreadModEntities.CRUDE_DROID.get(), CrudeDroidRenderer::new);
		event.registerEntityRenderer(DuelsdreadModEntities.WOODEN_CONSTRUCT.get(), WoodenConstructRenderer::new);
		event.registerEntityRenderer(DuelsdreadModEntities.SAVAGER.get(), SavagerRenderer::new);
		event.registerEntityRenderer(DuelsdreadModEntities.HAND.get(), HANDRenderer::new);
	}
}
