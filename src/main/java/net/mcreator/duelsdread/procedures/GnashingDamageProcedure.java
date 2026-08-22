package net.mcreator.duelsdread.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.duelsdread.init.DuelsdreadModMobEffects;
import net.mcreator.duelsdread.init.DuelsdreadModItems;
import net.mcreator.duelsdread.init.DuelsdreadModEnchantments;
import net.mcreator.duelsdread.entity.SavagerEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class GnashingDamageProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingHurtEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity(), event.getSource().getEntity(), event.getAmount());
		}
	}

	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity, double amount) {
		execute(null, world, entity, sourceentity, amount);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity, Entity sourceentity, double amount) {
		if (entity == null || sourceentity == null)
			return;
		if (0 < (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1)) {
			if (sourceentity instanceof SavagerEntity) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(DuelsdreadModMobEffects.GNASHED.get(), 40, (int) Math.ceil(amount / 1.67), false, true));
			} else if (EnchantmentHelper.getItemEnchantmentLevel(DuelsdreadModEnchantments.GNASHING.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(DuelsdreadModMobEffects.GNASHED.get(), 16,
							(int) Math.ceil((amount / 5) * (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(DuelsdreadModEnchantments.GNASHING.get())), false, true));
			} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == DuelsdreadModItems.SAVAGE_CLUB.get()) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(DuelsdreadModMobEffects.GNASHED.get(), 30, (int) Math.ceil((amount / 5) * 3), false, true));
			}
		}
	}
}
