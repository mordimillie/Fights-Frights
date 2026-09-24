package net.mcreator.fightsfrights.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
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
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.fightsfrights.init.FightsfrightsModParticleTypes;
import net.mcreator.fightsfrights.init.FightsfrightsModMobEffects;
import net.mcreator.fightsfrights.entity.PiglinProsecutorEntity;
import net.mcreator.fightsfrights.FightsfrightsMod;

import java.util.Map;
import java.util.List;
import java.util.Comparator;

public class PPtickProcedure {
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
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) <= 250 && (entity instanceof PiglinProsecutorEntity _datEntL10 && _datEntL10.getEntityData().get(PiglinProsecutorEntity.DATA_HalfHealth)) == false) {
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
							if ((entity instanceof PiglinProsecutorEntity _datEntL175 && _datEntL175.getEntityData().get(PiglinProsecutorEntity.DATA_HalfHealth)) == true) {
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
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.HOSTILE, 1, (float) 0.8);
										} else {
											_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.HOSTILE, 1, (float) 0.8, false);
										}
									}
									if (world instanceof ServerLevel _level)
										_level.sendParticles((SimpleParticleType) (FightsfrightsModParticleTypes.OMINOUS_SOUL.get()), x, (entity.getY() + 1), z, 50, 0, 0, 0, 0.1);
									if (world instanceof ServerLevel _level)
										_level.sendParticles(ParticleTypes.CAMPFIRE_COSY_SMOKE, x, (entity.getY() + 1), z, 100, 0, 0, 0, 1);
									if (world instanceof ServerLevel _level)
										_level.sendParticles(ParticleTypes.EXPLOSION_EMITTER, x, (entity.getY() + 1), z, 3, 0.7, 0.7, 0.7, 0.1);
									{
										final Vec3 _center = new Vec3(x, y, z);
										List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
												.toList();
										for (Entity entityiterator : _entfound) {
											if (!(entityiterator instanceof Piglin || entityiterator instanceof ZombifiedPiglin || entityiterator instanceof Blaze || entityiterator instanceof PiglinProsecutorEntity
													|| entityiterator instanceof PiglinBrute)) {
												entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.EXPLOSION)), Mth.nextInt(RandomSource.create(), 16, 25));
												entityiterator.setSecondsOnFire(Mth.nextInt(RandomSource.create(), 2, 5));
												entityiterator.push(1, 0, 0);
											}
										}
									}
								});
							} else {
								FightsfrightsMod.queueServerWork(1, () -> {
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.HOSTILE, 1, (float) 0.8);
										} else {
											_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.HOSTILE, 1, (float) 0.8, false);
										}
									}
									if (world instanceof ServerLevel _level)
										_level.sendParticles((SimpleParticleType) (FightsfrightsModParticleTypes.OMINOUS_SOUL.get()), x, (entity.getY() + 1), z, 50, 0, 0, 0, 0.1);
									if (world instanceof ServerLevel _level)
										_level.sendParticles(ParticleTypes.CAMPFIRE_COSY_SMOKE, x, (entity.getY() + 1), z, 100, 0, 0, 0, 0.1);
									if (world instanceof ServerLevel _level)
										_level.sendParticles(ParticleTypes.EXPLOSION_EMITTER, x, (entity.getY() + 1), z, 3, 0.7, 0.7, 0.7, 0.1);
									{
										final Vec3 _center = new Vec3(x, y, z);
										List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(7 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
												.toList();
										for (Entity entityiterator : _entfound) {
											if (!(entityiterator instanceof Piglin || entityiterator instanceof ZombifiedPiglin || entityiterator instanceof Blaze || entityiterator instanceof PiglinProsecutorEntity
													|| entityiterator instanceof PiglinBrute)) {
												entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.EXPLOSION)), Mth.nextInt(RandomSource.create(), 16, 25));
												entityiterator.setSecondsOnFire(Mth.nextInt(RandomSource.create(), 2, 5));
												entityiterator.push(1, 0, 0);
											}
										}
									}
								});
							}
						});
					}
				}
			}
		}
	}
}
