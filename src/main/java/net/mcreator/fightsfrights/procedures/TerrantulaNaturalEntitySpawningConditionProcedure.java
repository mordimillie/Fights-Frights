package net.mcreator.fightsfrights.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.fightsfrights.init.FightsfrightsModGameRules;

public class TerrantulaNaturalEntitySpawningConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (world.getMaxLocalRawBrightness(BlockPos.containing(x, y, z)) < 7 && world.getLevelData().getGameRules().getBoolean(FightsfrightsModGameRules.SPAWN_TERRANTULA) == true) {
			return true;
		}
		return false;
	}
}
