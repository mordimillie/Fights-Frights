
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fightsfrights.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.fightsfrights.client.gui.TrashcanGUIScreen;
import net.mcreator.fightsfrights.client.gui.GUIthingyScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class FightsfrightsModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(FightsfrightsModMenus.CRUSHER_GUI.get(), GUIthingyScreen::new);
			MenuScreens.register(FightsfrightsModMenus.TRASHCAN_GUI.get(), TrashcanGUIScreen::new);
		});
	}
}
