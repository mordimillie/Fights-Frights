package net.mcreator.fightsfrights.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.fightsfrights.init.FightsfrightsModParticleTypes;
import net.mcreator.fightsfrights.init.FightsfrightsModMobEffects;
import net.mcreator.fightsfrights.init.FightsfrightsModItems;
import net.mcreator.fightsfrights.init.FightsfrightsModEntities;
import net.mcreator.fightsfrights.init.FightsfrightsModBlocks;
import net.mcreator.fightsfrights.FightsfrightsMod;

import java.util.Random;

public class MysteryblockBlockDestroyedByPlayerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double Roll = 0;
		double Random = 0;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.SILK_TOUCH)) > 0) {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5), new ItemStack(FightsfrightsModBlocks.MYSTERYBLOCK.get()));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		} else {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("fightsfrights:evillaugh")), SoundSource.BLOCKS, (float) 0.6, 3);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("fightsfrights:evillaugh")), SoundSource.BLOCKS, (float) 0.6, 3, false);
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("fightsfrights:evillaugh")), SoundSource.BLOCKS, (float) 0.6, 4);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("fightsfrights:evillaugh")), SoundSource.BLOCKS, (float) 0.6, 4, false);
				}
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (FightsfrightsModParticleTypes.OMINOUS_SOUL.get()), (x + 0.5), (y + 0.5), (z + 0.5), 45, 0.125, 0.125, 0.125, 0.07);
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (FightsfrightsModParticleTypes.SHADOWPARTICLE.get()), (x + 0.5), (y + 0.5), (z + 0.5), 25, 0.125, 0.125, 0.125, 0.07);
			for (int index0 = 0; index0 < Mth.nextInt(RandomSource.create(), 1, 2); index0++) {
				Roll = Mth.nextInt(RandomSource.create(), 1, 21);
				if (Roll == 1) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"/summon tnt ~ ~ ~ {Fuse:160}");
				} else if (Roll == 2) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = EntityType.TNT.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setDeltaMovement(0.5, 0.2, 0.5);
						}
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = EntityType.TNT.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setDeltaMovement((-0.5), 0.2, 0.5);
						}
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = EntityType.TNT.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setDeltaMovement((-0.5), 0.2, (-0.5));
						}
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = EntityType.TNT.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setDeltaMovement(0.5, 0.2, (-0.5));
						}
					}
				} else if (Roll == 3) {
					for (int index1 = 0; index1 < Mth.nextInt(RandomSource.create(), 1, 3); index1++) {
						Random = Mth.nextInt(RandomSource.create(), 1, 10);
						if (Random == 1) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = FightsfrightsModEntities.SCOWL.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
								if (entityToSpawn != null) {
									entityToSpawn.setDeltaMovement(0, 0, 0);
								}
							}
						} else if (Random == 2) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = FightsfrightsModEntities.MIMENTIS.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
								if (entityToSpawn != null) {
									entityToSpawn.setDeltaMovement(0, 0, 0);
								}
							}
						} else if (Random == 3) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = FightsfrightsModEntities.PATUTI.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
								if (entityToSpawn != null) {
									entityToSpawn.setDeltaMovement(0, 0, 0);
								}
							}
						} else if (Random == 4) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = FightsfrightsModEntities.MIMIC_BEETLES.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
								if (entityToSpawn != null) {
									entityToSpawn.setDeltaMovement(0, 0, 0);
								}
							}
						} else if (Random == 5) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = FightsfrightsModEntities.GRIMMSQUITO.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
								if (entityToSpawn != null) {
									entityToSpawn.setDeltaMovement(0, 0, 0);
								}
							}
						} else if (Random == 6) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = FightsfrightsModEntities.PIONEER.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
								if (entityToSpawn != null) {
									entityToSpawn.setDeltaMovement(0, 0, 0);
								}
							}
						} else if (Random == 7) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = FightsfrightsModEntities.SEER.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
								if (entityToSpawn != null) {
									entityToSpawn.setDeltaMovement(0, 0, 0);
								}
							}
						} else if (Random == 8) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = FightsfrightsModEntities.TERRANTULA.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
								if (entityToSpawn != null) {
									entityToSpawn.setDeltaMovement(0, 0, 0);
								}
							}
						} else if (Random == 9) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = FightsfrightsModEntities.ALLMAN.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
								if (entityToSpawn != null) {
									entityToSpawn.setDeltaMovement(0, 0, 0);
								}
							}
						} else if (Random == 10) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = FightsfrightsModEntities.BANSHAA.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
								if (entityToSpawn != null) {
									entityToSpawn.setDeltaMovement(0, 0, 0);
								}
							}
						}
					}
				} else if (Roll == 4) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = EntityType.VILLAGER.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setDeltaMovement(0, 1, 0);
						}
					}
				} else if (Roll == 5) {
					Random = Mth.nextInt(RandomSource.create(), 1, 10);
					if (Random == 1) {
						if (world instanceof ServerLevel _level)
							_level.holderOrThrow(ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.parse("azalea_tree"))).value().place(_level, _level.getChunkSource().getGenerator(), _level.getRandom(),
									BlockPos.containing(x, y, z));
					} else if (Random == 2) {
						if (world instanceof ServerLevel _level)
							_level.holderOrThrow(ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.parse("trees_plains"))).value().place(_level, _level.getChunkSource().getGenerator(), _level.getRandom(),
									BlockPos.containing(x, y, z));
					} else if (Random == 3) {
						if (world instanceof ServerLevel _level)
							_level.holderOrThrow(ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.parse("flower_cherry"))).value().place(_level, _level.getChunkSource().getGenerator(), _level.getRandom(),
									BlockPos.containing(x, y, z));
					} else if (Random == 4) {
						if (world instanceof ServerLevel _level)
							_level.holderOrThrow(ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.parse("trees_savanna"))).value().place(_level, _level.getChunkSource().getGenerator(), _level.getRandom(),
									BlockPos.containing(x, y, z));
					} else if (Random == 5) {
						if (world instanceof ServerLevel _level)
							_level.holderOrThrow(ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.parse("spruce"))).value().place(_level, _level.getChunkSource().getGenerator(), _level.getRandom(), BlockPos.containing(x, y, z));
					} else if (Random == 6) {
						if (world instanceof ServerLevel _level)
							_level.holderOrThrow(ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.parse("birch"))).value().place(_level, _level.getChunkSource().getGenerator(), _level.getRandom(), BlockPos.containing(x, y, z));
					} else if (Random == 7) {
						if (world instanceof ServerLevel _level)
							_level.holderOrThrow(ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.parse("mangrove"))).value().place(_level, _level.getChunkSource().getGenerator(), _level.getRandom(), BlockPos.containing(x, y, z));
					} else if (Random == 8) {
						if (world instanceof ServerLevel _level)
							_level.holderOrThrow(ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.parse("dark_oak"))).value().place(_level, _level.getChunkSource().getGenerator(), _level.getRandom(), BlockPos.containing(x, y, z));
					} else if (Random == 9) {
						if (world instanceof ServerLevel _level)
							_level.holderOrThrow(ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.parse("jungle_tree"))).value().place(_level, _level.getChunkSource().getGenerator(), _level.getRandom(),
									BlockPos.containing(x, y, z));
					} else if (Random == 10) {
						if (world instanceof ServerLevel _level)
							_level.holderOrThrow(ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.parse("fancy_oak_bees_0002"))).value().place(_level, _level.getChunkSource().getGenerator(), _level.getRandom(),
									BlockPos.containing(x, y, z));
					}
				} else if (Roll == 6) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.DIAMOND));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				} else if (Roll == 7) {
					for (int index2 = 0; index2 < Mth.nextInt(RandomSource.create(), 1, 9); index2++) {
						Random = Mth.nextInt(RandomSource.create(), 1, 10);
						if (Random == 1) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.DIAMOND));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						} else if (Random == 2) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.IRON_INGOT));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						} else if (Random == 3) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.REDSTONE));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						} else if (Random == 4) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.EMERALD));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						} else if (Random == 5) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.GOLD_INGOT));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						} else if (Random == 6) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.LAPIS_LAZULI));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						} else if (Random == 7) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.COPPER_INGOT));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						} else if (Random == 8) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.NETHERITE_SCRAP));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						} else if (Random == 9) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.QUARTZ));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						} else if (Random == 10) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(FightsfrightsModItems.PATHOGEN.get()));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else if (Roll == 8) {
					for (int index3 = 0; index3 < Mth.nextInt(RandomSource.create(), 1, 3); index3++) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(FightsfrightsModItems.BUG_DUST.get()));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (Roll == 9) {
					for (int index4 = 0; index4 < 2; index4++) {
						Random = Mth.nextInt(RandomSource.create(), 1, 10);
						if (Random == 1) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(FightsfrightsModItems.GILLS.get()));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						} else if (Random == 2) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(FightsfrightsModItems.GOLDEN_TONGUE.get()));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						} else if (Random == 3) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(FightsfrightsModItems.TERRANTULA_LEG.get()));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						} else if (Random == 4) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(FightsfrightsModItems.BANSHAAS_LUNGS.get()));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						} else if (Random == 5) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(FightsfrightsModItems.GOOP.get()));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						} else if (Random == 6) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(FightsfrightsModItems.CHARGED_CHILI.get()));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						} else if (Random == 7) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(FightsfrightsModItems.MONSTER_POP.get()));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						} else if (Random == 8) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(FightsfrightsModItems.MONSTER_SALAD.get()));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						} else if (Random == 9) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(FightsfrightsModItems.CHEESE_STICK.get()));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						} else if (Random == 10) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(FightsfrightsModItems.PUNGENT_SOUP.get()));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else if (Roll == 10) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = EntityType.SILVERFISH.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = FightsfrightsModEntities.MIMIC_BEETLES.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = FightsfrightsModEntities.MIMENTIS.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = FightsfrightsModEntities.GRIMMSQUITO.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = FightsfrightsModEntities.TERRANTULA.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = EntityType.SPIDER.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = EntityType.CAVE_SPIDER.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = EntityType.BEE.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
				} else if (Roll == 11) {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 4, 99, false, true));
				} else if (Roll == 12) {
					for (int index5 = 0; index5 < Mth.nextInt(RandomSource.create(), 1, 5); index5++) {
						Random = Mth.nextInt(RandomSource.create(), 1, 10);
						if (Random == 1) {
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(FightsfrightsModMobEffects.AVERTED, 2000, 0, false, true));
						} else if (Random == 2) {
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(FightsfrightsModMobEffects.JELLIED, 2000, 0, false, true));
						} else if (Random == 3) {
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 2000, 0, false, true));
						} else if (Random == 4) {
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 2000, 0, false, true));
						} else if (Random == 5) {
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 2000, 0, false, true));
						} else if (Random == 6) {
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 2000, 0, false, true));
						} else if (Random == 7) {
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.JUMP, 2000, 0, false, true));
						} else if (Random == 8) {
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2000, 0, false, true));
						} else if (Random == 9) {
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 2000, 0, false, true));
						} else if (Random == 10) {
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 2000, 0, false, true));
						}
					}
				} else if (Roll == 13) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = EntityType.ENDERMAN.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
					for (int index6 = 0; index6 < Mth.nextInt(RandomSource.create(), 1, 3); index6++) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.ENDER_PEARL));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (Roll == 14) {
					for (int index7 = 0; index7 < Mth.nextInt(RandomSource.create(), 1, 5); index7++) {
						Random = Mth.nextInt(RandomSource.create(), 1, 10);
						if (Random == 1) {
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(FightsfrightsModMobEffects.GAZED, 2000, 0, false, true));
						} else if (Random == 2) {
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(FightsfrightsModMobEffects.INFECTED, 2000, 0, false, true));
						} else if (Random == 3) {
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(FightsfrightsModMobEffects.TERRIFIED, 2000, 0, false, true));
						} else if (Random == 4) {
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.WITHER, 2000, 0, false, true));
						} else if (Random == 5) {
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.POISON, 2000, 0, false, true));
						} else if (Random == 6) {
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.HUNGER, 2000, 0, false, true));
						} else if (Random == 7) {
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.HARM, 2000, 0, false, true));
						} else if (Random == 8) {
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 2000, 0, false, true));
						} else if (Random == 9) {
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 2000, 0, false, true));
						} else if (Random == 10) {
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 2000, 0, false, true));
						}
					}
				} else if (Roll == 15) {
					for (int index8 = 0; index8 < Mth.nextInt(RandomSource.create(), 1, 2); index8++) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(FightsfrightsModBlocks.MYSTERYBLOCK.get()));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (Roll == 16) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(FightsfrightsModItems.OMINOUS_ESSENCE.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				} else if (Roll == 17) {
					for (int index9 = 0; index9 < Mth.nextInt(RandomSource.create(), 2, 7); index9++) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(FightsfrightsModBlocks.ROTTEN_BLOCK.get()));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (Roll == 18) {
					for (int index10 = 0; index10 < Mth.nextInt(RandomSource.create(), 2, 5); index10++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = EntityType.PUFFERFISH.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
					}
				} else if (Roll == 19) {
					for (int index11 = 0; index11 < 3; index11++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = EntityType.BEE.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
					}
				} else if (Roll == 20) {
					Random = Mth.nextInt(RandomSource.create(), 1, 3);
					if (Random == 1) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = EntityType.WARDEN.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
					} else if (Random == 2) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = EntityType.EVOKER.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
					} else if (Random == 3) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = EntityType.RAVAGER.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setDeltaMovement(0, 1, 0);
							}
						}
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = EntityType.PILLAGER.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setDeltaMovement(0, 1, 0);
							}
						}
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = EntityType.VINDICATOR.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setDeltaMovement(0, 1, 0);
							}
						}
						FightsfrightsMod.queueServerWork(80, () -> {
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.BAD_OMEN, 400, 0, false, true));
						});
					}
				} else if (true) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = EntityType.GHAST.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setDeltaMovement(0, 1, 0);
						}
					}
				}
			}
		}
	}
}
