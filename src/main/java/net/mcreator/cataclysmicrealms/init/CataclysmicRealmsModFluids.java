
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cataclysmicrealms.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.cataclysmicrealms.fluid.ChaosFluidFluid;
import net.mcreator.cataclysmicrealms.CataclysmicRealmsMod;

public class CataclysmicRealmsModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, CataclysmicRealmsMod.MODID);
	public static final RegistryObject<FlowingFluid> CHAOS_FLUID = REGISTRY.register("chaos_fluid", () -> new ChaosFluidFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_CHAOS_FLUID = REGISTRY.register("flowing_chaos_fluid", () -> new ChaosFluidFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(CHAOS_FLUID.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_CHAOS_FLUID.get(), RenderType.translucent());
		}
	}
}
