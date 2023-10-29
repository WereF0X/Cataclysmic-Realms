
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cataclysmicrealms.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.cataclysmicrealms.world.features.ores.EntropyStoneFeature;
import net.mcreator.cataclysmicrealms.world.features.ores.DisarrayStoneFeature;
import net.mcreator.cataclysmicrealms.CataclysmicRealmsMod;

@Mod.EventBusSubscriber
public class CataclysmicRealmsModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, CataclysmicRealmsMod.MODID);
	public static final RegistryObject<Feature<?>> ENTROPY_STONE = REGISTRY.register("entropy_stone", EntropyStoneFeature::new);
	public static final RegistryObject<Feature<?>> DISARRAY_STONE = REGISTRY.register("disarray_stone", DisarrayStoneFeature::new);
}
