
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.superiorstructures.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.core.registries.Registries;

import net.mcreator.superiorstructures.world.inventory.TransceiverInterfaceMenu;
import net.mcreator.superiorstructures.world.inventory.PuzzleInventoryMenu;
import net.mcreator.superiorstructures.world.inventory.PowerCoreInventoryMenu;
import net.mcreator.superiorstructures.world.inventory.FlavorInterfaceMenu;
import net.mcreator.superiorstructures.world.inventory.ArtificeMenu;
import net.mcreator.superiorstructures.SuperiorstructuresMod;

public class SuperiorstructuresModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, SuperiorstructuresMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<ArtificeMenu>> ARTIFICE = REGISTRY.register("artifice", () -> IMenuTypeExtension.create(ArtificeMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<TransceiverInterfaceMenu>> TRANSCEIVER_INTERFACE = REGISTRY.register("transceiver_interface", () -> IMenuTypeExtension.create(TransceiverInterfaceMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<PowerCoreInventoryMenu>> POWER_CORE_INVENTORY = REGISTRY.register("power_core_inventory", () -> IMenuTypeExtension.create(PowerCoreInventoryMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<FlavorInterfaceMenu>> FLAVOR_INTERFACE = REGISTRY.register("flavor_interface", () -> IMenuTypeExtension.create(FlavorInterfaceMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<PuzzleInventoryMenu>> PUZZLE_INVENTORY = REGISTRY.register("puzzle_inventory", () -> IMenuTypeExtension.create(PuzzleInventoryMenu::new));
}
