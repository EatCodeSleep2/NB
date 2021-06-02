
package net.mcreator.funmods.item;

@FunModsModElements.ModElement.Tag
public class OrbitshovelItem extends FunModsModElements.ModElement {

	@ObjectHolder("fun_mods:orbitshovel")
	public static final Item block = null;

	public OrbitshovelItem(FunModsModElements instance) {
		super(instance, 54);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
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
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {

		}.setRegistryName("orbitshovel"));
	}

}
