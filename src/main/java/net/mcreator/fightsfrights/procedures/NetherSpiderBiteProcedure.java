package net.mcreator.fightsfrights.procedures;

import net.neoforged.neoforge.event.entity.living.LivingIncomingDamageEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.fightsfrights.entity.TerrantulaEntity;
import net.mcreator.fightsfrights.entity.NethersilverfishEntity;
import net.mcreator.fightsfrights.entity.NethercavespiderEntity;
import net.mcreator.fightsfrights.entity.NetherSpiderEntity;

import javax.annotation.Nullable;

@EventBusSubscriber
public class NetherSpiderBiteProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingIncomingDamageEvent event) {
		if (event.getEntity() != null) {
			execute(event, event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(Entity entity, Entity sourceentity) {
		execute(null, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (sourceentity instanceof NetherSpiderEntity) {
			entity.igniteForSeconds(Mth.nextInt(RandomSource.create(), 1, 5));
		} else if (sourceentity instanceof NethercavespiderEntity) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.WITHER, 240, 0, false, true));
		} else if (sourceentity instanceof NethersilverfishEntity) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 100, 1, false, true));
		} else if (sourceentity instanceof TerrantulaEntity && (sourceentity instanceof TerrantulaEntity animatable ? animatable.getTexture() : "null").equals("nether_terrantula")) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.WITHER, 120, 0, false, true));
		}
	}
}
