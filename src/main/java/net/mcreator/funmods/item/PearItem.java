
package net.mcreator.funmods.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

import net.mcreator.funmods.itemgroup.FunModsItemGroup;
import net.mcreator.funmods.FunModsModElements;

@FunModsModElements.ModElement.Tag
public class PearItem extends FunModsModElements.ModElement {
	@ObjectHolder("fun_mods:pear")
	public static final Item block = null;
	public PearItem(FunModsModElements instance) {
		super(instance, 27);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(FunModsItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(2).saturation(0.3f).setAlwaysEdible().build()));
			setRegistryName("pear");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}
	}
}
