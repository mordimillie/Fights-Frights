
package net.mcreator.fightsfrights.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.InteractionResult;

import net.mcreator.fightsfrights.procedures.MimentisClawRightclickedOnBlockProcedure;
import net.mcreator.fightsfrights.procedures.MimentisClawLivingEntityIsHitWithToolProcedure;
import net.mcreator.fightsfrights.init.FightsfrightsModItems;

public class MimentisClawItem extends PickaxeItem {
	public MimentisClawItem() {
		super(new Tier() {
			public int getUses() {
				return 300;
			}

			public float getSpeed() {
				return 6.5f;
			}

			public float getAttackDamageBonus() {
				return -1.999f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(FightsfrightsModItems.GOOP.get()), new ItemStack(Items.IRON_INGOT), new ItemStack(FightsfrightsModItems.MIMENTIS_CLAW_SINGLE_USE.get()));
			}
		}, 1, -2.3f, new Item.Properties());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		MimentisClawLivingEntityIsHitWithToolProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity, sourceentity, itemstack);
		return retval;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		MimentisClawRightclickedOnBlockProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getLevel().getBlockState(context.getClickedPos()),
				context.getPlayer(), context.getItemInHand());
		return InteractionResult.SUCCESS;
	}
}
