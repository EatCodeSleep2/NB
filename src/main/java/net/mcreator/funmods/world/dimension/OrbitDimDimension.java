
package net.mcreator.funmods.world.dimension;

import net.minecraft.block.material.Material;

@FunModsModElements.ModElement.Tag
public class OrbitDimDimension extends FunModsModElements.ModElement {

	public OrbitDimDimension(FunModsModElements instance) {
		super(instance, 58);

	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		DeferredWorkQueue.runLater(() -> {
			try {
				ObfuscationReflectionHelper.setPrivateValue(WorldCarver.class, WorldCarver.CAVE, new ImmutableSet.Builder<Block>()
						.addAll((Set<Block>) ObfuscationReflectionHelper.getPrivateValue(WorldCarver.class, WorldCarver.CAVE, "field_222718_j"))
						.add(OrbitStoneBlock.block.getDefaultState().getBlock()).build(), "field_222718_j");

				ObfuscationReflectionHelper.setPrivateValue(WorldCarver.class, WorldCarver.CANYON, new ImmutableSet.Builder<Block>()
						.addAll((Set<Block>) ObfuscationReflectionHelper.getPrivateValue(WorldCarver.class, WorldCarver.CANYON, "field_222718_j"))
						.add(OrbitStoneBlock.block.getDefaultState().getBlock()).build(), "field_222718_j");
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void clientLoad(FMLClientSetupEvent event) {
		DimensionRenderInfo customEffect = new DimensionRenderInfo(Float.NaN, true, DimensionRenderInfo.FogType.NONE, false, false) {

			@Override
			public Vector3d func_230494_a_(Vector3d color, float sunHeight) {
				return color;
			}

			@Override
			public boolean func_230493_a_(int x, int y) {
				return false;
			}

		};

		DeferredWorkQueue.runLater(() -> {
			try {
				Object2ObjectMap<ResourceLocation, DimensionRenderInfo> effectsRegistry = (Object2ObjectMap<ResourceLocation, DimensionRenderInfo>) ObfuscationReflectionHelper
						.getPrivateValue(DimensionRenderInfo.class, null, "field_239208_a_");
				effectsRegistry.put(new ResourceLocation("fun_mods:orbit_dim"), customEffect);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

	}

}
