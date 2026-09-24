package net.mcreator.fightsfrights.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.particles.ParticleTypes;

public class PioneerOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (Mth.nextInt(RandomSource.create(), 1, 120) == 1) {
			world.addParticle(ParticleTypes.CAMPFIRE_COSY_SMOKE, x, ((y + entity.getBbHeight()) - 0.2), z, 0, 0.08, 0);
		}
	}
}
