
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fightsfrights.init;

import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.GameRules;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class FightsfrightsModGameRules {
	public static GameRules.Key<GameRules.BooleanValue> DO_INFECTION;
	public static GameRules.Key<GameRules.BooleanValue> DO_MIMIC_BEETLES;
	public static GameRules.Key<GameRules.BooleanValue> SPAWN_SCOWL;
	public static GameRules.Key<GameRules.BooleanValue> SPAWN_SEER;
	public static GameRules.Key<GameRules.BooleanValue> SPAWN_ALLMAN;
	public static GameRules.Key<GameRules.BooleanValue> SPAWN_PATUTI;
	public static GameRules.Key<GameRules.BooleanValue> SPAWN_TERRANTULA;
	public static GameRules.Key<GameRules.BooleanValue> SPAWN_PIONEERS;
	public static GameRules.Key<GameRules.BooleanValue> SPAWN_BANSHAA;
	public static GameRules.Key<GameRules.BooleanValue> DO_REANIMATED;
	public static GameRules.Key<GameRules.BooleanValue> SPAWN_SHACKLED;
	public static GameRules.Key<GameRules.BooleanValue> SPAWN_GRIMMSQUITO;
	public static GameRules.Key<GameRules.BooleanValue> DO_BOSS_RITUALS;
	public static GameRules.Key<GameRules.BooleanValue> SPAWN_SHADOW;
	public static GameRules.Key<GameRules.BooleanValue> SPAWN_MIMENTIS;
	public static GameRules.Key<GameRules.BooleanValue> SPAWN_SUPAI;
	public static GameRules.Key<GameRules.IntegerValue> SHACKLED_SMOKE;
	public static GameRules.Key<GameRules.IntegerValue> BEETLE_CHANCE;
	public static GameRules.Key<GameRules.BooleanValue> SPAWN_OVERWORLD_BANSHAAS;

	@SubscribeEvent
	public static void registerGameRules(FMLCommonSetupEvent event) {
		DO_INFECTION = GameRules.register("doInfection", GameRules.Category.PLAYER, GameRules.BooleanValue.create(false));
		DO_MIMIC_BEETLES = GameRules.register("doMimicBeetles", GameRules.Category.MOBS, GameRules.BooleanValue.create(true));
		SPAWN_SCOWL = GameRules.register("spawnScowl", GameRules.Category.MOBS, GameRules.BooleanValue.create(true));
		SPAWN_SEER = GameRules.register("spawnSeer", GameRules.Category.MOBS, GameRules.BooleanValue.create(true));
		SPAWN_ALLMAN = GameRules.register("spawnAllman", GameRules.Category.MOBS, GameRules.BooleanValue.create(true));
		SPAWN_PATUTI = GameRules.register("spawnPatuti", GameRules.Category.MOBS, GameRules.BooleanValue.create(true));
		SPAWN_TERRANTULA = GameRules.register("spawnTerrantula", GameRules.Category.MOBS, GameRules.BooleanValue.create(true));
		SPAWN_PIONEERS = GameRules.register("spawnPioneers", GameRules.Category.MOBS, GameRules.BooleanValue.create(true));
		SPAWN_BANSHAA = GameRules.register("spawnBanshaa", GameRules.Category.MOBS, GameRules.BooleanValue.create(true));
		DO_REANIMATED = GameRules.register("doReanimated", GameRules.Category.MOBS, GameRules.BooleanValue.create(true));
		SPAWN_SHACKLED = GameRules.register("spawnShackled", GameRules.Category.MOBS, GameRules.BooleanValue.create(true));
		SPAWN_GRIMMSQUITO = GameRules.register("spawnGrimmsquito", GameRules.Category.MOBS, GameRules.BooleanValue.create(true));
		DO_BOSS_RITUALS = GameRules.register("doBossRituals", GameRules.Category.MOBS, GameRules.BooleanValue.create(true));
		SPAWN_SHADOW = GameRules.register("spawnShadow", GameRules.Category.MOBS, GameRules.BooleanValue.create(true));
		SPAWN_MIMENTIS = GameRules.register("spawnMimentis", GameRules.Category.MOBS, GameRules.BooleanValue.create(true));
		SPAWN_SUPAI = GameRules.register("spawnSupai", GameRules.Category.MOBS, GameRules.BooleanValue.create(false));
		SHACKLED_SMOKE = GameRules.register("shackledSmoke", GameRules.Category.MOBS, GameRules.IntegerValue.create(50));
		BEETLE_CHANCE = GameRules.register("beetleChance", GameRules.Category.SPAWNING, GameRules.IntegerValue.create(10));
		SPAWN_OVERWORLD_BANSHAAS = GameRules.register("spawnOverworldBanshaas", GameRules.Category.SPAWNING, GameRules.BooleanValue.create(true));
	}
}
