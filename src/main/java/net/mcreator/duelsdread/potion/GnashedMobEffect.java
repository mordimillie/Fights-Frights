
package net.mcreator.duelsdread.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.duelsdread.procedures.GnashedEffectExpiresProcedure;

public class GnashedMobEffect extends MobEffect {
	public GnashedMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1965998);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		GnashedEffectExpiresProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
