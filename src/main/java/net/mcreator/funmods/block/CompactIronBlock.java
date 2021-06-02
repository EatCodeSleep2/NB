
package net.mcreator.funmods.block;

import net.minecraft.block.material.Material;

@FunModsModElements.ModElement.Tag
public class CompactIronBlock extends FunModsModElements.ModElement {

	@ObjectHolder("fun_mods:compact_iron")
	public static final Block block = null;

	public CompactIronBlock(FunModsModElements instance) {
		super(instance, 56);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(FunModsItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends Block {

		public CustomBlock() {
			super(Block.Properties.create(Material.IRON).sound(SoundType.METAL).hardnessAndResistance(1f, 10f).setLightLevel(s -> 0));

			setRegistryName("compact_iron");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {

			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}

	}

}