
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.duelsdread.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.duelsdread.block.WoodenStationEmptyBlock;
import net.mcreator.duelsdread.block.WoodenStationBlock;
import net.mcreator.duelsdread.block.NetheriteStationEmptyBlock;
import net.mcreator.duelsdread.block.NetheriteStationBlock;
import net.mcreator.duelsdread.block.CopperStationEmptyBlock;
import net.mcreator.duelsdread.block.CopperStationBlock;
import net.mcreator.duelsdread.DuelsdreadMod;

public class DuelsdreadModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, DuelsdreadMod.MODID);
	public static final RegistryObject<Block> COPPER_STATION = REGISTRY.register("copper_station", () -> new CopperStationBlock());
	public static final RegistryObject<Block> COPPER_STATION_EMPTY = REGISTRY.register("copper_station_empty", () -> new CopperStationEmptyBlock());
	public static final RegistryObject<Block> NETHERITE_STATION = REGISTRY.register("netherite_station", () -> new NetheriteStationBlock());
	public static final RegistryObject<Block> NETHERITE_STATION_EMPTY = REGISTRY.register("netherite_station_empty", () -> new NetheriteStationEmptyBlock());
	public static final RegistryObject<Block> WOODEN_STATION = REGISTRY.register("wooden_station", () -> new WoodenStationBlock());
	public static final RegistryObject<Block> WOODEN_STATION_EMPTY = REGISTRY.register("wooden_station_empty", () -> new WoodenStationEmptyBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
