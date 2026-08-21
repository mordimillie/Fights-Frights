
package net.mcreator.fightsfrights.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import net.mcreator.fightsfrights.procedures.PathogenItemInInventoryTick2Procedure;

public class PathogenItem extends Item {
	public PathogenItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		PathogenItemInInventoryTick2Procedure.execute(world, entity);
	}
}
