package net.mcreator.fightsfrights.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.fightsfrights.init.FightsfrightsModGameRules;

public class PioneerNaturalEntitySpawningConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		return world.getLevelData().getGameRules().getBoolean(FightsfrightsModGameRules.SPAWN_PIONEERS) == true && !world.canSeeSkyFromBelowWater(BlockPos.containing(x, y, z));
	}
}
