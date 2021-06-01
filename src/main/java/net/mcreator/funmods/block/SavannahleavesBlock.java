
package net.mcreator.funmods.block;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block;

import net.mcreator.funmods.itemgroup.FunModsItemGroup;
import net.mcreator.funmods.FunModsModElements;

@FunModsModElements.ModElement.Tag
public class SavannahleavesBlock extends FunModsModElements.ModElement {
	@ObjectHolder("fun_mods:savannahleaves")
	public static final Block block = null;
	public SavannahleavesBlock(FunModsModElements instance) {
		super(instance, 28);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(FunModsItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.LEAVES).sound(SoundType.PLANT).hardnessAndResistance(1f, 10f).setLightLevel(s -> 0));
			setRegistryName("savannahleaves");
		}

		@Override
		public MaterialColor getMaterialColor() {
			return MaterialColor.GRASS;
		}
	}
}
