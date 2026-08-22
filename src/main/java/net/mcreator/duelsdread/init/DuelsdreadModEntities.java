
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.duelsdread.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.duelsdread.entity.WoodenConstructEntity;
import net.mcreator.duelsdread.entity.WeedWroughtEntity;
import net.mcreator.duelsdread.entity.WeedWraithEntity;
import net.mcreator.duelsdread.entity.SpamdurEntity;
import net.mcreator.duelsdread.entity.SavagerEntity;
import net.mcreator.duelsdread.entity.NetheriteDroidEntity;
import net.mcreator.duelsdread.entity.HANDEntity;
import net.mcreator.duelsdread.entity.CrudeDroidEntity;
import net.mcreator.duelsdread.entity.CopperDroidEntity;
import net.mcreator.duelsdread.entity.BloodspamdurEntity;
import net.mcreator.duelsdread.DuelsdreadMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DuelsdreadModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, DuelsdreadMod.MODID);
	public static final RegistryObject<EntityType<WeedWraithEntity>> WEED_WRAITH = register("weed_wraith",
			EntityType.Builder.<WeedWraithEntity>of(WeedWraithEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(WeedWraithEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<WeedWroughtEntity>> WEED_WROUGHT = register("weed_wrought",
			EntityType.Builder.<WeedWroughtEntity>of(WeedWroughtEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(WeedWroughtEntity::new)

					.sized(0.8f, 4.4f));
	public static final RegistryObject<EntityType<CopperDroidEntity>> COPPER_DROID = register("copper_droid",
			EntityType.Builder.<CopperDroidEntity>of(CopperDroidEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CopperDroidEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<NetheriteDroidEntity>> NETHERITE_DROID = register("netherite_droid", EntityType.Builder.<NetheriteDroidEntity>of(NetheriteDroidEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NetheriteDroidEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SpamdurEntity>> SPAMDUR = register("spamdur",
			EntityType.Builder.<SpamdurEntity>of(SpamdurEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SpamdurEntity::new)

					.sized(0.6f, 1.5f));
	public static final RegistryObject<EntityType<BloodspamdurEntity>> BLOODSPAMDUR = register("bloodspamdur",
			EntityType.Builder.<BloodspamdurEntity>of(BloodspamdurEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BloodspamdurEntity::new)

					.sized(0.6f, 1.1f));
	public static final RegistryObject<EntityType<CrudeDroidEntity>> CRUDE_DROID = register("crude_droid",
			EntityType.Builder.<CrudeDroidEntity>of(CrudeDroidEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CrudeDroidEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<WoodenConstructEntity>> WOODEN_CONSTRUCT = register("wooden_construct",
			EntityType.Builder.<WoodenConstructEntity>of(WoodenConstructEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(WoodenConstructEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SavagerEntity>> SAVAGER = register("savager",
			EntityType.Builder.<SavagerEntity>of(SavagerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SavagerEntity::new)

					.sized(0.9f, 1.1f));
	public static final RegistryObject<EntityType<HANDEntity>> HAND = register("hand",
			EntityType.Builder.<HANDEntity>of(HANDEntity::new, MobCategory.MISC).setCustomClientFactory(HANDEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.4f, 0.4f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			WeedWraithEntity.init();
			WeedWroughtEntity.init();
			CopperDroidEntity.init();
			NetheriteDroidEntity.init();
			SpamdurEntity.init();
			BloodspamdurEntity.init();
			CrudeDroidEntity.init();
			WoodenConstructEntity.init();
			SavagerEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(WEED_WRAITH.get(), WeedWraithEntity.createAttributes().build());
		event.put(WEED_WROUGHT.get(), WeedWroughtEntity.createAttributes().build());
		event.put(COPPER_DROID.get(), CopperDroidEntity.createAttributes().build());
		event.put(NETHERITE_DROID.get(), NetheriteDroidEntity.createAttributes().build());
		event.put(SPAMDUR.get(), SpamdurEntity.createAttributes().build());
		event.put(BLOODSPAMDUR.get(), BloodspamdurEntity.createAttributes().build());
		event.put(CRUDE_DROID.get(), CrudeDroidEntity.createAttributes().build());
		event.put(WOODEN_CONSTRUCT.get(), WoodenConstructEntity.createAttributes().build());
		event.put(SAVAGER.get(), SavagerEntity.createAttributes().build());
	}
}
