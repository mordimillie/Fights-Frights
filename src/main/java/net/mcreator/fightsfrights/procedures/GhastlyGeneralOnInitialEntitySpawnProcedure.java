package net.mcreator.fightsfrights.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.fightsfrights.FightsfrightsMod;

public class GhastlyGeneralOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		FightsfrightsMod.queueServerWork(20, () -> {
			entity.clearFire();
		});
	}
}
