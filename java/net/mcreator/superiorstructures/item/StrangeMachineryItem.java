
package net.mcreator.superiorstructures.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class StrangeMachineryItem extends Item {
	public StrangeMachineryItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
