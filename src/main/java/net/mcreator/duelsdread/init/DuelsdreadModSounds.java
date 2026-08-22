
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.duelsdread.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.duelsdread.DuelsdreadMod;

public class DuelsdreadModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, DuelsdreadMod.MODID);
	public static final RegistryObject<SoundEvent> DRYFIELD_AMBIENT = REGISTRY.register("dryfield_ambient", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("duelsdread", "dryfield_ambient")));
	public static final RegistryObject<SoundEvent> DROIDHURT = REGISTRY.register("droidhurt", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("duelsdread", "droidhurt")));
	public static final RegistryObject<SoundEvent> DROIDDEATH = REGISTRY.register("droiddeath", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("duelsdread", "droiddeath")));
	public static final RegistryObject<SoundEvent> SWOOSH = REGISTRY.register("swoosh", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("duelsdread", "swoosh")));
	public static final RegistryObject<SoundEvent> WAIL_DISC = REGISTRY.register("wail_disc", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("duelsdread", "wail_disc")));
	public static final RegistryObject<SoundEvent> CHOMP = REGISTRY.register("chomp", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("duelsdread", "chomp")));
	public static final RegistryObject<SoundEvent> SPAM_DEATH = REGISTRY.register("spam_death", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("duelsdread", "spam_death")));
	public static final RegistryObject<SoundEvent> SAVAGER_HOWL = REGISTRY.register("savager_howl", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("duelsdread", "savager_howl")));
	public static final RegistryObject<SoundEvent> SAVAGER_HURT = REGISTRY.register("savager_hurt", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("duelsdread", "savager_hurt")));
	public static final RegistryObject<SoundEvent> SAVAGER_STEPS = REGISTRY.register("savager_steps", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("duelsdread", "savager_steps")));
	public static final RegistryObject<SoundEvent> SAVAGER_PANTS = REGISTRY.register("savager_pants", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("duelsdread", "savager_pants")));
	public static final RegistryObject<SoundEvent> SAVAGER_DEATH = REGISTRY.register("savager_death", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("duelsdread", "savager_death")));
}
