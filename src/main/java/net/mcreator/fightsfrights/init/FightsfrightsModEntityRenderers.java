
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fightsfrights.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.fightsfrights.client.renderer.WitherProboscisRenderer;
import net.mcreator.fightsfrights.client.renderer.WickeWarmongerRenderer;
import net.mcreator.fightsfrights.client.renderer.TerrifiedProboscisRenderer;
import net.mcreator.fightsfrights.client.renderer.TerrantulaRenderer;
import net.mcreator.fightsfrights.client.renderer.SupaiRenderer;
import net.mcreator.fightsfrights.client.renderer.ShadowcompanioncompanionRenderer;
import net.mcreator.fightsfrights.client.renderer.ShadowcompanionRenderer;
import net.mcreator.fightsfrights.client.renderer.ShadowRenderer;
import net.mcreator.fightsfrights.client.renderer.ShackledRenderer;
import net.mcreator.fightsfrights.client.renderer.SeerRenderer;
import net.mcreator.fightsfrights.client.renderer.ScowlRenderer;
import net.mcreator.fightsfrights.client.renderer.ReanimatedRenderer;
import net.mcreator.fightsfrights.client.renderer.PoisonProboscisRenderer;
import net.mcreator.fightsfrights.client.renderer.PoisonOrbRenderer;
import net.mcreator.fightsfrights.client.renderer.PioneerRenderer;
import net.mcreator.fightsfrights.client.renderer.PiglinProsecutorRenderer;
import net.mcreator.fightsfrights.client.renderer.PatutiRenderer;
import net.mcreator.fightsfrights.client.renderer.NethersilverfishRenderer;
import net.mcreator.fightsfrights.client.renderer.NethercavespiderRenderer;
import net.mcreator.fightsfrights.client.renderer.NetherSpiderRenderer;
import net.mcreator.fightsfrights.client.renderer.NetherBanshaaRenderer;
import net.mcreator.fightsfrights.client.renderer.MossBombProyectileRenderer;
import net.mcreator.fightsfrights.client.renderer.MimicTerrantulaRenderer;
import net.mcreator.fightsfrights.client.renderer.MimicSeerRenderer;
import net.mcreator.fightsfrights.client.renderer.MimicScowlRenderer;
import net.mcreator.fightsfrights.client.renderer.MimicPioneerRenderer;
import net.mcreator.fightsfrights.client.renderer.MimicPatutiRenderer;
import net.mcreator.fightsfrights.client.renderer.MimicGrimmsquitoRenderer;
import net.mcreator.fightsfrights.client.renderer.MimicBeetlesRenderer;
import net.mcreator.fightsfrights.client.renderer.MimicBanshaaRenderer;
import net.mcreator.fightsfrights.client.renderer.MimicAllmanRenderer;
import net.mcreator.fightsfrights.client.renderer.MimentisRenderer;
import net.mcreator.fightsfrights.client.renderer.MaliciousMonarchP2Renderer;
import net.mcreator.fightsfrights.client.renderer.MaliciousMonarchP1Renderer;
import net.mcreator.fightsfrights.client.renderer.InfectedProboscisRenderer;
import net.mcreator.fightsfrights.client.renderer.ImperialIllagerP2Renderer;
import net.mcreator.fightsfrights.client.renderer.ImperialIllagerP1Renderer;
import net.mcreator.fightsfrights.client.renderer.IIproyectileRenderer;
import net.mcreator.fightsfrights.client.renderer.GrimmsquitoRenderer;
import net.mcreator.fightsfrights.client.renderer.GhastlyGeneralRenderer;
import net.mcreator.fightsfrights.client.renderer.FireFlyerRenderer;
import net.mcreator.fightsfrights.client.renderer.EffigyRenderer;
import net.mcreator.fightsfrights.client.renderer.ChargedScrapProyectileRenderer;
import net.mcreator.fightsfrights.client.renderer.CallousCommander1Renderer;
import net.mcreator.fightsfrights.client.renderer.BluntjavelinproyectileRenderer;
import net.mcreator.fightsfrights.client.renderer.BlindnessProboscisRenderer;
import net.mcreator.fightsfrights.client.renderer.BanshaaRenderer;
import net.mcreator.fightsfrights.client.renderer.AllmanRenderer;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class FightsfrightsModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(FightsfrightsModEntities.ALLMAN.get(), AllmanRenderer::new);
		event.registerEntityRenderer(FightsfrightsModEntities.SCOWL.get(), ScowlRenderer::new);
		event.registerEntityRenderer(FightsfrightsModEntities.MOSS_BOMB_PROYECTILE.get(), MossBombProyectileRenderer::new);
		event.registerEntityRenderer(FightsfrightsModEntities.SEER.get(), SeerRenderer::new);
		event.registerEntityRenderer(FightsfrightsModEntities.PATUTI.get(), PatutiRenderer::new);
		event.registerEntityRenderer(FightsfrightsModEntities.PIONEER.get(), PioneerRenderer::new);
		event.registerEntityRenderer(FightsfrightsModEntities.TERRANTULA.get(), TerrantulaRenderer::new);
		event.registerEntityRenderer(FightsfrightsModEntities.BANSHAA.get(), BanshaaRenderer::new);
		event.registerEntityRenderer(FightsfrightsModEntities.REANIMATED.get(), ReanimatedRenderer::new);
		event.registerEntityRenderer(FightsfrightsModEntities.CHARGED_SCRAP_PROYECTILE.get(), ChargedScrapProyectileRenderer::new);
		event.registerEntityRenderer(FightsfrightsModEntities.GHASTLY_GENERAL.get(), GhastlyGeneralRenderer::new);
		event.registerEntityRenderer(FightsfrightsModEntities.POISON_ORB.get(), PoisonOrbRenderer::new);
		event.registerEntityRenderer(FightsfrightsModEntities.SHACKLED.get(), ShackledRenderer::new);
		event.registerEntityRenderer(FightsfrightsModEntities.ALLBOMB_PROYECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(FightsfrightsModEntities.PIGLIN_PROSECUTOR.get(), PiglinProsecutorRenderer::new);
		event.registerEntityRenderer(FightsfrightsModEntities.BLUNTJAVELINPROYECTILE.get(), BluntjavelinproyectileRenderer::new);
		event.registerEntityRenderer(FightsfrightsModEntities.IMPERIAL_ILLAGER_P_1.get(), ImperialIllagerP1Renderer::new);
		event.registerEntityRenderer(FightsfrightsModEntities.IMPERIAL_ILLAGER_P_2.get(), ImperialIllagerP2Renderer::new);
		event.registerEntityRenderer(FightsfrightsModEntities.I_IPROYECTILE.get(), IIproyectileRenderer::new);
		event.registerEntityRenderer(FightsfrightsModEntities.EFFIGY.get(), EffigyRenderer::new);
		event.registerEntityRenderer(FightsfrightsModEntities.WICKE_WARMONGER.get(), WickeWarmongerRenderer::new);
		event.registerEntityRenderer(FightsfrightsModEntities.MALICIOUS_MONARCH_P_1.get(), MaliciousMonarchP1Renderer::new);
		event.registerEntityRenderer(FightsfrightsModEntities.MALICIOUS_MONARCH_P_2.get(), MaliciousMonarchP2Renderer::new);
		event.registerEntityRenderer(FightsfrightsModEntities.CALLOUS_COMMANDER_1.get(), CallousCommander1Renderer::new);
		event.registerEntityRenderer(FightsfrightsModEntities.GRIMMSQUITO.get(), GrimmsquitoRenderer::new);
		event.registerEntityRenderer(FightsfrightsModEntities.SHADOW.get(), ShadowRenderer::new);
		event.registerEntityRenderer(FightsfrightsModEntities.SHADOWCOMPANION.get(), ShadowcompanionRenderer::new);
		event.registerEntityRenderer(FightsfrightsModEntities.SHADOWCOMPANIONCOMPANION.get(), ShadowcompanioncompanionRenderer::new);
		event.registerEntityRenderer(FightsfrightsModEntities.MIMENTIS.get(), MimentisRenderer::new);
		event.registerEntityRenderer(FightsfrightsModEntities.MIMIC_SCOWL.get(), MimicScowlRenderer::new);
		event.registerEntityRenderer(FightsfrightsModEntities.MIMIC_BANSHAA.get(), MimicBanshaaRenderer::new);
		event.registerEntityRenderer(FightsfrightsModEntities.MIMIC_TERRANTULA.get(), MimicTerrantulaRenderer::new);
		event.registerEntityRenderer(FightsfrightsModEntities.MIMIC_PIONEER.get(), MimicPioneerRenderer::new);
		event.registerEntityRenderer(FightsfrightsModEntities.MIMIC_SEER.get(), MimicSeerRenderer::new);
		event.registerEntityRenderer(FightsfrightsModEntities.MIMIC_ALLMAN.get(), MimicAllmanRenderer::new);
		event.registerEntityRenderer(FightsfrightsModEntities.MIMIC_GRIMMSQUITO.get(), MimicGrimmsquitoRenderer::new);
		event.registerEntityRenderer(FightsfrightsModEntities.MIMIC_PATUTI.get(), MimicPatutiRenderer::new);
		event.registerEntityRenderer(FightsfrightsModEntities.SUPAI.get(), SupaiRenderer::new);
		event.registerEntityRenderer(FightsfrightsModEntities.POISON_PROBOSCIS.get(), PoisonProboscisRenderer::new);
		event.registerEntityRenderer(FightsfrightsModEntities.TERRIFIED_PROBOSCIS.get(), TerrifiedProboscisRenderer::new);
		event.registerEntityRenderer(FightsfrightsModEntities.BLINDNESS_PROBOSCIS.get(), BlindnessProboscisRenderer::new);
		event.registerEntityRenderer(FightsfrightsModEntities.INFECTED_PROBOSCIS.get(), InfectedProboscisRenderer::new);
		event.registerEntityRenderer(FightsfrightsModEntities.WITHER_PROBOSCIS.get(), WitherProboscisRenderer::new);
		event.registerEntityRenderer(FightsfrightsModEntities.NETHER_BANSHAA.get(), NetherBanshaaRenderer::new);
		event.registerEntityRenderer(FightsfrightsModEntities.NETHERSILVERFISH.get(), NethersilverfishRenderer::new);
		event.registerEntityRenderer(FightsfrightsModEntities.NETHER_SPIDER.get(), NetherSpiderRenderer::new);
		event.registerEntityRenderer(FightsfrightsModEntities.NETHERCAVESPIDER.get(), NethercavespiderRenderer::new);
		event.registerEntityRenderer(FightsfrightsModEntities.MIMIC_BEETLES.get(), MimicBeetlesRenderer::new);
		event.registerEntityRenderer(FightsfrightsModEntities.FIRE_SWARM.get(), FireFlyerRenderer::new);
	}
}
