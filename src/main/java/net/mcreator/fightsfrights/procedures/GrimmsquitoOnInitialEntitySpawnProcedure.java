package net.mcreator.fightsfrights.procedures;

import software.bernie.geckolib.util.Color;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.fightsfrights.init.FightsfrightsModGameRules;
import net.mcreator.fightsfrights.entity.GrimmsquitoEntity;

public class GrimmsquitoOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double Color = 0;
		if (!world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("fightsfrights:bug_den"))) {
			Color = Mth.nextInt(RandomSource.create(), 1, 6);
			if (Color == 2) {
				if (entity instanceof GrimmsquitoEntity animatable)
					animatable.setTexture("grimmsquitopoison");
			} else if (Color == 3) {
				if (entity instanceof GrimmsquitoEntity animatable)
					animatable.setTexture("grimmsquitoblindness");
			} else if (Color == 4) {
				if (entity instanceof GrimmsquitoEntity animatable)
					animatable.setTexture("grimmsquitowither");
			} else if (Color == 5) {
				if (entity instanceof GrimmsquitoEntity animatable)
					animatable.setTexture("grimmsquitoterrified");
			} else if (Color == 6 && world.getLevelData().getGameRules().getBoolean(FightsfrightsModGameRules.DO_INFECTION) == true) {
				if (entity instanceof GrimmsquitoEntity animatable)
					animatable.setTexture("grimmsquitoinfection");
			}
		} else {
			if (entity instanceof GrimmsquitoEntity animatable)
				animatable.setTexture("grimmsquitowither");
		}
	}
}
