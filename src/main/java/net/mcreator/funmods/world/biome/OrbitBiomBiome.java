
package net.mcreator.funmods.world.biome;

import net.minecraft.block.material.Material;
import java.util.ArrayList;
import java.util.HashMap;

@FunModsModElements.ModElement.Tag
public class OrbitBiomBiome extends FunModsModElements.ModElement {

	public static Biome biome;

	public OrbitBiomBiome(FunModsModElements instance) {
		super(instance, 57);
		FMLJavaModLoadingContext.get().getModEventBus().register(new BiomeRegisterHandler());
	}

	private static class BiomeRegisterHandler {

		@SubscribeEvent
		public void registerBiomes(RegistryEvent.Register<Biome> event) {
			if (biome == null) {
				BiomeAmbience effects = new BiomeAmbience.Builder().setFogColor(-1).setWaterColor(-6381922).setWaterFogColor(329011).withSkyColor(-1)
						.withFoliageColor(10387789).withGrassColor(9470285).build();

				BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder()
						.withSurfaceBuilder(SurfaceBuilder.DEFAULT.func_242929_a(new SurfaceBuilderConfig(OrbitDirtBlock.block.getDefaultState(),
								OrbitStoneBlock.block.getDefaultState(), OrbitStoneBlock.block.getDefaultState())));

				biomeGenerationSettings.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						Feature.TREE
								.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.AIR.getDefaultState()),
										new SimpleBlockStateProvider(Blocks.AIR.getDefaultState()),
										new BlobFoliagePlacer(FeatureSpread.func_242252_a(2), FeatureSpread.func_242252_a(0), 3),
										new StraightTrunkPlacer(0, 2, 0), new TwoLayerFeature(1, 0, 1))).setIgnoreVines().setMaxWaterDepth(0).build())
								.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
								.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(1, 0.1F, 1))));

				biomeGenerationSettings.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						Feature.RANDOM_PATCH.withConfiguration(Features.Configs.GRASS_PATCH_CONFIG).withPlacement(Features.Placements.PATCH_PLACEMENT)
								.withPlacement(Placement.COUNT_NOISE.configure(new NoiseDependant(-0.8D, 5, 4))));

				biomeGenerationSettings.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						Feature.FLOWER.withConfiguration(Features.Configs.NORMAL_FLOWER_CONFIG)
								.withPlacement(Features.Placements.VEGETATION_PLACEMENT).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
								.func_242731_b(4));

				DefaultBiomeFeatures.withCavesAndCanyons(biomeGenerationSettings);
				DefaultBiomeFeatures.withOverworldOres(biomeGenerationSettings);
				DefaultBiomeFeatures.withFrozenTopLayer(biomeGenerationSettings);

				MobSpawnInfo.Builder mobSpawnInfo = new MobSpawnInfo.Builder().isValidSpawnBiomeForPlayer();

				biome = new Biome.Builder().precipitation(Biome.RainType.NONE).category(Biome.Category.NONE).depth(0.1f).scale(0.2f).temperature(0.5f)
						.downfall(0f).setEffects(effects).withMobSpawnSettings(mobSpawnInfo.copy())
						.withGenerationSettings(biomeGenerationSettings.build()).build();

				event.getRegistry().register(biome.setRegistryName("fun_mods:orbit_biom"));
			}
		}

	}

	@Override
	public void init(FMLCommonSetupEvent event) {
	}

}