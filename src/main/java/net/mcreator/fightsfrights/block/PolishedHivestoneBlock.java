
package net.mcreator.fightsfrights.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class PolishedHivestoneBlock extends Block {
	public PolishedHivestoneBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.POLISHED_DEEPSLATE).strength(2.5f, 6f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}
