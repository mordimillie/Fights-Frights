package net.mcreator.fightsfrights.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.fightsfrights.entity.TerrantulaEntity;

public class TerrantulaOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("fightsfrights:bug_den"))) {
			if (entity instanceof TerrantulaEntity animatable)
				animatable.setTexture("nether_terrantula");
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, -1, 255, false, false));
		} else if (world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("badlands")) || world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("desert"))) {
			if (entity instanceof TerrantulaEntity animatable)
				animatable.setTexture("terrantuladesert");
		} else if (y <= 40) {
			if (entity instanceof TerrantulaEntity animatable)
				animatable.setTexture("dark_terrantula");
		}
	}
}
