package net.mcreator.duelsdread.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.duelsdread.init.DuelsdreadModGameRules;

public class SpawnSpamdurRuleProcedure {
	public static boolean execute(LevelAccessor world) {
		return world.getLevelData().getGameRules().getBoolean(DuelsdreadModGameRules.DO_DUELS_N_DREAD) == true && world.getLevelData().getGameRules().getBoolean(DuelsdreadModGameRules.SPAWN_SPAMDUR) == true;
	}
}
