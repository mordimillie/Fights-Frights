package net.mcreator.fightsfrights.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.fightsfrights.entity.PioneerEntity;

public class PioneerOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double variant = 0;
		variant = Mth.nextInt(RandomSource.create(), 1, 10);
		if ((variant) > (4) && (variant) < (6)) {
			if (entity instanceof PioneerEntity animatable)
				animatable.setTexture("pioneer_orange");
		} else if ((variant) > (7) && (variant) < (9)) {
			if (entity instanceof PioneerEntity animatable)
				animatable.setTexture("pioneer_blue");
		} else if (variant == 10) {
			if (entity instanceof PioneerEntity animatable)
				animatable.setTexture("pioneer_empty");
		}
	}
}
