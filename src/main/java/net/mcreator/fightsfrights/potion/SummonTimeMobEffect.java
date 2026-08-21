
package net.mcreator.fightsfrights.potion;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.fightsfrights.procedures.SummonTimeEffectExpiresProcedure;

public class SummonTimeMobEffect extends MobEffect {
	public SummonTimeMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -10989);
		this.addAttributeModifier(Attributes.FLYING_SPEED, "8156b501-ad05-3eeb-9b73-045f83073b28", 1.2, AttributeModifier.Operation.MULTIPLY_BASE);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		SummonTimeEffectExpiresProcedure.execute(entity.level(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
