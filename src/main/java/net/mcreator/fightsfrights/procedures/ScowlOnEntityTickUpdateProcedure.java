package net.mcreator.fightsfrights.procedures;

import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.fightsfrights.entity.ScowlEntity;
import net.mcreator.fightsfrights.entity.MimicScowlEntity;

public class ScowlOnEntityTickUpdateProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null) && (entity instanceof ScowlEntity _datEntL2 && _datEntL2.getEntityData().get(ScowlEntity.DATA_Popped)) == false
				|| !((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null) && (entity instanceof MimicScowlEntity _datEntL5 && _datEntL5.getEntityData().get(MimicScowlEntity.DATA_Popped)) == false) {
			if (Mth.nextInt(RandomSource.create(), 1, 100) == 1) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 40, 0, false, false));
			}
		}
	}
}
