package net.mcreator.fightsfrights.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.fightsfrights.entity.MimentisEntity;

public class MimentisOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof MimentisEntity _datEntL0 && _datEntL0.getEntityData().get(MimentisEntity.DATA_is_roaming)) == true && (entity instanceof MimentisEntity _datEntI ? _datEntI.getEntityData().get(MimentisEntity.DATA_roam_timer) : 0) > 0) {
			if (entity instanceof MimentisEntity _datEntSetI)
				_datEntSetI.getEntityData().set(MimentisEntity.DATA_roam_timer, (int) ((entity instanceof MimentisEntity _datEntI ? _datEntI.getEntityData().get(MimentisEntity.DATA_roam_timer) : 0) - 1));
		} else {
			if (entity instanceof MimentisEntity _datEntSetL)
				_datEntSetL.getEntityData().set(MimentisEntity.DATA_is_roaming, false);
		}
		if ((entity instanceof MimentisEntity _datEntL5 && _datEntL5.getEntityData().get(MimentisEntity.DATA_is_roaming)) == false
				&& (entity instanceof MimentisEntity _datEntI ? _datEntI.getEntityData().get(MimentisEntity.DATA_roam_timer) : 0) == 0) {
			ProcmimictransformProcedure.execute(world, x, y, z, entity);
		}
	}
}
