
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cataclysmicrealms.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.cataclysmicrealms.fluid.types.ChaosFluidFluidType;
import net.mcreator.cataclysmicrealms.CataclysmicRealmsMod;

public class CataclysmicRealmsModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, CataclysmicRealmsMod.MODID);
	public static final RegistryObject<FluidType> CHAOS_FLUID_TYPE = REGISTRY.register("chaos_fluid", () -> new ChaosFluidFluidType());
}
