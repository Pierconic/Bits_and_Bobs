package net.mcreator.superiorstructures.procedures;

import net.neoforged.neoforge.event.entity.player.ItemEntityPickupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;

import javax.annotation.Nullable;

import java.util.Collections;

@EventBusSubscriber
public class GiveTrapRecipesProcedure {
	@SubscribeEvent
	public static void onPickup(ItemEntityPickupEvent.Pre event) {
		execute(event, event.getPlayer(), event.getItemEntity().getItem());
	}

	public static void execute(Entity entity, ItemStack itemstack) {
		execute(null, entity, itemstack);
	}

	private static void execute(@Nullable Event event, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getItem() == Blocks.POINTED_DRIPSTONE.asItem()) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(ResourceLocation.parse("superiorstructures:spikestone_recipe")));
		} else if (itemstack.getItem() == Items.LAPIS_LAZULI) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(ResourceLocation.parse("superiorstructures:smashstone_recipe")));
		} else if (itemstack.getItem() == Items.PRISMARINE_SHARD) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(ResourceLocation.parse("superiorstructures:beamstone_recipe")));
		} else if (itemstack.getItem() == Items.FIRE_CHARGE) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(ResourceLocation.parse("superiorstructures:flamestone_recipe")));
		}
	}
}
