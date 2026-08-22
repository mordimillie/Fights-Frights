
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fightsfrights.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.registries.Registries;

import net.mcreator.fightsfrights.entity.WitherProboscisEntity;
import net.mcreator.fightsfrights.entity.WickeWarmongerEntity;
import net.mcreator.fightsfrights.entity.TerrifiedProboscisEntity;
import net.mcreator.fightsfrights.entity.TerrantulaEntity;
import net.mcreator.fightsfrights.entity.SupaiEntity;
import net.mcreator.fightsfrights.entity.ShadowcompanioncompanionEntity;
import net.mcreator.fightsfrights.entity.ShadowcompanionEntity;
import net.mcreator.fightsfrights.entity.ShadowEntity;
import net.mcreator.fightsfrights.entity.ShackledEntity;
import net.mcreator.fightsfrights.entity.SeerEntity;
import net.mcreator.fightsfrights.entity.ScowlEntity;
import net.mcreator.fightsfrights.entity.ReanimatedEntity;
import net.mcreator.fightsfrights.entity.PoisonProboscisEntity;
import net.mcreator.fightsfrights.entity.PoisonOrbEntity;
import net.mcreator.fightsfrights.entity.PioneerEntity;
import net.mcreator.fightsfrights.entity.PiglinProsecutorEntity;
import net.mcreator.fightsfrights.entity.PatutiEntity;
import net.mcreator.fightsfrights.entity.NethersilverfishEntity;
import net.mcreator.fightsfrights.entity.NethercavespiderEntity;
import net.mcreator.fightsfrights.entity.NetherSpiderEntity;
import net.mcreator.fightsfrights.entity.NetherBanshaaEntity;
import net.mcreator.fightsfrights.entity.MossBombProyectileEntity;
import net.mcreator.fightsfrights.entity.MimicTerrantulaEntity;
import net.mcreator.fightsfrights.entity.MimicSeerEntity;
import net.mcreator.fightsfrights.entity.MimicScowlEntity;
import net.mcreator.fightsfrights.entity.MimicPioneerEntity;
import net.mcreator.fightsfrights.entity.MimicPatutiEntity;
import net.mcreator.fightsfrights.entity.MimicGrimmsquitoEntity;
import net.mcreator.fightsfrights.entity.MimicBeetlesEntity;
import net.mcreator.fightsfrights.entity.MimicBanshaaEntity;
import net.mcreator.fightsfrights.entity.MimicAllmanEntity;
import net.mcreator.fightsfrights.entity.MimentisEntity;
import net.mcreator.fightsfrights.entity.MaliciousMonarchP2Entity;
import net.mcreator.fightsfrights.entity.MaliciousMonarchP1Entity;
import net.mcreator.fightsfrights.entity.InfectedProboscisEntity;
import net.mcreator.fightsfrights.entity.ImperialIllagerP2Entity;
import net.mcreator.fightsfrights.entity.ImperialIllagerP1Entity;
import net.mcreator.fightsfrights.entity.IIproyectileEntity;
import net.mcreator.fightsfrights.entity.GrimmsquitoEntity;
import net.mcreator.fightsfrights.entity.GhastlyGeneralEntity;
import net.mcreator.fightsfrights.entity.FireFlyerEntity;
import net.mcreator.fightsfrights.entity.EffigyEntity;
import net.mcreator.fightsfrights.entity.ChargedScrapProyectileEntity;
import net.mcreator.fightsfrights.entity.CallousCommander1Entity;
import net.mcreator.fightsfrights.entity.BluntjavelinproyectileEntity;
import net.mcreator.fightsfrights.entity.BlindnessProboscisEntity;
import net.mcreator.fightsfrights.entity.BanshaaEntity;
import net.mcreator.fightsfrights.entity.AllmanEntity;
import net.mcreator.fightsfrights.entity.AllbombProyectileEntity;
import net.mcreator.fightsfrights.FightsfrightsMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class FightsfrightsModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, FightsfrightsMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<AllmanEntity>> ALLMAN = register("allman",
			EntityType.Builder.<AllmanEntity>of(AllmanEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(80).setUpdateInterval(3)

					.sized(0.9f, 4.4f));
	public static final DeferredHolder<EntityType<?>, EntityType<ScowlEntity>> SCOWL = register("scowl",
			EntityType.Builder.<ScowlEntity>of(ScowlEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.8f, 2.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<MossBombProyectileEntity>> MOSS_BOMB_PROYECTILE = register("moss_bomb_proyectile",
			EntityType.Builder.<MossBombProyectileEntity>of(MossBombProyectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<SeerEntity>> SEER = register("seer",
			EntityType.Builder.<SeerEntity>of(SeerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(50).setUpdateInterval(3)

					.sized(0.7f, 2f));
	public static final DeferredHolder<EntityType<?>, EntityType<PatutiEntity>> PATUTI = register("patuti",
			EntityType.Builder.<PatutiEntity>of(PatutiEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 1.2f));
	public static final DeferredHolder<EntityType<?>, EntityType<PioneerEntity>> PIONEER = register("pioneer",
			EntityType.Builder.<PioneerEntity>of(PioneerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 2.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<TerrantulaEntity>> TERRANTULA = register("terrantula",
			EntityType.Builder.<TerrantulaEntity>of(TerrantulaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 1.3f));
	public static final DeferredHolder<EntityType<?>, EntityType<BanshaaEntity>> BANSHAA = register("banshaa",
			EntityType.Builder.<BanshaaEntity>of(BanshaaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(200).setUpdateInterval(3)

					.sized(0.7f, 1.7f));
	public static final DeferredHolder<EntityType<?>, EntityType<ReanimatedEntity>> REANIMATED = register("reanimated",
			EntityType.Builder.<ReanimatedEntity>of(ReanimatedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.8f, 2.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<ChargedScrapProyectileEntity>> CHARGED_SCRAP_PROYECTILE = register("charged_scrap_proyectile",
			EntityType.Builder.<ChargedScrapProyectileEntity>of(ChargedScrapProyectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<GhastlyGeneralEntity>> GHASTLY_GENERAL = register("ghastly_general",
			EntityType.Builder.<GhastlyGeneralEntity>of(GhastlyGeneralEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(48).setUpdateInterval(3)

					.sized(0.6f, 2.2f));
	public static final DeferredHolder<EntityType<?>, EntityType<PoisonOrbEntity>> POISON_ORB = register("poison_orb",
			EntityType.Builder.<PoisonOrbEntity>of(PoisonOrbEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.3f, 0.3f));
	public static final DeferredHolder<EntityType<?>, EntityType<ShackledEntity>> SHACKLED = register("shackled",
			EntityType.Builder.<ShackledEntity>of(ShackledEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.4f));
	public static final DeferredHolder<EntityType<?>, EntityType<AllbombProyectileEntity>> ALLBOMB_PROYECTILE = register("allbomb_proyectile",
			EntityType.Builder.<AllbombProyectileEntity>of(AllbombProyectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.4f, 0.4f));
	public static final DeferredHolder<EntityType<?>, EntityType<PiglinProsecutorEntity>> PIGLIN_PROSECUTOR = register("piglin_prosecutor",
			EntityType.Builder.<PiglinProsecutorEntity>of(PiglinProsecutorEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(1.3f, 3.2f));
	public static final DeferredHolder<EntityType<?>, EntityType<BluntjavelinproyectileEntity>> BLUNTJAVELINPROYECTILE = register("bluntjavelinproyectile",
			EntityType.Builder.<BluntjavelinproyectileEntity>of(BluntjavelinproyectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.3f, 0.3f));
	public static final DeferredHolder<EntityType<?>, EntityType<ImperialIllagerP1Entity>> IMPERIAL_ILLAGER_P_1 = register("imperial_illager_p_1",
			EntityType.Builder.<ImperialIllagerP1Entity>of(ImperialIllagerP1Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.2f, 2f));
	public static final DeferredHolder<EntityType<?>, EntityType<ImperialIllagerP2Entity>> IMPERIAL_ILLAGER_P_2 = register("imperial_illager_p_2",
			EntityType.Builder.<ImperialIllagerP2Entity>of(ImperialIllagerP2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.2f, 2.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<IIproyectileEntity>> I_IPROYECTILE = register("i_iproyectile",
			EntityType.Builder.<IIproyectileEntity>of(IIproyectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.4f, 0.4f));
	public static final DeferredHolder<EntityType<?>, EntityType<EffigyEntity>> EFFIGY = register("effigy",
			EntityType.Builder.<EffigyEntity>of(EffigyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<WickeWarmongerEntity>> WICKE_WARMONGER = register("wicke_warmonger",
			EntityType.Builder.<WickeWarmongerEntity>of(WickeWarmongerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(1.3f, 3.2f));
	public static final DeferredHolder<EntityType<?>, EntityType<MaliciousMonarchP1Entity>> MALICIOUS_MONARCH_P_1 = register("malicious_monarch_p_1",
			EntityType.Builder.<MaliciousMonarchP1Entity>of(MaliciousMonarchP1Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.2f, 2f));
	public static final DeferredHolder<EntityType<?>, EntityType<MaliciousMonarchP2Entity>> MALICIOUS_MONARCH_P_2 = register("malicious_monarch_p_2",
			EntityType.Builder.<MaliciousMonarchP2Entity>of(MaliciousMonarchP2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.2f, 2.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<CallousCommander1Entity>> CALLOUS_COMMANDER_1 = register("callous_commander_1",
			EntityType.Builder.<CallousCommander1Entity>of(CallousCommander1Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(48).setUpdateInterval(3)

					.sized(0.6f, 2.2f));
	public static final DeferredHolder<EntityType<?>, EntityType<GrimmsquitoEntity>> GRIMMSQUITO = register("grimmsquito",
			EntityType.Builder.<GrimmsquitoEntity>of(GrimmsquitoEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.7f));
	public static final DeferredHolder<EntityType<?>, EntityType<ShadowEntity>> SHADOW = register("shadow",
			EntityType.Builder.<ShadowEntity>of(ShadowEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.8f, 1.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<ShadowcompanionEntity>> SHADOWCOMPANION = register("shadowcompanion",
			EntityType.Builder.<ShadowcompanionEntity>of(ShadowcompanionEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.8f, 1.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<ShadowcompanioncompanionEntity>> SHADOWCOMPANIONCOMPANION = register("shadowcompanioncompanion",
			EntityType.Builder.<ShadowcompanioncompanionEntity>of(ShadowcompanioncompanionEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.8f, 1.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<MimentisEntity>> MIMENTIS = register("mimentis",
			EntityType.Builder.<MimentisEntity>of(MimentisEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<MimicScowlEntity>> MIMIC_SCOWL = register("mimic_scowl",
			EntityType.Builder.<MimicScowlEntity>of(MimicScowlEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.8f, 2.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<MimicBanshaaEntity>> MIMIC_BANSHAA = register("mimic_banshaa",
			EntityType.Builder.<MimicBanshaaEntity>of(MimicBanshaaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 1.7f));
	public static final DeferredHolder<EntityType<?>, EntityType<MimicTerrantulaEntity>> MIMIC_TERRANTULA = register("mimic_terrantula",
			EntityType.Builder.<MimicTerrantulaEntity>of(MimicTerrantulaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 1.3f));
	public static final DeferredHolder<EntityType<?>, EntityType<MimicPioneerEntity>> MIMIC_PIONEER = register("mimic_pioneer",
			EntityType.Builder.<MimicPioneerEntity>of(MimicPioneerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 2.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<MimicSeerEntity>> MIMIC_SEER = register("mimic_seer",
			EntityType.Builder.<MimicSeerEntity>of(MimicSeerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(50).setUpdateInterval(3)

					.sized(0.7f, 2f));
	public static final DeferredHolder<EntityType<?>, EntityType<MimicAllmanEntity>> MIMIC_ALLMAN = register("mimic_allman",
			EntityType.Builder.<MimicAllmanEntity>of(MimicAllmanEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.9f, 4.4f));
	public static final DeferredHolder<EntityType<?>, EntityType<MimicGrimmsquitoEntity>> MIMIC_GRIMMSQUITO = register("mimic_grimmsquito",
			EntityType.Builder.<MimicGrimmsquitoEntity>of(MimicGrimmsquitoEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<MimicPatutiEntity>> MIMIC_PATUTI = register("mimic_patuti",
			EntityType.Builder.<MimicPatutiEntity>of(MimicPatutiEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 1.2f));
	public static final DeferredHolder<EntityType<?>, EntityType<SupaiEntity>> SUPAI = register("supai",
			EntityType.Builder.<SupaiEntity>of(SupaiEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(2f, 3.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<PoisonProboscisEntity>> POISON_PROBOSCIS = register("poison_proboscis",
			EntityType.Builder.<PoisonProboscisEntity>of(PoisonProboscisEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.3f, 0.3f));
	public static final DeferredHolder<EntityType<?>, EntityType<TerrifiedProboscisEntity>> TERRIFIED_PROBOSCIS = register("terrified_proboscis",
			EntityType.Builder.<TerrifiedProboscisEntity>of(TerrifiedProboscisEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.3f, 0.3f));
	public static final DeferredHolder<EntityType<?>, EntityType<BlindnessProboscisEntity>> BLINDNESS_PROBOSCIS = register("blindness_proboscis",
			EntityType.Builder.<BlindnessProboscisEntity>of(BlindnessProboscisEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.3f, 0.3f));
	public static final DeferredHolder<EntityType<?>, EntityType<InfectedProboscisEntity>> INFECTED_PROBOSCIS = register("infected_proboscis",
			EntityType.Builder.<InfectedProboscisEntity>of(InfectedProboscisEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.3f, 0.3f));
	public static final DeferredHolder<EntityType<?>, EntityType<WitherProboscisEntity>> WITHER_PROBOSCIS = register("wither_proboscis",
			EntityType.Builder.<WitherProboscisEntity>of(WitherProboscisEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.3f, 0.3f));
	public static final DeferredHolder<EntityType<?>, EntityType<NetherBanshaaEntity>> NETHER_BANSHAA = register("nether_banshaa",
			EntityType.Builder.<NetherBanshaaEntity>of(NetherBanshaaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(200).setUpdateInterval(3)

					.sized(0.7f, 1.7f));
	public static final DeferredHolder<EntityType<?>, EntityType<NethersilverfishEntity>> NETHERSILVERFISH = register("nethersilverfish",
			EntityType.Builder.<NethersilverfishEntity>of(NethersilverfishEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.3f, 0.4f));
	public static final DeferredHolder<EntityType<?>, EntityType<NetherSpiderEntity>> NETHER_SPIDER = register("nether_spider",
			EntityType.Builder.<NetherSpiderEntity>of(NetherSpiderEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(1.8f, 0.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<NethercavespiderEntity>> NETHERCAVESPIDER = register("nethercavespider",
			EntityType.Builder.<NethercavespiderEntity>of(NethercavespiderEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(1f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<MimicBeetlesEntity>> MIMIC_BEETLES = register("mimic_beetles",
			EntityType.Builder.<MimicBeetlesEntity>of(MimicBeetlesEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(66).setUpdateInterval(3)

					.sized(0.9f, 1.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<FireFlyerEntity>> FIRE_SWARM = register("fire_swarm",
			EntityType.Builder.<FireFlyerEntity>of(FireFlyerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(1.8f, 1.8f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		AllmanEntity.init(event);
		ScowlEntity.init(event);
		SeerEntity.init(event);
		PatutiEntity.init(event);
		PioneerEntity.init(event);
		TerrantulaEntity.init(event);
		BanshaaEntity.init(event);
		ReanimatedEntity.init(event);
		GhastlyGeneralEntity.init(event);
		ShackledEntity.init(event);
		PiglinProsecutorEntity.init(event);
		ImperialIllagerP1Entity.init(event);
		ImperialIllagerP2Entity.init(event);
		EffigyEntity.init(event);
		WickeWarmongerEntity.init(event);
		MaliciousMonarchP1Entity.init(event);
		MaliciousMonarchP2Entity.init(event);
		CallousCommander1Entity.init(event);
		GrimmsquitoEntity.init(event);
		ShadowEntity.init(event);
		ShadowcompanionEntity.init(event);
		ShadowcompanioncompanionEntity.init(event);
		MimentisEntity.init(event);
		MimicScowlEntity.init(event);
		MimicBanshaaEntity.init(event);
		MimicTerrantulaEntity.init(event);
		MimicPioneerEntity.init(event);
		MimicSeerEntity.init(event);
		MimicAllmanEntity.init(event);
		MimicGrimmsquitoEntity.init(event);
		MimicPatutiEntity.init(event);
		SupaiEntity.init(event);
		NetherBanshaaEntity.init(event);
		NethersilverfishEntity.init(event);
		NetherSpiderEntity.init(event);
		NethercavespiderEntity.init(event);
		MimicBeetlesEntity.init(event);
		FireFlyerEntity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(ALLMAN.get(), AllmanEntity.createAttributes().build());
		event.put(SCOWL.get(), ScowlEntity.createAttributes().build());
		event.put(SEER.get(), SeerEntity.createAttributes().build());
		event.put(PATUTI.get(), PatutiEntity.createAttributes().build());
		event.put(PIONEER.get(), PioneerEntity.createAttributes().build());
		event.put(TERRANTULA.get(), TerrantulaEntity.createAttributes().build());
		event.put(BANSHAA.get(), BanshaaEntity.createAttributes().build());
		event.put(REANIMATED.get(), ReanimatedEntity.createAttributes().build());
		event.put(GHASTLY_GENERAL.get(), GhastlyGeneralEntity.createAttributes().build());
		event.put(SHACKLED.get(), ShackledEntity.createAttributes().build());
		event.put(PIGLIN_PROSECUTOR.get(), PiglinProsecutorEntity.createAttributes().build());
		event.put(IMPERIAL_ILLAGER_P_1.get(), ImperialIllagerP1Entity.createAttributes().build());
		event.put(IMPERIAL_ILLAGER_P_2.get(), ImperialIllagerP2Entity.createAttributes().build());
		event.put(EFFIGY.get(), EffigyEntity.createAttributes().build());
		event.put(WICKE_WARMONGER.get(), WickeWarmongerEntity.createAttributes().build());
		event.put(MALICIOUS_MONARCH_P_1.get(), MaliciousMonarchP1Entity.createAttributes().build());
		event.put(MALICIOUS_MONARCH_P_2.get(), MaliciousMonarchP2Entity.createAttributes().build());
		event.put(CALLOUS_COMMANDER_1.get(), CallousCommander1Entity.createAttributes().build());
		event.put(GRIMMSQUITO.get(), GrimmsquitoEntity.createAttributes().build());
		event.put(SHADOW.get(), ShadowEntity.createAttributes().build());
		event.put(SHADOWCOMPANION.get(), ShadowcompanionEntity.createAttributes().build());
		event.put(SHADOWCOMPANIONCOMPANION.get(), ShadowcompanioncompanionEntity.createAttributes().build());
		event.put(MIMENTIS.get(), MimentisEntity.createAttributes().build());
		event.put(MIMIC_SCOWL.get(), MimicScowlEntity.createAttributes().build());
		event.put(MIMIC_BANSHAA.get(), MimicBanshaaEntity.createAttributes().build());
		event.put(MIMIC_TERRANTULA.get(), MimicTerrantulaEntity.createAttributes().build());
		event.put(MIMIC_PIONEER.get(), MimicPioneerEntity.createAttributes().build());
		event.put(MIMIC_SEER.get(), MimicSeerEntity.createAttributes().build());
		event.put(MIMIC_ALLMAN.get(), MimicAllmanEntity.createAttributes().build());
		event.put(MIMIC_GRIMMSQUITO.get(), MimicGrimmsquitoEntity.createAttributes().build());
		event.put(MIMIC_PATUTI.get(), MimicPatutiEntity.createAttributes().build());
		event.put(SUPAI.get(), SupaiEntity.createAttributes().build());
		event.put(NETHER_BANSHAA.get(), NetherBanshaaEntity.createAttributes().build());
		event.put(NETHERSILVERFISH.get(), NethersilverfishEntity.createAttributes().build());
		event.put(NETHER_SPIDER.get(), NetherSpiderEntity.createAttributes().build());
		event.put(NETHERCAVESPIDER.get(), NethercavespiderEntity.createAttributes().build());
		event.put(MIMIC_BEETLES.get(), MimicBeetlesEntity.createAttributes().build());
		event.put(FIRE_SWARM.get(), FireFlyerEntity.createAttributes().build());
	}
}
