
package net.mcreator.cataclysmicrealms.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.cataclysmicrealms.init.CataclysmicRealmsModFluids;

public class ChaosFluidBlock extends LiquidBlock {
	public ChaosFluidBlock() {
		super(() -> CataclysmicRealmsModFluids.CHAOS_FLUID.get(), BlockBehaviour.Properties.of().mapColor(MapColor.WATER).strength(100f).noCollission().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}
}
