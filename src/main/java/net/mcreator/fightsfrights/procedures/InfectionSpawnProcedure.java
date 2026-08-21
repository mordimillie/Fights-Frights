package net.mcreator.fightsfrights.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.fightsfrights.init.FightsfrightsModMobEffects;
import net.mcreator.fightsfrights.init.FightsfrightsModGameRules;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class InfectionSpawnProcedure {
	@SubscribeEvent
	public static void onEntitySpawned(EntityJoinLevelEvent event) {
		execute(event, event.getLevel(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world.getLevelData().getGameRules().getBoolean(FightsfrightsModGameRules.DO_INFECTION) == true) {
			if (entity instanceof LivingEntity _livEnt1 && _livEnt1.getMobType() == MobType.UNDEAD && 1 == Mth.nextInt(RandomSource.create(), 1, 200)) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(FightsfrightsModMobEffects.ASYMPTOMATIC.get(), -1, 0, false, true));
			}
		}
	}
}
