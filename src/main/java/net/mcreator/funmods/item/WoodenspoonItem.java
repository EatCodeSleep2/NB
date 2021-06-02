
package net.mcreator.funmods.item;

@FunModsModElements.ModElement.Tag
public class WoodenspoonItem extends FunModsModElements.ModElement {

	@ObjectHolder("fun_mods:woodenspoon")
	public static final Item block = null;

	public WoodenspoonItem(FunModsModElements instance) {
		super(instance, 56);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("woodenspoon");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

	}

}
