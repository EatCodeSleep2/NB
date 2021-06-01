
package net.mcreator.funmods.gui;

import net.mcreator.funmods.FunModsMod;

@OnlyIn(Dist.CLIENT)
public class RCT1GuiWindow extends ContainerScreen<RCT1Gui.GuiContainerMod> {

	private World world;
	private int x, y, z;
	private PlayerEntity entity;

	public RCT1GuiWindow(RCT1Gui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 80;
		this.ySize = 80;
	}

	private static final ResourceLocation texture = new ResourceLocation("fun_mods:textures/rct_1.png");

	@Override
	public void render(MatrixStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderHoveredTooltip(ms, mouseX, mouseY);

	}

	@Override
	protected void drawGuiContainerBackgroundLayer(MatrixStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.color4f(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		Minecraft.getInstance().getTextureManager().bindTexture(texture);
		int k = (this.width - this.xSize) / 2;
		int l = (this.height - this.ySize) / 2;
		this.blit(ms, k, l, 0, 0, this.xSize, this.ySize, this.xSize, this.ySize);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeScreen();
			return true;
		}

		return super.keyPressed(key, b, c);
	}

	@Override
	public void tick() {
		super.tick();
	}

	@Override
	protected void drawGuiContainerForegroundLayer(MatrixStack ms, int mouseX, int mouseY) {
		this.font.drawString(ms, "Tier 1", 1, 3, -12829636);
		this.font.drawString(ms, "Build Rocket?", 6, 18, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardListener.enableRepeatEvents(false);
	}

	@Override
	public void init(Minecraft minecraft, int width, int height) {
		super.init(minecraft, width, height);
		minecraft.keyboardListener.enableRepeatEvents(true);

		this.addButton(new Button(this.guiLeft + 18, this.guiTop + 32, 40, 20, new StringTextComponent("Yes"), e -> {
			if (true) {
				FunModsMod.PACKET_HANDLER.sendToServer(new RCT1Gui.ButtonPressedMessage(0, x, y, z));
				RCT1Gui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
	}

}
