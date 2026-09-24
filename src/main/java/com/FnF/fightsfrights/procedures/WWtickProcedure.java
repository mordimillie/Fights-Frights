package net.mcreator.fightsfrights.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameRules;
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
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.fightsfrights.init.FightsfrightsModParticleTypes;
import net.mcreator.fightsfrights.init.FightsfrightsModMobEffects;
import net.mcreator.fightsfrights.entity.WickeWarmongerEntity;
import net.mcreator.fightsfrights.entity.PiglinProsecutorEntity;
import net.mcreator.fightsfrights.FightsfrightsMod;

import java.util.Map;
import java.util.List;
import java.util.Comparator;

public class WWtickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world.getFluidState(BlockPos.containing(x, y - 1, z)).createLegacyBlock()).getBlock() == Blocks.LAVA || (world.getFluidState(BlockPos.containing(x, y - 1, z)).createLegacyBlock()).getBlock() == Blocks.LAVA) {
			{
				BlockPos _bp = BlockPos.containing(x, y - 1, z);
				BlockState _bs = Blocks.BLACKSTONE.defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
			{
				BlockPos _bp = BlockPos.containing(x, y - 1, z - 1);
				BlockState _bs = Blocks.BLACKSTONE.defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
			{
				BlockPos _bp = BlockPos.containing(x, y - 1, z + 1);
				BlockState _bs = Blocks.BLACKSTONE.defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
			{
				BlockPos _bp = BlockPos.containing(x - 1, y - 1, z);
				BlockState _bs = Blocks.BLACKSTONE.defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
			{
				BlockPos _bp = BlockPos.containing(x + 1, y - 1, z);
				BlockState _bs = Blocks.BLACKSTONE.defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) <= 500 && (entity instanceof WickeWarmongerEntity _datEntL10 && _datEntL10.getEntityData().get(WickeWarmongerEntity.DATA_HalfHealth)) == false) {
			if (entity instanceof WickeWarmongerEntity _datEntSetL)
				_datEntSetL.getEntityData().set(WickeWarmongerEntity.DATA_HalfHealth, true);
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(FightsfrightsModMobEffects.MAD.get(), -1, 0, false, true));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, -1, 5, false, true));
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
				if (entity instanceof WickeWarmongerEntity animatable)
					animatable.setTexture("piglin_prosecutor_ghostp2");
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
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.BLAZE.spawn(_level, BlockPos.containing(entity.getX(), entity.getY() + 2.2, entity.getZ() - 3), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 1, 0);
					}
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.BLAZE.spawn(_level, BlockPos.containing(entity.getX() + 3, entity.getY() + 2.2, entity.getZ()), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(1, 0, 0);
					}
				}
			});
		} else {
			if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null) && entity.isAlive() && (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).isAlive()) {
				if (entity instanceof WickeWarmongerEntity _datEntSetI)
					_datEntSetI.getEntityData().set(WickeWarmongerEntity.DATA_SummonCooldown, (int) ((entity instanceof WickeWarmongerEntity _datEntI ? _datEntI.getEntityData().get(WickeWarmongerEntity.DATA_SummonCooldown) : 0) + 1));
				if (entity instanceof WickeWarmongerEntity _datEntSetI)
					_datEntSetI.getEntityData().set(WickeWarmongerEntity.DATA_SlamCooldown, (int) ((entity instanceof WickeWarmongerEntity _datEntI ? _datEntI.getEntityData().get(WickeWarmongerEntity.DATA_SlamCooldown) : 0) + 1));
				if ((entity instanceof WickeWarmongerEntity _datEntI ? _datEntI.getEntityData().get(WickeWarmongerEntity.DATA_SummonCooldown) : 0) >= 275
						&& Math.sqrt(Math.pow(entity.getX() - (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX(), 2) + Math.pow(entity.getY() - (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY(), 2)
								+ Math.pow(entity.getZ() - (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ(), 2)) <= 25) {
					if (entity instanceof WickeWarmongerEntity _datEntSetI)
						_datEntSetI.getEntityData().set(WickeWarmongerEntity.DATA_SlamCooldown, 0);
					if (entity instanceof WickeWarmongerEntity _datEntSetI)
						_datEntSetI.getEntityData().set(WickeWarmongerEntity.DATA_SummonCooldown, 0);
					if (entity instanceof WickeWarmongerEntity _datEntSetI)
						_datEntSetI.getEntityData().set(WickeWarmongerEntity.DATA_Minion, 0);
					{
						final Vec3 _center = new Vec3(x, y, z);
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(40 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
						for (Entity entityiterator : _entfound) {
							if (entityiterator instanceof Blaze || entityiterator instanceof PiglinBrute) {
								if (entity instanceof WickeWarmongerEntity _datEntSetI)
									_datEntSetI.getEntityData().set(WickeWarmongerEntity.DATA_Minion, (int) ((entity instanceof WickeWarmongerEntity _datEntI ? _datEntI.getEntityData().get(WickeWarmongerEntity.DATA_Minion) : 0) + 1));
							}
						}
					}
					if (!((entity instanceof WickeWarmongerEntity _datEntI ? _datEntI.getEntityData().get(WickeWarmongerEntity.DATA_Minion) : 0) >= 20)) {
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 116, 4, false, true));
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
								Entity entityToSpawn = EntityType.BLAZE.spawn(_level, BlockPos.containing(entity.getX(), entity.getY() + 2.2, entity.getZ() + 3), MobSpawnType.MOB_SUMMONED);
								if (entityToSpawn != null) {
									entityToSpawn.setDeltaMovement(0, 0, 0);
								}
							}
							if (world instanceof ServerLevel _level)
								_level.sendParticles((SimpleParticleType) (FightsfrightsModParticleTypes.OMINOUS_SOUL.get()), (entity.getX()), (entity.getY() + 2.2), (entity.getZ() + 3), 10, 0.1, 0.1, 0.1, 0.05);
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.CAMPFIRE_COSY_SMOKE, (entity.getX()), (entity.getY() + 2.2), (entity.getZ() + 3), 10, 0.1, 0.1, 0.1, 0.05);
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = EntityType.PIGLIN_BRUTE.spawn(_level, BlockPos.containing(entity.getX(), entity.getY() + 2.2, entity.getZ() - 3), MobSpawnType.MOB_SUMMONED);
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
					if (world.getLevelData().getGameRules().getBoolean(GameRules.RULE_MOBGRIEFING) == true && (entity instanceof WickeWarmongerEntity _datEntI ? _datEntI.getEntityData().get(WickeWarmongerEntity.DATA_SlamCooldown) : 0) >= 85
							&& Math.sqrt(
									Math.pow(entity.getX() - (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX(), 2) + Math.pow(entity.getY() - (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY(), 2)
											+ Math.pow(entity.getZ() - (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ(), 2)) <= 15) {
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 80, 255, false, false));
						if (entity instanceof WickeWarmongerEntity _datEntSetI)
							_datEntSetI.getEntityData().set(WickeWarmongerEntity.DATA_SlamCooldown, 0);
						if (entity instanceof WickeWarmongerEntity) {
							((WickeWarmongerEntity) entity).setAnimation("Slam");
						}
						FightsfrightsMod.queueServerWork(25, () -> {
							if ((entity instanceof WickeWarmongerEntity _datEntL184 && _datEntL184.getEntityData().get(WickeWarmongerEntity.DATA_HalfHealth)) == true) {
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
								FightsfrightsMod.queueServerWork(1, () -> {
									if (world instanceof Level _level && !_level.isClientSide())
										_level.explode(null, x, (y + 2), z, 7, Level.ExplosionInteraction.MOB);
									if (world instanceof ServerLevel _level)
										_level.sendParticles((SimpleParticleType) (FightsfrightsModParticleTypes.OMINOUS_SOUL.get()), x, (entity.getY() + 1), z, 150, 0, 0, 0, 0.1);
									if (world instanceof ServerLevel _level)
										_level.sendParticles(ParticleTypes.CAMPFIRE_COSY_SMOKE, x, (entity.getY() + 1), z, 250, 0, 0, 0, 0.8);
								});
							} else {
								FightsfrightsMod.queueServerWork(1, () -> {
									if (world instanceof Level _level && !_level.isClientSide())
										_level.explode(null, x, (y + 2), z, 5, Level.ExplosionInteraction.MOB);
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
