
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fightsfrights.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.fightsfrights.client.model.Modelmossbomb;
import net.mcreator.fightsfrights.client.model.Modelblunt_javelin;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class FightsfrightsModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelmossbomb.LAYER_LOCATION, Modelmossbomb::createBodyLayer);
		event.registerLayerDefinition(Modelblunt_javelin.LAYER_LOCATION, Modelblunt_javelin::createBodyLayer);
	}
}
