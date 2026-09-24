
package net.mcreator.fightsfrights.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.SoundType;

public class ChitinbrickswallBlock extends WallBlock {
	public ChitinbrickswallBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.WART_BLOCK).strength(2f, 6f).requiresCorrectToolForDrops().dynamicShape().forceSolidOn());
	}
}
