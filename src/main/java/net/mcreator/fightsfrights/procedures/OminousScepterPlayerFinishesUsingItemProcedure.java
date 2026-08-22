package net.mcreator.fightsfrights.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.fightsfrights.init.FightsfrightsModMobEffects;
import net.mcreator.fightsfrights.init.FightsfrightsModItems;
import net.mcreator.fightsfrights.init.FightsfrightsModEntities;
import net.mcreator.fightsfrights.entity.EffigyEntity;
import net.mcreator.fightsfrights.FightsfrightsMod;

import java.util.List;
import java.util.Comparator;

public class OminousScepterPlayerFinishesUsingItemProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(FightsfrightsModItems.OMINOUS_SCEPTER.get(), 300);
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("fightsfrights:ominous_summoning")), SoundSource.NEUTRAL, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("fightsfrights:ominous_summoning")), SoundSource.NEUTRAL, 1, 1, false);
			}
		}
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.TOTEM_OF_UNDYING, x, (y + 1.5), z, 100, 0, 0, 0, 0.7);
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = FightsfrightsModEntities.EFFIGY.get().spawn(_level, BlockPos.containing(x, y + 1.5, z), MobSpawnType.MOB_SUMMONED);
			if (entityToSpawn != null) {
				entityToSpawn.setDeltaMovement(0.01, 0, 0.01);
			}
		}
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = FightsfrightsModEntities.EFFIGY.get().spawn(_level, BlockPos.containing(x, y + 1.5, z), MobSpawnType.MOB_SUMMONED);
			if (entityToSpawn != null) {
				entityToSpawn.setDeltaMovement((-0.01), 0, (-0.01));
			}
		}
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = FightsfrightsModEntities.EFFIGY.get().spawn(_level, BlockPos.containing(x, y + 1.5, z), MobSpawnType.MOB_SUMMONED);
			if (entityToSpawn != null) {
				entityToSpawn.setDeltaMovement((-0.01), 0, 0.01);
			}
		}
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				FightsfrightsMod.queueServerWork(1, () -> {
					if (entityiterator instanceof EffigyEntity) {
						if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(FightsfrightsModMobEffects.SUMMON_TIME, 600, 0, false, false));
					}
				});
			}
		}
	}
}
