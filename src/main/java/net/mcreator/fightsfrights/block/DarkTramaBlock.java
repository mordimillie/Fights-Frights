
package net.mcreator.fightsfrights.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class DarkTramaBlock extends Block {
	public DarkTramaBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.SHROOMLIGHT).strength(0.2f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}
