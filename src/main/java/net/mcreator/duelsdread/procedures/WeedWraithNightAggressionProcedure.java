package net.mcreator.duelsdread.procedures;

import net.minecraft.world.level.LevelAccessor;

public class WeedWraithNightAggressionProcedure {
	public static boolean execute(LevelAccessor world) {
		return ((world.dayTime())) > (13000) && ((world.dayTime())) < (23000);
	}
}
