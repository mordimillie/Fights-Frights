package net.mcreator.fightsfrights.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.fightsfrights.init.FightsfrightsModGameRules;

public class BanshaaNaturalEntitySpawningConditionProcedure {
	public static boolean execute(LevelAccessor world) {
		if (Math.random() < ((world.getLevelData().getGameRules().getInt(FightsfrightsModGameRules.FIGHTSFRIGHTSMOBSPAWNCHANCE))) / ((float) 20) && world.getLevelData().getGameRules().getBoolean(FightsfrightsModGameRules.SPAWN_BANSHAA) == true) {
			return true;
		}
		return false;
	}
}
