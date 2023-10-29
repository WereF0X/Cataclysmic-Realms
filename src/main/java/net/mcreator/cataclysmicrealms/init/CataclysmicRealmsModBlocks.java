
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cataclysmicrealms.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.cataclysmicrealms.block.PortalBlock;
import net.mcreator.cataclysmicrealms.block.EntropyStoneBlock;
import net.mcreator.cataclysmicrealms.block.DisarrayStoneBlock;
import net.mcreator.cataclysmicrealms.block.ChaosFluidBlock;
import net.mcreator.cataclysmicrealms.CataclysmicRealmsMod;

public class CataclysmicRealmsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CataclysmicRealmsMod.MODID);
	public static final RegistryObject<Block> ENTROPY_STONE = REGISTRY.register("entropy_stone", () -> new EntropyStoneBlock());
	public static final RegistryObject<Block> CHAOS_FLUID = REGISTRY.register("chaos_fluid", () -> new ChaosFluidBlock());
	public static final RegistryObject<Block> DISARRAY_STONE = REGISTRY.register("disarray_stone", () -> new DisarrayStoneBlock());
	public static final RegistryObject<Block> PORTAL = REGISTRY.register("portal", () -> new PortalBlock());
}
