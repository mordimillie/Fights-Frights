
package net.mcreator.fightsfrights.potion;

import net.neoforged.neoforge.common.EffectCure;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import java.util.Set;

public class AddictedMobEffect extends MobEffect {
	public AddictedMobEffect() {
		super(MobEffectCategory.NEUTRAL, -27904);
	}

	@Override
	public void fillEffectCures(Set<EffectCure> cures, MobEffectInstance effectInstance) {
	}
}
