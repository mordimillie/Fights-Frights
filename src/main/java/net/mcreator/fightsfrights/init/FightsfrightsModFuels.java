
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fightsfrights.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber
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
