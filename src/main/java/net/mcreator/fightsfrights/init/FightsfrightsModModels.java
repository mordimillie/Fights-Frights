
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fightsfrights.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.fightsfrights.client.model.Modelmossbomb;
import net.mcreator.fightsfrights.client.model.Modelblunt_javelin;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class FightsfrightsModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelmossbomb.LAYER_LOCATION, Modelmossbomb::createBodyLayer);
		event.registerLayerDefinition(Modelblunt_javelin.LAYER_LOCATION, Modelblunt_javelin::createBodyLayer);
	}
}
