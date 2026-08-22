
package net.mcreator.fightsfrights.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.SoundType;

public class HivestoneBricksWallBlock extends WallBlock {
	public HivestoneBricksWallBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.POLISHED_DEEPSLATE).strength(2.5f, 6f).requiresCorrectToolForDrops().dynamicShape().forceSolidOn());
	}
}
