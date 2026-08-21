package net.mcreator.fightsfrights.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.fightsfrights.init.FightsfrightsModGameRules;

public class ShadowNaturalEntitySpawningConditionProcedure {
	public static boolean execute(LevelAccessor world) {
		if (world.getLevelData().getGameRules().getBoolean(FightsfrightsModGameRules.SPAWN_SHADOW) == true && ((world.dayTime())) > (14000) && ((world.dayTime())) < (22000)) {
			return true;
		}
		return false;
	}
}
