package net.mcreator.fightsfrights.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.fightsfrights.init.FightsfrightsModGameRules;
import net.mcreator.fightsfrights.entity.TerrantulaEntity;

public class TerrantulaEntityVisualScaleProcedure {
	public static double execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return 0;
		if (Math.random() < ((world.getLevelData().getGameRules().getInt(FightsfrightsModGameRules.FIGHTSFRIGHTSMOBSPAWNCHANCE))) / ((float) 20)
				&& (entity instanceof TerrantulaEntity _datEntL2 && _datEntL2.getEntityData().get(TerrantulaEntity.DATA_HasRevealed)) == false) {
			return 0;
		}
		return 1;
	}
}
