package net.mcreator.superiorstructures.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.superiorstructures.block.display.TetherDisplayItem;

public class TetherDisplayModel extends GeoModel<TetherDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(TetherDisplayItem animatable) {
		return ResourceLocation.parse("superiorstructures:animations/tether.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TetherDisplayItem animatable) {
		return ResourceLocation.parse("superiorstructures:geo/tether.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TetherDisplayItem entity) {
		return ResourceLocation.parse("superiorstructures:textures/block/tether.png");
	}
}
