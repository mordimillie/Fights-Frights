
package net.mcreator.fightsfrights.potion;

import net.minecraftforge.common.ForgeMod;

import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class AmphibianMobEffect extends MobEffect {
	public AmphibianMobEffect() {
		super(MobEffectCategory.NEUTRAL, -15073281);
		this.addAttributeModifier(ForgeMod.SWIM_SPEED.get(), "215f1207-7bb1-379d-aa38-3324dcc00520", 1.5, AttributeModifier.Operation.MULTIPLY_TOTAL);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
