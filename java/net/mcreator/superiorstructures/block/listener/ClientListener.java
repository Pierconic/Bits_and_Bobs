package net.mcreator.superiorstructures.block.listener;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.block.entity.BlockEntityType;

import net.mcreator.superiorstructures.init.SuperiorstructuresModBlockEntities;
import net.mcreator.superiorstructures.block.renderer.TetherTileRenderer;
import net.mcreator.superiorstructures.block.entity.TetherTileEntity;
import net.mcreator.superiorstructures.SuperiorstructuresMod;

@EventBusSubscriber(modid = SuperiorstructuresMod.MODID, value = Dist.CLIENT, bus = EventBusSubscriber.Bus.MOD)
public class ClientListener {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer((BlockEntityType<TetherTileEntity>) SuperiorstructuresModBlockEntities.TETHER.get(), context -> new TetherTileRenderer());
	}
}
