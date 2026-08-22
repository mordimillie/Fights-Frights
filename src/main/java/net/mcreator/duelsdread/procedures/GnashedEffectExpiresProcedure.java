package net.mcreator.duelsdread.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.mcreator.duelsdread.init.DuelsdreadModParticleTypes;
import net.mcreator.duelsdread.init.DuelsdreadModMobEffects;

public class GnashedEffectExpiresProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double Level = 0;
		if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(DuelsdreadModMobEffects.GNASHED.get()) ? _livEnt.getEffect(DuelsdreadModMobEffects.GNASHED.get()).getDuration() : 0) == 1) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (DuelsdreadModParticleTypes.GNASHING_PARTICLE.get()), x, (y + entity.getBbHeight() / 2), z,
						entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(DuelsdreadModMobEffects.GNASHED.get()) ? _livEnt.getEffect(DuelsdreadModMobEffects.GNASHED.get()).getAmplifier() : 0, (entity.getBbHeight() / 8),
						(entity.getBbHeight() / 8), (entity.getBbHeight() / 8), 0);
			entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MAGIC)),
					entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(DuelsdreadModMobEffects.GNASHED.get()) ? _livEnt.getEffect(DuelsdreadModMobEffects.GNASHED.get()).getAmplifier() : 0);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("duelsdread:chomp")), SoundSource.PLAYERS, (float) 0.3, (float) 1.2);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("duelsdread:chomp")), SoundSource.PLAYERS, (float) 0.3, (float) 1.2, false);
				}
			}
		}
	}
}
