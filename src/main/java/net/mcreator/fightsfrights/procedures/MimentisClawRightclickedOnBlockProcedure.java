package net.mcreator.fightsfrights.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

public class MimentisClawRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.CLOUD, (entity.getX()), (entity.getY() + 1), (entity.getZ()), 30, 0.125, 0.125, 0.125, 0.04);
		entity.push(
				((0.8 - itemstack.getEnchantmentLevel(Enchantments.SILK_TOUCH) * 2)
						* (((x + 0.5) - entity.getX()) / Math.sqrt(Math.pow((x + 0.5) - entity.getX(), 2) + Math.pow((y + 2 - itemstack.getEnchantmentLevel(Enchantments.SILK_TOUCH) * 2) - entity.getY(), 2) + Math.pow((z + 0.5) - entity.getZ(), 2)))),
				((0.8 - itemstack.getEnchantmentLevel(Enchantments.SILK_TOUCH) * 2) * (((y + 2 - itemstack.getEnchantmentLevel(Enchantments.SILK_TOUCH) * 2) - entity.getY())
						/ Math.sqrt(Math.pow((x + 0.5) - entity.getX(), 2) + Math.pow((y + 2 - itemstack.getEnchantmentLevel(Enchantments.SILK_TOUCH) * 2) - entity.getY(), 2) + Math.pow((z + 0.5) - entity.getZ(), 2)))),
				((0.8 - itemstack.getEnchantmentLevel(Enchantments.SILK_TOUCH) * 2) * (((z + 0.5) - entity.getZ())
						/ Math.sqrt(Math.pow((x + 0.5) - entity.getX(), 2) + Math.pow((y + 2 - itemstack.getEnchantmentLevel(Enchantments.SILK_TOUCH) * 2) - entity.getY(), 2) + Math.pow((z + 0.5) - entity.getZ(), 2)))));
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(itemstack.getItem(), (int) (12 - itemstack.getEnchantmentLevel(Enchantments.BLOCK_EFFICIENCY)));
		{
			ItemStack _ist = itemstack;
			if (_ist.hurt((int) (1 + itemstack.getEnchantmentLevel(Enchantments.BLOCK_EFFICIENCY) + itemstack.getEnchantmentLevel(Enchantments.SILK_TOUCH)), RandomSource.create(), null)) {
				_ist.shrink(1);
				_ist.setDamageValue(0);
			}
		}
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fightsfrights:claw")), SoundSource.PLAYERS, (float) 0.3, (float) (1 + Mth.nextInt(RandomSource.create(), -2, 2) / 4));
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fightsfrights:claw")), SoundSource.PLAYERS, (float) 0.3, (float) (1 + Mth.nextInt(RandomSource.create(), -2, 2) / 4), false);
			}
		}
		world.levelEvent(2001, BlockPos.containing(x + 0.5, y + 0.5, z + 0.5), Block.getId(blockstate));
	}
}
