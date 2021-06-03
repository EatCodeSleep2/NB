
package net.mcreator.funmods.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.block.Blocks;

import net.mcreator.funmods.itemgroup.FunModsItemGroup;
import net.mcreator.funmods.FunModsModElements;

@FunModsModElements.ModElement.Tag
public class LightsaberItem extends FunModsModElements.ModElement {
	@ObjectHolder("fun_mods:lightsaber")
	public static final Item block = null;
	public LightsaberItem(FunModsModElements instance) {
		super(instance, 71);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 1000;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 8f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Items.IRON_INGOT, (int) (1)), new ItemStack(Blocks.REDSTONE_TORCH, (int) (1)));
			}
		}, 3, -3f, new Item.Properties().group(FunModsItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("lightsaber"));
	}
}
