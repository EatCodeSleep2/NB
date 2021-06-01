package net.mcreator.funmods.procedures;

@FunModsModElements.ModElement.Tag
public class ScubagearBodyTickEventProcedure extends FunModsModElements.ModElement {

	public ScubagearBodyTickEventProcedure(FunModsModElements instance) {
		super(instance, 37);

	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				FunModsMod.LOGGER.warn("Failed to load dependency entity for procedure ScubagearBodyTickEvent!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.WATER_BREATHING, (int) 1000000, (int) 1, (false), (false)));

	}

}
