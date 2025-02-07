
package net.mcreator.superiorstructures.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class VesselPieceItem extends Item {
	public VesselPieceItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE));
	}
}
