
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.duelsdread.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.duelsdread.potion.SummonedMobEffect;
import net.mcreator.duelsdread.potion.GnashedMobEffect;
import net.mcreator.duelsdread.DuelsdreadMod;

public class DuelsdreadModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, DuelsdreadMod.MODID);
	public static final RegistryObject<MobEffect> SUMMONED = REGISTRY.register("summoned", () -> new SummonedMobEffect());
	public static final RegistryObject<MobEffect> GNASHED = REGISTRY.register("gnashed", () -> new GnashedMobEffect());
}
