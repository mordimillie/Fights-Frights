package net.mcreator.fightsfrights.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.mcreator.fightsfrights.network.FightsfrightsModVariables;
import net.mcreator.fightsfrights.init.FightsfrightsModMobEffects;
import net.mcreator.fightsfrights.init.FightsfrightsModItems;
import net.mcreator.fightsfrights.init.FightsfrightsModGameRules;

import java.util.List;
import java.util.Comparator;

public class PathogenItemInInventoryTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world.getLevelData().getGameRules().getBoolean(FightsfrightsModGameRules.DO_INFECTION) == true) {
			if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(FightsfrightsModMobEffects.INFECTED) ? _livEnt.getEffect(FightsfrightsModMobEffects.INFECTED).getAmplifier() : 0) == 75
					&& entity.getData(FightsfrightsModVariables.PLAYER_VARIABLES).CooldownInfected >= 400) {
				{
					FightsfrightsModVariables.PlayerVariables _vars = entity.getData(FightsfrightsModVariables.PLAYER_VARIABLES);
					_vars.CooldownInfected = 0;
					_vars.syncPlayerVariables(entity);
				}
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(FightsfrightsModItems.PATHOGEN.get()));
					entityToSpawn.setPickUpDelay(0);
					_level.addFreshEntity(entityToSpawn);
				}
				if (entity instanceof Player _player)
					_player.getFoodData().setSaturation((float) ((entity instanceof Player _plr ? _plr.getFoodData().getSaturationLevel() : 0) - 2));
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("fightsfrights:sneeze")), SoundSource.PLAYERS, (float) 0.5, Mth.nextInt(RandomSource.create(), -1, 1));
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("fightsfrights:sneeze")), SoundSource.PLAYERS, (float) 0.5, Mth.nextInt(RandomSource.create(), -1, 1), false);
					}
				}
				entity.push(0, 0.4, 0);
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (entityiterator instanceof Player) {
							if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(FightsfrightsModMobEffects.INFECTED, 60, 1, false, true));
						}
					}
				}
			} else {
				if (entity.getData(FightsfrightsModVariables.PLAYER_VARIABLES).CooldownInfected >= 1552
						- 16 * (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(FightsfrightsModMobEffects.INFECTED) ? _livEnt.getEffect(FightsfrightsModMobEffects.INFECTED).getAmplifier() : 0)) {
					{
						FightsfrightsModVariables.PlayerVariables _vars = entity.getData(FightsfrightsModVariables.PLAYER_VARIABLES);
						_vars.CooldownInfected = 0;
						_vars.syncPlayerVariables(entity);
					}
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(FightsfrightsModItems.PATHOGEN.get()));
						entityToSpawn.setPickUpDelay(0);
						_level.addFreshEntity(entityToSpawn);
					}
					if (entity instanceof Player _player)
						_player.getFoodData().setSaturation((float) ((entity instanceof Player _plr ? _plr.getFoodData().getSaturationLevel() : 0) - 10));
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(FightsfrightsModMobEffects.INFECTED, -1,
								(int) ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(FightsfrightsModMobEffects.INFECTED) ? _livEnt.getEffect(FightsfrightsModMobEffects.INFECTED).getAmplifier() : 0) + 1), false, true));
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("fightsfrights:sneeze")), SoundSource.PLAYERS, (float) 0.5, Mth.nextInt(RandomSource.create(), -1, 1));
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("fightsfrights:sneeze")), SoundSource.PLAYERS, (float) 0.5, Mth.nextInt(RandomSource.create(), -1, 1), false);
						}
					}
					entity.push(0, 0.4, 0);
					{
						final Vec3 _center = new Vec3(x, y, z);
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
						for (Entity entityiterator : _entfound) {
							if (entityiterator instanceof Player) {
								if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(FightsfrightsModMobEffects.INFECTED, 60, 1, false, true));
							}
						}
					}
				}
			}
			if (entity.getData(FightsfrightsModVariables.PLAYER_VARIABLES).Infected == false) {
				{
					FightsfrightsModVariables.PlayerVariables _vars = entity.getData(FightsfrightsModVariables.PLAYER_VARIABLES);
					_vars.Infected = true;
					_vars.syncPlayerVariables(entity);
				}
			}
			{
				FightsfrightsModVariables.PlayerVariables _vars = entity.getData(FightsfrightsModVariables.PLAYER_VARIABLES);
				_vars.CooldownInfected = entity.getData(FightsfrightsModVariables.PLAYER_VARIABLES).CooldownInfected + 1;
				_vars.syncPlayerVariables(entity);
			}
			for (Entity entityiterator : world.getEntities(null, new AABB((x + 0.5), (y + 0.5), (z + 0.5), (x + -0.5), (y + -0.5), (z + -0.5)))) {
				if (entityiterator instanceof Player) {
					if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(FightsfrightsModMobEffects.INFECTED, 60, 1, false, true));
				}
			}
		}
	}
}
