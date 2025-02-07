
package net.mcreator.superiorstructures.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class GildedMachineryItem extends Item {
	public GildedMachineryItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
