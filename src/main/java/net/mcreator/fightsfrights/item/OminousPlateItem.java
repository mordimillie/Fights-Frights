
package net.mcreator.fightsfrights.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class OminousPlateItem extends Item {
	public OminousPlateItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}
}
