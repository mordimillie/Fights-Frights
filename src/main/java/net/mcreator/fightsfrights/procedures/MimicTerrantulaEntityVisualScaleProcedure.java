package net.mcreator.fightsfrights.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.fightsfrights.entity.MimicTerrantulaEntity;

public class MimicTerrantulaEntityVisualScaleProcedure {
	public static double execute(Entity entity) {
		if (entity == null)
			return 0;
		if ((entity instanceof MimicTerrantulaEntity _datEntL0 && _datEntL0.getEntityData().get(MimicTerrantulaEntity.DATA_HasRevealed)) == false) {
			return 0;
		}
		return 1;
	}
}
