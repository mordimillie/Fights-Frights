
package net.mcreator.fightsfrights.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.InteractionResult;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.fightsfrights.procedures.CircuitLeverOnBlockRightClickedProcedure;
import net.mcreator.fightsfrights.procedures.CircuitLeverEmittedRedstonePowerProcedure;
import net.mcreator.fightsfrights.block.entity.CircuitLeverBlockEntity;

public class CircuitLeverBlock extends Block implements EntityBlock {
	public static final IntegerProperty BLOCKSTATE = IntegerProperty.create("blockstate", 0, 16);
	public static final IntegerProperty POWER = BlockStateProperties.POWER;

	public CircuitLeverBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(0.5f, 1f).lightLevel(s -> (new Object() {
			public int getLightLevel() {
				if (s.getValue(BLOCKSTATE) == 1)
					return 0;
				if (s.getValue(BLOCKSTATE) == 2)
					return 1;
				if (s.getValue(BLOCKSTATE) == 3)
					return 2;
				if (s.getValue(BLOCKSTATE) == 4)
					return 3;
				if (s.getValue(BLOCKSTATE) == 5)
					return 4;
				if (s.getValue(BLOCKSTATE) == 6)
					return 5;
				if (s.getValue(BLOCKSTATE) == 7)
					return 6;
				if (s.getValue(BLOCKSTATE) == 8)
					return 7;
				if (s.getValue(BLOCKSTATE) == 9)
					return 8;
				if (s.getValue(BLOCKSTATE) == 10)
					return 9;
				if (s.getValue(BLOCKSTATE) == 11)
					return 10;
				if (s.getValue(BLOCKSTATE) == 12)
					return 11;
				if (s.getValue(BLOCKSTATE) == 13)
					return 12;
				if (s.getValue(BLOCKSTATE) == 14)
					return 13;
				if (s.getValue(BLOCKSTATE) == 15)
					return 14;
				if (s.getValue(BLOCKSTATE) == 16)
					return 15;
				return 0;
			}
		}.getLightLevel())));
		this.registerDefaultState(this.stateDefinition.any().setValue(POWER, 0));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		if (state.getValue(BLOCKSTATE) == 1) {
			return box(0, 0, 0, 16, 16, 16);
		}
		if (state.getValue(BLOCKSTATE) == 2) {
			return box(0, 0, 0, 16, 16, 16);
		}
		if (state.getValue(BLOCKSTATE) == 3) {
			return box(0, 0, 0, 16, 16, 16);
		}
		if (state.getValue(BLOCKSTATE) == 4) {
			return box(0, 0, 0, 16, 16, 16);
		}
		if (state.getValue(BLOCKSTATE) == 5) {
			return box(0, 0, 0, 16, 16, 16);
		}
		if (state.getValue(BLOCKSTATE) == 6) {
			return box(0, 0, 0, 16, 16, 16);
		}
		if (state.getValue(BLOCKSTATE) == 7) {
			return box(0, 0, 0, 16, 16, 16);
		}
		if (state.getValue(BLOCKSTATE) == 8) {
			return box(0, 0, 0, 16, 16, 16);
		}
		if (state.getValue(BLOCKSTATE) == 9) {
			return box(0, 0, 0, 16, 16, 16);
		}
		if (state.getValue(BLOCKSTATE) == 12) {
			return box(0, 0, 0, 16, 16, 16);
		}
		if (state.getValue(BLOCKSTATE) == 13) {
			return box(0, 0, 0, 16, 16, 16);
		}
		if (state.getValue(BLOCKSTATE) == 14) {
			return box(0, 0, 0, 16, 16, 16);
		}
		if (state.getValue(BLOCKSTATE) == 15) {
			return box(0, 0, 0, 16, 16, 16);
		}
		if (state.getValue(BLOCKSTATE) == 16) {
			return box(0, 0, 0, 16, 16, 16);
		}
		return box(0, 0, 0, 16, 16, 16);
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(POWER, BLOCKSTATE);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return super.getStateForPlacement(context).setValue(POWER, 0);
	}

	@Override
	public boolean isSignalSource(BlockState state) {
		return true;
	}

	@Override
	public int getSignal(BlockState blockstate, BlockGetter blockAccess, BlockPos pos, Direction direction) {
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		Level world = (Level) blockAccess;
		return (int) CircuitLeverEmittedRedstonePowerProcedure.execute(world, x, y, z);
	}

	@Override
	public boolean canConnectRedstone(BlockState state, BlockGetter world, BlockPos pos, Direction side) {
		return true;
	}

	@Override
	public InteractionResult useWithoutItem(BlockState blockstate, Level world, BlockPos pos, Player entity, BlockHitResult hit) {
		super.useWithoutItem(blockstate, world, pos, entity, hit);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		double hitX = hit.getLocation().x;
		double hitY = hit.getLocation().y;
		double hitZ = hit.getLocation().z;
		Direction direction = hit.getDirection();
		CircuitLeverOnBlockRightClickedProcedure.execute(world, x, y, z, entity);
		return InteractionResult.SUCCESS;
	}

	@Override
	public MenuProvider getMenuProvider(BlockState state, Level worldIn, BlockPos pos) {
		BlockEntity tileEntity = worldIn.getBlockEntity(pos);
		return tileEntity instanceof MenuProvider menuProvider ? menuProvider : null;
	}

	@Override
	public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
		return new CircuitLeverBlockEntity(pos, state);
	}

	@Override
	public boolean triggerEvent(BlockState state, Level world, BlockPos pos, int eventID, int eventParam) {
		super.triggerEvent(state, world, pos, eventID, eventParam);
		BlockEntity blockEntity = world.getBlockEntity(pos);
		return blockEntity == null ? false : blockEntity.triggerEvent(eventID, eventParam);
	}
}
