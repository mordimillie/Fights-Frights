package net.mcreator.fightsfrights.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.AdvancementHolder;

import net.mcreator.fightsfrights.init.FightsfrightsModEntities;
import net.mcreator.fightsfrights.entity.MimicTerrantulaEntity;
import net.mcreator.fightsfrights.entity.MimicSeerEntity;
import net.mcreator.fightsfrights.entity.MimicScowlEntity;
import net.mcreator.fightsfrights.entity.MimicPioneerEntity;
import net.mcreator.fightsfrights.entity.MimicPatutiEntity;
import net.mcreator.fightsfrights.entity.MimicGrimmsquitoEntity;
import net.mcreator.fightsfrights.entity.MimicBanshaaEntity;
import net.mcreator.fightsfrights.entity.MimicAllmanEntity;

import java.util.Comparator;

public class ProcmimictransformProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double roll = 0;
		if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null)) {
			if (Math.sqrt(Math.pow(entity.getX() - (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX(), 2) + Math.pow(entity.getY() - (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY(), 2)
					+ Math.pow(entity.getZ() - (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ(), 2)) <= 8) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.CAMPFIRE_COSY_SMOKE, x, y, z, 10, 0.125, 0.25, 0.125, 0.04);
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.CLOUD, x, y, z, 60, 0.125, 0.25, 0.125, 0.04);
				roll = Mth.nextInt(RandomSource.create(), 1, 8);
				if (roll == 1) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = FightsfrightsModEntities.MIMIC_SCOWL.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
					if (((Entity) world.getEntitiesOfClass(MimicScowlEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof MimicScowlEntity _datEntSetI)
						_datEntSetI.getEntityData().set(MimicScowlEntity.DATA_HP, (int) (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1));
				}
				if (roll == 2) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = FightsfrightsModEntities.MIMIC_PIONEER.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
					if (((Entity) world.getEntitiesOfClass(MimicPioneerEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof MimicPioneerEntity _datEntSetI)
						_datEntSetI.getEntityData().set(MimicPioneerEntity.DATA_HP, (int) (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1));
				}
				if (roll == 3) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = FightsfrightsModEntities.MIMIC_TERRANTULA.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
					if (((Entity) world.getEntitiesOfClass(MimicTerrantulaEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof MimicTerrantulaEntity _datEntSetI)
						_datEntSetI.getEntityData().set(MimicTerrantulaEntity.DATA_HP, (int) (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1));
				}
				if (roll == 4) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = FightsfrightsModEntities.MIMIC_BANSHAA.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
					if (((Entity) world.getEntitiesOfClass(MimicBanshaaEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof MimicBanshaaEntity _datEntSetI)
						_datEntSetI.getEntityData().set(MimicBanshaaEntity.DATA_HP, (int) (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1));
				}
				if (roll == 5) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = FightsfrightsModEntities.MIMIC_ALLMAN.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
					if (((Entity) world.getEntitiesOfClass(MimicAllmanEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof MimicAllmanEntity _datEntSetI)
						_datEntSetI.getEntityData().set(MimicAllmanEntity.DATA_HP, (int) (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1));
				}
				if (roll == 6) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = FightsfrightsModEntities.MIMIC_PATUTI.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
					if (((Entity) world.getEntitiesOfClass(MimicPatutiEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof MimicPatutiEntity _datEntSetI)
						_datEntSetI.getEntityData().set(MimicPatutiEntity.DATA_HP, (int) (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1));
				}
				if (roll == 7) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = FightsfrightsModEntities.MIMIC_SEER.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
					if (((Entity) world.getEntitiesOfClass(MimicSeerEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof MimicSeerEntity _datEntSetI)
						_datEntSetI.getEntityData().set(MimicSeerEntity.DATA_HP, (int) (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1));
				}
				if (roll == 8) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = FightsfrightsModEntities.MIMIC_GRIMMSQUITO.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
					if (((Entity) world.getEntitiesOfClass(MimicGrimmsquitoEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof MimicGrimmsquitoEntity _datEntSetI)
						_datEntSetI.getEntityData().set(MimicGrimmsquitoEntity.DATA_HP, (int) (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1));
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("fightsfrights:mimentis_transform")), SoundSource.HOSTILE, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("fightsfrights:mimentis_transform")), SoundSource.HOSTILE, 1, 1, false);
					}
				}
				if (!entity.level().isClientSide())
					entity.discard();
				if (((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("fightsfrights:smoke_and_mirrors"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		}
	}
}
