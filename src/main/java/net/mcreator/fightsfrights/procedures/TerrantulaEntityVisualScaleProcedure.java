package net.mcreator.fightsfrights.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.fightsfrights.entity.TerrantulaEntity;

public class TerrantulaEntityVisualScaleProcedure {
	public static double execute(Entity entity) {
		if (entity == null)
			return 0;
		if ((entity instanceof TerrantulaEntity _datEntL0 && _datEntL0.getEntityData().get(TerrantulaEntity.DATA_HasRevealed)) == false) {
			return 0;
		}
		return 1;
	}
}
