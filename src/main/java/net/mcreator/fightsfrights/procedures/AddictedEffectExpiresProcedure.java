package net.mcreator.fightsfrights.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;

import net.mcreator.fightsfrights.init.FightsfrightsModMobEffects;

public class AddictedEffectExpiresProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!(entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(FightsfrightsModMobEffects.ADDICTED))) {
			entity.hurt(new DamageSource(world.holderOrThrow(DamageTypes.STARVE)), 256);
		}
	}
}
