
package net.mcreator.fightsfrights.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Blocks;

public class JellyBricksStairsBlock extends StairBlock {
	public JellyBricksStairsBlock() {
		super(Blocks.AIR.defaultBlockState(), BlockBehaviour.Properties.of().sound(SoundType.MUD).strength(0.5f, 1400f).friction(0.7f).dynamicShape());
	}

	@Override
	public float getExplosionResistance() {
		return 1400f;
	}
}
