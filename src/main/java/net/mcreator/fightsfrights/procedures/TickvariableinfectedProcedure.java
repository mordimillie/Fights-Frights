package net.mcreator.fightsfrights.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.fightsfrights.network.FightsfrightsModVariables;
import net.mcreator.fightsfrights.init.FightsfrightsModMobEffects;
import net.mcreator.fightsfrights.init.FightsfrightsModGameRules;

import javax.annotation.Nullable;

@EventBusSubscriber
public class TickvariableinfectedProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity().level(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world.getLevelData().getGameRules().getBoolean(FightsfrightsModGameRules.DO_INFECTION) == true) {
			if (entity.getData(FightsfrightsModVariables.PLAYER_VARIABLES).Infected == true && !(entity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(FightsfrightsModMobEffects.INFECTED))) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(FightsfrightsModMobEffects.INFECTED, -1, 0, false, true));
			}
		}
	}
}
