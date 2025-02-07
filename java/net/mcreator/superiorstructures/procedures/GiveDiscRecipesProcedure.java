package net.mcreator.superiorstructures.procedures;

import net.neoforged.neoforge.event.entity.player.ItemEntityPickupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.superiorstructures.init.SuperiorstructuresModItems;

import javax.annotation.Nullable;

import java.util.Collections;

@EventBusSubscriber
public class GiveDiscRecipesProcedure {
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
		if (entity instanceof Player) {
			if (itemstack.getItem() == SuperiorstructuresModItems.DISC_FRAGMENT_2.get()) {
				if (entity instanceof ServerPlayer _serverPlayer)
					_serverPlayer.awardRecipesByKey(Collections.singletonList(ResourceLocation.parse("superiorstructures:relic_recipe")));
			}
			if (itemstack.getItem() == SuperiorstructuresModItems.DISC_FRAGMENT_CREATOR_MUSIC_BOX.get()) {
				if (entity instanceof ServerPlayer _serverPlayer)
					_serverPlayer.awardRecipesByKey(Collections.singletonList(ResourceLocation.parse("superiorstructures:creator_recipe")));
				if (entity instanceof ServerPlayer _serverPlayer)
					_serverPlayer.awardRecipesByKey(Collections.singletonList(ResourceLocation.parse("superiorstructures:precipice_recipe")));
			}
			if (itemstack.getItem() == SuperiorstructuresModItems.DISC_FRAGMENT_CREATOR.get()) {
				if (entity instanceof ServerPlayer _serverPlayer)
					_serverPlayer.awardRecipesByKey(Collections.singletonList(ResourceLocation.parse("superiorstructures:creator_music_box_recipe")));
				if (entity instanceof ServerPlayer _serverPlayer)
					_serverPlayer.awardRecipesByKey(Collections.singletonList(ResourceLocation.parse("superiorstructures:precipice_recipe")));
			}
			if (itemstack.getItem() == SuperiorstructuresModItems.DISC_FRAGMENT_ELEGY.get()) {
				if (entity instanceof ServerPlayer _serverPlayer)
					_serverPlayer.awardRecipesByKey(Collections.singletonList(ResourceLocation.parse("superiorstructures:elegy_recipe")));
			}
			if (itemstack.getItem() == SuperiorstructuresModItems.DISC_FRAGMENT_DIAMOND.get()) {
				if (entity instanceof ServerPlayer _serverPlayer)
					_serverPlayer.awardRecipesByKey(Collections.singletonList(ResourceLocation.parse("superiorstructures:diamond_recipe")));
			}
			if (itemstack.getItem() == SuperiorstructuresModItems.DISC_FRAGMENT_MINECRAFT.get()) {
				if (entity instanceof ServerPlayer _serverPlayer)
					_serverPlayer.awardRecipesByKey(Collections.singletonList(ResourceLocation.parse("superiorstructures:minecraft_recipe")));
			}
			if (itemstack.getItem() == SuperiorstructuresModItems.DISC_FRAGMENT_SPIDERS.get()) {
				if (entity instanceof ServerPlayer _serverPlayer)
					_serverPlayer.awardRecipesByKey(Collections.singletonList(ResourceLocation.parse("superiorstructures:ballad_recipe")));
			}
			if (itemstack.getItem() == SuperiorstructuresModItems.DISC_FRAGMENT_MOOG_SPACE.get()) {
				if (entity instanceof ServerPlayer _serverPlayer)
					_serverPlayer.awardRecipesByKey(Collections.singletonList(ResourceLocation.parse("superiorstructures:moog_in_space_recipe")));
			}
			if (itemstack.getItem() == SuperiorstructuresModItems.DISC_FRAGMENT_RELIC.get()) {
				if (entity instanceof ServerPlayer _serverPlayer)
					_serverPlayer.awardRecipesByKey(Collections.singletonList(ResourceLocation.parse("superiorstructures:disc_two_recipe")));
			}
			if (itemstack.getItem() == SuperiorstructuresModItems.DISC_FRAGMENT_MOOG_CITY.get()) {
				if (entity instanceof ServerPlayer _serverPlayer)
					_serverPlayer.awardRecipesByKey(Collections.singletonList(ResourceLocation.parse("superiorstructures:moog_city_recipe")));
			}
			if (itemstack.getItem() == SuperiorstructuresModItems.DISC_FRAGMENT_KYOTO.get()) {
				if (entity instanceof ServerPlayer _serverPlayer)
					_serverPlayer.awardRecipesByKey(Collections.singletonList(ResourceLocation.parse("superiorstructures:kyoto_recipe")));
			}
			if (itemstack.getItem() == SuperiorstructuresModItems.DISC_FRAGMENT_INTRO.get()) {
				if (entity instanceof ServerPlayer _serverPlayer)
					_serverPlayer.awardRecipesByKey(Collections.singletonList(ResourceLocation.parse("superiorstructures:intro_recipe")));
				if (entity instanceof ServerPlayer _serverPlayer)
					_serverPlayer.awardRecipesByKey(Collections.singletonList(ResourceLocation.parse("superiorstructures:eleven_repair")));
			}
			if (itemstack.getItem() == SuperiorstructuresModItems.DISC_FRAGMENT_WAIT.get()) {
				if (entity instanceof ServerPlayer _serverPlayer)
					_serverPlayer.awardRecipesByKey(Collections.singletonList(ResourceLocation.parse("superiorstructures:wait_recipe")));
			}
			if (itemstack.getItem() == SuperiorstructuresModItems.DISC_FRAGMENT_OTHERSIDE.get()) {
				if (entity instanceof ServerPlayer _serverPlayer)
					_serverPlayer.awardRecipesByKey(Collections.singletonList(ResourceLocation.parse("superiorstructures:otherside_recipe")));
			}
			if (itemstack.getItem() == SuperiorstructuresModItems.DISC_FRAGMENT_PIGSTEP.get()) {
				if (entity instanceof ServerPlayer _serverPlayer)
					_serverPlayer.awardRecipesByKey(Collections.singletonList(ResourceLocation.parse("superiorstructures:pigstep_recipe")));
			}
			if (itemstack.getItem() == SuperiorstructuresModItems.DISC_FRAGMENT_CAT.get()) {
				if (entity instanceof ServerPlayer _serverPlayer)
					_serverPlayer.awardRecipesByKey(Collections.singletonList(ResourceLocation.parse("superiorstructures:cat_recipe")));
			}
			if (itemstack.getItem() == SuperiorstructuresModItems.DISC_FRAGMENT_FAR.get()) {
				if (entity instanceof ServerPlayer _serverPlayer)
					_serverPlayer.awardRecipesByKey(Collections.singletonList(ResourceLocation.parse("superiorstructures:far_recipe")));
			}
			if (itemstack.getItem() == SuperiorstructuresModItems.DISC_FRAGMENT_BLOCKS.get()) {
				if (entity instanceof ServerPlayer _serverPlayer)
					_serverPlayer.awardRecipesByKey(Collections.singletonList(ResourceLocation.parse("superiorstructures:blocks_recipe")));
			}
			if (itemstack.getItem() == SuperiorstructuresModItems.DISC_FRAGMENT_13.get()) {
				if (entity instanceof ServerPlayer _serverPlayer)
					_serverPlayer.awardRecipesByKey(Collections.singletonList(ResourceLocation.parse("superiorstructures:disc_thirteen_recipe")));
			}
			if (itemstack.getItem() == SuperiorstructuresModItems.DISC_FRAGMENT_11.get()) {
				if (entity instanceof ServerPlayer _serverPlayer)
					_serverPlayer.awardRecipesByKey(Collections.singletonList(ResourceLocation.parse("superiorstructures:disc_eleven_recipe")));
			}
			if (itemstack.getItem() == SuperiorstructuresModItems.DISC_FRAGMENT_WARD.get()) {
				if (entity instanceof ServerPlayer _serverPlayer)
					_serverPlayer.awardRecipesByKey(Collections.singletonList(ResourceLocation.parse("superiorstructures:ward_recipe")));
			}
			if (itemstack.getItem() == SuperiorstructuresModItems.DISC_FRAGMENT_STAL.get()) {
				if (entity instanceof ServerPlayer _serverPlayer)
					_serverPlayer.awardRecipesByKey(Collections.singletonList(ResourceLocation.parse("superiorstructures:stal_recipe")));
			}
			if (itemstack.getItem() == SuperiorstructuresModItems.DISC_FRAGMENT_STRAD.get()) {
				if (entity instanceof ServerPlayer _serverPlayer)
					_serverPlayer.awardRecipesByKey(Collections.singletonList(ResourceLocation.parse("superiorstructures:strad_recipe")));
			}
			if (itemstack.getItem() == SuperiorstructuresModItems.DISC_FRAGMENT_MALL.get()) {
				if (entity instanceof ServerPlayer _serverPlayer)
					_serverPlayer.awardRecipesByKey(Collections.singletonList(ResourceLocation.parse("superiorstructures:mall_recipe")));
			}
			if (itemstack.getItem() == SuperiorstructuresModItems.DISC_FRAGMENT_MELLOHI.get()) {
				if (entity instanceof ServerPlayer _serverPlayer)
					_serverPlayer.awardRecipesByKey(Collections.singletonList(ResourceLocation.parse("superiorstructures:mellohi_recipe")));
			}
			if (itemstack.getItem() == SuperiorstructuresModItems.DISC_FRAGMENT_CHIRP.get()) {
				if (entity instanceof ServerPlayer _serverPlayer)
					_serverPlayer.awardRecipesByKey(Collections.singletonList(ResourceLocation.parse("superiorstructures:chirp_recipe")));
			}
		}
	}
}
