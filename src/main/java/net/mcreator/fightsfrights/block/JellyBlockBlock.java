
package net.mcreator.fightsfrights.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class JellyBlockBlock extends Block {
	public JellyBlockBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.MUD).strength(0.5f, 1400f).friction(0.7f).speedFactor(0.7f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}
