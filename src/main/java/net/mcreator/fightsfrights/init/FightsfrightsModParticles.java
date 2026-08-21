
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fightsfrights.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.fightsfrights.client.particle.ShadowparticleParticle;
import net.mcreator.fightsfrights.client.particle.ProboscisparticleParticle;
import net.mcreator.fightsfrights.client.particle.OminousSoulParticle;
import net.mcreator.fightsfrights.client.particle.MadParticlleParticle;
import net.mcreator.fightsfrights.client.particle.InfectionParticleParticle;
import net.mcreator.fightsfrights.client.particle.GreenFlyParticleParticle;
import net.mcreator.fightsfrights.client.particle.GoopparticleParticle;
import net.mcreator.fightsfrights.client.particle.GazedParticleParticle;
import net.mcreator.fightsfrights.client.particle.FlyParticle;
import net.mcreator.fightsfrights.client.particle.FireFlyParticleParticle;
import net.mcreator.fightsfrights.client.particle.CalmParticleParticle;
import net.mcreator.fightsfrights.client.particle.BeetleyellowParticle;
import net.mcreator.fightsfrights.client.particle.BeetleRedParticle;
import net.mcreator.fightsfrights.client.particle.BeetleGoldParticle;
import net.mcreator.fightsfrights.client.particle.BeetleBlueParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class FightsfrightsModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(FightsfrightsModParticleTypes.OMINOUS_SOUL.get(), OminousSoulParticle::provider);
		event.registerSpriteSet(FightsfrightsModParticleTypes.GOOPPARTICLE.get(), GoopparticleParticle::provider);
		event.registerSpriteSet(FightsfrightsModParticleTypes.GAZED_PARTICLE.get(), GazedParticleParticle::provider);
		event.registerSpriteSet(FightsfrightsModParticleTypes.MAD_PARTICLLE.get(), MadParticlleParticle::provider);
		event.registerSpriteSet(FightsfrightsModParticleTypes.CALM_PARTICLE.get(), CalmParticleParticle::provider);
		event.registerSpriteSet(FightsfrightsModParticleTypes.BEETLE_BLUE.get(), BeetleBlueParticle::provider);
		event.registerSpriteSet(FightsfrightsModParticleTypes.BEETLEYELLOW.get(), BeetleyellowParticle::provider);
		event.registerSpriteSet(FightsfrightsModParticleTypes.BEETLE_RED.get(), BeetleRedParticle::provider);
		event.registerSpriteSet(FightsfrightsModParticleTypes.BEETLE_GOLD.get(), BeetleGoldParticle::provider);
		event.registerSpriteSet(FightsfrightsModParticleTypes.SHADOWPARTICLE.get(), ShadowparticleParticle::provider);
		event.registerSpriteSet(FightsfrightsModParticleTypes.INFECTION_PARTICLE.get(), InfectionParticleParticle::provider);
		event.registerSpriteSet(FightsfrightsModParticleTypes.PROBOSCISPARTICLE.get(), ProboscisparticleParticle::provider);
		event.registerSpriteSet(FightsfrightsModParticleTypes.FLY.get(), FlyParticle::provider);
		event.registerSpriteSet(FightsfrightsModParticleTypes.FIRE_FLY_PARTICLE.get(), FireFlyParticleParticle::provider);
		event.registerSpriteSet(FightsfrightsModParticleTypes.GREEN_FLY_PARTICLE.get(), GreenFlyParticleParticle::provider);
	}
}
