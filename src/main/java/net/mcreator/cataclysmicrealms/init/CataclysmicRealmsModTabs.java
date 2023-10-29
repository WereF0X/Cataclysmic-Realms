
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cataclysmicrealms.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.cataclysmicrealms.CataclysmicRealmsMod;

public class CataclysmicRealmsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CataclysmicRealmsMod.MODID);
	public static final RegistryObject<CreativeModeTab> CATACLYSMIC_REALMS_CREATIVE_TAB = REGISTRY.register("cataclysmic_realms_creative_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.cataclysmic_realms.cataclysmic_realms_creative_tab")).icon(() -> new ItemStack(Blocks.BARRIER)).displayItems((parameters, tabData) -> {
				tabData.accept(CataclysmicRealmsModBlocks.ENTROPY_STONE.get().asItem());
				tabData.accept(CataclysmicRealmsModBlocks.DISARRAY_STONE.get().asItem());
				tabData.accept(CataclysmicRealmsModItems.CHAOS_CATALYST.get());
			})

					.build());
}
