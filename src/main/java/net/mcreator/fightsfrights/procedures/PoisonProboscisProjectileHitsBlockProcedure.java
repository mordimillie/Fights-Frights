package net.mcreator.fightsfrights.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.fightsfrights.init.FightsfrightsModParticleTypes;

public class PoisonProboscisProjectileHitsBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (FightsfrightsModParticleTypes.PROBOSCISPARTICLE.get()), (x + 0.5), (y + 1), (z + 0.5), 15, 0.1, 0.1, 0.1, 0.05);
	}
}
