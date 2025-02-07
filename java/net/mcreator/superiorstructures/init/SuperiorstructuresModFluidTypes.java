
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.superiorstructures.init;

import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.fluids.FluidType;

import net.mcreator.superiorstructures.fluid.types.EssenceFluidType;
import net.mcreator.superiorstructures.SuperiorstructuresMod;

public class SuperiorstructuresModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(NeoForgeRegistries.FLUID_TYPES, SuperiorstructuresMod.MODID);
	public static final DeferredHolder<FluidType, FluidType> ESSENCE_TYPE = REGISTRY.register("essence", () -> new EssenceFluidType());
}
