package net.mcreator.fightsfrights.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.fightsfrights.init.FightsfrightsModGameRules;

public class GrimmsquitoNaturalEntitySpawningConditionProcedure {
	public static boolean execute(LevelAccessor world) {
		return world.getLevelData().getGameRules().getBoolean(FightsfrightsModGameRules.SPAWN_GRIMMSQUITO) == true;
	}
}
