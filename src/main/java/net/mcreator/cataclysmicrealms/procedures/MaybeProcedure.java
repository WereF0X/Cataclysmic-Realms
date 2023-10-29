package net.mcreator.cataclysmicrealms.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.cataclysmicrealms.init.CataclysmicRealmsModItems;
import net.mcreator.cataclysmicrealms.init.CataclysmicRealmsModBlocks;
import net.mcreator.cataclysmicrealms.CataclysmicRealmsMod;

import java.util.function.Supplier;
import java.util.Map;

public class MaybeProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == CataclysmicRealmsModItems.CHAOS_CATALYST
				.get()) {
			CataclysmicRealmsMod.queueServerWork(20, () -> {
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.END_ROD, (x + 1), (y + 1), (z + 2), 25, 3, 3, 3, 1.5);
				world.setBlock(BlockPos.containing(x + 1, y + 1, z + 2), CataclysmicRealmsModBlocks.ENTROPY_STONE.get().defaultBlockState(), 3);
				CataclysmicRealmsMod.queueServerWork(20, () -> {
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.END_ROD, (x - 1), (y + 1), (z + 2), 25, 3, 3, 3, 1.5);
					world.setBlock(BlockPos.containing(x - 1, y + 1, z + 2), CataclysmicRealmsModBlocks.ENTROPY_STONE.get().defaultBlockState(), 3);
					CataclysmicRealmsMod.queueServerWork(20, () -> {
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.END_ROD, x, (y + 1), (z + 1), 25, 3, 3, 3, 1.5);
						world.setBlock(BlockPos.containing(x, y + 1, z + 1), CataclysmicRealmsModBlocks.ENTROPY_STONE.get().defaultBlockState(), 3);
						CataclysmicRealmsMod.queueServerWork(20, () -> {
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.END_ROD, x, (y + 1), (z + 3), 25, 3, 3, 3, 1.5);
							world.setBlock(BlockPos.containing(x, y + 1, z + 3), CataclysmicRealmsModBlocks.ENTROPY_STONE.get().defaultBlockState(), 3);
							CataclysmicRealmsMod.queueServerWork(20, () -> {
								if (world instanceof ServerLevel _level)
									_level.sendParticles(ParticleTypes.END_ROD, (x + 1), (y + 1), (z + 1), 25, 3, 3, 3, 1.5);
								world.setBlock(BlockPos.containing(x + 1, y + 1, z + 1), Blocks.QUARTZ_STAIRS.defaultBlockState(), 3);
								if (world instanceof Level _level)
									_level.updateNeighborsAt(BlockPos.containing(x, y, z), _level.getBlockState(BlockPos.containing(x, y, z)).getBlock());
								CataclysmicRealmsMod.queueServerWork(20, () -> {
									if (world instanceof ServerLevel _level)
										_level.sendParticles(ParticleTypes.END_ROD, (x - 1), (y + 1), (z + 1), 25, 3, 3, 3, 1.5);
									world.setBlock(BlockPos.containing(x - 1, y + 1, z + 1), Blocks.QUARTZ_STAIRS.defaultBlockState(), 3);
									if (world instanceof Level _level)
										_level.updateNeighborsAt(BlockPos.containing(x, y, z), _level.getBlockState(BlockPos.containing(x, y, z)).getBlock());
									CataclysmicRealmsMod.queueServerWork(20, () -> {
										if (world instanceof ServerLevel _level)
											_level.sendParticles(ParticleTypes.END_ROD, (x + 1), (y + 1), (z + 3), 25, 3, 3, 3, 1.5);
										world.setBlock(BlockPos.containing(x + 1, y + 1, z + 3), Blocks.QUARTZ_STAIRS.defaultBlockState(), 3);
										if (world instanceof Level _level)
											_level.updateNeighborsAt(BlockPos.containing(x, y, z), _level.getBlockState(BlockPos.containing(x, y, z)).getBlock());
										CataclysmicRealmsMod.queueServerWork(20, () -> {
											if (world instanceof ServerLevel _level)
												_level.sendParticles(ParticleTypes.END_ROD, (x - 1), (y + 1), (z + 3), 25, 3, 3, 3, 1.5);
											world.setBlock(BlockPos.containing(x - 1, y + 1, z + 3), Blocks.QUARTZ_STAIRS.defaultBlockState(), 3);
											if (world instanceof Level _level)
												_level.updateNeighborsAt(BlockPos.containing(x, y, z), _level.getBlockState(BlockPos.containing(x, y, z)).getBlock());
											CataclysmicRealmsMod.queueServerWork(10, () -> {
												world.setBlock(BlockPos.containing(x + 1, y + 2, z + 2), Blocks.END_ROD.defaultBlockState(), 3);
												CataclysmicRealmsMod.queueServerWork(10, () -> {
													world.setBlock(BlockPos.containing(x - 1, y + 2, z + 2), Blocks.END_ROD.defaultBlockState(), 3);
													CataclysmicRealmsMod.queueServerWork(10, () -> {
														world.setBlock(BlockPos.containing(x, y + 2, z + 1), Blocks.END_ROD.defaultBlockState(), 3);
														CataclysmicRealmsMod.queueServerWork(10, () -> {
															world.setBlock(BlockPos.containing(x, y + 2, z + 3), Blocks.END_ROD.defaultBlockState(), 3);
															CataclysmicRealmsMod.queueServerWork(20, () -> {
																if (world instanceof ServerLevel _level)
																	_level.sendParticles(ParticleTypes.END_ROD, x, (y + 1), (z + 2), 25, 3, 3, 3, 1.5);
																world.setBlock(BlockPos.containing(x, y + 1, z + 2), CataclysmicRealmsModBlocks.PORTAL.get().defaultBlockState(), 3);
															});
														});
													});
												});
											});
										});
									});
								});
							});
						});
					});
				});
			});
		}
	}
}
