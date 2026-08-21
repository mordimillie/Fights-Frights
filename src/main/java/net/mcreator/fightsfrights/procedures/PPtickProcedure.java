package net.mcreator.fightsfrights.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.monster.piglin.PiglinBrute;
import net.minecraft.world.entity.monster.piglin.Piglin;
import net.minecraft.world.entity.monster.ZombifiedPiglin;
import net.minecraft.world.entity.monster.Blaze;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.fightsfrights.init.FightsfrightsModParticleTypes;
import net.mcreator.fightsfrights.init.FightsfrightsModMobEffects;
import net.mcreator.fightsfrights.entity.PiglinProsecutorEntity;
import net.mcreator.fightsfrights.FightsfrightsMod;

import java.util.List;
import java.util.Comparator;

public class PPtickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) <= 250 && (entity instanceof PiglinProsecutorEntity _datEntL1 && _datEntL1.getEntityData().get(PiglinProsecutorEntity.DATA_HalfHealth)) == false) {
			if (entity instanceof PiglinProsecutorEntity _datEntSetL)
				_datEntSetL.getEntityData().set(PiglinProsecutorEntity.DATA_HalfHealth, true);
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(FightsfrightsModMobEffects.MAD.get(), -1, 0, false, true));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, -1, 3, false, true));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 116, 255, false, false));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 116, 2, false, true));
			if (entity instanceof PiglinProsecutorEntity) {
				((PiglinProsecutorEntity) entity).setAnimation("Summon");
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fightsfrights:ominous_summoning")), SoundSource.HOSTILE, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fightsfrights:ominous_summoning")), SoundSource.HOSTILE, 1, 1, false);
				}
			}
			FightsfrightsMod.queueServerWork(56, () -> {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fightsfrights:evillaugh")), SoundSource.HOSTILE, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fightsfrights:evillaugh")), SoundSource.HOSTILE, 1, 1, false);
					}
				}
				if (entity instanceof PiglinProsecutorEntity animatable)
					animatable.setTexture("piglin_prosecutor_ominous");
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(20 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (entityiterator instanceof Blaze) {
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 5, false, true));
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(FightsfrightsModMobEffects.MAD.get(), -1, 0, false, true));
						}
					}
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (FightsfrightsModParticleTypes.OMINOUS_SOUL.get()), (entity.getX()), (entity.getY() + 2.2), (entity.getZ()), 20, 0.1, 0.1, 0.1, 0.05);
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.BLAZE.spawn(_level, BlockPos.containing(entity.getX() + 3, entity.getY() + 2.2, entity.getZ()), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 1, 0);
					}
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (FightsfrightsModParticleTypes.OMINOUS_SOUL.get()), (entity.getX() + 3), (entity.getY() + 2.2), (entity.getZ()), 10, 0.1, 0.1, 0.1, 0.05);
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.CAMPFIRE_COSY_SMOKE, (entity.getX() + 3), (entity.getY() + 2.2), (entity.getZ()), 10, 0.1, 0.1, 0.1, 0.05);
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.BLAZE.spawn(_level, BlockPos.containing(entity.getX() - 3, entity.getY() + 2.2, entity.getZ()), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 1, 0);
					}
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (FightsfrightsModParticleTypes.OMINOUS_SOUL.get()), (entity.getX() - 3), (entity.getY() + 2.2), (entity.getZ()), 10, 0.1, 0.1, 0.1, 0.05);
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.CAMPFIRE_COSY_SMOKE, (entity.getX() - 3), (entity.getY() + 2.2), (entity.getZ()), 10, 0.1, 0.1, 0.1, 0.05);
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.BLAZE.spawn(_level, BlockPos.containing(entity.getX(), entity.getY() + 2.2, entity.getZ() + 3), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 1, 0);
					}
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (FightsfrightsModParticleTypes.OMINOUS_SOUL.get()), (entity.getX()), (entity.getY() + 2.2), (entity.getZ() + 3), 10, 0.1, 0.1, 0.1, 0.05);
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.CAMPFIRE_COSY_SMOKE, (entity.getX()), (entity.getY() + 2.2), (entity.getZ() + 3), 10, 0.1, 0.1, 0.1, 0.05);
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.BLAZE.spawn(_level, BlockPos.containing(entity.getX(), entity.getY() + 2.2, entity.getZ() - 3), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 1, 0);
					}
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (FightsfrightsModParticleTypes.OMINOUS_SOUL.get()), (entity.getX()), (entity.getY() + 2.2), (entity.getZ() - 3), 10, 0.1, 0.1, 0.1, 0.05);
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.CAMPFIRE_COSY_SMOKE, (entity.getX()), (entity.getY() + 2.2), (entity.getZ() - 3), 10, 0.1, 0.1, 0.1, 0.05);
			});
		} else {
			if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null) && entity.isAlive() && (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).isAlive()) {
				if (entity instanceof PiglinProsecutorEntity _datEntSetI)
					_datEntSetI.getEntityData().set(PiglinProsecutorEntity.DATA_SummonCooldown, (int) ((entity instanceof PiglinProsecutorEntity _datEntI ? _datEntI.getEntityData().get(PiglinProsecutorEntity.DATA_SummonCooldown) : 0) + 1));
				if (entity instanceof PiglinProsecutorEntity _datEntSetI)
					_datEntSetI.getEntityData().set(PiglinProsecutorEntity.DATA_SlamCooldown, (int) ((entity instanceof PiglinProsecutorEntity _datEntI ? _datEntI.getEntityData().get(PiglinProsecutorEntity.DATA_SlamCooldown) : 0) + 1));
				if ((entity instanceof PiglinProsecutorEntity _datEntI ? _datEntI.getEntityData().get(PiglinProsecutorEntity.DATA_SummonCooldown) : 0) >= 525
						&& Math.sqrt(Math.pow(entity.getX() - (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX(), 2) + Math.pow(entity.getY() - (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY(), 2)
								+ Math.pow(entity.getZ() - (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ(), 2)) <= 25) {
					if (entity instanceof PiglinProsecutorEntity _datEntSetI)
						_datEntSetI.getEntityData().set(PiglinProsecutorEntity.DATA_SlamCooldown, 0);
					if (entity instanceof PiglinProsecutorEntity _datEntSetI)
						_datEntSetI.getEntityData().set(PiglinProsecutorEntity.DATA_SummonCooldown, 0);
					if (entity instanceof PiglinProsecutorEntity _datEntSetI)
						_datEntSetI.getEntityData().set(PiglinProsecutorEntity.DATA_Minion, 0);
					{
						final Vec3 _center = new Vec3(x, y, z);
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(40 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
						for (Entity entityiterator : _entfound) {
							if (entityiterator instanceof Piglin || entityiterator instanceof PiglinBrute) {
								if (entity instanceof PiglinProsecutorEntity _datEntSetI)
									_datEntSetI.getEntityData().set(PiglinProsecutorEntity.DATA_Minion, (int) ((entity instanceof PiglinProsecutorEntity _datEntI ? _datEntI.getEntityData().get(PiglinProsecutorEntity.DATA_Minion) : 0) + 1));
							}
						}
					}
					if (!((entity instanceof PiglinProsecutorEntity _datEntI ? _datEntI.getEntityData().get(PiglinProsecutorEntity.DATA_Minion) : 0) >= 12)) {
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 116, 1, false, true));
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 116, 255, false, false));
						if (entity instanceof PiglinProsecutorEntity) {
							((PiglinProsecutorEntity) entity).setAnimation("Summon");
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fightsfrights:ominous_summoning")), SoundSource.HOSTILE, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fightsfrights:ominous_summoning")), SoundSource.HOSTILE, 1, 1, false);
							}
						}
						FightsfrightsMod.queueServerWork(56, () -> {
							if (world instanceof ServerLevel _level)
								_level.sendParticles((SimpleParticleType) (FightsfrightsModParticleTypes.OMINOUS_SOUL.get()), (entity.getX()), (entity.getY() + 2.2), (entity.getZ()), 20, 0.1, 0.1, 0.1, 0.05);
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = EntityType.PIGLIN_BRUTE.spawn(_level, BlockPos.containing(entity.getX() + 3, entity.getY() + 2.2, entity.getZ()), MobSpawnType.MOB_SUMMONED);
								if (entityToSpawn != null) {
									entityToSpawn.setDeltaMovement(0, 0, 0);
								}
							}
							if (world instanceof ServerLevel _level)
								_level.sendParticles((SimpleParticleType) (FightsfrightsModParticleTypes.OMINOUS_SOUL.get()), (entity.getX() + 3), (entity.getY() + 2.2), (entity.getZ()), 10, 0.1, 0.1, 0.1, 0.05);
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.CAMPFIRE_COSY_SMOKE, (entity.getX() + 3), (entity.getY() + 2.2), (entity.getZ()), 10, 0.1, 0.1, 0.1, 0.05);
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = EntityType.PIGLIN_BRUTE.spawn(_level, BlockPos.containing(entity.getX() - 3, entity.getY() + 2.2, entity.getZ()), MobSpawnType.MOB_SUMMONED);
								if (entityToSpawn != null) {
									entityToSpawn.setDeltaMovement(0, 0, 0);
								}
							}
							if (world instanceof ServerLevel _level)
								_level.sendParticles((SimpleParticleType) (FightsfrightsModParticleTypes.OMINOUS_SOUL.get()), (entity.getX() - 3), (entity.getY() + 2.2), (entity.getZ()), 10, 0.1, 0.1, 0.1, 0.05);
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.CAMPFIRE_COSY_SMOKE, (entity.getX() - 3), (entity.getY() + 2.2), (entity.getZ()), 10, 0.1, 0.1, 0.1, 0.05);
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = EntityType.PIGLIN.spawn(_level, BlockPos.containing(entity.getX(), entity.getY() + 2.2, entity.getZ() + 3), MobSpawnType.MOB_SUMMONED);
								if (entityToSpawn != null) {
									entityToSpawn.setDeltaMovement(0, 0, 0);
								}
							}
							if (world instanceof ServerLevel _level)
								_level.sendParticles((SimpleParticleType) (FightsfrightsModParticleTypes.OMINOUS_SOUL.get()), (entity.getX()), (entity.getY() + 2.2), (entity.getZ() + 3), 10, 0.1, 0.1, 0.1, 0.05);
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.CAMPFIRE_COSY_SMOKE, (entity.getX()), (entity.getY() + 2.2), (entity.getZ() + 3), 10, 0.1, 0.1, 0.1, 0.05);
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = EntityType.PIGLIN.spawn(_level, BlockPos.containing(entity.getX(), entity.getY() + 2.2, entity.getZ() - 3), MobSpawnType.MOB_SUMMONED);
								if (entityToSpawn != null) {
									entityToSpawn.setDeltaMovement(0, 0, 0);
								}
							}
							if (world instanceof ServerLevel _level)
								_level.sendParticles((SimpleParticleType) (FightsfrightsModParticleTypes.OMINOUS_SOUL.get()), (entity.getX()), (entity.getY() + 2.2), (entity.getZ() - 3), 10, 0.1, 0.1, 0.1, 0.05);
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.CAMPFIRE_COSY_SMOKE, (entity.getX()), (entity.getY() + 2.2), (entity.getZ() - 3), 10, 0.1, 0.1, 0.1, 0.05);
						});
					}
				} else {
					if ((entity instanceof PiglinProsecutorEntity _datEntI ? _datEntI.getEntityData().get(PiglinProsecutorEntity.DATA_SlamCooldown) : 0) >= 200 && Math
							.sqrt(Math.pow(entity.getX() - (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX(), 2) + Math.pow(entity.getY() - (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY(), 2)
									+ Math.pow(entity.getZ() - (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ(), 2)) <= 15) {
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 80, 255, false, false));
						if (entity instanceof PiglinProsecutorEntity _datEntSetI)
							_datEntSetI.getEntityData().set(PiglinProsecutorEntity.DATA_SlamCooldown, 0);
						if (entity instanceof PiglinProsecutorEntity) {
							((PiglinProsecutorEntity) entity).setAnimation("Slam");
						}
						FightsfrightsMod.queueServerWork(25, () -> {
							if ((entity instanceof PiglinProsecutorEntity _datEntL166 && _datEntL166.getEntityData().get(PiglinProsecutorEntity.DATA_HalfHealth)) == true) {
								{
									final Vec3 _center = new Vec3(x, y, z);
									List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(20 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
											.toList();
									for (Entity entityiterator : _entfound) {
										if (entityiterator instanceof Piglin || entityiterator instanceof PiglinBrute || entityiterator instanceof Blaze || entityiterator instanceof ZombifiedPiglin) {
											if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
												_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 5, false, true));
											if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
												_entity.addEffect(new MobEffectInstance(FightsfrightsModMobEffects.MAD.get(), 100, 0, false, true));
										}
									}
								}
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
											"fill ~2 ~-1 ~2 ~-2 ~-1 ~-2 fightsfrights:fissured_netherrack");
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
											"fill ~1 ~-1 ~3 ~-1 ~-1 ~-3 fightsfrights:fissured_netherrack");
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
											"fill ~3 ~-1 ~1 ~-3 ~-1 ~-1 fightsfrights:fissured_netherrack");
								FightsfrightsMod.queueServerWork(1, () -> {
									if (world instanceof Level _level && !_level.isClientSide())
										_level.explode(null, x, (y + 2), z, 5, Level.ExplosionInteraction.MOB);
									if (world instanceof ServerLevel _level)
										_level.sendParticles((SimpleParticleType) (FightsfrightsModParticleTypes.OMINOUS_SOUL.get()), x, (entity.getY() + 1), z, 150, 0, 0, 0, 0.1);
									if (world instanceof ServerLevel _level)
										_level.sendParticles(ParticleTypes.CAMPFIRE_COSY_SMOKE, x, (entity.getY() + 1), z, 250, 0, 0, 0, 0.8);
								});
							} else {
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
											"fill ~3 ~-1 ~1 ~-3 ~-1 ~-1 fightsfrights:fissured_netherrack");
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
											"fill ~1 ~-1 ~3 ~-1 ~-1 ~-3 fightsfrights:fissured_netherrack");
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
											"fill ~2 ~-1 ~2 ~-2 ~-1 ~-2 fightsfrights:fissured_netherrack");
								FightsfrightsMod.queueServerWork(1, () -> {
									if (world instanceof Level _level && !_level.isClientSide())
										_level.explode(null, x, (y + 2), z, 3, Level.ExplosionInteraction.MOB);
									if (world instanceof ServerLevel _level)
										_level.sendParticles((SimpleParticleType) (FightsfrightsModParticleTypes.OMINOUS_SOUL.get()), x, (entity.getY() + 1), z, 100, 0, 0, 0, 0.1);
									if (world instanceof ServerLevel _level)
										_level.sendParticles(ParticleTypes.CAMPFIRE_COSY_SMOKE, x, (entity.getY() + 1), z, 200, 0, 0, 0, 0.8);
								});
							}
						});
					}
				}
			}
		}
	}
}
