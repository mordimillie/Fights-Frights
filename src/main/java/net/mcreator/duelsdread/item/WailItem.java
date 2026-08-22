
package net.mcreator.duelsdread.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class WailItem extends RecordItem {
	public WailItem() {
		super(12, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("duelsdread:wail_disc")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 3640);
	}
}
