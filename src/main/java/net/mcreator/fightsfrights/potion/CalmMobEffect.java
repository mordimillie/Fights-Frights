
package net.mcreator.fightsfrights.potion;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class CalmMobEffect extends MobEffect {
	public CalmMobEffect() {
		super(MobEffectCategory.NEUTRAL, -14456864);
		this.addAttributeModifier(Attributes.FOLLOW_RANGE, "aee012e1-dded-368d-b248-cf9a789f5597", -30, AttributeModifier.Operation.ADDITION);
		this.addAttributeModifier(Attributes.MOVEMENT_SPEED, "7ad45913-6a96-3ce3-82aa-fa490c4d0e81", -0.02, AttributeModifier.Operation.ADDITION);
		this.addAttributeModifier(Attributes.ATTACK_DAMAGE, "d2a65330-c1d3-3975-a815-eca04e24d51d", -1.5, AttributeModifier.Operation.ADDITION);
		this.addAttributeModifier(Attributes.ARMOR, "f530da3e-a523-309a-a1fc-5df8bd09c62e", -0.5, AttributeModifier.Operation.ADDITION);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
