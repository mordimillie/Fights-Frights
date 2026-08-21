package net.mcreator.fightsfrights.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.fightsfrights.entity.MimicTerrantulaEntity;
import net.mcreator.fightsfrights.FightsfrightsMod;

import java.util.List;
import java.util.Comparator;

public class MimicTerrantulaTickFixedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null)) {
			if (Math.sqrt(Math.pow(entity.getX() - (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX(), 2) + Math.pow(entity.getY() - (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY(), 2)
					+ Math.pow(entity.getZ() - (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ(), 2)) <= 7
					&& (entity instanceof MimicTerrantulaEntity _datEntL11 && _datEntL11.getEntityData().get(MimicTerrantulaEntity.DATA_HasRevealed)) == false) {
				if (entity instanceof MimicTerrantulaEntity) {
					((MimicTerrantulaEntity) entity).setAnimation("Emerge");
				}
				if (entity instanceof MimicTerrantulaEntity _datEntSetL)
					_datEntSetL.getEntityData().set(MimicTerrantulaEntity.DATA_HasRevealed, true);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fightsfrights:terrantula_emerge")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fightsfrights:terrantula_emerge")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				FightsfrightsMod.queueServerWork(8, () -> {
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.CAMPFIRE_COSY_SMOKE, x, y, z, 60, 0.6, 0.1, 0.6, 0.02);
				});
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(7 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (entityiterator instanceof Player) {
							if (entityiterator instanceof ServerPlayer _player) {
								Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("fightsfrights:itsy_bitsy"));
								AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
								if (!_ap.isDone()) {
									for (String criteria : _ap.getRemainingCriteria())
										_player.getAdvancements().award(_adv, criteria);
								}
							}
						}
					}
				}
			}
		} else if ((entity instanceof MimicTerrantulaEntity _datEntL20 && _datEntL20.getEntityData().get(MimicTerrantulaEntity.DATA_HasRevealed)) == false && Mth.nextInt(RandomSource.create(), 1, 5) == 1) {
			world.addParticle(ParticleTypes.CAMPFIRE_COSY_SMOKE, x, y, z, 0, 0, 0);
		}
	}
}
