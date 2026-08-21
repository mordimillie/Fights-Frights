package net.mcreator.fightsfrights.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class OminousBottlePlayerFinishesUsingItemProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		itemstack.shrink(1);
		if (world instanceof ServerLevel _level) {
			ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.GLASS_BOTTLE));
			entityToSpawn.setPickUpDelay(0);
			_level.addFreshEntity(entityToSpawn);
		}
		if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.BAD_OMEN) ? _livEnt.getEffect(MobEffects.BAD_OMEN).getAmplifier() : 0) == 3) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.BAD_OMEN, 7200000, 4, true, true));
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fightsfrights:ominous_bottle_breaks")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fightsfrights:ominous_bottle_breaks")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		} else {
			if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.BAD_OMEN) ? _livEnt.getEffect(MobEffects.BAD_OMEN).getAmplifier() : 0) == 2) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.BAD_OMEN, 7200000, 3, true, true));
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fightsfrights:ominous_bottle_breaks")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fightsfrights:ominous_bottle_breaks")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			} else {
				if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.BAD_OMEN) ? _livEnt.getEffect(MobEffects.BAD_OMEN).getAmplifier() : 0) == 1) {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.BAD_OMEN, 7200000, 2, true, true));
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fightsfrights:ominous_bottle_breaks")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fightsfrights:ominous_bottle_breaks")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				} else {
					if (entity instanceof LivingEntity _livEnt12 && _livEnt12.hasEffect(MobEffects.BAD_OMEN)) {
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.BAD_OMEN, 7200000, 1, true, true));
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fightsfrights:ominous_bottle_breaks")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fightsfrights:ominous_bottle_breaks")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
					} else {
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.BAD_OMEN, 7200000, 0, true, true));
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fightsfrights:ominous_bottle_breaks")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fightsfrights:ominous_bottle_breaks")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
					}
				}
			}
		}
	}
}
