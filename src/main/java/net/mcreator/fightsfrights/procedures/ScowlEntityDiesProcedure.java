package net.mcreator.fightsfrights.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.fightsfrights.entity.ScowlEntity;
import net.mcreator.fightsfrights.FightsfrightsMod;

public class ScowlEntityDiesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof ScowlEntity animatable ? animatable.getTexture() : "null").equals("bloomingscowl")) {
			for (int index0 = 0; index0 < Mth.nextInt(RandomSource.create(), 1, 2); index0++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.FLOWERING_AZALEA));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		} else if ((entity instanceof ScowlEntity animatable ? animatable.getTexture() : "null").equals("berriedscowl")) {
			for (int index1 = 0; index1 < Mth.nextInt(RandomSource.create(), 1, 4); index1++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.GLOW_BERRIES));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		} else {
			for (int index2 = 0; index2 < Mth.nextInt(RandomSource.create(), 1, 3); index2++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.AZALEA_LEAVES));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			FightsfrightsMod.queueServerWork(30, () -> {
				if ((entity instanceof ScowlEntity _datEntL8 && _datEntL8.getEntityData().get(ScowlEntity.DATA_Popped)) == false) {
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.CLOUD, x, y, z, 20, 0.25, 0.25, 0.25, 0.12);
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.EXPLOSION_EMITTER, x, y, z, 1, 0, 0, 0, 0.12);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.HOSTILE, (float) 0.5, 3);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.HOSTILE, (float) 0.5, 3, false);
						}
					}
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"summon minecraft:area_effect_cloud ~ ~1 ~ {Radius:3.0f,Duration:100,Effects:[{Id:19,Amplifier:1,Duration:100}]}");
				}
			});
		}
	}
}
