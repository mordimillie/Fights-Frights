
package net.mcreator.fightsfrights.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class SmoothchitinslabsBlock extends SlabBlock {
	public SmoothchitinslabsBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.WART_BLOCK).strength(2f, 6f).requiresCorrectToolForDrops().dynamicShape());
	}
}
