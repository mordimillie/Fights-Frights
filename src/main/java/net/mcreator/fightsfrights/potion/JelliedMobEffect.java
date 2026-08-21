
package net.mcreator.fightsfrights.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.fightsfrights.procedures.JelliedOnEffectActiveTickProcedure;

public class JelliedMobEffect extends MobEffect {
	public JelliedMobEffect() {
		super(MobEffectCategory.NEUTRAL, -16754586);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		JelliedOnEffectActiveTickProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
