package net.mcreator.duelsdread.procedures;

import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;

import net.mcreator.duelsdread.entity.NetheriteDroidEntity;

public class UnlessSelfProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return !((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof NetheriteDroidEntity);
	}
}
