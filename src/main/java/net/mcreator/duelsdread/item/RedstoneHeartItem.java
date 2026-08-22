
package net.mcreator.duelsdread.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class RedstoneHeartItem extends Item {
	public RedstoneHeartItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
