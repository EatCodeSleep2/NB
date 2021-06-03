
package net.mcreator.funmods.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.funmods.itemgroup.FunModsItemGroup;
import net.mcreator.funmods.FunModsModElements;

@FunModsModElements.ModElement.Tag
public class LightsaberCrystalItem extends FunModsModElements.ModElement {
	@ObjectHolder("fun_mods:lightsaber_crystal")
	public static final Item block = null;
	public LightsaberCrystalItem(FunModsModElements instance) {
		super(instance, 88);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(FunModsItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("lightsaber_crystal");
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
