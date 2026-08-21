package net.mcreator.fightsfrights.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.decoration.Painting;
import net.minecraft.world.entity.decoration.ItemFrame;
import net.minecraft.world.entity.decoration.GlowItemFrame;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.fightsfrights.entity.ReanimatedEntity;
import net.mcreator.fightsfrights.FightsfrightsMod;

import java.util.List;
import java.util.Comparator;

public class ReanimatedEntityIsHurtProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.ELECTRIC_SPARK, x, y, z, 15, 6.6, 6.6, 6.6, 0);
		if (Mth.nextInt(RandomSource.create(), 1, 200) == 1) {
			world.addParticle(ParticleTypes.CAMPFIRE_SIGNAL_SMOKE, x, (y + 2), z, 0, 0.12, 0);
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(14 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (!(entityiterator instanceof ItemEntity || entityiterator instanceof Boat || entityiterator instanceof Arrow || entityiterator instanceof ReanimatedEntity || entityiterator instanceof Painting
							|| entityiterator instanceof GlowItemFrame || entityiterator instanceof ItemFrame)) {
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.GLOW, (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 40, 0.125, 0.1, 0.125, 0.1);
						FightsfrightsMod.queueServerWork(20, () -> {
							if (entityiterator instanceof Player && (entityiterator instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == Items.SHIELD) {
								if (entityiterator instanceof Player _player)
									_player.getCooldowns().addCooldown((entityiterator instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem(), 60);
							}
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"execute as @e[ distance=..12, type=!fightsfrights:reanimated, type=!minecraft:item, type=!minecraft:experience_orb, type=!minecraft:area_effect_cloud, type=!minecraft:arrow, type=!minecraft:spectral_arrow, type=!minecraft:trident, type=!minecraft:fireball, type=!minecraft:small_fireball, type=!minecraft:dragon_fireball, type=!minecraft:wither_skull, type=!minecraft:snowball, type=!minecraft:egg, type=!minecraft:ender_pearl, type=!minecraft:potion, type=!minecraft:experience_bottle, type=!minecraft:boat, type=!minecraft:chest_boat, type=!minecraft:minecart, type=!minecraft:armor_stand, type=!minecraft:item_frame, type=!minecraft:glow_item_frame, type=!minecraft:painting, type=!minecraft:lightning_bolt, type=!minecraft:fishing_bobber ] at @s run summon minecraft:lightning_bolt");
						});
					}
				}
			}
		}
	}
}
