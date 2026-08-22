
package net.mcreator.fightsfrights.potion;

import net.neoforged.neoforge.common.NeoForgeMod;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.fightsfrights.FightsfrightsMod;

public class TerrifiedMobEffect extends MobEffect {
	public TerrifiedMobEffect() {
		super(MobEffectCategory.HARMFUL, -2096897);
		this.addAttributeModifier(Attributes.FLYING_SPEED, ResourceLocation.fromNamespaceAndPath(FightsfrightsMod.MODID, "effect.terrified_0"), -0.2, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(NeoForgeMod.SWIM_SPEED, ResourceLocation.fromNamespaceAndPath(FightsfrightsMod.MODID, "effect.terrified_1"), -0.2, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.MOVEMENT_SPEED, ResourceLocation.fromNamespaceAndPath(FightsfrightsMod.MODID, "effect.terrified_2"), -0.2, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.ATTACK_DAMAGE, ResourceLocation.fromNamespaceAndPath(FightsfrightsMod.MODID, "effect.terrified_3"), -5, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.ATTACK_SPEED, ResourceLocation.fromNamespaceAndPath(FightsfrightsMod.MODID, "effect.terrified_4"), -5, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.FOLLOW_RANGE, ResourceLocation.fromNamespaceAndPath(FightsfrightsMod.MODID, "effect.terrified_5"), -2, AttributeModifier.Operation.ADD_VALUE);
	}
}
