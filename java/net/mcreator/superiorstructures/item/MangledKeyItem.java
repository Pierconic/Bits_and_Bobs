
package net.mcreator.superiorstructures.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class MangledKeyItem extends Item {
	public MangledKeyItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
