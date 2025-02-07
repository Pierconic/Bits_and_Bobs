
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.superiorstructures.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.superiorstructures.client.gui.TransceiverInterfaceScreen;
import net.mcreator.superiorstructures.client.gui.PuzzleInventoryScreen;
import net.mcreator.superiorstructures.client.gui.PowerCoreInventoryScreen;
import net.mcreator.superiorstructures.client.gui.FlavorInterfaceScreen;
import net.mcreator.superiorstructures.client.gui.ArtificeScreen;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class SuperiorstructuresModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(SuperiorstructuresModMenus.ARTIFICE.get(), ArtificeScreen::new);
		event.register(SuperiorstructuresModMenus.TRANSCEIVER_INTERFACE.get(), TransceiverInterfaceScreen::new);
		event.register(SuperiorstructuresModMenus.POWER_CORE_INVENTORY.get(), PowerCoreInventoryScreen::new);
		event.register(SuperiorstructuresModMenus.FLAVOR_INTERFACE.get(), FlavorInterfaceScreen::new);
		event.register(SuperiorstructuresModMenus.PUZZLE_INVENTORY.get(), PuzzleInventoryScreen::new);
	}
}
