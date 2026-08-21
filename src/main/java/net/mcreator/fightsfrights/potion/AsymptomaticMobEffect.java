
package net.mcreator.fightsfrights.potion;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.fightsfrights.procedures.AsymptomaticOnEffectActiveTickProcedure;

import java.util.List;
import java.util.ArrayList;

public class AsymptomaticMobEffect extends MobEffect {
	public AsymptomaticMobEffect() {
		super(MobEffectCategory.NEUTRAL, -5847468);
		this.addAttributeModifier(Attributes.MAX_HEALTH, "2f1f36ce-e820-345c-ae1d-f28dfafa71ed", 0.5, AttributeModifier.Operation.MULTIPLY_BASE);
	}

	@Override
	public List<ItemStack> getCurativeItems() {
		ArrayList<ItemStack> cures = new ArrayList<ItemStack>();
		return cures;
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		AsymptomaticOnEffectActiveTickProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
