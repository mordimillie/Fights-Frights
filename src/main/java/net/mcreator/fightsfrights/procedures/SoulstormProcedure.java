package net.mcreator.fightsfrights.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.mcreator.fightsfrights.init.FightsfrightsModParticleTypes;
import net.mcreator.fightsfrights.init.FightsfrightsModMobEffects;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SoulstormProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(FightsfrightsModMobEffects.CURSED.get())) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (FightsfrightsModParticleTypes.OMINOUS_SOUL.get()), (x - 0), (y + entity.getBbHeight() - 0.2), (z - 0), 5, 0, 0, 0, 0.08);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.warden.heartbeat")), SoundSource.PLAYERS, (float) 0.3, -2);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.warden.heartbeat")), SoundSource.PLAYERS, (float) 0.3, -2, false);
				}
			}
		}
	}
}
