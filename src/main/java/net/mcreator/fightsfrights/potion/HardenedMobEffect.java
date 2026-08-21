
package net.mcreator.fightsfrights.potion;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class HardenedMobEffect extends MobEffect {
	public HardenedMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
		this.addAttributeModifier(Attributes.ARMOR, "9901c43b-fc84-38c5-874a-bd017fb6b4eb", 0.2, AttributeModifier.Operation.ADDITION);
		this.addAttributeModifier(Attributes.ATTACK_KNOCKBACK, "7dd3b759-caad-33f5-bf7b-41f7b30cd3f3", 0.1, AttributeModifier.Operation.ADDITION);
		this.addAttributeModifier(Attributes.KNOCKBACK_RESISTANCE, "e5e841a3-4ab7-37e6-86ee-4966c8a5fa81", 0.1, AttributeModifier.Operation.ADDITION);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
