package net.mcreator.fightsfrights.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.fightsfrights.init.FightsfrightsModGameRules;

public class ShackledEntityDiesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.CAMPFIRE_SIGNAL_SMOKE, x, y, z, (int) ((world.getLevelData().getGameRules().getInt(FightsfrightsModGameRules.SHACKLED_SMOKE)) * 10), 0, 0, 0, 0.02);
	}
}
