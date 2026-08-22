package net.mcreator.fightsfrights.procedures;

import net.neoforged.neoforge.event.tick.EntityTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.fightsfrights.init.FightsfrightsModParticleTypes;
import net.mcreator.fightsfrights.init.FightsfrightsModMobEffects;

import javax.annotation.Nullable;

@EventBusSubscriber
public class EmmanenceProcedure {
	@SubscribeEvent
	public static void onEntityTick(EntityTickEvent.Pre event) {
		execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(FightsfrightsModMobEffects.INFECTED) && Mth.nextInt(RandomSource.create(), 1, 30) == 1
				|| entity instanceof LivingEntity _livEnt2 && _livEnt2.hasEffect(FightsfrightsModMobEffects.ASYMPTOMATIC) && Mth.nextInt(RandomSource.create(), 1, 30) == 1) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (FightsfrightsModParticleTypes.INFECTION_PARTICLE.get()), x, (y + entity.getBbHeight() - 1), z, 1, 0.05, 0.05, 0.05, 0.015);
		}
	}
}
