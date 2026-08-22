
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.duelsdread.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ArmorItem;

import net.mcreator.duelsdread.item.WrithingWeedItem;
import net.mcreator.duelsdread.item.WailItem;
import net.mcreator.duelsdread.item.TornClothItem;
import net.mcreator.duelsdread.item.SavageToothItem;
import net.mcreator.duelsdread.item.SavageClubItem;
import net.mcreator.duelsdread.item.RedstoneHeartItem;
import net.mcreator.duelsdread.item.PerpetualOneDayBlindingStewItem;
import net.mcreator.duelsdread.item.GazingHoodItem;
import net.mcreator.duelsdread.item.EnderSeedItem;
import net.mcreator.duelsdread.item.EnderBloomItem;
import net.mcreator.duelsdread.DuelsdreadMod;

public class DuelsdreadModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DuelsdreadMod.MODID);
	public static final RegistryObject<Item> WEED_WRAITH_SPAWN_EGG = REGISTRY.register("weed_wraith_spawn_egg", () -> new ForgeSpawnEggItem(DuelsdreadModEntities.WEED_WRAITH, -9083063, -6844547, new Item.Properties()));
	public static final RegistryObject<Item> WEED_WROUGHT_SPAWN_EGG = REGISTRY.register("weed_wrought_spawn_egg", () -> new ForgeSpawnEggItem(DuelsdreadModEntities.WEED_WROUGHT, -11582162, -3554379, new Item.Properties()));
	public static final RegistryObject<Item> WRITHING_WEED = REGISTRY.register("writhing_weed", () -> new WrithingWeedItem());
	public static final RegistryObject<Item> COPPER_DROID_SPAWN_EGG = REGISTRY.register("copper_droid_spawn_egg", () -> new ForgeSpawnEggItem(DuelsdreadModEntities.COPPER_DROID, -3512507, -29583, new Item.Properties()));
	public static final RegistryObject<Item> COPPER_STATION = block(DuelsdreadModBlocks.COPPER_STATION);
	public static final RegistryObject<Item> COPPER_STATION_EMPTY = block(DuelsdreadModBlocks.COPPER_STATION_EMPTY);
	public static final RegistryObject<Item> NETHERITE_DROID_SPAWN_EGG = REGISTRY.register("netherite_droid_spawn_egg", () -> new ForgeSpawnEggItem(DuelsdreadModEntities.NETHERITE_DROID, -13421773, -10066330, new Item.Properties()));
	public static final RegistryObject<Item> NETHERITE_STATION = block(DuelsdreadModBlocks.NETHERITE_STATION);
	public static final RegistryObject<Item> NETHERITE_STATION_EMPTY = block(DuelsdreadModBlocks.NETHERITE_STATION_EMPTY);
	public static final RegistryObject<Item> SPAMDUR_SPAWN_EGG = REGISTRY.register("spamdur_spawn_egg", () -> new ForgeSpawnEggItem(DuelsdreadModEntities.SPAMDUR, -6539876, -2039688, new Item.Properties()));
	public static final RegistryObject<Item> PERPETUAL_ONE_DAY_BLINDING_STEW = REGISTRY.register("perpetual_one_day_blinding_stew", () -> new PerpetualOneDayBlindingStewItem());
	public static final RegistryObject<Item> BLOODSPAMDUR_SPAWN_EGG = REGISTRY.register("bloodspamdur_spawn_egg", () -> new ForgeSpawnEggItem(DuelsdreadModEntities.BLOODSPAMDUR, -65536, -6684826, new Item.Properties()));
	public static final RegistryObject<Item> TORN_CLOTH = REGISTRY.register("torn_cloth", () -> new TornClothItem());
	public static final RegistryObject<Item> CRUDE_DROID_SPAWN_EGG = REGISTRY.register("crude_droid_spawn_egg", () -> new ForgeSpawnEggItem(DuelsdreadModEntities.CRUDE_DROID, -11316397, -11556722, new Item.Properties()));
	public static final RegistryObject<Item> REDSTONE_HEART = REGISTRY.register("redstone_heart", () -> new RedstoneHeartItem());
	public static final RegistryObject<Item> WOODEN_CONSTRUCT_SPAWN_EGG = REGISTRY.register("wooden_construct_spawn_egg", () -> new ForgeSpawnEggItem(DuelsdreadModEntities.WOODEN_CONSTRUCT, -6388403, -7245504, new Item.Properties()));
	public static final RegistryObject<Item> WOODEN_STATION = block(DuelsdreadModBlocks.WOODEN_STATION);
	public static final RegistryObject<Item> WOODEN_STATION_EMPTY = block(DuelsdreadModBlocks.WOODEN_STATION_EMPTY);
	public static final RegistryObject<Item> ENDER_SEED = REGISTRY.register("ender_seed", () -> new EnderSeedItem());
	public static final RegistryObject<Item> ENDER_BLOOM = REGISTRY.register("ender_bloom", () -> new EnderBloomItem());
	public static final RegistryObject<GazingHoodItem> GAZING_HOOD_HELMET = REGISTRY.register("gazing_hood_helmet", () -> new GazingHoodItem(ArmorItem.Type.HELMET, new Item.Properties()));
	public static final RegistryObject<Item> SAVAGER_SPAWN_EGG = REGISTRY.register("savager_spawn_egg", () -> new ForgeSpawnEggItem(DuelsdreadModEntities.SAVAGER, -5478333, -8218445, new Item.Properties()));
	public static final RegistryObject<Item> WAIL = REGISTRY.register("wail", () -> new WailItem());
	public static final RegistryObject<Item> SAVAGE_TOOTH = REGISTRY.register("savage_tooth", () -> new SavageToothItem());
	public static final RegistryObject<Item> SAVAGE_CLUB = REGISTRY.register("savage_club", () -> new SavageClubItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
