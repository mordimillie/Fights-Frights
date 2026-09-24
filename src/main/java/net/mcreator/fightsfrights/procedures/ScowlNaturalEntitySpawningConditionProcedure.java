package net.mcreator.fightsfrights.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.fightsfrights.init.FightsfrightsModGameRules;

public class ScowlNaturalEntitySpawningConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() < ((world.getLevelData().getGameRules().getInt(FightsfrightsModGameRules.FIGHTSFRIGHTSMOBSPAWNCHANCE))) / ((float) 20) && world.getMaxLocalRawBrightness(BlockPos.containing(x, y, z)) < 7
				&& world.getLevelData().getGameRules().getBoolean(FightsfrightsModGameRules.SPAWN_SCOWL) == true) {
			return true;
		}
		return false;
	}
}
