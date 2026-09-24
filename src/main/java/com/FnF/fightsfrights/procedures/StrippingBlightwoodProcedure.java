package net.mcreator.fightsfrights.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.level.BlockEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.util.RandomSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.fightsfrights.init.FightsfrightsModBlocks;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class StrippingBlightwoodProcedure {
	@SubscribeEvent
	public static void onSecondaryToolUse(BlockEvent.BlockToolModificationEvent event) {
		String toolaction = event.getToolAction().toString().toLowerCase();
		toolaction = toolaction.replace("]", "").replace("toolaction[", "");
		String usehand = "";
		if (event.getContext().getHand() == InteractionHand.MAIN_HAND) {
			usehand = "mainhand";
		} else {
			usehand = "offhand";
		}
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getPlayer(), event.getHeldItemStack());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		execute(null, world, x, y, z, entity, itemstack);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getItem() instanceof AxeItem && (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == FightsfrightsModBlocks.BLIGHT_HYPHAE.get()) {
			if (entity instanceof Player _plr4)
				_plr4.resetAttackStrengthTicker();
			{
				ItemStack _ist = itemstack;
				if (_ist.hurt(1, RandomSource.create(), null)) {
					_ist.shrink(1);
					_ist.setDamageValue(0);
				}
			}
			world.setBlock(BlockPos.containing(x, y, z), FightsfrightsModBlocks.STRIPPED_BLIGHT_HYPHAE.get().defaultBlockState(), 3);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.axe.strip")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.axe.strip")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		} else if (itemstack.getItem() instanceof AxeItem && (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == FightsfrightsModBlocks.BLIGHT_STEM.get()) {
			if (entity instanceof Player _plr13)
				_plr13.resetAttackStrengthTicker();
			{
				ItemStack _ist = itemstack;
				if (_ist.hurt(1, RandomSource.create(), null)) {
					_ist.shrink(1);
					_ist.setDamageValue(0);
				}
			}
			world.setBlock(BlockPos.containing(x, y, z), FightsfrightsModBlocks.STRIPPED_BLIGHT_STEM.get().defaultBlockState(), 3);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.axe.strip")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.axe.strip")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		}
	}
}
