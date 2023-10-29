
package net.mcreator.cataclysmicrealms.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.cataclysmicrealms.init.CataclysmicRealmsModFluids;
import net.mcreator.cataclysmicrealms.init.CataclysmicRealmsModFluidTypes;
import net.mcreator.cataclysmicrealms.init.CataclysmicRealmsModBlocks;

public abstract class ChaosFluidFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> CataclysmicRealmsModFluidTypes.CHAOS_FLUID_TYPE.get(), () -> CataclysmicRealmsModFluids.CHAOS_FLUID.get(),
			() -> CataclysmicRealmsModFluids.FLOWING_CHAOS_FLUID.get()).explosionResistance(100f).block(() -> (LiquidBlock) CataclysmicRealmsModBlocks.CHAOS_FLUID.get());

	private ChaosFluidFluid() {
		super(PROPERTIES);
	}

	public static class Source extends ChaosFluidFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends ChaosFluidFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
