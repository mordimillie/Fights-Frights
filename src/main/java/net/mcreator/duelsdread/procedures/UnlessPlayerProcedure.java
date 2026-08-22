package net.mcreator.duelsdread.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;

public class UnlessPlayerProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return !((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof Player);
	}
}
