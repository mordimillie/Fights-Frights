
package net.mcreator.fightsfrights.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.fightsfrights.procedures.PutridScytheLivingEntityIsHitWithItemProcedure;
import net.mcreator.fightsfrights.init.FightsfrightsModItems;

public class DeadsteelScimitarItem extends SwordItem {
	public DeadsteelScimitarItem() {
		super(new Tier() {
			public int getUses() {
				return 2300;
			}

			public float getSpeed() {
				return 12f;
			}

			public float getAttackDamageBonus() {
				return 3f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 17;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(FightsfrightsModItems.POISON_ORB_ITEM.get()));
			}
		}, 3, -2.3f, new Item.Properties().fireResistant());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		PutridScytheLivingEntityIsHitWithItemProcedure.execute(entity);
		return retval;
	}
}
