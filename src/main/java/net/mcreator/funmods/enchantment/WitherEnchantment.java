
package net.mcreator.funmods.enchantment;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.DamageSource;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.enchantment.Enchantment;

import net.mcreator.funmods.item.OrbitItem;
import net.mcreator.funmods.FunModsModElements;

@FunModsModElements.ModElement.Tag
public class WitherEnchantment extends FunModsModElements.ModElement {
	@ObjectHolder("fun_mods:wither")
	public static final Enchantment enchantment = null;
	public WitherEnchantment(FunModsModElements instance) {
		super(instance, 24);
	}

	@Override
	public void initElements() {
		elements.enchantments.add(() -> new CustomEnchantment(EquipmentSlotType.MAINHAND).setRegistryName("wither"));
	}
	public static class CustomEnchantment extends Enchantment {
		public CustomEnchantment(EquipmentSlotType... slots) {
			super(Enchantment.Rarity.VERY_RARE, EnchantmentType.ARMOR, slots);
		}

		@Override
		public int getMinLevel() {
			return 1;
		}

		@Override
		public int getMaxLevel() {
			return 1;
		}

		@Override
		public int calcModifierDamage(int level, DamageSource source) {
			return level * 2;
		}

		@Override
		public boolean canApplyAtEnchantingTable(ItemStack stack) {
			if (stack.getItem() == new ItemStack(OrbitItem.helmet, (int) (1)).getItem())
				return true;
			if (stack.getItem() == new ItemStack(OrbitItem.body, (int) (1)).getItem())
				return true;
			if (stack.getItem() == new ItemStack(OrbitItem.legs, (int) (1)).getItem())
				return true;
			if (stack.getItem() == new ItemStack(OrbitItem.boots, (int) (1)).getItem())
				return true;
			if (stack.getItem() == new ItemStack(Items.LEATHER_HELMET, (int) (1)).getItem())
				return true;
			if (stack.getItem() == new ItemStack(Items.LEATHER_CHESTPLATE, (int) (1)).getItem())
				return true;
			if (stack.getItem() == new ItemStack(Items.LEATHER_LEGGINGS, (int) (1)).getItem())
				return true;
			if (stack.getItem() == new ItemStack(Items.LEATHER_BOOTS, (int) (1)).getItem())
				return true;
			if (stack.getItem() == new ItemStack(Items.CHAINMAIL_HELMET, (int) (1)).getItem())
				return true;
			if (stack.getItem() == new ItemStack(Items.CHAINMAIL_CHESTPLATE, (int) (1)).getItem())
				return true;
			if (stack.getItem() == new ItemStack(Items.CHAINMAIL_LEGGINGS, (int) (1)).getItem())
				return true;
			if (stack.getItem() == new ItemStack(Items.CHAINMAIL_BOOTS, (int) (1)).getItem())
				return true;
			if (stack.getItem() == new ItemStack(Items.IRON_HELMET, (int) (1)).getItem())
				return true;
			if (stack.getItem() == new ItemStack(Items.IRON_CHESTPLATE, (int) (1)).getItem())
				return true;
			if (stack.getItem() == new ItemStack(Items.IRON_CHESTPLATE, (int) (1)).getItem())
				return true;
			if (stack.getItem() == new ItemStack(Items.IRON_BOOTS, (int) (1)).getItem())
				return true;
			if (stack.getItem() == new ItemStack(Items.GOLDEN_CHESTPLATE, (int) (1)).getItem())
				return true;
			if (stack.getItem() == new ItemStack(Items.GOLDEN_CHESTPLATE, (int) (1)).getItem())
				return true;
			if (stack.getItem() == new ItemStack(Items.GOLDEN_LEGGINGS, (int) (1)).getItem())
				return true;
			if (stack.getItem() == new ItemStack(Items.GOLDEN_BOOTS, (int) (1)).getItem())
				return true;
			if (stack.getItem() == new ItemStack(Items.DIAMOND_HELMET, (int) (1)).getItem())
				return true;
			if (stack.getItem() == new ItemStack(Items.DIAMOND_CHESTPLATE, (int) (1)).getItem())
				return true;
			if (stack.getItem() == new ItemStack(Items.DIAMOND_LEGGINGS, (int) (1)).getItem())
				return true;
			if (stack.getItem() == new ItemStack(Items.DIAMOND_BOOTS, (int) (1)).getItem())
				return true;
			if (stack.getItem() == new ItemStack(Items.NETHERITE_HELMET, (int) (1)).getItem())
				return true;
			if (stack.getItem() == new ItemStack(Items.NETHERITE_CHESTPLATE, (int) (1)).getItem())
				return true;
			if (stack.getItem() == new ItemStack(Items.NETHERITE_LEGGINGS, (int) (1)).getItem())
				return true;
			if (stack.getItem() == new ItemStack(Items.NETHERITE_BOOTS, (int) (1)).getItem())
				return true;
			return false;
		}

		@Override
		public boolean isTreasureEnchantment() {
			return true;
		}

		@Override
		public boolean isCurse() {
			return false;
		}

		@Override
		public boolean isAllowedOnBooks() {
			return true;
		}
	}
}
