package net.mcreator.duelsdread.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.duelsdread.init.DuelsdreadModEntities;

public class SpamdurOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double TpRadius = 0;
		double randomX = 0;
		double randomZ = 0;
		double scanY = 0;
		if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null)) {
			entity.getPersistentData().putDouble("SummonTimer", (entity.getPersistentData().getDouble("SummonTimer") + 1));
			if (120 + entity.getPersistentData().getDouble("SummonTimeGoal") < entity.getPersistentData().getDouble("SummonTimer")) {
				entity.getPersistentData().putDouble("SummonTimer", 0);
				entity.getPersistentData().putDouble("SummonTimeGoal", (Mth.nextInt(RandomSource.create(), 0, 80)));
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = DuelsdreadModEntities.BLOODSPAMDUR.get().spawn(_level, BlockPos.containing(x + 0.5, y + 2.5, z + 0.5), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 0, 0);
					}
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.REVERSE_PORTAL, x, (y + 2.5), z, 30, 0.15, 0.25, 0.15, 0.07);
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.END_ROD, x, (y + 2.5), z, 30, 0.15, 0.25, 0.15, 0.07);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")), SoundSource.HOSTILE, 1, 0);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")), SoundSource.HOSTILE, 1, 0, false);
					}
				}
			}
		}
	}
}
