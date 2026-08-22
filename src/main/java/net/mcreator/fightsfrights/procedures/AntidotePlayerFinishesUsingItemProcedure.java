package net.mcreator.fightsfrights.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.fightsfrights.network.FightsfrightsModVariables;
import net.mcreator.fightsfrights.init.FightsfrightsModMobEffects;

public class AntidotePlayerFinishesUsingItemProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		itemstack.shrink(1);
		if (world instanceof ServerLevel _level) {
			ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.GLASS_BOTTLE));
			entityToSpawn.setPickUpDelay(0);
			_level.addFreshEntity(entityToSpawn);
		}
		{
			FightsfrightsModVariables.PlayerVariables _vars = entity.getData(FightsfrightsModVariables.PLAYER_VARIABLES);
			_vars.Infected = false;
			_vars.syncPlayerVariables(entity);
		}
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(FightsfrightsModMobEffects.INFECTED);
		{
			FightsfrightsModVariables.PlayerVariables _vars = entity.getData(FightsfrightsModVariables.PLAYER_VARIABLES);
			_vars.Infected = false;
			_vars.syncPlayerVariables(entity);
		}
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(FightsfrightsModMobEffects.INFECTED);
	}
}
