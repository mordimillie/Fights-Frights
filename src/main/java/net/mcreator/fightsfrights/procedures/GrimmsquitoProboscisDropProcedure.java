package net.mcreator.fightsfrights.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.fightsfrights.init.FightsfrightsModItems;
import net.mcreator.fightsfrights.entity.GrimmsquitoEntity;

public class GrimmsquitoProboscisDropProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof GrimmsquitoEntity animatable ? animatable.getTexture() : "null").equals("grimmsquitopoison")) {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(FightsfrightsModItems.POISONOUS_PROBOSCIS.get()));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		}
		if ((entity instanceof GrimmsquitoEntity animatable ? animatable.getTexture() : "null").equals("grimmsquitowither")) {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(FightsfrightsModItems.WITHERED_PROBOSCIS.get()));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		}
		if ((entity instanceof GrimmsquitoEntity animatable ? animatable.getTexture() : "null").equals("grimmsquitoblindness")) {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(FightsfrightsModItems.BLINDING_PROBOSCIS.get()));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		}
		if ((entity instanceof GrimmsquitoEntity animatable ? animatable.getTexture() : "null").equals("grimmsquitoterrified")) {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(FightsfrightsModItems.TERRIFYING_PROBOSCIS.get()));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		}
		if ((entity instanceof GrimmsquitoEntity animatable ? animatable.getTexture() : "null").equals("grimmsquitoinfection")) {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(FightsfrightsModItems.INFECTIOUS_PROBOSCIS.get()));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		}
	}
}
