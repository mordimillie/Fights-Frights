package net.mcreator.fightsfrights.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.fightsfrights.init.FightsfrightsModGameRules;
import net.mcreator.fightsfrights.init.FightsfrightsModEntities;
import net.mcreator.fightsfrights.init.FightsfrightsModBlocks;

import javax.annotation.Nullable;

import java.util.Comparator;

@Mod.EventBusSubscriber
public class SummonMonsterProcedure {
	@SubscribeEvent
	public static void onEntitySpawned(EntityJoinLevelEvent event) {
		execute(event, event.getLevel(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world.getLevelData().getGameRules().getBoolean(FightsfrightsModGameRules.DO_REANIMATED) == true) {
			if (entity instanceof LightningBolt) {
				if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.LIGHTNING_ROD && (world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock() == FightsfrightsModBlocks.ROTTEN_BLOCK.get()
						&& (world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock() == Blocks.COPPER_BLOCK && (world.getBlockState(BlockPos.containing(x, y - 4, z))).getBlock() == FightsfrightsModBlocks.ROTTEN_BLOCK.get()
						&& (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == FightsfrightsModBlocks.TOTEM_BLOCK.get()
						&& ((world.getBlockState(BlockPos.containing(x - 1, y - 3, z))).getBlock() == Blocks.COPPER_BLOCK && (world.getBlockState(BlockPos.containing(x + 1, y - 3, z))).getBlock() == Blocks.COPPER_BLOCK
								|| (world.getBlockState(BlockPos.containing(x, y - 3, z + 1))).getBlock() == Blocks.COPPER_BLOCK && (world.getBlockState(BlockPos.containing(x, y - 3, z - 1))).getBlock() == Blocks.COPPER_BLOCK)) {
					world.setBlock(BlockPos.containing(x, y - 4, z), Blocks.AIR.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x, y - 3, z), Blocks.AIR.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x, y - 2, z), Blocks.AIR.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x, y - 1, z), Blocks.AIR.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x, y - 3, z - 1), Blocks.AIR.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x, y - 3, z + 1), Blocks.AIR.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x + 1, y - 3, z), Blocks.AIR.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x - 1, y - 3, z), Blocks.AIR.defaultBlockState(), 3);
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = FightsfrightsModEntities.REANIMATED.get().spawn(_level, BlockPos.containing(x, y - 4, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.CAMPFIRE_SIGNAL_SMOKE, x, (y - 2), z, 100, 1, 1, 1, 0.07);
					if (((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("fightsfrights:itsalive"));
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
}
