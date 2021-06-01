
package net.mcreator.funmods.item;

@FunModsModElements.ModElement.Tag
public class DoritosItem extends FunModsModElements.ModElement {

	@ObjectHolder("fun_mods:doritos")
	public static final Item block = null;

	public DoritosItem(FunModsModElements instance) {
		super(instance, 49);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}

	public static class FoodItemCustom extends Item {

		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(4).saturation(0.3f)

							.build()));
			setRegistryName("doritos");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}

	}

}
