
package net.mcreator.fightsfrights.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class SmoothJellySlabBlock extends SlabBlock {
	public SmoothJellySlabBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.MUD).strength(0.5f, 1400f).friction(0.7f).dynamicShape());
	}
}
