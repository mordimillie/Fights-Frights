
package net.mcreator.fightsfrights.block;

import net.minecraft.world.level.pathfinder.PathType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.fightsfrights.procedures.VSDEntityWalksOnTheBlockProcedure;

import com.mojang.serialization.MapCodec;

public class VSDBlock extends FallingBlock {
	public static final MapCodec<VSDBlock> CODEC = simpleCodec(properties -> new VSDBlock());

	public MapCodec<VSDBlock> codec() {
		return CODEC;
	}

	public VSDBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.GLASS).strength(4f, 10f).friction(0.85f).speedFactor(1.25f).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public PathType getBlockPathType(BlockState state, BlockGetter world, BlockPos pos, Mob entity) {
		return PathType.WALKABLE;
	}

	@Override
	public void stepOn(Level world, BlockPos pos, BlockState blockstate, Entity entity) {
		super.stepOn(world, pos, blockstate, entity);
		VSDEntityWalksOnTheBlockProcedure.execute(entity);
	}
}
