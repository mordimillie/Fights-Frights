package net.mcreator.fightsfrights.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.fightsfrights.network.FightsfrightsModVariables;
import net.mcreator.fightsfrights.init.FightsfrightsModGameRules;

public class PathogenItemInInventoryTick2Procedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world.getLevelData().getGameRules().getBoolean(FightsfrightsModGameRules.DO_INFECTION) == true) {
			if (!(entity.getData(FightsfrightsModVariables.PLAYER_VARIABLES).Infected == true)) {
				{
					FightsfrightsModVariables.PlayerVariables _vars = entity.getData(FightsfrightsModVariables.PLAYER_VARIABLES);
					_vars.Infected = true;
					_vars.syncPlayerVariables(entity);
				}
			}
		}
	}
}
