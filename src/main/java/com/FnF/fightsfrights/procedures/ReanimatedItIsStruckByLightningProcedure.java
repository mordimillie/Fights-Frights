package net.mcreator.fightsfrights.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.particles.ParticleTypes;

public class ReanimatedItIsStruckByLightningProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + 1));
		world.addParticle(ParticleTypes.HEART, x, y, z, 0, 0.2, 0);
	}
}
