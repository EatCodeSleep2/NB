
package net.mcreator.funmods.item;

@FunModsModElements.ModElement.Tag
public class CheeseItem extends FunModsModElements.ModElement {

	@ObjectHolder("fun_mods:cheese")
	public static final Item block = null;

	public CheeseItem(FunModsModElements instance) {
		super(instance, 59);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}

	public static class FoodItemCustom extends Item {

		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(2).saturation(0.3f)

							.build()));
			setRegistryName("cheese");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}

	}

}
