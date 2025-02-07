
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.superiorstructures.init;

import net.neoforged.neoforge.event.village.WandererTradesEvent;
import net.neoforged.neoforge.common.BasicItemListing;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

@EventBusSubscriber
public class SuperiorstructuresModTrades {
	@SubscribeEvent
	public static void registerWanderingTrades(WandererTradesEvent event) {
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 2), new ItemStack(SuperiorstructuresModItems.YELLOW_CERAMIC_SHARD.get()), 6, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 2), new ItemStack(SuperiorstructuresModItems.PINK_CERAMIC_SHARD.get()), 6, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 2), new ItemStack(SuperiorstructuresModItems.WHITE_CERAMIC_SHARD.get()), 6, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 3), new ItemStack(SuperiorstructuresModItems.LIGHT_BLUE_CERAMIC_SHARD.get()), 6, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 3), new ItemStack(SuperiorstructuresModItems.ORANGE_CERAMIC_SHARD.get()), 6, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 3), new ItemStack(SuperiorstructuresModItems.RED_CERAMIC_SHARD.get()), 6, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 4), new ItemStack(SuperiorstructuresModItems.DISC_FRAGMENT_CAT.get()), 5, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 5), new ItemStack(SuperiorstructuresModItems.DISC_FRAGMENT_FAR.get()), 5, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 6), new ItemStack(SuperiorstructuresModItems.DISC_FRAGMENT_WAIT.get()), 5, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 5), new ItemStack(SuperiorstructuresModItems.WEATHERED_COPPER_DAGGER.get()), 4, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 3), new ItemStack(SuperiorstructuresModItems.EXPOSED_COPPER_SPEAR.get(), 3), 6, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 5), new ItemStack(SuperiorstructuresModItems.WEATHERED_COPPER_SPEAR.get(), 3), 6, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 5), new ItemStack(SuperiorstructuresModItems.BROKEN_MACHINERY.get()), 4, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 16), new ItemStack(SuperiorstructuresModItems.OLD_MACHINERY.get()), 10, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 6), new ItemStack(SuperiorstructuresModItems.EXPOSED_COPPER_BRUSH.get()), 3, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 14), new ItemStack(SuperiorstructuresModItems.WEATHERED_COPPER_BRUSH.get()), 3, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 6), new ItemStack(SuperiorstructuresModItems.EMPTY_POWER_CELL.get()), 10, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 6), new ItemStack(SuperiorstructuresModItems.AMETHYSTDAGGER.get()), 10, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD), new ItemStack(Items.EXPLORER_POTTERY_SHERD), 10, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD), new ItemStack(Items.BREWER_POTTERY_SHERD), 10, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD), new ItemStack(Items.ANGLER_POTTERY_SHERD), 10, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 3), new ItemStack(Items.EXPERIENCE_BOTTLE, 3), 10, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 5), new ItemStack(Items.FIRE_CHARGE), 4, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 5), new ItemStack(SuperiorstructuresModItems.LIGHTNING_CHARGE.get()), 4, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 5), new ItemStack(SuperiorstructuresModItems.FROST_CHARGE.get()), 4, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 64), new ItemStack(SuperiorstructuresModItems.VESSEL_PIECE.get()), 10, 5, 0.05f));
	}
}
