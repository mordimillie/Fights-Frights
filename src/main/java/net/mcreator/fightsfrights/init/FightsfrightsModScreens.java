
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fightsfrights.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.fightsfrights.client.gui.TrashcanGUIScreen;
import net.mcreator.fightsfrights.client.gui.GUIthingyScreen;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class FightsfrightsModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(FightsfrightsModMenus.CRUSHER_GUI.get(), GUIthingyScreen::new);
		event.register(FightsfrightsModMenus.TRASHCAN_GUI.get(), TrashcanGUIScreen::new);
	}
}
