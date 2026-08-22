package net.mcreator.fightsfrights.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.fightsfrights.init.FightsfrightsModMobEffects;

public class JelliedOnEffectActiveTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(FightsfrightsModMobEffects.HARDENED, 2,
					(int) (((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(FightsfrightsModMobEffects.JELLIED) ? _livEnt.getEffect(FightsfrightsModMobEffects.JELLIED).getAmplifier() : 0) + 1)
							* Math.ceil((entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) - (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1))),
					true, false));
	}
}
