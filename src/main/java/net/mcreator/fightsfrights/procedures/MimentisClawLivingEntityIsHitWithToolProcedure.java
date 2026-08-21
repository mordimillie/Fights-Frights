package net.mcreator.fightsfrights.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class MimentisClawLivingEntityIsHitWithToolProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity, ItemStack itemstack) {
		if (entity == null || sourceentity == null)
			return;
		entity.push(
				(((-1) - itemstack.getEnchantmentLevel(Enchantments.BLOCK_FORTUNE) / 3)
						* ((entity.getX() - sourceentity.getX()) / Math.sqrt(Math.pow(entity.getX() - sourceentity.getX(), 2) + Math.pow(entity.getY() - sourceentity.getY(), 2) + Math.pow(entity.getZ() - sourceentity.getZ(), 2)))),
				(((-1) - itemstack.getEnchantmentLevel(Enchantments.BLOCK_FORTUNE) / 3)
						* ((entity.getY() - sourceentity.getY()) / Math.sqrt(Math.pow(entity.getX() - sourceentity.getX(), 2) + Math.pow(entity.getY() - sourceentity.getY(), 2) + Math.pow(entity.getZ() - sourceentity.getZ(), 2)))),
				(((-1) - itemstack.getEnchantmentLevel(Enchantments.BLOCK_FORTUNE) / 3)
						* ((entity.getZ() - sourceentity.getZ()) / Math.sqrt(Math.pow(entity.getX() - sourceentity.getX(), 2) + Math.pow(entity.getY() - sourceentity.getY(), 2) + Math.pow(entity.getZ() - sourceentity.getZ(), 2)))));
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fightsfrights:claw")), SoundSource.PLAYERS, (float) 0.1, (float) (-0.3 + Mth.nextInt(RandomSource.create(), -2, 2) / 4));
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fightsfrights:claw")), SoundSource.PLAYERS, (float) 0.1, (float) (-0.3 + Mth.nextInt(RandomSource.create(), -2, 2) / 4), false);
			}
		}
		{
			ItemStack _ist = itemstack;
			if (_ist.hurt(itemstack.getEnchantmentLevel(Enchantments.BLOCK_FORTUNE), RandomSource.create(), null)) {
				_ist.shrink(1);
				_ist.setDamageValue(0);
			}
		}
	}
}
