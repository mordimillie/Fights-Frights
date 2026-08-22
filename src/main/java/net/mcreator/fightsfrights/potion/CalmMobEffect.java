
package net.mcreator.fightsfrights.potion;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.fightsfrights.FightsfrightsMod;

public class CalmMobEffect extends MobEffect {
	public CalmMobEffect() {
		super(MobEffectCategory.NEUTRAL, -14456864);
		this.addAttributeModifier(Attributes.FOLLOW_RANGE, ResourceLocation.fromNamespaceAndPath(FightsfrightsMod.MODID, "effect.calm_0"), -30, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.MOVEMENT_SPEED, ResourceLocation.fromNamespaceAndPath(FightsfrightsMod.MODID, "effect.calm_1"), -0.02, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.ATTACK_DAMAGE, ResourceLocation.fromNamespaceAndPath(FightsfrightsMod.MODID, "effect.calm_2"), -1.5, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.ARMOR, ResourceLocation.fromNamespaceAndPath(FightsfrightsMod.MODID, "effect.calm_3"), -0.5, AttributeModifier.Operation.ADD_VALUE);
	}
}
