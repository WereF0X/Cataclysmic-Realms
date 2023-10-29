
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cataclysmicrealms.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.cataclysmicrealms.world.inventory.KeyMenu;
import net.mcreator.cataclysmicrealms.CataclysmicRealmsMod;

public class CataclysmicRealmsModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, CataclysmicRealmsMod.MODID);
	public static final RegistryObject<MenuType<KeyMenu>> KEY = REGISTRY.register("key", () -> IForgeMenuType.create(KeyMenu::new));
}
