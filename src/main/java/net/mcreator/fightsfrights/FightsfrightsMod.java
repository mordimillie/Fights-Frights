package net.mcreator.fightsfrights;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraftforge.network.simple.SimpleChannel;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.util.thread.SidedThreadGroups;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;

import net.mcreator.fightsfrights.init.FightsfrightsModTabs;
import net.mcreator.fightsfrights.init.FightsfrightsModSounds;
import net.mcreator.fightsfrights.init.FightsfrightsModPotions;
import net.mcreator.fightsfrights.init.FightsfrightsModParticleTypes;
import net.mcreator.fightsfrights.init.FightsfrightsModPaintings;
import net.mcreator.fightsfrights.init.FightsfrightsModMobEffects;
import net.mcreator.fightsfrights.init.FightsfrightsModMenus;
import net.mcreator.fightsfrights.init.FightsfrightsModItems;
import net.mcreator.fightsfrights.init.FightsfrightsModEntities;
import net.mcreator.fightsfrights.init.FightsfrightsModBlocks;
import net.mcreator.fightsfrights.init.FightsfrightsModBlockEntities;

import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.BiConsumer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
import java.util.AbstractMap;

@Mod("fightsfrights")
public class FightsfrightsMod {
	public static final Logger LOGGER = LogManager.getLogger(FightsfrightsMod.class);
	public static final String MODID = "fightsfrights";

	public FightsfrightsMod() {
		// Start of user code block mod constructor
		// End of user code block mod constructor
		MinecraftForge.EVENT_BUS.register(this);
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		FightsfrightsModSounds.REGISTRY.register(bus);
		FightsfrightsModBlocks.REGISTRY.register(bus);
		FightsfrightsModBlockEntities.REGISTRY.register(bus);
		FightsfrightsModItems.REGISTRY.register(bus);
		FightsfrightsModEntities.REGISTRY.register(bus);

		FightsfrightsModTabs.REGISTRY.register(bus);

		FightsfrightsModMobEffects.REGISTRY.register(bus);
		FightsfrightsModPotions.REGISTRY.register(bus);
		FightsfrightsModPaintings.REGISTRY.register(bus);
		FightsfrightsModParticleTypes.REGISTRY.register(bus);

		FightsfrightsModMenus.REGISTRY.register(bus);

		// Start of user code block mod init
		// End of user code block mod init
	}

	// Start of user code block mod methods
	// End of user code block mod methods
	private static final String PROTOCOL_VERSION = "1";
	public static final SimpleChannel PACKET_HANDLER = NetworkRegistry.newSimpleChannel(new ResourceLocation(MODID, MODID), () -> PROTOCOL_VERSION, PROTOCOL_VERSION::equals, PROTOCOL_VERSION::equals);
	private static int messageID = 0;

	public static <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, FriendlyByteBuf> encoder, Function<FriendlyByteBuf, T> decoder, BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
		PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
		messageID++;
	}

	private static final Collection<AbstractMap.SimpleEntry<Runnable, Integer>> workQueue = new ConcurrentLinkedQueue<>();

	public static void queueServerWork(int tick, Runnable action) {
		if (Thread.currentThread().getThreadGroup() == SidedThreadGroups.SERVER)
			workQueue.add(new AbstractMap.SimpleEntry<>(action, tick));
	}

	@SubscribeEvent
	public void tick(TickEvent.ServerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			List<AbstractMap.SimpleEntry<Runnable, Integer>> actions = new ArrayList<>();
			workQueue.forEach(work -> {
				work.setValue(work.getValue() - 1);
				if (work.getValue() == 0)
					actions.add(work);
			});
			actions.forEach(e -> e.getKey().run());
			workQueue.removeAll(actions);
		}
	}
}
