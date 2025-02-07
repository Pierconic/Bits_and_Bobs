package net.mcreator.superiorstructures.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.superiorstructures.entity.CreepletEntity;

public class CreepletModel extends GeoModel<CreepletEntity> {
	@Override
	public ResourceLocation getAnimationResource(CreepletEntity entity) {
		return ResourceLocation.parse("superiorstructures:animations/creepling.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CreepletEntity entity) {
		return ResourceLocation.parse("superiorstructures:geo/creepling.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CreepletEntity entity) {
		return ResourceLocation.parse("superiorstructures:textures/entities/" + entity.getTexture() + ".png");
	}

}
