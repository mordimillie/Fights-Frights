package net.mcreator.duelsdread.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.duelsdread.entity.SpamdurEntity;
import net.mcreator.duelsdread.DuelsdreadMod;

public class SpamteleportProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double randomX = 0;
		double randomZ = 0;
		double scanY = 0;
		double TpRadius = 0;
		if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null) && Mth.nextInt(RandomSource.create(), 1, 2) == 1) {
			TpRadius = 16;
			randomX = entity.getX() + Mth.nextInt(RandomSource.create(), (int) (TpRadius * (-1)), (int) TpRadius);
			randomZ = entity.getZ() + Mth.nextInt(RandomSource.create(), (int) (TpRadius * (-1)), (int) TpRadius);
			scanY = entity.getY() + TpRadius * 0.5;
			for (int index0 = 0; index0 < (int) TpRadius; index0++) {
				scanY = scanY - 1;
				if ((world.getBlockState(BlockPos.containing(randomX, scanY, randomZ))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(randomX, scanY + 1, randomZ))).getBlock() == Blocks.AIR
						&& world.getBlockState(BlockPos.containing(randomX, scanY - 1, randomZ)).canOcclude()) {
					entity.getPersistentData().putDouble("randomX", randomX);
					entity.getPersistentData().putDouble("scanY", scanY);
					entity.getPersistentData().putDouble("randomZ", randomZ);
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 1, false, true));
					if (entity instanceof SpamdurEntity) {
						((SpamdurEntity) entity).setAnimation("teleport");
					}
					DuelsdreadMod.queueServerWork(20, () -> {
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.REVERSE_PORTAL, (entity.getX()), (entity.getY() + 0.7), (entity.getZ()), 30, 0.15, 0.25, 0.15, 0.07);
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.END_ROD, (entity.getX()), (entity.getY() + 0.7), (entity.getZ()), 30, 0.15, 0.25, 0.15, 0.07);
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.END_ROD, (entity.getPersistentData().getDouble("randomX")), (entity.getPersistentData().getDouble("scanY") + 0.7), (entity.getPersistentData().getDouble("randomZ")), 30, 0.15, 0.25, 0.15,
									0.07);
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.REVERSE_PORTAL, (entity.getPersistentData().getDouble("randomX")), (entity.getPersistentData().getDouble("scanY") + 0.7), (entity.getPersistentData().getDouble("randomZ")), 30, 0.15,
									0.25, 0.15, 0.07);
						{
							Entity _ent = entity;
							_ent.teleportTo((entity.getPersistentData().getDouble("randomX")), (entity.getPersistentData().getDouble("scanY")), (entity.getPersistentData().getDouble("randomZ")));
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport((entity.getPersistentData().getDouble("randomX")), (entity.getPersistentData().getDouble("scanY")), (entity.getPersistentData().getDouble("randomZ")), _ent.getYRot(), _ent.getXRot());
						}
					});
					break;
				}
			}
			DuelsdreadMod.queueServerWork(20, () -> {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")), SoundSource.HOSTILE, 1, 0);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")), SoundSource.HOSTILE, 1, 0, false);
					}
				}
			});
		}
	}
}
