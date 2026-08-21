package net.mcreator.fightsfrights.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.fightsfrights.entity.ScowlEntity;

public class PoppedProcedure {
	public static double execute(Entity entity) {
		if (entity == null)
			return 0;
		if ((entity instanceof ScowlEntity _datEntL0 && _datEntL0.getEntityData().get(ScowlEntity.DATA_Popped)) == true) {
			return 0.8;
		}
		return 1;
	}
}
