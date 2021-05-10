package com.github.nebelnidas.oceancraft.feature;

import com.github.nebelnidas.oceancraft.init.OceancraftBlocks;

import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.ProbabilityConfig;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;


public abstract class OceancraftFeature<FC extends FeatureConfig> {
	public static SeaweedFeature SEAWEED;
	public static SeaweedFeature THICK_SEAWEED;
	public static CoralFeature SEAROD_CORAL;
	public static CoralFeature SEAWHIP_CORAL;
	public static CoralFeature SHEET_CORAL;
	public static CoralFeature STAR_CORAL;
	public static CoralFeature BRAIN_CORAL;


	private static <C extends FeatureConfig, F extends Feature<C>> F registerFeature(String name, F feature) {
		return (F)Registry.register(Registry.FEATURE, name, feature);
	}

	public static void init() {
		// Seaweed
		SEAWEED = registerFeature("seaweed", new SeaweedFeature(ProbabilityConfig.CODEC, OceancraftBlocks.SEAWEED_PLANT_BLOCK));
		THICK_SEAWEED = registerFeature("thick_seaweed", new SeaweedFeature(ProbabilityConfig.CODEC, OceancraftBlocks.THICK_SEAWEED_PLANT_BLOCK));
		// Corals
		SEAROD_CORAL = registerFeature("searod_coral", new CoralFeature(ProbabilityConfig.CODEC, OceancraftBlocks.SEAROD_CORAL));
		SEAWHIP_CORAL = registerFeature("seawhip_coral", new CoralFeature(ProbabilityConfig.CODEC, OceancraftBlocks.SEAWHIP_CORAL));
		SHEET_CORAL = registerFeature("sheet_coral", new CoralFeature(ProbabilityConfig.CODEC, OceancraftBlocks.SHEET_CORAL));
		STAR_CORAL = registerFeature("star_coral", new CoralFeature(ProbabilityConfig.CODEC, OceancraftBlocks.STAR_CORAL));
		BRAIN_CORAL = registerFeature("brain_coral", new CoralFeature(ProbabilityConfig.CODEC, OceancraftBlocks.BRAIN_CORAL));
	}
}
