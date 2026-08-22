
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.duelsdread.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.duelsdread.DuelsdreadMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DuelsdreadModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DuelsdreadMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(DuelsdreadModItems.WEED_WRAITH_SPAWN_EGG.get());
			tabData.accept(DuelsdreadModItems.WEED_WROUGHT_SPAWN_EGG.get());
			tabData.accept(DuelsdreadModItems.COPPER_DROID_SPAWN_EGG.get());
			tabData.accept(DuelsdreadModItems.NETHERITE_DROID_SPAWN_EGG.get());
			tabData.accept(DuelsdreadModItems.SPAMDUR_SPAWN_EGG.get());
			tabData.accept(DuelsdreadModItems.BLOODSPAMDUR_SPAWN_EGG.get());
			tabData.accept(DuelsdreadModItems.CRUDE_DROID_SPAWN_EGG.get());
			tabData.accept(DuelsdreadModItems.WOODEN_CONSTRUCT_SPAWN_EGG.get());
			tabData.accept(DuelsdreadModItems.SAVAGER_SPAWN_EGG.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
			tabData.accept(DuelsdreadModItems.WRITHING_WEED.get());
			tabData.accept(DuelsdreadModItems.PERPETUAL_ONE_DAY_BLINDING_STEW.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.REDSTONE_BLOCKS) {
			tabData.accept(DuelsdreadModBlocks.COPPER_STATION.get().asItem());
			tabData.accept(DuelsdreadModBlocks.NETHERITE_STATION.get().asItem());
			tabData.accept(DuelsdreadModBlocks.WOODEN_STATION.get().asItem());
			tabData.accept(DuelsdreadModBlocks.WOODEN_STATION_EMPTY.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(DuelsdreadModItems.TORN_CLOTH.get());
			tabData.accept(DuelsdreadModItems.REDSTONE_HEART.get());
			tabData.accept(DuelsdreadModItems.SAVAGE_TOOTH.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(DuelsdreadModItems.ENDER_SEED.get());
			tabData.accept(DuelsdreadModItems.ENDER_BLOOM.get());
			tabData.accept(DuelsdreadModItems.WAIL.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(DuelsdreadModItems.GAZING_HOOD_HELMET.get());
			tabData.accept(DuelsdreadModItems.SAVAGE_CLUB.get());
		}
	}
}
