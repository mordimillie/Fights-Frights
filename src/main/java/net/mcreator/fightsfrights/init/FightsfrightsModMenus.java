
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fightsfrights.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.core.registries.Registries;

import net.mcreator.fightsfrights.world.inventory.TrashcanGUIMenu;
import net.mcreator.fightsfrights.world.inventory.GUIthingyMenu;
import net.mcreator.fightsfrights.FightsfrightsMod;

public class FightsfrightsModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, FightsfrightsMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<GUIthingyMenu>> CRUSHER_GUI = REGISTRY.register("crusher_gui", () -> IMenuTypeExtension.create(GUIthingyMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<TrashcanGUIMenu>> TRASHCAN_GUI = REGISTRY.register("trashcan_gui", () -> IMenuTypeExtension.create(TrashcanGUIMenu::new));
}
