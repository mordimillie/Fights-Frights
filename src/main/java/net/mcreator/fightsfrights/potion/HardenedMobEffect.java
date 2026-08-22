
package net.mcreator.fightsfrights.potion;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.fightsfrights.FightsfrightsMod;

public class HardenedMobEffect extends MobEffect {
	public HardenedMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
		this.addAttributeModifier(Attributes.ARMOR, ResourceLocation.fromNamespaceAndPath(FightsfrightsMod.MODID, "effect.hardened_0"), 0.2, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.ATTACK_KNOCKBACK, ResourceLocation.fromNamespaceAndPath(FightsfrightsMod.MODID, "effect.hardened_1"), 0.1, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.KNOCKBACK_RESISTANCE, ResourceLocation.fromNamespaceAndPath(FightsfrightsMod.MODID, "effect.hardened_2"), 0.1, AttributeModifier.Operation.ADD_VALUE);
	}
}
