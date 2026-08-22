
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.duelsdread.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DuelsdreadModGameRules {
	public static final GameRules.Key<GameRules.IntegerValue> DROID_WANDER_RADIUS = GameRules.register("droidWanderRadius", GameRules.Category.MOBS, GameRules.IntegerValue.create(12));
	public static final GameRules.Key<GameRules.BooleanValue> DO_DUELS_N_DREAD = GameRules.register("doDuelsNDread", GameRules.Category.MOBS, GameRules.BooleanValue.create(true));
	public static final GameRules.Key<GameRules.BooleanValue> SPAWN_SPAMDUR = GameRules.register("spawnSpamdur", GameRules.Category.MOBS, GameRules.BooleanValue.create(true));
	public static final GameRules.Key<GameRules.BooleanValue> SPAWN_WRAITHS = GameRules.register("spawnWraiths", GameRules.Category.MOBS, GameRules.BooleanValue.create(true));
	public static final GameRules.Key<GameRules.BooleanValue> SPAWN_SAVAGER = GameRules.register("spawnSavager", GameRules.Category.MOBS, GameRules.BooleanValue.create(true));
}
