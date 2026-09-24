
package net.mcreator.fightsfrights.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class HivestoneBricksSlabBlock extends SlabBlock {
	public HivestoneBricksSlabBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.POLISHED_DEEPSLATE).strength(2.5f, 6f).requiresCorrectToolForDrops().dynamicShape());
	}
}
