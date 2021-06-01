package net.mcreator.funmods.procedures;

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
				&& (((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z + 1)))).getBlock() == RocketBoosterTierIBlock.block
						.getDefaultState().getBlock())
						&& ((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z - 1)))).getBlock() == RocketBoosterTierIBlock.block
								.getDefaultState().getBlock())))) {
			if (world instanceof ServerWorld) {
				((World) world).getServer().getCommandManager()
						.handleCommand(new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, z), Vector2f.ZERO, (ServerWorld) world, 4, "",
								new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(), "say hi");
			}
		}

	}

}
