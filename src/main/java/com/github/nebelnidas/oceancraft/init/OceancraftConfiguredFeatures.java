package com.github.nebelnidas.oceancraft.init;

import com.github.nebelnidas.oceancraft.Oceancraft;
import com.github.nebelnidas.oceancraft.feature.*;
import com.google.common.collect.ImmutableList;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.block.BlockState;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.ConfiguredFeatures;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.RandomFeatureConfig;
import net.minecraft.world.gen.feature.RandomPatchFeatureConfig;
import net.minecraft.world.gen.placer.SimpleBlockPlacer;
import net.minecraft.world.gen.stateprovider.WeightedBlockStateProvider;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.ProbabilityConfig;
import net.minecraft.world.gen.decorator.CountExtraDecoratorConfig;
import net.minecraft.world.gen.decorator.CountNoiseBiasedDecoratorConfig;
import net.minecraft.world.gen.decorator.Decorator;


// This class exports public block constants, these fields have to be public
public class OceancraftConfiguredFeatures {
	public static ConfiguredFeature<?, ?> SEAWEED;
	public static RegistryKey<ConfiguredFeature<?, ?>> SEAWEED_FEATURE_KEY;
	public static ConfiguredFeature<?, ?> THICK_SEAWEED;
	public static RegistryKey<ConfiguredFeature<?, ?>> THICK_SEAWEED_FEATURE_KEY;

	public static ConfiguredFeature<?, ?> SEAROD_CORAL;
	public static RegistryKey<ConfiguredFeature<?, ?>> SEAROD_CORAL_FEATURE_KEY;
	public static ConfiguredFeature<?, ?> SEAWHIP_CORAL;
	public static RegistryKey<ConfiguredFeature<?, ?>> SEAWHIP_CORAL_FEATURE_KEY;
	public static ConfiguredFeature<?, ?> SHEET_CORAL;
	public static RegistryKey<ConfiguredFeature<?, ?>> SHEET_CORAL_FEATURE_KEY;
	public static ConfiguredFeature<?, ?> STAR_CORAL;
	public static RegistryKey<ConfiguredFeature<?, ?>> STAR_CORAL_FEATURE_KEY;
	public static ConfiguredFeature<?, ?> BRAIN_CORAL;
	public static RegistryKey<ConfiguredFeature<?, ?>> BRAIN_CORAL_FEATURE_KEY;

	public static ConfiguredFeature<?, ?> OCEANCRAFT_CORALS;
	public static RegistryKey<ConfiguredFeature<?, ?>> OCEANCRAFT_CORALS_FEATURE_KEY;



	public static final class Configs {
		public static RandomPatchFeatureConfig OCEANCRAFT_CORALS_CONFIG;

		static {
			OCEANCRAFT_CORALS_CONFIG = (new RandomPatchFeatureConfig.Builder((new WeightedBlockStateProvider())
			.addState(States.SEAROD_CORAL, 1)
			.addState(States.SEAWHIP_CORAL, 1)
			.addState(States.SHEET_CORAL, 1)
			.addState(States.STAR_CORAL, 1)
			.addState(States.BRAIN_CORAL, 1)
			, SimpleBlockPlacer.INSTANCE)).tries(32).build();
		}
	}

	public static final class States {
		protected static BlockState SEAROD_CORAL;
		protected static BlockState SEAWHIP_CORAL;
		protected static BlockState SHEET_CORAL;
		protected static BlockState STAR_CORAL;
		protected static BlockState BRAIN_CORAL;

		static {
			SEAROD_CORAL = OceancraftBlocks.SEAROD_CORAL.getDefaultState();
			SEAWHIP_CORAL = OceancraftBlocks.SEAWHIP_CORAL.getDefaultState();
			SHEET_CORAL = OceancraftBlocks.SHEET_CORAL.getDefaultState();
			STAR_CORAL = OceancraftBlocks.STAR_CORAL.getDefaultState();
			BRAIN_CORAL = OceancraftBlocks.BRAIN_CORAL.getDefaultState();
		}
	}


