
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fightsfrights.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

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

public class FightsfrightsModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, FightsfrightsMod.MODID);
	public static final RegistryObject<MobEffect> JELLIED = REGISTRY.register("jellied", () -> new JelliedMobEffect());
	public static final RegistryObject<MobEffect> AMPHIBIAN = REGISTRY.register("amphibian", () -> new AmphibianMobEffect());
	public static final RegistryObject<MobEffect> GAZED = REGISTRY.register("gazed", () -> new GazedMobEffect());
	public static final RegistryObject<MobEffect> MAD = REGISTRY.register("mad", () -> new MadMobEffect());
	public static final RegistryObject<MobEffect> CURSED = REGISTRY.register("cursed", () -> new CursedMobEffect());
	public static final RegistryObject<MobEffect> TERRIFIED = REGISTRY.register("terrified", () -> new TerrifiedMobEffect());
	public static final RegistryObject<MobEffect> SUMMON_TIME = REGISTRY.register("summon_time", () -> new SummonTimeMobEffect());
	public static final RegistryObject<MobEffect> AVERTED = REGISTRY.register("averted", () -> new AvertedMobEffect());
	public static final RegistryObject<MobEffect> CALM = REGISTRY.register("calm", () -> new CalmMobEffect());
	public static final RegistryObject<MobEffect> HARDENED = REGISTRY.register("hardened", () -> new HardenedMobEffect());
	public static final RegistryObject<MobEffect> ADDICTED = REGISTRY.register("addicted", () -> new AddictedMobEffect());
	public static final RegistryObject<MobEffect> INFECTED = REGISTRY.register("infected", () -> new InfectedMobEffect());
	public static final RegistryObject<MobEffect> ASYMPTOMATIC = REGISTRY.register("asymptomatic", () -> new AsymptomaticMobEffect());
}
