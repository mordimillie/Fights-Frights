package net.mcreator.fightsfrights.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.fightsfrights.init.FightsfrightsModMobEffects;
import net.mcreator.fightsfrights.entity.SeerEntity;
import net.mcreator.fightsfrights.FightsfrightsMod;

public class SeerOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double variant = 0;
		FightsfrightsMod.queueServerWork(20, () -> {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(FightsfrightsModMobEffects.JELLIED.get(), -1, 2, true, true));
		});
		if (Math.random() < (2) / ((float) 5)) {
			if (entity instanceof SeerEntity animatable)
				animatable.setTexture("seer_blue");
		} else if (Math.random() < (1) / ((float) 10)) {
			if (entity instanceof SeerEntity animatable)
				animatable.setTexture("seer_snow");
		}
	}
}
