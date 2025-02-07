
package net.mcreator.superiorstructures.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class EmptyPowerCellItem extends Item {
	public EmptyPowerCellItem() {
		super(new Item.Properties().stacksTo(16).rarity(Rarity.COMMON));
	}
}
