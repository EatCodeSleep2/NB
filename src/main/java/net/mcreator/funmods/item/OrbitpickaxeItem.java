
package net.mcreator.funmods.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.funmods.FunModsModElements;

@FunModsModElements.ModElement.Tag
public class OrbitpickaxeItem extends FunModsModElements.ModElement {
	@ObjectHolder("fun_mods:orbitpickaxe")
	public static final Item block = null;
	public OrbitpickaxeItem(FunModsModElements instance) {
		super(instance, 16);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
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
		}, 1, 1f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("orbitpickaxe"));
	}
}
