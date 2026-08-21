package net.mcreator.fightsfrights.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.fightsfrights.init.FightsfrightsModParticleTypes;

public class ShadowOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null) && 1 == Mth.nextInt(RandomSource.create(), 1, 4)) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (FightsfrightsModParticleTypes.SHADOWPARTICLE.get()), x, y, z, 1, 0.125, 0.25, 0.125, 0.02);
		}
		if (world.dayTime() > 23300) {
			entity.setSecondsOnFire(10);
		}
	}
}
