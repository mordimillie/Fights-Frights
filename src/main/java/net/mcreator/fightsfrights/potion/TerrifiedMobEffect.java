
package net.mcreator.fightsfrights.potion;

import net.minecraftforge.common.ForgeMod;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class TerrifiedMobEffect extends MobEffect {
	public TerrifiedMobEffect() {
		super(MobEffectCategory.HARMFUL, -2096897);
		this.addAttributeModifier(Attributes.FLYING_SPEED, "5e969185-568b-3b01-b6d5-a9e86e525cf0", -0.2, AttributeModifier.Operation.ADDITION);
		this.addAttributeModifier(ForgeMod.SWIM_SPEED.get(), "26b753f4-141c-3f31-b3a1-9839b0aa010c", -0.2, AttributeModifier.Operation.ADDITION);
		this.addAttributeModifier(Attributes.MOVEMENT_SPEED, "5eea00e2-6b39-3ee5-b5ea-26adb05a3ba9", -0.2, AttributeModifier.Operation.ADDITION);
		this.addAttributeModifier(Attributes.ATTACK_DAMAGE, "7ad781b5-70fc-39b4-a4c3-475701d7a978", -5, AttributeModifier.Operation.ADDITION);
		this.addAttributeModifier(Attributes.ATTACK_SPEED, "94ffa4b5-a5be-3dba-9fc2-dad46bd76d7c", -5, AttributeModifier.Operation.ADDITION);
		this.addAttributeModifier(Attributes.FOLLOW_RANGE, "c5c89085-a45f-30c8-881e-dddc176f4eb0", -2, AttributeModifier.Operation.ADDITION);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
