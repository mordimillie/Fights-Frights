
package net.mcreator.fightsfrights.block;

import net.minecraftforge.common.PlantType;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.fightsfrights.procedures.BlightcapMobplayerCollidesWithPlantProcedure;
import net.mcreator.fightsfrights.init.FightsfrightsModBlocks;
import net.mcreator.fightsfrights.block.grower.BlightcapTreeGrower;

public class BlightcapBlock extends SaplingBlock {
	public BlightcapBlock() {
		super(new BlightcapTreeGrower(), BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).randomTicks().sound(SoundType.GRASS).instabreak().noCollission().offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY));
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		Vec3 offset = state.getOffset(world, pos);
		return box(4, 0, 4, 12, 12, 12).move(offset.x, offset.y, offset.z);
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 100;
	}

	@Override
	public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 60;
	}

	@Override
	public boolean mayPlaceOn(BlockState groundState, BlockGetter worldIn, BlockPos pos) {
		return groundState.is(FightsfrightsModBlocks.ROTTEN_BLOCK.get()) || groundState.is(Blocks.GRASS_BLOCK) || groundState.is(Blocks.DIRT) || groundState.is(Blocks.MOSS_BLOCK) || groundState.is(Blocks.STONE) || groundState.is(Blocks.ANDESITE)
				|| groundState.is(Blocks.DIORITE) || groundState.is(Blocks.DEEPSLATE) || groundState.is(Blocks.GRANITE) || groundState.is(Blocks.TUFF) || groundState.is(FightsfrightsModBlocks.HIVESTONE.get());
	}

	@Override
	public boolean canSurvive(BlockState blockstate, LevelReader worldIn, BlockPos pos) {
		BlockPos blockpos = pos.below();
		BlockState groundState = worldIn.getBlockState(blockpos);
		return this.mayPlaceOn(groundState, worldIn, blockpos);
	}

	@Override
	public PlantType getPlantType(BlockGetter world, BlockPos pos) {
		return PlantType.CAVE;
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		BlightcapMobplayerCollidesWithPlantProcedure.execute(entity);
	}
}
