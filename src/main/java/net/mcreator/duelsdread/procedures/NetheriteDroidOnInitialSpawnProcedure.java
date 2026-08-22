package net.mcreator.duelsdread.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.duelsdread.init.DuelsdreadModBlocks;
import net.mcreator.duelsdread.entity.NetheriteDroidEntity;

public class NetheriteDroidOnInitialSpawnProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((world.getBlockState(BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()))).getBlock() == DuelsdreadModBlocks.NETHERITE_STATION_EMPTY.get()) {
			entity.getPersistentData().putDouble("HomeX", Math.floor(entity.getX()));
			entity.getPersistentData().putDouble("HomeY", Math.floor(entity.getY()));
			entity.getPersistentData().putDouble("HomeZ", Math.floor(entity.getZ()));
			if (entity instanceof NetheriteDroidEntity) {
				((NetheriteDroidEntity) entity).setAnimation("On");
			}
		}
	}
}
