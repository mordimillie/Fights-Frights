
package net.mcreator.fightsfrights.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class EmptyHexItem extends Item {
	public EmptyHexItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.RARE));
	}
}
