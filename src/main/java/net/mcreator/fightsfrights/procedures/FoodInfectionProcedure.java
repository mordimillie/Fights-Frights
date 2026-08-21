package net.mcreator.fightsfrights.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.fightsfrights.init.FightsfrightsModMobEffects;
import net.mcreator.fightsfrights.init.FightsfrightsModItems;
import net.mcreator.fightsfrights.init.FightsfrightsModGameRules;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class FoodInfectionProcedure {
	@SubscribeEvent
	public static void onUseItemFinish(LivingEntityUseItemEvent.Finish event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity(), event.getItem());
		}
	}

	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		execute(null, world, entity, itemstack);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (world.getLevelData().getGameRules().getBoolean(FightsfrightsModGameRules.DO_INFECTION) == true) {
			if (itemstack.getItem() == FightsfrightsModItems.ROTTEN_HANDLE.get() || itemstack.getItem() == Items.SPIDER_EYE || itemstack.getItem() == Items.ROTTEN_FLESH && Mth.nextInt(RandomSource.create(), 1, 5) == 1
					|| itemstack.getItem() == FightsfrightsModItems.GOOP.get() && Mth.nextInt(RandomSource.create(), 1, 6) == 1 || itemstack.getItem() == FightsfrightsModItems.GILLS.get() && Mth.nextInt(RandomSource.create(), 1, 7) == 1
					|| itemstack.getItem() == FightsfrightsModItems.GOLDEN_TONGUE.get() && Mth.nextInt(RandomSource.create(), 1, 7) == 1
					|| itemstack.getItem() == FightsfrightsModItems.TERRANTULA_LEG.get() && Mth.nextInt(RandomSource.create(), 1, 8) == 1
					|| itemstack.getItem() == FightsfrightsModItems.BANSHAAS_LUNGS.get() && Mth.nextInt(RandomSource.create(), 1, 8) == 1 || itemstack.getItem() == Items.COD && Mth.nextInt(RandomSource.create(), 1, 8) == 1
					|| itemstack.getItem() == Items.SALMON && Mth.nextInt(RandomSource.create(), 1, 8) == 1 || itemstack.getItem() == Items.PUFFERFISH && Mth.nextInt(RandomSource.create(), 1, 8) == 1
					|| itemstack.getItem() == Items.PORKCHOP && Mth.nextInt(RandomSource.create(), 1, 10) == 1 || itemstack.getItem() == Items.BEEF && Mth.nextInt(RandomSource.create(), 1, 10) == 1
					|| itemstack.getItem() == Items.MUTTON && Mth.nextInt(RandomSource.create(), 1, 10) == 1 || itemstack.getItem() == Items.CHICKEN && Mth.nextInt(RandomSource.create(), 1, 10) == 1
					|| itemstack.getItem() == Items.RABBIT && Mth.nextInt(RandomSource.create(), 1, 10) == 1) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(FightsfrightsModMobEffects.INFECTED.get(), -1, 0, false, true));
			}
		}
	}
}
