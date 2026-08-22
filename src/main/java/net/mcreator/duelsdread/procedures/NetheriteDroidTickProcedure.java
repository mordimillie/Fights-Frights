package net.mcreator.duelsdread.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.duelsdread.init.DuelsdreadModGameRules;
import net.mcreator.duelsdread.init.DuelsdreadModBlocks;

public class NetheriteDroidTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double dx = 0;
		double dz = 0;
		if ((world.getBlockState(BlockPos.containing(entity.getPersistentData().getDouble("HomeX"), entity.getPersistentData().getDouble("HomeY"), entity.getPersistentData().getDouble("HomeZ"))))
				.getBlock() == DuelsdreadModBlocks.NETHERITE_STATION_EMPTY.get()) {
			entity.getPersistentData().putDouble("WaitTick", (0 + entity.getPersistentData().getDouble("WaitTick") + 1));
			if (40 < entity.getPersistentData().getDouble("WaitTick")) {
				entity.getPersistentData().putDouble("WaitTick", 0);
				dx = entity.getX() - entity.getPersistentData().getDouble("HomeX");
				dz = entity.getZ() - entity.getPersistentData().getDouble("HomeZ");
				if (dx * dx + dz * dz > Math.pow((world.getLevelData().getGameRules().getInt(DuelsdreadModGameRules.DROID_WANDER_RADIUS)), 2)) {
					if (entity instanceof Mob _entity)
						_entity.getNavigation().moveTo((entity.getPersistentData().getDouble("HomeX")), (entity.getPersistentData().getDouble("HomeY")), (entity.getPersistentData().getDouble("HomeZ")), 1.3);
				}
			}
		}
	}
}
