
package net.mcreator.fightsfrights.potion;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class MadMobEffect extends MobEffect {
	public MadMobEffect() {
		super(MobEffectCategory.NEUTRAL, -10092544);
		this.addAttributeModifier(Attributes.FOLLOW_RANGE, "3ddc4af5-da69-3f44-b8b9-6318129865b9", 100, AttributeModifier.Operation.ADDITION);
		this.addAttributeModifier(Attributes.MOVEMENT_SPEED, "290c49b1-6b13-3a82-b16c-c10121a86894", 0.05, AttributeModifier.Operation.ADDITION);
		this.addAttributeModifier(Attributes.ATTACK_DAMAGE, "10c0fa0b-353d-3634-bdaf-86d9c3066987", 2, AttributeModifier.Operation.ADDITION);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
