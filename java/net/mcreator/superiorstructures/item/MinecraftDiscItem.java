
package net.mcreator.superiorstructures.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.superiorstructures.SuperiorstructuresMod;

public class MinecraftDiscItem extends Item {
	public MinecraftDiscItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC).jukeboxPlayable(ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath(SuperiorstructuresMod.MODID, "minecraft_disc"))));
	}
}
