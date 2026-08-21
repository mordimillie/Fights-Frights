
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fightsfrights.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class FightsfrightsModGameRules {
	public static final GameRules.Key<GameRules.BooleanValue> DO_INFECTION = GameRules.register("doInfection", GameRules.Category.PLAYER, GameRules.BooleanValue.create(false));
	public static final GameRules.Key<GameRules.BooleanValue> DO_MIMIC_BEETLES = GameRules.register("doMimicBeetles", GameRules.Category.MOBS, GameRules.BooleanValue.create(true));
	public static final GameRules.Key<GameRules.BooleanValue> SPAWN_SCOWL = GameRules.register("spawnScowl", GameRules.Category.MOBS, GameRules.BooleanValue.create(true));
	public static final GameRules.Key<GameRules.BooleanValue> SPAWN_SEER = GameRules.register("spawnSeer", GameRules.Category.MOBS, GameRules.BooleanValue.create(true));
	public static final GameRules.Key<GameRules.BooleanValue> SPAWN_ALLMAN = GameRules.register("spawnAllman", GameRules.Category.MOBS, GameRules.BooleanValue.create(true));
	public static final GameRules.Key<GameRules.BooleanValue> SPAWN_PATUTI = GameRules.register("spawnPatuti", GameRules.Category.MOBS, GameRules.BooleanValue.create(true));
	public static final GameRules.Key<GameRules.BooleanValue> SPAWN_TERRANTULA = GameRules.register("spawnTerrantula", GameRules.Category.MOBS, GameRules.BooleanValue.create(true));
	public static final GameRules.Key<GameRules.BooleanValue> SPAWN_PIONEERS = GameRules.register("spawnPioneers", GameRules.Category.MOBS, GameRules.BooleanValue.create(true));
	public static final GameRules.Key<GameRules.BooleanValue> SPAWN_BANSHAA = GameRules.register("spawnBanshaa", GameRules.Category.MOBS, GameRules.BooleanValue.create(true));
	public static final GameRules.Key<GameRules.BooleanValue> DO_REANIMATED = GameRules.register("doReanimated", GameRules.Category.MOBS, GameRules.BooleanValue.create(true));
	public static final GameRules.Key<GameRules.BooleanValue> SPAWN_SHACKLED = GameRules.register("spawnShackled", GameRules.Category.MOBS, GameRules.BooleanValue.create(true));
	public static final GameRules.Key<GameRules.BooleanValue> SPAWN_GRIMMSQUITO = GameRules.register("spawnGrimmsquito", GameRules.Category.MOBS, GameRules.BooleanValue.create(true));
	public static final GameRules.Key<GameRules.BooleanValue> DO_BOSS_RITUALS = GameRules.register("doBossRituals", GameRules.Category.MOBS, GameRules.BooleanValue.create(true));
	public static final GameRules.Key<GameRules.BooleanValue> SPAWN_SHADOW = GameRules.register("spawnShadow", GameRules.Category.MOBS, GameRules.BooleanValue.create(true));
	public static final GameRules.Key<GameRules.BooleanValue> SPAWN_MIMENTIS = GameRules.register("spawnMimentis", GameRules.Category.MOBS, GameRules.BooleanValue.create(true));
	public static final GameRules.Key<GameRules.BooleanValue> SPAWN_SUPAI = GameRules.register("spawnSupai", GameRules.Category.MOBS, GameRules.BooleanValue.create(false));
	public static final GameRules.Key<GameRules.IntegerValue> SHACKLED_SMOKE = GameRules.register("shackledSmoke", GameRules.Category.MOBS, GameRules.IntegerValue.create(50));
	public static final GameRules.Key<GameRules.IntegerValue> BEETLE_CHANCE = GameRules.register("beetleChance", GameRules.Category.SPAWNING, GameRules.IntegerValue.create(10));
	public static final GameRules.Key<GameRules.BooleanValue> SPAWN_OVERWORLD_BANSHAAS = GameRules.register("spawnOverworldBanshaas", GameRules.Category.SPAWNING, GameRules.BooleanValue.create(true));
}
