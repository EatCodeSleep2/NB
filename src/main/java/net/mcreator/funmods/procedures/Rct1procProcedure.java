package net.mcreator.funmods.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.RegistryKey;
import net.minecraft.potion.EffectInstance;
import net.minecraft.network.play.server.SPlayerAbilitiesPacket;
import net.minecraft.network.play.server.SPlaySoundEventPacket;
import net.minecraft.network.play.server.SPlayEntityEffectPacket;
import net.minecraft.network.play.server.SChangeGameStatePacket;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.funmods.block.RocketBoosterTierIBlock;
import net.mcreator.funmods.block.CompactIronBlock;
import net.mcreator.funmods.FunModsModElements;
import net.mcreator.funmods.FunModsMod;

import java.util.Map;

@FunModsModElements.ModElement.Tag
public class Rct1procProcedure extends FunModsModElements.ModElement {
	public Rct1procProcedure(FunModsModElements instance) {
		super(instance, 39);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				FunModsMod.LOGGER.warn("Failed to load dependency entity for procedure Rct1proc!");
			return;
		}
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
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if ((((((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z + 1)))).getBlock() == RocketBoosterTierIBlock.block
				.getDefaultState().getBlock())
				&& ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z + (-1))))).getBlock() == RocketBoosterTierIBlock.block
						.getDefaultState().getBlock()))
				&& ((((world.getBlockState(new BlockPos((int) (x + (-1)), (int) y, (int) (z + 1)))).getBlock() == RocketBoosterTierIBlock.block
						.getDefaultState().getBlock())
						&& ((world.getBlockState(new BlockPos((int) (x + (-1)), (int) y, (int) (z + (-1)))))
								.getBlock() == RocketBoosterTierIBlock.block.getDefaultState().getBlock()))
						&& (((world.getBlockState(new BlockPos((int) (x + 0), (int) (1 + y), (int) (z + 0)))).getBlock() == Blocks.IRON_BLOCK
								.getDefaultState().getBlock())
								&& ((((world.getBlockState(new BlockPos((int) (x - 0), (int) (1 + y), (int) (z + (-1)))))
										.getBlock() == Blocks.IRON_BLOCK.getDefaultState().getBlock())
										&& ((world.getBlockState(new BlockPos((int) (x + 1), (int) (1 + y), (int) (z + 0))))
												.getBlock() == Blocks.IRON_BLOCK.getDefaultState().getBlock()))
										&& (((world.getBlockState(new BlockPos((int) (x + (-1)), (int) (1 + y), (int) (z + 0))))
												.getBlock() == Blocks.IRON_BLOCK.getDefaultState().getBlock())
												&& ((((world.getBlockState(new BlockPos((int) (x + 0), (int) (1 + y), (int) (z + 1))))
														.getBlock() == Blocks.IRON_BLOCK.getDefaultState().getBlock())
														&& ((world.getBlockState(new BlockPos((int) (x + 1), (int) (1 + y), (int) (z + 1))))
																.getBlock() == Blocks.IRON_BLOCK.getDefaultState().getBlock()))
														&& ((((world.getBlockState(new BlockPos((int) (x + (-1)), (int) (1 + y), (int) (z + 1))))
																.getBlock() == Blocks.IRON_BLOCK.getDefaultState().getBlock())
																&& ((world.getBlockState(
																		new BlockPos((int) (x + (-1)), (int) (1 + y), (int) (z + (-1)))))
																				.getBlock() == Blocks.IRON_BLOCK.getDefaultState().getBlock()))
																&& ((world
																		.getBlockState(new BlockPos((int) (x + 1), (int) (1 + y), (int) (z + (-1)))))
																				.getBlock() == Blocks.IRON_BLOCK.getDefaultState().getBlock()))))))))
				|| ((((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z + 1)))).getBlock() == RocketBoosterTierIBlock.block
						.getDefaultState().getBlock())
						&& ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z + (-1))))).getBlock() == RocketBoosterTierIBlock.block
								.getDefaultState().getBlock()))
						&& ((((world.getBlockState(new BlockPos((int) (x + (-1)), (int) y, (int) (z + 1))))
								.getBlock() == RocketBoosterTierIBlock.block.getDefaultState().getBlock())
								&& ((world.getBlockState(new BlockPos((int) (x + (-1)), (int) y, (int) (z + (-1)))))
										.getBlock() == RocketBoosterTierIBlock.block.getDefaultState().getBlock()))
								&& ((world.getBlockState(new BlockPos((int) (x + 0), (int) (1 + y), (int) (z + 0))))
										.getBlock() == CompactIronBlock.block.getDefaultState().getBlock()))))) {
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote && _ent instanceof ServerPlayerEntity) {
					RegistryKey<World> destinationType = RegistryKey.getOrCreateKey(Registry.WORLD_KEY, new ResourceLocation("fun_mods:orbit_dim"));
					ServerWorld nextWorld = _ent.getServer().getWorld(destinationType);
					if (nextWorld != null) {
						((ServerPlayerEntity) _ent).connection.sendPacket(new SChangeGameStatePacket(SChangeGameStatePacket.field_241768_e_, 0));
						((ServerPlayerEntity) _ent).teleport(nextWorld, nextWorld.getSpawnPoint().getX(), nextWorld.getSpawnPoint().getY() + 1,
								nextWorld.getSpawnPoint().getZ(), _ent.rotationYaw, _ent.rotationPitch);
						((ServerPlayerEntity) _ent).connection.sendPacket(new SPlayerAbilitiesPacket(((ServerPlayerEntity) _ent).abilities));
						for (EffectInstance effectinstance : ((ServerPlayerEntity) _ent).getActivePotionEffects()) {
							((ServerPlayerEntity) _ent).connection.sendPacket(new SPlayEntityEffectPacket(_ent.getEntityId(), effectinstance));
						}
						((ServerPlayerEntity) _ent).connection.sendPacket(new SPlaySoundEventPacket(1032, BlockPos.ZERO, 0, false));
					}
				}
			}
		}
	}
}
