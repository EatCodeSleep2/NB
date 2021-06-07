package net.mcreator.funmods.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.funmods.FunModsModElements;
import net.mcreator.funmods.FunModsMod;

import java.util.Map;

@FunModsModElements.ModElement.Tag
public class ChairOnBlockRightClickedProcedure extends FunModsModElements.ModElement {
	public ChairOnBlockRightClickedProcedure(FunModsModElements instance) {
		super(instance, 97);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				FunModsMod.LOGGER.warn("Failed to load dependency entity for procedure ChairOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				FunModsMod.LOGGER.warn("Failed to load dependency sourceentity for procedure ChairOnBlockRightClicked!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		sourceentity.startRiding(entity);
	}
}
