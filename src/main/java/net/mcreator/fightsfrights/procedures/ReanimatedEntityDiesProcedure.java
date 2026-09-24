package net.mcreator.fightsfrights.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import java.util.List;
import java.util.Comparator;

public class ReanimatedEntityDiesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"execute as @e[ distance=5..20, type=!fightsfrights:reanimated, type=!minecraft:item, type=!minecraft:experience_orb, type=!minecraft:area_effect_cloud, type=!minecraft:arrow, type=!minecraft:spectral_arrow, type=!minecraft:trident, type=!minecraft:fireball, type=!minecraft:small_fireball, type=!minecraft:dragon_fireball, type=!minecraft:wither_skull, type=!minecraft:snowball, type=!minecraft:egg, type=!minecraft:ender_pearl, type=!minecraft:potion, type=!minecraft:experience_bottle, type=!minecraft:boat, type=!minecraft:chest_boat, type=!minecraft:minecart, type=!minecraft:armor_stand, type=!minecraft:item_frame, type=!minecraft:glow_item_frame, type=!minecraft:painting, type=!minecraft:lightning_bolt, type=!minecraft:fishing_bobber ] at @s run summon minecraft:lightning_bolt");
			}
		}
	}
}
