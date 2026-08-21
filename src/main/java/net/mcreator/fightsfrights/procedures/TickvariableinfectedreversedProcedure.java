package net.mcreator.fightsfrights.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.fightsfrights.network.FightsfrightsModVariables;
import net.mcreator.fightsfrights.init.FightsfrightsModMobEffects;
import net.mcreator.fightsfrights.init.FightsfrightsModGameRules;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class TickvariableinfectedreversedProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player);
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world.getLevelData().getGameRules().getBoolean(FightsfrightsModGameRules.DO_INFECTION) == true) {
			if ((entity.getCapability(FightsfrightsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FightsfrightsModVariables.PlayerVariables())).Infected == false && entity instanceof LivingEntity _livEnt1
					&& _livEnt1.hasEffect(FightsfrightsModMobEffects.INFECTED.get())) {
				{
					boolean _setval = false;
					entity.getCapability(FightsfrightsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Infected = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
