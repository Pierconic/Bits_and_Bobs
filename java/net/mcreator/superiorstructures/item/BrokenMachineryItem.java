
package net.mcreator.superiorstructures.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class BrokenMachineryItem extends Item {
	public BrokenMachineryItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
