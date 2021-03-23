package com.github.nebelnidas.oceancraft.init;

import com.github.nebelnidas.oceancraft.Oceancraft;
import com.github.nebelnidas.oceancraft.feature.*;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.ConfiguredFeatures;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.CountNoiseBiasedDecoratorConfig;
import net.minecraft.world.gen.decorator.Decorator;


// This class exports public block constants, these fields have to be public
public class OceancraftFeatures {
	public static Feature<DefaultFeatureConfig> SEAWEED;
	public static ConfiguredFeature<?, ?> SEAWEED_CONFIGURED;
	public static RegistryKey<ConfiguredFeature<?, ?>> SEAWEED_FEATURE_KEY;

	public static Feature<DefaultFeatureConfig> THICK_SEAWEED;
	public static ConfiguredFeature<?, ?> THICK_SEAWEED_CONFIGURED;
	public static RegistryKey<ConfiguredFeature<?, ?>> THICK_SEAWEED_FEATURE_KEY;


	public static void init() {
		SEAWEED = new SeaweedFeature(DefaultFeatureConfig.CODEC, OceancraftBlocks.SEAWEED_PLANT_BLOCK);
		SEAWEED_CONFIGURED = SEAWEED.configure(FeatureConfig.DEFAULT)
			.decorate(ConfiguredFeatures.Decorators.TOP_SOLID_HEIGHTMAP).spreadHorizontally()
			.decorate(Decorator.COUNT_NOISE_BIASED.configure(new CountNoiseBiasedDecoratorConfig(60, 50.0D, 0.0D)));

		THICK_SEAWEED = new SeaweedFeature(DefaultFeatureConfig.CODEC, OceancraftBlocks.THICK_SEAWEED_PLANT_BLOCK);
		THICK_SEAWEED_CONFIGURED = THICK_SEAWEED.configure(FeatureConfig.DEFAULT)
			.decorate(ConfiguredFeatures.Decorators.TOP_SOLID_HEIGHTMAP).spreadHorizontally()
			.decorate(Decorator.COUNT_NOISE_BIASED.configure(new CountNoiseBiasedDecoratorConfig(60, 50.0D, 0.0D)));



		SEAWEED = registerFeature(SEAWEED, "seaweed");
		SEAWEED_FEATURE_KEY = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(Oceancraft.MOD_ID, "seaweed"));
		SEAWEED_CONFIGURED = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, SEAWEED_FEATURE_KEY.getValue(), SEAWEED_CONFIGURED);

		THICK_SEAWEED = registerFeature(THICK_SEAWEED, "thick_seaweed");
		THICK_SEAWEED_FEATURE_KEY = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(Oceancraft.MOD_ID, "thick_seaweed"));
		SEAWEED_CONFIGURED = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, THICK_SEAWEED_FEATURE_KEY.getValue(), THICK_SEAWEED_CONFIGURED);



		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.VEGETAL_DECORATION, SEAWEED_FEATURE_KEY);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.VEGETAL_DECORATION, THICK_SEAWEED_FEATURE_KEY);
	}

	private static <T extends Feature<?>> T registerFeature(Feature<?> feature, String id) {
        return (T) Registry.register(Registry.FEATURE, new Identifier(Oceancraft.MOD_ID, id), feature);
    }
}
