
package net.mcreator.duelsdread.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.duelsdread.procedures.PerpetualOneDayBlindingStewPlayerFinishesUsingItemProcedure;

public class PerpetualOneDayBlindingStewItem extends Item {
	public PerpetualOneDayBlindingStewItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(20).saturationMod(10f).alwaysEat().meat().build()));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		PerpetualOneDayBlindingStewPlayerFinishesUsingItemProcedure.execute(entity);
		return retval;
	}
}
