package net.mcreator.fightsfrights.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.fightsfrights.init.FightsfrightsModEntities;
import net.mcreator.fightsfrights.entity.ShadowcompanionEntity;

public class ShadowcompanionEntityIsHurtProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof ShadowcompanionEntity _datEntL0 && _datEntL0.getEntityData().get(ShadowcompanionEntity.DATA_summon)) == false && 1 == Mth.nextInt(RandomSource.create(), 1, 3)) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = FightsfrightsModEntities.SHADOWCOMPANIONCOMPANION.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
			if (entity instanceof ShadowcompanionEntity _datEntSetL)
				_datEntSetL.getEntityData().set(ShadowcompanionEntity.DATA_summon, true);
		}
	}
}
