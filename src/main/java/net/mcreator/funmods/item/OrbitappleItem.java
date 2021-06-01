
package net.mcreator.funmods.item;

@FunModsModElements.ModElement.Tag
public class OrbitappleItem extends FunModsModElements.ModElement {

	@ObjectHolder("fun_mods:orbitapple")
	public static final Item block = null;

	public OrbitappleItem(FunModsModElements instance) {
		super(instance, 33);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}

	public static class FoodItemCustom extends Item {

		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(7).saturation(0.4f)

							.build()));
			setRegistryName("orbitapple");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}

	}

}
