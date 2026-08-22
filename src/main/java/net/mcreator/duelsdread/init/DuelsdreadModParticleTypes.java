
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.duelsdread.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.duelsdread.DuelsdreadMod;

public class DuelsdreadModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, DuelsdreadMod.MODID);
	public static final RegistryObject<SimpleParticleType> GNASHING_PARTICLE = REGISTRY.register("gnashing_particle", () -> new SimpleParticleType(false));
}