	public static void init() {
		 // ------------------------------------------------------------
		// Configuration
		// Probability affects the density, repeat affects how widespread it is
		SEAWEED = OceancraftFeature.SEAWEED.configure(new ProbabilityConfig(0.4F)).repeat(48)
			.decorate(ConfiguredFeatures.Decorators.TOP_SOLID_HEIGHTMAP).spreadHorizontally()
			.decorate(ConfiguredFeatures.Decorators.SQUARE_TOP_SOLID_HEIGHTMAP);
		THICK_SEAWEED = OceancraftFeature.THICK_SEAWEED.configure(new ProbabilityConfig(0.4F)).repeat(48)
			.decorate(ConfiguredFeatures.Decorators.TOP_SOLID_HEIGHTMAP).spreadHorizontally()
			.decorate(ConfiguredFeatures.Decorators.SQUARE_TOP_SOLID_HEIGHTMAP);

		SEAROD_CORAL = OceancraftFeature.SEAROD_CORAL.configure(new ProbabilityConfig(0.1F)).repeat(48)
			.decorate(ConfiguredFeatures.Decorators.SQUARE_TOP_SOLID_HEIGHTMAP);
		SEAWHIP_CORAL = OceancraftFeature.SEAWHIP_CORAL.configure(new ProbabilityConfig(0.1F)).repeat(48)
			.decorate(ConfiguredFeatures.Decorators.SQUARE_TOP_SOLID_HEIGHTMAP);
		SHEET_CORAL = OceancraftFeature.SHEET_CORAL.configure(new ProbabilityConfig(0.1F)).repeat(48)
			.decorate(ConfiguredFeatures.Decorators.SQUARE_TOP_SOLID_HEIGHTMAP);
		STAR_CORAL = OceancraftFeature.STAR_CORAL.configure(new ProbabilityConfig(0.1F)).repeat(48)
			.decorate(ConfiguredFeatures.Decorators.SQUARE_TOP_SOLID_HEIGHTMAP);
		BRAIN_CORAL = OceancraftFeature.BRAIN_CORAL.configure(new ProbabilityConfig(0.1F)).repeat(48)
			.decorate(ConfiguredFeatures.Decorators.SQUARE_TOP_SOLID_HEIGHTMAP);



		 // ------------------------------------------------------------
		// Registration
		SEAWEED_FEATURE_KEY = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(Oceancraft.MOD_ID, "seaweed"));
		SEAWEED = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, SEAWEED_FEATURE_KEY.getValue(), SEAWEED);
		THICK_SEAWEED_FEATURE_KEY = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(Oceancraft.MOD_ID, "thick_seaweed"));
		THICK_SEAWEED = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, THICK_SEAWEED_FEATURE_KEY.getValue(), THICK_SEAWEED);

		SEAROD_CORAL_FEATURE_KEY = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(Oceancraft.MOD_ID, "searod_coral"));
		SEAROD_CORAL = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, SEAROD_CORAL_FEATURE_KEY.getValue(), SEAROD_CORAL);
		SEAWHIP_CORAL_FEATURE_KEY = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(Oceancraft.MOD_ID, "seawhip_coral"));
		SEAWHIP_CORAL = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, SEAWHIP_CORAL_FEATURE_KEY.getValue(), SEAWHIP_CORAL);
		SHEET_CORAL_FEATURE_KEY = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(Oceancraft.MOD_ID, "sheet_coral"));
		SHEET_CORAL = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, SHEET_CORAL_FEATURE_KEY.getValue(), SHEET_CORAL);
		STAR_CORAL_FEATURE_KEY = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(Oceancraft.MOD_ID, "star_coral"));
		STAR_CORAL = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, STAR_CORAL_FEATURE_KEY.getValue(), STAR_CORAL);
		BRAIN_CORAL_FEATURE_KEY = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(Oceancraft.MOD_ID, "brain_coral"));
		BRAIN_CORAL = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, BRAIN_CORAL_FEATURE_KEY.getValue(), BRAIN_CORAL);


		// OCEANCRAFT_CORALS_FEATURE_KEY = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(Oceancraft.MOD_ID, "oceancraft_corals"));
		// OCEANCRAFT_CORALS = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, OCEANCRAFT_CORALS_FEATURE_KEY.getValue(), Feature.RANDOM_PATCH.configure(Configs.OCEANCRAFT_CORALS_CONFIG));


		 // ------------------------------------------------------------
		// Adding
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.VEGETAL_DECORATION, SEAWEED_FEATURE_KEY);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.VEGETAL_DECORATION, THICK_SEAWEED_FEATURE_KEY);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.VEGETAL_DECORATION, SEAROD_CORAL_FEATURE_KEY);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.VEGETAL_DECORATION, SEAWHIP_CORAL_FEATURE_KEY);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.VEGETAL_DECORATION, SHEET_CORAL_FEATURE_KEY);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.VEGETAL_DECORATION, STAR_CORAL_FEATURE_KEY);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.VEGETAL_DECORATION, BRAIN_CORAL_FEATURE_KEY);
		// BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.VEGETAL_DECORATION, OCEANCRAFT_CORALS_FEATURE_KEY);
	}
}
