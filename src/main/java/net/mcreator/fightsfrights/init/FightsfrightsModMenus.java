
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fightsfrights.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.fightsfrights.world.inventory.TrashcanGUIMenu;
import net.mcreator.fightsfrights.world.inventory.GUIthingyMenu;
import net.mcreator.fightsfrights.FightsfrightsMod;

public class FightsfrightsModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, FightsfrightsMod.MODID);
	public static final RegistryObject<MenuType<GUIthingyMenu>> CRUSHER_GUI = REGISTRY.register("crusher_gui", () -> IForgeMenuType.create(GUIthingyMenu::new));
	public static final RegistryObject<MenuType<TrashcanGUIMenu>> TRASHCAN_GUI = REGISTRY.register("trashcan_gui", () -> IForgeMenuType.create(TrashcanGUIMenu::new));
}
