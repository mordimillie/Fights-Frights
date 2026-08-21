
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fightsfrights.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.fightsfrights.block.entity.TrashcanBlockEntity;
import net.mcreator.fightsfrights.block.entity.CircuitLeverBlockEntity;
import net.mcreator.fightsfrights.FightsfrightsMod;

public class FightsfrightsModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, FightsfrightsMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> TRASHCAN = register("trashcan", FightsfrightsModBlocks.TRASHCAN, TrashcanBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CIRCUIT_LEVER = register("circuit_lever", FightsfrightsModBlocks.CIRCUIT_LEVER, CircuitLeverBlockEntity::new);

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
