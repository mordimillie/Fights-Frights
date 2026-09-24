package net.mcreator.fightsfrights.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.fightsfrights.entity.ScowlEntity;

public class ScowlOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double Type = 0;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, -1, 0, true, false));
		Type = Mth.nextInt(RandomSource.create(), 1, 3);
		if (Type == 2) {
			if (entity instanceof ScowlEntity animatable)
				animatable.setTexture("bloomingscowl");
		} else if (Type == 3) {
			if (entity instanceof ScowlEntity animatable)
				animatable.setTexture("berriedscowl");
		} else {
			if (entity instanceof ScowlEntity animatable)
				animatable.setTexture("scowl");
		}
	}
}
