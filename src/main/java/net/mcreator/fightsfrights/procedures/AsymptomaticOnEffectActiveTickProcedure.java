package net.mcreator.fightsfrights.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.fightsfrights.init.FightsfrightsModMobEffects;

public class AsymptomaticOnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		for (Entity entityiterator : world.getEntities(entity, new AABB((x + 1), (y + 1), (z + 1), (x + -1), (y + -1), (z + -1)))) {
			if (entityiterator instanceof Player && !(entityiterator instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(FightsfrightsModMobEffects.INFECTED.get()))) {
				if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(FightsfrightsModMobEffects.INFECTED.get(), -1, 0, false, true));
			} else if (!(entityiterator instanceof Player) && !(entityiterator instanceof LivingEntity _livEnt4 && _livEnt4.hasEffect(FightsfrightsModMobEffects.ASYMPTOMATIC.get()))) {
				if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(FightsfrightsModMobEffects.ASYMPTOMATIC.get(), -1, 0, false, true));
			}
		}
		if (Mth.nextInt(RandomSource.create(), 1, 600) == 1) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fightsfrights:sneeze")), SoundSource.HOSTILE, (float) 0.5, -2);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fightsfrights:sneeze")), SoundSource.HOSTILE, (float) 0.5, -2, false);
				}
			}
			entity.push(0, 0.4, 0);
			for (Entity entityiterator : world.getEntities(entity, new AABB((x + 2.5), (y + 2.5), (z + 2.5), (x + -2.5), (y + -2.5), (z + -2.5)))) {
				if (entityiterator instanceof Player && !(entityiterator instanceof LivingEntity _livEnt11 && _livEnt11.hasEffect(FightsfrightsModMobEffects.INFECTED.get()))) {
					if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(FightsfrightsModMobEffects.INFECTED.get(), -1, 0, false, true));
				} else if (!(entityiterator instanceof Player) && !(entityiterator instanceof LivingEntity _livEnt14 && _livEnt14.hasEffect(FightsfrightsModMobEffects.ASYMPTOMATIC.get()))) {
					if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(FightsfrightsModMobEffects.ASYMPTOMATIC.get(), -1, 0, false, true));
				}
			}
		}
	}
}
