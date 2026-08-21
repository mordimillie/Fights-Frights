
package net.mcreator.fightsfrights.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ChitinItem extends Item {
	public ChitinItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
