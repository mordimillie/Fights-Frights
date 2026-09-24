package net.mcreator.fightsfrights.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.fightsfrights.init.FightsfrightsModItems;
import net.mcreator.fightsfrights.init.FightsfrightsModEntities;
import net.mcreator.fightsfrights.FightsfrightsMod;

public class PioneerEntityDiesHeadProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() < (4) / ((float) 5)) {
			FightsfrightsMod.queueServerWork(50, () -> {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = FightsfrightsModEntities.PIONEER_HEAD.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 0, 0);
					}
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.POOF, x, y, z, 5, 0.125, 0.125, 0.125, 0.07);
			});
		} else {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(FightsfrightsModItems.SCREEN_HEAD_HELMET.get()));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		}
	}
}
