
package net.mcreator.fightsfrights.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.fightsfrights.procedures.PutridScytheLivingEntityIsHitWithItemProcedure;
import net.mcreator.fightsfrights.init.FightsfrightsModItems;

public class PutridScythe2Item extends HoeItem {
	public PutridScythe2Item() {
		super(new Tier() {
			public int getUses() {
				return 70;
			}

			public float getSpeed() {
				return 7f;
			}

			public float getAttackDamageBonus() {
				return 4f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(FightsfrightsModItems.SHACKLE.get()));
			}
		}, 0, -2.2f, new Item.Properties());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		PutridScytheLivingEntityIsHitWithItemProcedure.execute(entity);
		return retval;
	}
}
