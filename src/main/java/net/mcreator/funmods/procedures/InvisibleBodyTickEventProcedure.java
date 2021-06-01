package net.mcreator.funmods.procedures;

@FunModsModElements.ModElement.Tag
public class InvisibleBodyTickEventProcedure extends FunModsModElements.ModElement {

	public InvisibleBodyTickEventProcedure(FunModsModElements instance) {
		super(instance, 36);

	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				FunModsMod.LOGGER.warn("Failed to load dependency entity for procedure InvisibleBodyTickEvent!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.INVISIBILITY, (int) 1000000, (int) 1, (false), (false)));

	}

}
