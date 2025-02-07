package net.mcreator.superiorstructures.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.superiorstructures.block.entity.TetherTileEntity;

public class TetherBlockModel extends GeoModel<TetherTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(TetherTileEntity animatable) {
		return ResourceLocation.parse("superiorstructures:animations/tether.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TetherTileEntity animatable) {
		return ResourceLocation.parse("superiorstructures:geo/tether.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TetherTileEntity animatable) {
		return ResourceLocation.parse("superiorstructures:textures/block/tether.png");
	}
}
