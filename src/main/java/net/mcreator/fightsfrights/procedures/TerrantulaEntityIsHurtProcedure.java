package net.mcreator.fightsfrights.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
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

import net.mcreator.fightsfrights.entity.TerrantulaEntity;
import net.mcreator.fightsfrights.FightsfrightsMod;

public class TerrantulaEntityIsHurtProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean FoundSpot = false;
		double TpRadius = 0;
		double randomX = 0;
		double randomZ = 0;
		double scanY = 0;
		double MinRadius = 0;
		if (entity.getPersistentData().getBoolean("TpBusy") == false) {
			FoundSpot = false;
			MinRadius = 7;
			TpRadius = 12;
			if (Mth.nextInt(RandomSource.create(), 1, 3) == 1) {
				for (int index0 = 0; index0 < (int) TpRadius; index0++) {
					randomX = entity.getX() + Mth.nextInt(RandomSource.create(), (int) MinRadius, (int) TpRadius) * (Mth.nextInt(RandomSource.create(), 0, 1) * 2 - 1);
					randomZ = entity.getZ() + Mth.nextInt(RandomSource.create(), (int) MinRadius, (int) TpRadius) * (Mth.nextInt(RandomSource.create(), 0, 1) * 2 - 1);
					scanY = entity.getY() + TpRadius * 0.5;
					for (int index1 = 0; index1 < (int) TpRadius; index1++) {
						scanY = scanY - 1;
						if ((world.getBlockState(BlockPos.containing(randomX, scanY, randomZ))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(randomX, scanY + 1, randomZ))).getBlock() == Blocks.AIR
								&& world.getBlockState(BlockPos.containing(randomX, scanY - 1, randomZ)).canOcclude()) {
							entity.getPersistentData().putDouble("randomX", randomX);
							entity.getPersistentData().putDouble("scanY", scanY);
							entity.getPersistentData().putDouble("randomZ", randomZ);
							FoundSpot = true;
							entity.getPersistentData().putBoolean("TpBusy", true);
							break;
						}
					}
					if (FoundSpot == true) {
						break;
					}
				}
				if (FoundSpot == true) {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 60, 3, false, false));
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 80, 255, false, false));
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 60, 255, false, false));
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fightsfrights:terrantula_emerge")), SoundSource.HOSTILE, (float) 0.2, -2);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fightsfrights:terrantula_emerge")), SoundSource.HOSTILE, (float) 0.2, -2, false);
						}
					}
					if (entity instanceof TerrantulaEntity) {
						((TerrantulaEntity) entity).setAnimation("Dig");
					}
					FightsfrightsMod.queueServerWork(15, () -> {
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.CAMPFIRE_COSY_SMOKE, x, y, z, 50, 0.6, 0.1, 0.6, 0.02);
						FightsfrightsMod.queueServerWork(14, () -> {
							if (entity instanceof TerrantulaEntity _datEntSetL)
								_datEntSetL.getEntityData().set(TerrantulaEntity.DATA_HasRevealed, false);
							FightsfrightsMod.queueServerWork(5, () -> {
								if (entity.isAlive()) {
									{
										Entity _ent = entity;
										_ent.teleportTo((entity.getPersistentData().getDouble("randomX")), (entity.getPersistentData().getDouble("scanY")), (entity.getPersistentData().getDouble("randomZ")));
										if (_ent instanceof ServerPlayer _serverPlayer)
											_serverPlayer.connection.teleport((entity.getPersistentData().getDouble("randomX")), (entity.getPersistentData().getDouble("scanY")), (entity.getPersistentData().getDouble("randomZ")), _ent.getYRot(),
													_ent.getXRot());
									}
									entity.getPersistentData().putBoolean("TpBusy", false);
								}
							});
						});
					});
				}
			}
		}
	}
}
