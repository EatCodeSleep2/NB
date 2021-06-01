package net.mcreator.funmods.procedures;

@FunModsModElements.ModElement.Tag
public class ScubagearHelmetTickEventProcedure extends FunModsModElements.ModElement {

	public ScubagearHelmetTickEventProcedure(FunModsModElements instance) {
		super(instance, 38);

	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				FunModsMod.LOGGER.warn("Failed to load dependency entity for procedure ScubagearHelmetTickEvent!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NIGHT_VISION, (int) 1000000, (int) 1, (false), (false)));

	}

}
