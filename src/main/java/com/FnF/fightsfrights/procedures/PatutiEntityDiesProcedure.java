package net.mcreator.fightsfrights.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.fightsfrights.FightsfrightsMod;

public class PatutiEntityDiesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.SPLASH, x, y, z, 10, 0.125, 0.125, 0.125, 0.1);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.DRIPPING_WATER, x, y, z, 10, 0.125, 0.125, 0.125, 0.1);
		world.setBlock(BlockPos.containing(x, y, z), Blocks.WATER.defaultBlockState(), 3);
		if (world instanceof Level _level)
			_level.updateNeighborsAt(BlockPos.containing(x, y, z), _level.getBlockState(BlockPos.containing(x, y, z)).getBlock());
		FightsfrightsMod.queueServerWork(10, () -> {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.WATER) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			}
		});
	}
}
