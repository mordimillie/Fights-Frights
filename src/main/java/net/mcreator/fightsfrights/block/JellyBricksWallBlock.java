
package net.mcreator.fightsfrights.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.SoundType;

public class JellyBricksWallBlock extends WallBlock {
	public JellyBricksWallBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.MUD).strength(0.5f, 1400f).friction(0.7f).dynamicShape().forceSolidOn());
	}
}
