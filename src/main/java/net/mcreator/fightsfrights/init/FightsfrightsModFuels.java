
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fightsfrights.init;

import net.neoforged.neoforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;

@EventBusSubscriber
public class FightsfrightsModFuels {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		ItemStack itemstack = event.getItemStack();
		if (itemstack.getItem() == FightsfrightsModBlocks.BLIGHT_PLANKS.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == FightsfrightsModBlocks.BLIGHT_STEM.get().asItem())
			event.setBurnTime(300);
	}
}
