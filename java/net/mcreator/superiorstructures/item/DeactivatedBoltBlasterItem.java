
package net.mcreator.superiorstructures.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class DeactivatedBoltBlasterItem extends Item {
	public DeactivatedBoltBlasterItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}
}
