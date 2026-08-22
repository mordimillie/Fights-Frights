
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.duelsdread.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.duelsdread.enchantment.GnashingEnchantment;
import net.mcreator.duelsdread.DuelsdreadMod;

public class DuelsdreadModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, DuelsdreadMod.MODID);
	public static final RegistryObject<Enchantment> GNASHING = REGISTRY.register("gnashing", () -> new GnashingEnchantment());
}
