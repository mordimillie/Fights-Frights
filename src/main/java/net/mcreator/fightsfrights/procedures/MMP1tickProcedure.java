package net.mcreator.fightsfrights.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.monster.Vindicator;
import net.minecraft.world.entity.monster.Ravager;
import net.minecraft.world.entity.monster.Pillager;
import net.minecraft.world.entity.monster.Evoker;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.arguments.EntityAnchorArgument;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.fightsfrights.init.FightsfrightsModParticleTypes;
import net.mcreator.fightsfrights.init.FightsfrightsModEntities;
import net.mcreator.fightsfrights.entity.MaliciousMonarchP1Entity;
import net.mcreator.fightsfrights.entity.ImperialIllagerP1Entity;
import net.mcreator.fightsfrights.entity.IIproyectileEntity;
import net.mcreator.fightsfrights.entity.GhastlyGeneralEntity;
import net.mcreator.fightsfrights.FightsfrightsMod;

import java.util.List;
import java.util.Comparator;

public class MMP1tickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double TpRadius = 0;
		double randomX = 0;
		double randomZ = 0;
		double scanY = 0;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) <= 500 && (entity instanceof MaliciousMonarchP1Entity _datEntL1 && _datEntL1.getEntityData().get(MaliciousMonarchP1Entity.DATA_HalfHealth)) == false) {
			if (entity instanceof MaliciousMonarchP1Entity _datEntSetL)
				_datEntSetL.getEntityData().set(MaliciousMonarchP1Entity.DATA_HalfHealth, true);
			if (entity instanceof MaliciousMonarchP1Entity) {
				((MaliciousMonarchP1Entity) entity).setAnimation("teleport");
			}
			FightsfrightsMod.queueServerWork(29, () -> {
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (FightsfrightsModParticleTypes.OMINOUS_SOUL.get()), (entity.getX()), (entity.getY() + 1.2), (entity.getZ()), 30, 0.1, 0.1, 0.1, 0.05);
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.CAMPFIRE_SIGNAL_SMOKE, (entity.getX()), (entity.getY() + 1.2), (entity.getZ()), 60, 0.1, 0.1, 0.1, 0.05);
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = FightsfrightsModEntities.MALICIOUS_MONARCH_P_2.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 0.5, 0);
					}
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fightsfrights:evillaugh")), SoundSource.HOSTILE, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fightsfrights:evillaugh")), SoundSource.HOSTILE, 1, 1, false);
					}
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.HOSTILE, (float) 0.5, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.HOSTILE, (float) 0.5, 1, false);
					}
				}
				if (!entity.level().isClientSide())
					entity.discard();
			});
		} else {
			if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null) && entity.isAlive() && (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).isAlive()) {
				if (entity instanceof MaliciousMonarchP1Entity _datEntSetI)
					_datEntSetI.getEntityData().set(MaliciousMonarchP1Entity.DATA_SummonCooldown, (int) ((entity instanceof MaliciousMonarchP1Entity _datEntI ? _datEntI.getEntityData().get(MaliciousMonarchP1Entity.DATA_SummonCooldown) : 0) + 1));
				if (entity instanceof MaliciousMonarchP1Entity _datEntSetI)
					_datEntSetI.getEntityData().set(MaliciousMonarchP1Entity.DATA_ShootCooldown, (int) ((entity instanceof MaliciousMonarchP1Entity _datEntI ? _datEntI.getEntityData().get(MaliciousMonarchP1Entity.DATA_ShootCooldown) : 0) + 1));
				if (entity instanceof MaliciousMonarchP1Entity _datEntSetI)
					_datEntSetI.getEntityData().set(MaliciousMonarchP1Entity.DATA_TeleportCooldown, (int) ((entity instanceof MaliciousMonarchP1Entity _datEntI ? _datEntI.getEntityData().get(MaliciousMonarchP1Entity.DATA_TeleportCooldown) : 0) + 1));
				if ((entity instanceof MaliciousMonarchP1Entity _datEntI ? _datEntI.getEntityData().get(MaliciousMonarchP1Entity.DATA_TeleportCooldown) : 0) >= 375) {
					if (entity instanceof MaliciousMonarchP1Entity _datEntSetI)
						_datEntSetI.getEntityData().set(MaliciousMonarchP1Entity.DATA_SummonCooldown, 0);
					if (entity instanceof MaliciousMonarchP1Entity _datEntSetI)
						_datEntSetI.getEntityData().set(MaliciousMonarchP1Entity.DATA_TeleportCooldown, 0);
					if (entity instanceof MaliciousMonarchP1Entity _datEntSetI)
						_datEntSetI.getEntityData().set(MaliciousMonarchP1Entity.DATA_ShootCooldown, 0);
					if (entity instanceof MaliciousMonarchP1Entity) {
						((MaliciousMonarchP1Entity) entity).setAnimation("teleport");
					}
					TpRadius = 20;
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
								_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 4, false, true));
							FightsfrightsMod.queueServerWork(40, () -> {
								if (world instanceof ServerLevel _level)
									_level.sendParticles((SimpleParticleType) (FightsfrightsModParticleTypes.OMINOUS_SOUL.get()), (entity.getX()), (entity.getY() + 1.2), (entity.getZ()), 20, 0.1, 0.1, 0.1, 0.05);
								if (world instanceof ServerLevel _level)
									_level.sendParticles((SimpleParticleType) (FightsfrightsModParticleTypes.OMINOUS_SOUL.get()), (entity.getPersistentData().getDouble("randomX")), (entity.getPersistentData().getDouble("scanY") + 0.7),
											(entity.getPersistentData().getDouble("randomZ")), 20, 0.1, 0.1, 0.1, 0.05);
								{
									Entity _ent = entity;
									_ent.teleportTo((entity.getPersistentData().getDouble("randomX")), (entity.getPersistentData().getDouble("scanY")), (entity.getPersistentData().getDouble("randomZ")));
									if (_ent instanceof ServerPlayer _serverPlayer)
										_serverPlayer.connection.teleport((entity.getPersistentData().getDouble("randomX")), (entity.getPersistentData().getDouble("scanY")), (entity.getPersistentData().getDouble("randomZ")), _ent.getYRot(),
												_ent.getXRot());
								}
								if (entity instanceof GhastlyGeneralEntity) {
									((GhastlyGeneralEntity) entity).setAnimation("empty");
								}
							});
							break;
						}
					}
					FightsfrightsMod.queueServerWork(40, () -> {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")), SoundSource.HOSTILE, 1, 0);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")), SoundSource.HOSTILE, 1, 0, false);
							}
						}
					});
				} else {
					if ((entity instanceof MaliciousMonarchP1Entity _datEntI ? _datEntI.getEntityData().get(MaliciousMonarchP1Entity.DATA_SummonCooldown) : 0) >= 135 && Math
							.sqrt(Math.pow(entity.getX() - (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX(), 2) + Math.pow(entity.getY() - (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY(), 2)
									+ Math.pow(entity.getZ() - (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ(), 2)) <= 25) {
						if (entity instanceof MaliciousMonarchP1Entity _datEntSetI)
							_datEntSetI.getEntityData().set(MaliciousMonarchP1Entity.DATA_ShootCooldown, 0);
						if (entity instanceof MaliciousMonarchP1Entity _datEntSetI)
							_datEntSetI.getEntityData().set(MaliciousMonarchP1Entity.DATA_SummonCooldown, 0);
						if (entity instanceof MaliciousMonarchP1Entity _datEntSetI)
							_datEntSetI.getEntityData().set(MaliciousMonarchP1Entity.DATA_Minion, 0);
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(60 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
							for (Entity entityiterator : _entfound) {
								if (entityiterator instanceof Pillager || entityiterator instanceof Vindicator || entityiterator instanceof Evoker || entityiterator instanceof Ravager) {
									if (entity instanceof MaliciousMonarchP1Entity _datEntSetI)
										_datEntSetI.getEntityData().set(MaliciousMonarchP1Entity.DATA_Minion, (int) ((entity instanceof MaliciousMonarchP1Entity _datEntI ? _datEntI.getEntityData().get(MaliciousMonarchP1Entity.DATA_Minion) : 0) + 1));
								}
							}
						}
						if (!((entity instanceof MaliciousMonarchP1Entity _datEntI ? _datEntI.getEntityData().get(MaliciousMonarchP1Entity.DATA_Minion) : 0) >= 15)) {
							if (entity instanceof ImperialIllagerP1Entity) {
								((ImperialIllagerP1Entity) entity).setAnimation("Summon");
							}
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fightsfrights:ominous_summoning")), SoundSource.HOSTILE, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fightsfrights:ominous_summoning")), SoundSource.HOSTILE, 1, 1, false);
								}
							}
							FightsfrightsMod.queueServerWork(20, () -> {
								if (world instanceof ServerLevel _level)
									_level.sendParticles((SimpleParticleType) (FightsfrightsModParticleTypes.OMINOUS_SOUL.get()), (entity.getX()), (entity.getY() + 1.2), (entity.getZ()), 20, 0.1, 0.1, 0.1, 0.05);
								if (world instanceof ServerLevel _level) {
									Entity entityToSpawn = EntityType.PILLAGER.spawn(_level, BlockPos.containing(entity.getX() + 5, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) + 1, entity.getZ()),
											MobSpawnType.MOB_SUMMONED);
									if (entityToSpawn != null) {
										entityToSpawn.setDeltaMovement(0, 0, 0);
									}
								}
								if (world instanceof ServerLevel _level)
									_level.sendParticles((SimpleParticleType) (FightsfrightsModParticleTypes.OMINOUS_SOUL.get()), (entity.getX() + 5), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) + 1),
											(entity.getZ()), 10, 0.1, 0.1, 0.1, 0.05);
								if (world instanceof ServerLevel _level)
									_level.sendParticles(ParticleTypes.CAMPFIRE_COSY_SMOKE, (entity.getX() + 5), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) + 1), (entity.getZ()), 10, 0.1, 0.1, 0.1, 0.05);
								if (world instanceof ServerLevel _level) {
									Entity entityToSpawn = EntityType.PILLAGER.spawn(_level, BlockPos.containing(entity.getX() - 5, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) + 1, entity.getZ()),
											MobSpawnType.MOB_SUMMONED);
									if (entityToSpawn != null) {
										entityToSpawn.setDeltaMovement(0, 0, 0);
									}
								}
								if (world instanceof ServerLevel _level)
									_level.sendParticles((SimpleParticleType) (FightsfrightsModParticleTypes.OMINOUS_SOUL.get()), (entity.getX() - 5), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) + 1),
											(entity.getZ()), 10, 0.1, 0.1, 0.1, 0.05);
								if (world instanceof ServerLevel _level)
									_level.sendParticles(ParticleTypes.CAMPFIRE_COSY_SMOKE, (entity.getX() - 5), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) + 1), (entity.getZ()), 10, 0.1, 0.1, 0.1, 0.05);
								if (world instanceof ServerLevel _level) {
									Entity entityToSpawn = EntityType.VINDICATOR.spawn(_level, BlockPos.containing(entity.getX(), world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) + 1, entity.getZ() + 5),
											MobSpawnType.MOB_SUMMONED);
									if (entityToSpawn != null) {
										entityToSpawn.setDeltaMovement(0, 0, 0);
									}
								}
								if (world instanceof ServerLevel _level)
									_level.sendParticles((SimpleParticleType) (FightsfrightsModParticleTypes.OMINOUS_SOUL.get()), (entity.getX()), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) + 1),
											(entity.getZ() + 5), 10, 0.1, 0.1, 0.1, 0.05);
								if (world instanceof ServerLevel _level)
									_level.sendParticles(ParticleTypes.CAMPFIRE_COSY_SMOKE, (entity.getX()), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) + 1), (entity.getZ() + 5), 10, 0.1, 0.1, 0.1, 0.05);
								if (Mth.nextInt(RandomSource.create(), 1, 2) == 1) {
									if (world instanceof ServerLevel _level) {
										Entity entityToSpawn = EntityType.RAVAGER.spawn(_level, BlockPos.containing(entity.getX(), world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) + 1, entity.getZ() - 5),
												MobSpawnType.MOB_SUMMONED);
										if (entityToSpawn != null) {
											entityToSpawn.setDeltaMovement(0, 0, 0);
										}
									}
									if (world instanceof ServerLevel _level)
										_level.sendParticles((SimpleParticleType) (FightsfrightsModParticleTypes.OMINOUS_SOUL.get()), (entity.getX()), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) + 1),
												(entity.getZ() - 5), 10, 0.1, 0.1, 0.1, 0.05);
									if (world instanceof ServerLevel _level)
										_level.sendParticles(ParticleTypes.CAMPFIRE_COSY_SMOKE, (entity.getX()), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) + 1), (entity.getZ() - 5), 10, 0.1, 0.1, 0.1, 0.05);
								} else {
									if (world instanceof ServerLevel _level)
										_level.getServer().getCommands().performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, new Vec3((entity.getX()), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) + 1), (entity.getZ() - 5)), Vec2.ZERO, _level, 4, "",
														Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
												"summon minecraft:evoker ~ ~ ~ {DeathLootTable:\"minecraft:empty\",HandItems:[{},{id:\"minecraft:totem_of_undying\",Count:1b}],HandDropChances:[0.0f,0.0f]}");
									if (world instanceof ServerLevel _level)
										_level.sendParticles((SimpleParticleType) (FightsfrightsModParticleTypes.OMINOUS_SOUL.get()), (entity.getX()), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) + 1),
												(entity.getZ() - 5), 10, 0.1, 0.1, 0.1, 0.05);
								}
							});
						}
					} else {
						if ((entity instanceof MaliciousMonarchP1Entity _datEntI ? _datEntI.getEntityData().get(MaliciousMonarchP1Entity.DATA_ShootCooldown) : 0) >= 70) {
							if (entity instanceof MaliciousMonarchP1Entity _datEntSetI)
								_datEntSetI.getEntityData().set(MaliciousMonarchP1Entity.DATA_ShootCooldown, 0);
							if (entity instanceof MaliciousMonarchP1Entity) {
								((MaliciousMonarchP1Entity) entity).setAnimation("Shoot");
							}
							FightsfrightsMod.queueServerWork(8, () -> {
								if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null) && entity.isAlive() && (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).isAlive()) {
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fightsfrights:ominousgem")), SoundSource.HOSTILE, 1, 2);
										} else {
											_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fightsfrights:ominousgem")), SoundSource.HOSTILE, 1, 2, false);
										}
									}
									entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX()),
											((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY() + 1), ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ())));
									{
										Entity _shootFrom = entity;
										Level projectileLevel = _shootFrom.level();
										if (!projectileLevel.isClientSide()) {
											Projectile _entityToSpawn = new Object() {
												public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
													AbstractArrow entityToSpawn = new IIproyectileEntity(FightsfrightsModEntities.I_IPROYECTILE.get(), level);
													entityToSpawn.setOwner(shooter);
													entityToSpawn.setBaseDamage(damage);
													entityToSpawn.setKnockback(knockback);
													entityToSpawn.setSilent(true);
													return entityToSpawn;
												}
											}.getArrow(projectileLevel, entity, 10, 1);
											_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
											_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, (float) 2.5, 0);
											projectileLevel.addFreshEntity(_entityToSpawn);
										}
									}
								}
							});
						}
					}
				}
			}
		}
	}
}
