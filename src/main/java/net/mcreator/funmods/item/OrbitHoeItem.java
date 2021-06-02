
package net.mcreator.funmods.item;

@FunModsModElements.ModElement.Tag
public class OrbitHoeItem extends FunModsModElements.ModElement {

	@ObjectHolder("fun_mods:orbit_hoe")
	public static final Item block = null;

	public OrbitHoeItem(FunModsModElements instance) {
		super(instance, 53);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 100;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 0, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {

		}.setRegistryName("orbit_hoe"));
	}

}
