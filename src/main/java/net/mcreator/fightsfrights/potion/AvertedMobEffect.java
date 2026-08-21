
package net.mcreator.fightsfrights.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.fightsfrights.procedures.AvertedOnEffectActivationProcedure;

public class AvertedMobEffect extends MobEffect {
	public AvertedMobEffect() {
		super(MobEffectCategory.HARMFUL, -14439203);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		AvertedOnEffectActivationProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
