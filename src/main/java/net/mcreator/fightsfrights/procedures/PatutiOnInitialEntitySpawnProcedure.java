package net.mcreator.fightsfrights.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.fightsfrights.init.FightsfrightsModMobEffects;
import net.mcreator.fightsfrights.entity.PatutiEntity;

public class PatutiOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double variant = 0;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(FightsfrightsModMobEffects.AMPHIBIAN.get(), -1, 0, false, false));
		variant = Mth.nextInt(RandomSource.create(), 1, 100);
		if ((variant) > (38) && (variant) < (72)) {
			if (entity instanceof PatutiEntity animatable)
				animatable.setTexture("patuti_yellow");
		} else if ((variant) > (72) && (variant) < (99)) {
			if (entity instanceof PatutiEntity animatable)
				animatable.setTexture("patuti_red");
		} else if (variant == 100) {
			if (entity instanceof PatutiEntity animatable)
				animatable.setTexture("patuti_variant");
		}
	}
}
