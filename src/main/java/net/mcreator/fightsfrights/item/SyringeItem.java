
package net.mcreator.fightsfrights.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.fightsfrights.procedures.SyringeLivingEntityIsHitWithItemProcedure;

public class SyringeItem extends Item {
	public SyringeItem() {
		super(new Item.Properties().durability(10).rarity(Rarity.COMMON));
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		SyringeLivingEntityIsHitWithItemProcedure.execute(entity.level(), entity, itemstack);
		return retval;
	}
}
