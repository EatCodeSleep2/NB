package net.mcreator.funmods.procedures;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.funmods.FunModsModElements;
import net.mcreator.funmods.FunModsMod;

import java.util.Map;

@FunModsModElements.ModElement.Tag
public class InstantHealthOnPotionActiveTickProcedure extends FunModsModElements.ModElement {
	public InstantHealthOnPotionActiveTickProcedure(FunModsModElements instance) {
		super(instance, 48);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				FunModsMod.LOGGER.warn("Failed to load dependency entity for procedure InstantHealthOnPotionActiveTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).getFoodStats().setFoodLevel((int) 10);
	}
}
