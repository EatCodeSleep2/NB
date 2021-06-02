
package net.mcreator.funmods.item;

@FunModsModElements.ModElement.Tag
public class OrbitaxeItem extends FunModsModElements.ModElement {

	@ObjectHolder("fun_mods:orbitaxe")
	public static final Item block = null;

	public OrbitaxeItem(FunModsModElements instance) {
		super(instance, 52);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 100;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 3f;
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
		}, 1, 0f, new Item.Properties().group(ItemGroup.TOOLS)) {

		}.setRegistryName("orbitaxe"));
	}

}
