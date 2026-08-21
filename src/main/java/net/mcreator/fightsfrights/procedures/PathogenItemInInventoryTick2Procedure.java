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
			if (!((entity.getCapability(FightsfrightsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FightsfrightsModVariables.PlayerVariables())).Infected == true)) {
				{
					boolean _setval = true;
					entity.getCapability(FightsfrightsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Infected = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
