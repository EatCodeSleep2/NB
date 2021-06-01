package net.mcreator.funmods.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.vector.Vector2f;
import net.minecraft.util.math.BlockPos;
import net.minecraft.command.ICommandSource;
import net.minecraft.command.CommandSource;
import net.minecraft.block.Blocks;

import net.mcreator.funmods.block.RocketBoosterTierIBlock;
import net.mcreator.funmods.FunModsModElements;
import net.mcreator.funmods.FunModsMod;

import java.util.Map;

@FunModsModElements.ModElement.Tag
public class Rct1procProcedure extends FunModsModElements.ModElement {
	public Rct1procProcedure(FunModsModElements instance) {
		super(instance, 39);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				FunModsMod.LOGGER.warn("Failed to load dependency x for procedure Rct1proc!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				FunModsMod.LOGGER.warn("Failed to load dependency y for procedure Rct1proc!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				FunModsMod.LOGGER.warn("Failed to load dependency z for procedure Rct1proc!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				FunModsMod.LOGGER.warn("Failed to load dependency world for procedure Rct1proc!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if (((((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z + 1)))).getBlock() == RocketBoosterTierIBlock.block
				.getDefaultState().getBlock())
				&& ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 1)))).getBlock() == RocketBoosterTierIBlock.block
						.getDefaultState().getBlock()))
				&& ((((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z + 1)))).getBlock() == RocketBoosterTierIBlock.block
						.getDefaultState().getBlock())
						&& ((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z - 1)))).getBlock() == RocketBoosterTierIBlock.block
								.getDefaultState().getBlock()))
						&& (((world.getBlockState(new BlockPos((int) (x + 1), (int) (1 + y), (int) (z + 0)))).getBlock() == Blocks.IRON_BLOCK
								.getDefaultState().getBlock())
								&& ((((world.getBlockState(new BlockPos((int) (x + 1), (int) (1 + y), (int) (z + 1)))).getBlock() == Blocks.IRON_BLOCK
										.getDefaultState().getBlock())
										&& ((world.getBlockState(new BlockPos((int) (x + 2), (int) (1 + y), (int) (z + 1))))
												.getBlock() == Blocks.IRON_BLOCK.getDefaultState().getBlock()))
										&& (((world.getBlockState(new BlockPos((int) (x + 1), (int) (1 + y), (int) (z + 2))))
												.getBlock() == Blocks.IRON_BLOCK.getDefaultState().getBlock())
												&& ((((world.getBlockState(new BlockPos((int) (x + 2), (int) (1 + y), (int) (z + 2))))
														.getBlock() == Blocks.IRON_BLOCK.getDefaultState().getBlock())
														&& ((world.getBlockState(new BlockPos((int) (x + 3), (int) (1 + y), (int) (z + 2))))
																.getBlock() == Blocks.IRON_BLOCK.getDefaultState().getBlock()))
														&& ((world.getBlockState(new BlockPos((int) (x + 2), (int) (1 + y), (int) (z + 3))))
																.getBlock() == Blocks.IRON_BLOCK.getDefaultState().getBlock())))))))) {
			if (world instanceof ServerWorld) {
				((World) world).getServer().getCommandManager()
						.handleCommand(new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, z), Vector2f.ZERO, (ServerWorld) world, 4, "",
								new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(), "say hi");
			}
		}
	}
}
