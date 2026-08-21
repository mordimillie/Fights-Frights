package net.mcreator.fightsfrights.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.fightsfrights.init.FightsfrightsModParticleTypes;

public class PoisonOrbWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.addParticle((SimpleParticleType) (FightsfrightsModParticleTypes.OMINOUS_SOUL.get()), x, y, z, 0, 0, 0);
	}
}
