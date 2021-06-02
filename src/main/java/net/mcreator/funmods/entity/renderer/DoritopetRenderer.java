package net.mcreator.funmods.entity.renderer;

@OnlyIn(Dist.CLIENT)
public class DoritopetRenderer {

	public static class ModelRegisterHandler {

		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(DoritopetItem.arrow,
					renderManager -> new SpriteRenderer(renderManager, Minecraft.getInstance().getItemRenderer()));
		}

	}

}
