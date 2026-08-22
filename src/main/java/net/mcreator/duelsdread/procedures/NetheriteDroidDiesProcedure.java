package net.mcreator.duelsdread.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.duelsdread.init.DuelsdreadModBlocks;

import java.util.Map;

public class NetheriteDroidDiesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world.getBlockState(BlockPos.containing(entity.getPersistentData().getDouble("HomeX"), entity.getPersistentData().getDouble("HomeY"), entity.getPersistentData().getDouble("HomeZ"))))
				.getBlock() == DuelsdreadModBlocks.NETHERITE_STATION_EMPTY.get()) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.CLOUD, (entity.getPersistentData().getDouble("HomeX") + 0.5), (entity.getPersistentData().getDouble("HomeY") + 0.5), (entity.getPersistentData().getDouble("HomeZ") + 0.5), 25, 0.1, 0.2, 0.1, 0.07);
			{
				BlockPos _bp = BlockPos.containing(entity.getPersistentData().getDouble("HomeX"), entity.getPersistentData().getDouble("HomeY"), entity.getPersistentData().getDouble("HomeZ"));
				BlockState _bs = DuelsdreadModBlocks.NETHERITE_STATION.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		} else {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(DuelsdreadModBlocks.NETHERITE_STATION.get()));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		}
	}
}
