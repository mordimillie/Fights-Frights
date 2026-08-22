
package net.mcreator.fightsfrights.potion;

import net.neoforged.neoforge.common.NeoForgeMod;

import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.fightsfrights.FightsfrightsMod;

public class AmphibianMobEffect extends MobEffect {
	public AmphibianMobEffect() {
		super(MobEffectCategory.NEUTRAL, -15073281);
		this.addAttributeModifier(NeoForgeMod.SWIM_SPEED, ResourceLocation.fromNamespaceAndPath(FightsfrightsMod.MODID, "effect.amphibian_0"), 1.5, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL);
	}
}
