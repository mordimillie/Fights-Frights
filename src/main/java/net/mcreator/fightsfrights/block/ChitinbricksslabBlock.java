
package net.mcreator.fightsfrights.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class ChitinbricksslabBlock extends SlabBlock {
	public ChitinbricksslabBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.WART_BLOCK).strength(2f, 6f).requiresCorrectToolForDrops().dynamicShape());
	}
}
