package net.mcreator.fightsfrights.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.fightsfrights.init.FightsfrightsModParticleTypes;
import net.mcreator.fightsfrights.init.FightsfrightsModMobEffects;
import net.mcreator.fightsfrights.entity.WitherProboscisEntity;
import net.mcreator.fightsfrights.entity.TerrifiedProboscisEntity;
import net.mcreator.fightsfrights.entity.PoisonProboscisEntity;
import net.mcreator.fightsfrights.entity.InfectedProboscisEntity;
import net.mcreator.fightsfrights.entity.BlindnessProboscisEntity;

public class PoisonProboscisProjectileHitsLivingEntityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity immediatesourceentity) {
		if (entity == null || immediatesourceentity == null)
			return;
		if (immediatesourceentity instanceof PoisonProboscisEntity) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.POISON, 200, 1, false, true));
		}
		if (immediatesourceentity instanceof TerrifiedProboscisEntity) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(FightsfrightsModMobEffects.TERRIFIED, 100, 4, false, true));
		}
		if (immediatesourceentity instanceof BlindnessProboscisEntity) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 160, 4, false, true));
		}
		if (immediatesourceentity instanceof InfectedProboscisEntity) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(FightsfrightsModMobEffects.INFECTED, -1, 0, false, true));
		}
		if (immediatesourceentity instanceof WitherProboscisEntity) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.WITHER, 180, 0, false, true));
		}
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (FightsfrightsModParticleTypes.PROBOSCISPARTICLE.get()), x, (y + 0.5), z, 15, 0.1, 0.1, 0.1, 0.05);
	}
}
