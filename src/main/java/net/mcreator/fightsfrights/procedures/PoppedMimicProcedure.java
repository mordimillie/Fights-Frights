package net.mcreator.fightsfrights.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.fightsfrights.entity.MimicScowlEntity;

public class PoppedMimicProcedure {
	public static double execute(Entity entity) {
		if (entity == null)
			return 0;
		if ((entity instanceof MimicScowlEntity _datEntL0 && _datEntL0.getEntityData().get(MimicScowlEntity.DATA_Popped)) == true) {
			return 0.8;
		}
		return 1;
	}
}
