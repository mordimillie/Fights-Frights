
package net.mcreator.fightsfrights.potion;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.fightsfrights.FightsfrightsMod;

public class MadMobEffect extends MobEffect {
	public MadMobEffect() {
		super(MobEffectCategory.NEUTRAL, -10092544);
		this.addAttributeModifier(Attributes.FOLLOW_RANGE, ResourceLocation.fromNamespaceAndPath(FightsfrightsMod.MODID, "effect.mad_0"), 100, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.MOVEMENT_SPEED, ResourceLocation.fromNamespaceAndPath(FightsfrightsMod.MODID, "effect.mad_1"), 0.05, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.ATTACK_DAMAGE, ResourceLocation.fromNamespaceAndPath(FightsfrightsMod.MODID, "effect.mad_2"), 2, AttributeModifier.Operation.ADD_VALUE);
	}
}
