
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fightsfrights.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.entity.decoration.PaintingVariant;

import net.mcreator.fightsfrights.FightsfrightsMod;

public class FightsfrightsModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, FightsfrightsMod.MODID);
	public static final RegistryObject<PaintingVariant> REANIMATED_ALTAR = REGISTRY.register("reanimated_altar", () -> new PaintingVariant(32, 48));
}
