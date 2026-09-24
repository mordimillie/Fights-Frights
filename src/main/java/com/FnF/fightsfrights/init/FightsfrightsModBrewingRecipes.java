
package net.mcreator.fightsfrights.init;

import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.item.alchemy.PotionUtils;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;

import mezz.jei.api.registration.IRecipeRegistration;
import mezz.jei.api.recipe.vanilla.IVanillaRecipeFactory;
import mezz.jei.api.recipe.vanilla.IJeiBrewingRecipe;
import mezz.jei.api.constants.RecipeTypes;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.IModPlugin;

import java.util.List;
import java.util.ArrayList;

@JeiPlugin
public class FightsfrightsModBrewingRecipes implements IModPlugin {
	@Override
	public ResourceLocation getPluginUid() {
		return new ResourceLocation("fightsfrights:brewing_recipes");
	}

	@Override
	public void registerRecipes(IRecipeRegistration registration) {
		IVanillaRecipeFactory factory = registration.getVanillaRecipeFactory();
		List<IJeiBrewingRecipe> brewingRecipes = new ArrayList<>();
		ItemStack potion = new ItemStack(Items.POTION);
		ItemStack potion2 = new ItemStack(Items.POTION);
		List<ItemStack> ingredientStack = new ArrayList<>();
		List<ItemStack> inputStack = new ArrayList<>();
		ingredientStack.add(new ItemStack(FightsfrightsModItems.BANSHAAS_LUNGS.get()));
		PotionUtils.setPotion(potion, Potions.AWKWARD);
		PotionUtils.setPotion(potion2, FightsfrightsModPotions.GAZINGPOTION.get());
		brewingRecipes.add(factory.createBrewingRecipe(List.copyOf(ingredientStack), potion.copy(), potion2.copy()));
		ingredientStack.clear();
		ingredientStack.add(new ItemStack(FightsfrightsModItems.TERRANTULA_LEG.get()));
		PotionUtils.setPotion(potion, Potions.AWKWARD);
		PotionUtils.setPotion(potion2, FightsfrightsModPotions.HASTE.get());
		brewingRecipes.add(factory.createBrewingRecipe(List.copyOf(ingredientStack), potion.copy(), potion2.copy()));
		ingredientStack.clear();
		ingredientStack.add(new ItemStack(Items.GLOWSTONE_DUST));
		PotionUtils.setPotion(potion, FightsfrightsModPotions.HASTE.get());
		PotionUtils.setPotion(potion2, FightsfrightsModPotions.HASTE_2.get());
		brewingRecipes.add(factory.createBrewingRecipe(List.copyOf(ingredientStack), potion.copy(), potion2.copy()));
		ingredientStack.clear();
		ingredientStack.add(new ItemStack(Items.FERMENTED_SPIDER_EYE));
		PotionUtils.setPotion(potion, FightsfrightsModPotions.GAZINGPOTION.get());
		PotionUtils.setPotion(potion2, FightsfrightsModPotions.MAD_POTION.get());
		brewingRecipes.add(factory.createBrewingRecipe(List.copyOf(ingredientStack), potion.copy(), potion2.copy()));
		ingredientStack.clear();
		ingredientStack.add(new ItemStack(FightsfrightsModItems.ELDER_SPINE.get()));
		PotionUtils.setPotion(potion, Potions.AWKWARD);
		PotionUtils.setPotion(potion2, FightsfrightsModPotions.GUARDIANS_STRENGTH.get());
		brewingRecipes.add(factory.createBrewingRecipe(List.copyOf(ingredientStack), potion.copy(), potion2.copy()));
		ingredientStack.clear();
		ingredientStack.add(new ItemStack(FightsfrightsModBlocks.BLIGHTCAP.get()));
		PotionUtils.setPotion(potion, Potions.AWKWARD);
		PotionUtils.setPotion(potion2, FightsfrightsModPotions.DEATHBLIGHT.get());
		brewingRecipes.add(factory.createBrewingRecipe(List.copyOf(ingredientStack), potion.copy(), potion2.copy()));
		ingredientStack.clear();
		ingredientStack.add(new ItemStack(FightsfrightsModItems.MIMENTIS_CLAW.get()));
		PotionUtils.setPotion(potion, FightsfrightsModPotions.GAZINGPOTION.get());
		PotionUtils.setPotion(potion2, FightsfrightsModPotions.AVERTED_POTION.get());
		brewingRecipes.add(factory.createBrewingRecipe(List.copyOf(ingredientStack), potion.copy(), potion2.copy()));
		ingredientStack.clear();
		ingredientStack.add(new ItemStack(FightsfrightsModItems.FOREWINGS.get()));
		PotionUtils.setPotion(potion, Potions.AWKWARD);
		PotionUtils.setPotion(potion2, Potions.SLOW_FALLING);
		brewingRecipes.add(factory.createBrewingRecipe(List.copyOf(ingredientStack), potion.copy(), potion2.copy()));
		ingredientStack.clear();
		ingredientStack.add(new ItemStack(FightsfrightsModItems.PATHOGEN.get()));
		PotionUtils.setPotion(potion, Potions.AWKWARD);
		PotionUtils.setPotion(potion2, FightsfrightsModPotions.INFECTION_P.get());
		brewingRecipes.add(factory.createBrewingRecipe(List.copyOf(ingredientStack), potion.copy(), potion2.copy()));
		ingredientStack.clear();
		ingredientStack.add(new ItemStack(FightsfrightsModItems.NIGHTMARE.get()));
		inputStack.add(new ItemStack(FightsfrightsModItems.OMINOUS_BOTTLE.get()));
		brewingRecipes.add(factory.createBrewingRecipe(List.copyOf(ingredientStack), List.copyOf(inputStack), new ItemStack(FightsfrightsModItems.OMINOUS_ESSENCE.get())));
		inputStack.clear();
		ingredientStack.clear();
		ingredientStack.add(new ItemStack(FightsfrightsModItems.GOLDEN_TONGUE.get()));
		PotionUtils.setPotion(potion, Potions.AWKWARD);
		PotionUtils.setPotion(potion2, FightsfrightsModPotions.LEVITATION.get());
		brewingRecipes.add(factory.createBrewingRecipe(List.copyOf(ingredientStack), potion.copy(), potion2.copy()));
		ingredientStack.clear();
		registration.addRecipes(RecipeTypes.BREWING, brewingRecipes);
	}
}
