
package net.mcreator.fightsfrights.potion;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.fightsfrights.FightsfrightsMod;

public class SummonTimeMobEffect extends MobEffect {
	public SummonTimeMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -10989);
		this.addAttributeModifier(Attributes.FLYING_SPEED, ResourceLocation.fromNamespaceAndPath(FightsfrightsMod.MODID, "effect.summon_time_0"), 1.2, AttributeModifier.Operation.ADD_MULTIPLIED_BASE);
	}
}
