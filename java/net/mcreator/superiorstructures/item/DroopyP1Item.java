
package net.mcreator.superiorstructures.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.superiorstructures.SuperiorstructuresMod;

public class DroopyP1Item extends Item {
	public DroopyP1Item() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath(SuperiorstructuresMod.MODID, "droopy_p_1"))));
	}
}
