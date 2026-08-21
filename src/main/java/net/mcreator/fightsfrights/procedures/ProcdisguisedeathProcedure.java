package net.mcreator.fightsfrights.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.fightsfrights.init.FightsfrightsModEntities;
import net.mcreator.fightsfrights.entity.MimicTerrantulaEntity;
import net.mcreator.fightsfrights.entity.MimicSeerEntity;
import net.mcreator.fightsfrights.entity.MimicScowlEntity;
import net.mcreator.fightsfrights.entity.MimicPioneerEntity;
import net.mcreator.fightsfrights.entity.MimicPatutiEntity;
import net.mcreator.fightsfrights.entity.MimicGrimmsquitoEntity;
import net.mcreator.fightsfrights.entity.MimicBanshaaEntity;
import net.mcreator.fightsfrights.entity.MimicAllmanEntity;
import net.mcreator.fightsfrights.entity.MimentisEntity;

import java.util.Comparator;

public class ProcdisguisedeathProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.CAMPFIRE_COSY_SMOKE, x, y, z, 10, 0.125, 0.25, 0.125, 0.04);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.CLOUD, x, y, z, 60, 0.125, 0.25, 0.125, 0.04);
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = FightsfrightsModEntities.MIMENTIS.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
			if (entityToSpawn != null) {
				entityToSpawn.setDeltaMovement(0, 0, 0);
			}
		}
		if ((((Entity) world.getEntitiesOfClass(MimicScowlEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
			Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
				return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
			}
		}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof MimicScowlEntity _datEntI ? _datEntI.getEntityData().get(MimicScowlEntity.DATA_HP) : 0) > 0) {
			if (((Entity) world.getEntitiesOfClass(MimentisEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
					return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
				}
			}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof LivingEntity _entity)
				_entity.setHealth((float) (((Entity) world.getEntitiesOfClass(MimicScowlEntity.class, AABB.ofSize(new Vec3(x, y, z), 2, 2, 2), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof MimicScowlEntity _datEntI ? _datEntI.getEntityData().get(MimicScowlEntity.DATA_HP) : 0));
		} else {
			if ((((Entity) world.getEntitiesOfClass(MimicPioneerEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
					return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
				}
			}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof MimicPioneerEntity _datEntI ? _datEntI.getEntityData().get(MimicPioneerEntity.DATA_HP) : 0) > 0) {
				if (((Entity) world.getEntitiesOfClass(MimentisEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof LivingEntity _entity)
					_entity.setHealth((float) (((Entity) world.getEntitiesOfClass(MimicPioneerEntity.class, AABB.ofSize(new Vec3(x, y, z), 2, 2, 2), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof MimicPioneerEntity _datEntI ? _datEntI.getEntityData().get(MimicPioneerEntity.DATA_HP) : 0));
			} else {
				if ((((Entity) world.getEntitiesOfClass(MimicTerrantulaEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof MimicTerrantulaEntity _datEntI ? _datEntI.getEntityData().get(MimicTerrantulaEntity.DATA_HP) : 0) > 0) {
					if (((Entity) world.getEntitiesOfClass(MimentisEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof LivingEntity _entity)
						_entity.setHealth((float) (((Entity) world.getEntitiesOfClass(MimicTerrantulaEntity.class, AABB.ofSize(new Vec3(x, y, z), 2, 2, 2), e -> true).stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof MimicTerrantulaEntity _datEntI ? _datEntI.getEntityData().get(MimicTerrantulaEntity.DATA_HP) : 0));
				} else {
					if ((((Entity) world.getEntitiesOfClass(MimicAllmanEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof MimicAllmanEntity _datEntI ? _datEntI.getEntityData().get(MimicAllmanEntity.DATA_HP) : 0) > 0) {
						if (((Entity) world.getEntitiesOfClass(MimentisEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof LivingEntity _entity)
							_entity.setHealth((float) (((Entity) world.getEntitiesOfClass(MimicAllmanEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof MimicAllmanEntity _datEntI ? _datEntI.getEntityData().get(MimicAllmanEntity.DATA_HP) : 0));
					} else {
						if ((((Entity) world.getEntitiesOfClass(MimicPatutiEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof MimicPatutiEntity _datEntI ? _datEntI.getEntityData().get(MimicPatutiEntity.DATA_HP) : 0) > 0) {
							if (((Entity) world.getEntitiesOfClass(MimentisEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof LivingEntity _entity)
								_entity.setHealth((float) (((Entity) world.getEntitiesOfClass(MimicPatutiEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
									}
								}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof MimicPatutiEntity _datEntI ? _datEntI.getEntityData().get(MimicPatutiEntity.DATA_HP) : 0));
						} else {
							if ((((Entity) world.getEntitiesOfClass(MimicSeerEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof MimicSeerEntity _datEntI ? _datEntI.getEntityData().get(MimicSeerEntity.DATA_HP) : 0) > 0) {
								if (((Entity) world.getEntitiesOfClass(MimentisEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
									}
								}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof LivingEntity _entity)
									_entity.setHealth((float) (((Entity) world.getEntitiesOfClass(MimicSeerEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
										Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
											return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
										}
									}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof MimicSeerEntity _datEntI ? _datEntI.getEntityData().get(MimicSeerEntity.DATA_HP) : 0));
							} else {
								if ((((Entity) world.getEntitiesOfClass(MimicGrimmsquitoEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
									}
								}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof MimicGrimmsquitoEntity _datEntI ? _datEntI.getEntityData().get(MimicGrimmsquitoEntity.DATA_HP) : 0) > 0) {
									if (((Entity) world.getEntitiesOfClass(MimentisEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
										Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
											return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
										}
									}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof LivingEntity _entity)
										_entity.setHealth((float) (((Entity) world.getEntitiesOfClass(MimicGrimmsquitoEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
											Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
												return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
											}
										}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof MimicGrimmsquitoEntity _datEntI ? _datEntI.getEntityData().get(MimicGrimmsquitoEntity.DATA_HP) : 0));
								} else {
									if (((Entity) world.getEntitiesOfClass(MimentisEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
										Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
											return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
										}
									}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof LivingEntity _entity)
										_entity.setHealth((float) (((Entity) world.getEntitiesOfClass(MimicBanshaaEntity.class, AABB.ofSize(new Vec3(x, y, z), 2, 2, 2), e -> true).stream().sorted(new Object() {
											Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
												return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
											}
										}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof MimicBanshaaEntity _datEntI ? _datEntI.getEntityData().get(MimicBanshaaEntity.DATA_HP) : 0));
								}
							}
						}
					}
				}
			}
		}
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fightsfrights:mimentis_transform")), SoundSource.NEUTRAL, (float) 0.5, -1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fightsfrights:mimentis_transform")), SoundSource.NEUTRAL, (float) 0.5, -1, false);
			}
		}
		if (((Entity) world.getEntitiesOfClass(MimentisEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
			Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
				return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
			}
		}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof MimentisEntity _datEntSetL)
			_datEntSetL.getEntityData().set(MimentisEntity.DATA_is_roaming, true);
		if (((Entity) world.getEntitiesOfClass(MimentisEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
			Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
				return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
			}
		}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof MimentisEntity _datEntSetI)
			_datEntSetI.getEntityData().set(MimentisEntity.DATA_roam_timer, 140);
	}
}
