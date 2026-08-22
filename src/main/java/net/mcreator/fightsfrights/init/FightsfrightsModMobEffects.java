
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fightsfrights.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.living.MobEffectEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.registries.Registries;

import net.mcreator.fightsfrights.procedures.SummonTimeEffectExpiresProcedure;
import net.mcreator.fightsfrights.procedures.CursedEffectExpiresProcedure;
import net.mcreator.fightsfrights.procedures.AddictedEffectExpiresProcedure;
import net.mcreator.fightsfrights.potion.TerrifiedMobEffect;
import net.mcreator.fightsfrights.potion.SummonTimeMobEffect;
import net.mcreator.fightsfrights.potion.MadMobEffect;
import net.mcreator.fightsfrights.potion.JelliedMobEffect;
import net.mcreator.fightsfrights.potion.InfectedMobEffect;
import net.mcreator.fightsfrights.potion.HardenedMobEffect;
import net.mcreator.fightsfrights.potion.GazedMobEffect;
import net.mcreator.fightsfrights.potion.CursedMobEffect;
import net.mcreator.fightsfrights.potion.CalmMobEffect;
import net.mcreator.fightsfrights.potion.AvertedMobEffect;
import net.mcreator.fightsfrights.potion.AsymptomaticMobEffect;
import net.mcreator.fightsfrights.potion.AmphibianMobEffect;
import net.mcreator.fightsfrights.potion.AddictedMobEffect;
import net.mcreator.fightsfrights.FightsfrightsMod;

@EventBusSubscriber
public class FightsfrightsModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(Registries.MOB_EFFECT, FightsfrightsMod.MODID);
	public static final DeferredHolder<MobEffect, MobEffect> JELLIED = REGISTRY.register("jellied", () -> new JelliedMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> AMPHIBIAN = REGISTRY.register("amphibian", () -> new AmphibianMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> GAZED = REGISTRY.register("gazed", () -> new GazedMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> MAD = REGISTRY.register("mad", () -> new MadMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> CURSED = REGISTRY.register("cursed", () -> new CursedMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> TERRIFIED = REGISTRY.register("terrified", () -> new TerrifiedMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> SUMMON_TIME = REGISTRY.register("summon_time", () -> new SummonTimeMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> AVERTED = REGISTRY.register("averted", () -> new AvertedMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> CALM = REGISTRY.register("calm", () -> new CalmMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> HARDENED = REGISTRY.register("hardened", () -> new HardenedMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> ADDICTED = REGISTRY.register("addicted", () -> new AddictedMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> INFECTED = REGISTRY.register("infected", () -> new InfectedMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> ASYMPTOMATIC = REGISTRY.register("asymptomatic", () -> new AsymptomaticMobEffect());

	@SubscribeEvent
	public static void onEffectRemoved(MobEffectEvent.Remove event) {
		MobEffectInstance effectInstance = event.getEffectInstance();
		if (effectInstance != null) {
			expireEffects(event.getEntity(), effectInstance);
		}
	}

	@SubscribeEvent
	public static void onEffectExpired(MobEffectEvent.Expired event) {
		MobEffectInstance effectInstance = event.getEffectInstance();
		if (effectInstance != null) {
			expireEffects(event.getEntity(), effectInstance);
		}
	}

	private static void expireEffects(Entity entity, MobEffectInstance effectInstance) {
		if (effectInstance.getEffect().is(CURSED)) {
			CursedEffectExpiresProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
		} else if (effectInstance.getEffect().is(SUMMON_TIME)) {
			SummonTimeEffectExpiresProcedure.execute(entity.level(), entity);
		} else if (effectInstance.getEffect().is(ADDICTED)) {
			AddictedEffectExpiresProcedure.execute(entity.level(), entity);
		}
	}
}
