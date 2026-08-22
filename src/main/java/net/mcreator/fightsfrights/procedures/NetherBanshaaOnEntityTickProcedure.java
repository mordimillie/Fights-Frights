package net.mcreator.fightsfrights.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.mcreator.fightsfrights.init.FightsfrightsModMobEffects;
import net.mcreator.fightsfrights.entity.NetherBanshaaEntity;
import net.mcreator.fightsfrights.FightsfrightsMod;

public class NetherBanshaaOnEntityTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null)) {
			if ((entity instanceof NetherBanshaaEntity _datEntL2 && _datEntL2.getEntityData().get(NetherBanshaaEntity.DATA_HasScreamed)) == false
					&& Math.sqrt(Math.pow(entity.getX() - (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX(), 2) + Math.pow(entity.getY() - (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY(), 2)
							+ Math.pow(entity.getZ() - (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ(), 2)) <= 12) {
				if (entity instanceof NetherBanshaaEntity _datEntSetL)
					_datEntSetL.getEntityData().set(NetherBanshaaEntity.DATA_HasScreamed, true);
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 120, 255, false, false));
				if (entity instanceof NetherBanshaaEntity) {
					((NetherBanshaaEntity) entity).setAnimation("Banshaa.Scream");
				}
				FightsfrightsMod.queueServerWork(20, () -> {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("fightsfrights:banshaa_scream")), SoundSource.HOSTILE, 3, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("fightsfrights:banshaa_scream")), SoundSource.HOSTILE, 3, 1, false);
						}
					}
					if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(FightsfrightsModMobEffects.GAZED, 480, 1, false, true));
					FightsfrightsMod.queueServerWork(4, () -> {
						if (entity instanceof LivingEntity _entity)
							_entity.removeAllEffects();
						FightsfrightsMod.queueServerWork(480, () -> {
							if (entity instanceof NetherBanshaaEntity _datEntSetL)
								_datEntSetL.getEntityData().set(NetherBanshaaEntity.DATA_HasScreamed, false);
						});
					});
				});
			}
		}
	}
}
