
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fightsfrights.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.fightsfrights.FightsfrightsMod;

public class FightsfrightsModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(Registries.PARTICLE_TYPE, FightsfrightsMod.MODID);
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> OMINOUS_SOUL = REGISTRY.register("ominous_soul", () -> new SimpleParticleType(false));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> GOOPPARTICLE = REGISTRY.register("goopparticle", () -> new SimpleParticleType(false));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> GAZED_PARTICLE = REGISTRY.register("gazed_particle", () -> new SimpleParticleType(false));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> MAD_PARTICLLE = REGISTRY.register("mad_particlle", () -> new SimpleParticleType(false));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> CALM_PARTICLE = REGISTRY.register("calm_particle", () -> new SimpleParticleType(false));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> BEETLE_BLUE = REGISTRY.register("beetle_blue", () -> new SimpleParticleType(false));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> BEETLEYELLOW = REGISTRY.register("beetleyellow", () -> new SimpleParticleType(false));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> BEETLE_RED = REGISTRY.register("beetle_red", () -> new SimpleParticleType(false));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> BEETLE_GOLD = REGISTRY.register("beetle_gold", () -> new SimpleParticleType(false));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> SHADOWPARTICLE = REGISTRY.register("shadowparticle", () -> new SimpleParticleType(false));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> INFECTION_PARTICLE = REGISTRY.register("infection_particle", () -> new SimpleParticleType(false));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> PROBOSCISPARTICLE = REGISTRY.register("proboscisparticle", () -> new SimpleParticleType(false));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> FLY = REGISTRY.register("fly", () -> new SimpleParticleType(false));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> FIRE_FLY_PARTICLE = REGISTRY.register("fire_fly_particle", () -> new SimpleParticleType(false));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> GREEN_FLY_PARTICLE = REGISTRY.register("green_fly_particle", () -> new SimpleParticleType(false));
}
