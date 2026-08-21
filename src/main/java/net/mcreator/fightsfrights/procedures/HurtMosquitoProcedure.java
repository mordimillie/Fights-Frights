package net.mcreator.fightsfrights.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.fightsfrights.init.FightsfrightsModMobEffects;
import net.mcreator.fightsfrights.entity.GrimmsquitoEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class HurtMosquitoProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingHurtEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(Entity entity, Entity sourceentity) {
		execute(null, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (sourceentity instanceof GrimmsquitoEntity) {
			if ((sourceentity instanceof GrimmsquitoEntity animatable ? animatable.getTexture() : "null").equals("grimmsquitopoison")) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.POISON, 120, 1, true, true));
			}
			if ((sourceentity instanceof GrimmsquitoEntity animatable ? animatable.getTexture() : "null").equals("grimmsquitowither")) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.WITHER, 100, 0, true, true));
			}
			if ((sourceentity instanceof GrimmsquitoEntity animatable ? animatable.getTexture() : "null").equals("grimmsquitoblindness")) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 140, 0, true, true));
			}
			if ((sourceentity instanceof GrimmsquitoEntity animatable ? animatable.getTexture() : "null").equals("grimmsquitoterrified")) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(FightsfrightsModMobEffects.TERRIFIED.get(), 60, 4, true, true));
			}
			if ((sourceentity instanceof GrimmsquitoEntity animatable ? animatable.getTexture() : "null").equals("grimmsquitoinfection")) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(FightsfrightsModMobEffects.INFECTED.get(), -1, 0, false, true));
			}
		}
	}
}
