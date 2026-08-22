
package net.mcreator.fightsfrights.potion;

import net.neoforged.neoforge.common.EffectCure;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.fightsfrights.procedures.AsymptomaticOnEffectActiveTickProcedure;
import net.mcreator.fightsfrights.FightsfrightsMod;

import java.util.Set;

public class AsymptomaticMobEffect extends MobEffect {
	public AsymptomaticMobEffect() {
		super(MobEffectCategory.NEUTRAL, -5847468);
		this.addAttributeModifier(Attributes.MAX_HEALTH, ResourceLocation.fromNamespaceAndPath(FightsfrightsMod.MODID, "effect.asymptomatic_0"), 0.5, AttributeModifier.Operation.ADD_MULTIPLIED_BASE);
	}

	@Override
	public void fillEffectCures(Set<EffectCure> cures, MobEffectInstance effectInstance) {
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public boolean applyEffectTick(LivingEntity entity, int amplifier) {
		AsymptomaticOnEffectActiveTickProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
		return super.applyEffectTick(entity, amplifier);
	}
}
