
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fightsfrights.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.core.registries.Registries;

import net.mcreator.fightsfrights.FightsfrightsMod;

public class FightsfrightsModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(Registries.POTION, FightsfrightsMod.MODID);
	public static final DeferredHolder<Potion, Potion> GAZINGPOTION = REGISTRY.register("gazingpotion", () -> new Potion(new MobEffectInstance(FightsfrightsModMobEffects.GAZED, 3000, 0, false, true)));
	public static final DeferredHolder<Potion, Potion> HASTE = REGISTRY.register("haste", () -> new Potion(new MobEffectInstance(MobEffects.DIG_SPEED, 3600, 0, false, true)));
	public static final DeferredHolder<Potion, Potion> HASTE_2 = REGISTRY.register("haste_2", () -> new Potion(new MobEffectInstance(MobEffects.DIG_SPEED, 3600, 1, false, true)));
	public static final DeferredHolder<Potion, Potion> MAD_POTION = REGISTRY.register("mad_potion", () -> new Potion(new MobEffectInstance(FightsfrightsModMobEffects.MAD, 3600, 1, false, true)));
	public static final DeferredHolder<Potion, Potion> GUARDIANS_STRENGTH = REGISTRY.register("guardians_strength",
			() -> new Potion(new MobEffectInstance(MobEffects.CONDUIT_POWER, 3600, 1, false, true), new MobEffectInstance(MobEffects.DAMAGE_BOOST, 3600, 0, false, true), new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 3600, 0, false, true)));
	public static final DeferredHolder<Potion, Potion> DEATHBLIGHT = REGISTRY.register("deathblight",
			() -> new Potion(new MobEffectInstance(MobEffects.POISON, 500, 1, false, true), new MobEffectInstance(MobEffects.BLINDNESS, 500, 0, false, true), new MobEffectInstance(MobEffects.DARKNESS, 500, 0, false, true)));
	public static final DeferredHolder<Potion, Potion> TERRIFIED_POTION = REGISTRY.register("terrified_potion", () -> new Potion(new MobEffectInstance(FightsfrightsModMobEffects.TERRIFIED, 3600, 3, false, false)));
	public static final DeferredHolder<Potion, Potion> AVERTED_POTION = REGISTRY.register("averted_potion", () -> new Potion(new MobEffectInstance(FightsfrightsModMobEffects.AVERTED, 3000, 0, false, true)));
	public static final DeferredHolder<Potion, Potion> INFECTION_P = REGISTRY.register("infection_p", () -> new Potion(new MobEffectInstance(FightsfrightsModMobEffects.INFECTED, -1, 0, false, true)));
	public static final DeferredHolder<Potion, Potion> LEVITATION = REGISTRY.register("levitation", () -> new Potion(new MobEffectInstance(MobEffects.LEVITATION, 200, 0, false, true)));
}
