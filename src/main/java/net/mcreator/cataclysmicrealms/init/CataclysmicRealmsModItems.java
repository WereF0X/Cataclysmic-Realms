
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cataclysmicrealms.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.cataclysmicrealms.item.ChaosCatalystItem;
import net.mcreator.cataclysmicrealms.CataclysmicRealmsMod;

public class CataclysmicRealmsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CataclysmicRealmsMod.MODID);
	public static final RegistryObject<Item> ENTROPY_STONE = block(CataclysmicRealmsModBlocks.ENTROPY_STONE);
	public static final RegistryObject<Item> DISARRAY_STONE = block(CataclysmicRealmsModBlocks.DISARRAY_STONE);
	public static final RegistryObject<Item> PORTAL = block(CataclysmicRealmsModBlocks.PORTAL);
	public static final RegistryObject<Item> CHAOS_CATALYST = REGISTRY.register("chaos_catalyst", () -> new ChaosCatalystItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
