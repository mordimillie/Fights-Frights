package net.mcreator.fightsfrights.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.fightsfrights.init.FightsfrightsModEntities;
import net.mcreator.fightsfrights.entity.ShadowEntity;

public class ShadowEntityIsHurtProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof ShadowEntity _datEntI ? _datEntI.getEntityData().get(ShadowEntity.DATA_summon) : 0) < 4 && 1 == Mth.nextInt(RandomSource.create(), 1, 3)) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = FightsfrightsModEntities.SHADOWCOMPANION.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
			if (entity instanceof ShadowEntity _datEntSetI)
				_datEntSetI.getEntityData().set(ShadowEntity.DATA_summon, (int) ((entity instanceof ShadowEntity _datEntI ? _datEntI.getEntityData().get(ShadowEntity.DATA_summon) : 0) + 1));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DARKNESS, 50, 0, false, false));
		}
	}
}
