
package net.mcreator.fightsfrights.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.fightsfrights.procedures.GazedOnEffectActiveTickProcedure;

public class GazedMobEffect extends MobEffect {
	public GazedMobEffect() {
		super(MobEffectCategory.HARMFUL, -10092544);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		GazedOnEffectActiveTickProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
