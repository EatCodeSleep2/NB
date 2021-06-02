
package net.mcreator.funmods.item;

@FunModsModElements.ModElement.Tag
public class BackpackItem extends FunModsModElements.ModElement {

	@ObjectHolder("fun_mods:backpack")
	public static final Item block = null;

	public BackpackItem(FunModsModElements instance) {
		super(instance, 55);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(FunModsItemGroup.tab).maxStackSize(1).isImmuneToFire().rarity(Rarity.COMMON));
			setRegistryName("backpack");
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