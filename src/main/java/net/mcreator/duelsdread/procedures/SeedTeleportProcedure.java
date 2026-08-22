package net.mcreator.duelsdread.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.duelsdread.init.DuelsdreadModItems;

public class SeedTeleportProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double randomX = 0;
		double randomZ = 0;
		double scanY = 0;
		double TpRadius = 0;
		boolean found = false;
		found = false;
		TpRadius = 32;
		for (int index0 = 0; index0 < (int) TpRadius; index0++) {
			randomX = entity.getX() + Mth.nextInt(RandomSource.create(), (int) (TpRadius * (-1)), (int) TpRadius);
			randomZ = entity.getZ() + Mth.nextInt(RandomSource.create(), (int) (TpRadius * (-1)), (int) TpRadius);
			scanY = entity.getY() + TpRadius;
			for (int index1 = 0; index1 < (int) (TpRadius * 2); index1++) {
				scanY = scanY - 1;
				if ((world.getBlockState(BlockPos.containing(randomX, scanY, randomZ))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(randomX, scanY + 1, randomZ))).getBlock() == Blocks.AIR
						&& world.getBlockState(BlockPos.containing(randomX, scanY - 1, randomZ)).canOcclude()) {
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.REVERSE_PORTAL, (entity.getX()), (entity.getY() + 1), (entity.getZ()), 30, 0.15, 0.25, 0.15, 0.07);
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.END_ROD, (entity.getX()), (entity.getY() + 1), (entity.getZ()), 30, 0.15, 0.25, 0.15, 0.07);
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.END_ROD, randomX, (scanY + 1), randomZ, 30, 0.15, 0.25, 0.15, 0.07);
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.REVERSE_PORTAL, randomX, (scanY + 1), randomZ, 30, 0.15, 0.25, 0.15, 0.07);
					{
						Entity _ent = entity;
						_ent.teleportTo(randomX, scanY, randomZ);
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport(randomX, scanY, randomZ, _ent.getYRot(), _ent.getXRot());
					}
					{
						ItemStack _ist = itemstack;
						if (_ist.hurt(1, RandomSource.create(), null)) {
							_ist.shrink(1);
							_ist.setDamageValue(0);
						}
					}
					if (entity instanceof Player _player)
						_player.getCooldowns().addCooldown(itemstack.getItem(), 200);
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(DuelsdreadModItems.PERPETUAL_ONE_DAY_BLINDING_STEW.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
					found = true;
					break;
				}
			}
			if (found == true) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(randomX, scanY, randomZ), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")), SoundSource.PLAYERS, 1, -3);
					} else {
						_level.playLocalSound(randomX, scanY, randomZ, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")), SoundSource.PLAYERS, 1, -3, false);
					}
				}
				entity.push(0, 0.2, 0);
				break;
			}
		}
	}
}
