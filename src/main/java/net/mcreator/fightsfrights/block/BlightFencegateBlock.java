
package net.mcreator.fightsfrights.block;

import net.minecraft.world.level.pathfinder.PathType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.entity.Mob;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class BlightFencegateBlock extends FenceGateBlock {
	public BlightFencegateBlock() {
		super(WoodType.OAK, BlockBehaviour.Properties.of().sound(SoundType.WOOD).strength(0.2f).dynamicShape().forceSolidOn());
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 20;
	}

	@Override
	public PathType getBlockPathType(BlockState state, BlockGetter world, BlockPos pos, Mob entity) {
		return PathType.WALKABLE_DOOR;
	}
}
