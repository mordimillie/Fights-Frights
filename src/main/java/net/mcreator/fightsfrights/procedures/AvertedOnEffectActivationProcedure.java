package net.mcreator.fightsfrights.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.fightsfrights.init.FightsfrightsModMobEffects;

import java.util.List;
import java.util.Comparator;

public class AvertedOnEffectActivationProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(40 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (entityiterator.isAlive() && entityiterator instanceof Monster && !(entity instanceof LivingEntity _livEnt2 && _livEnt2.hasEffect(FightsfrightsModMobEffects.CALM))) {
					if (!(entityiterator == entity)) {
						if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(FightsfrightsModMobEffects.CALM,
									entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(FightsfrightsModMobEffects.AVERTED) ? _livEnt.getEffect(FightsfrightsModMobEffects.AVERTED).getDuration() : 0, 0, true, true));
					}
				}
			}
		}
	}
}
