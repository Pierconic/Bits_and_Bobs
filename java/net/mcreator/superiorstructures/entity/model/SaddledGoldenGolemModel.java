package net.mcreator.superiorstructures.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.superiorstructures.entity.SaddledGoldenGolemEntity;

public class SaddledGoldenGolemModel extends GeoModel<SaddledGoldenGolemEntity> {
	@Override
	public ResourceLocation getAnimationResource(SaddledGoldenGolemEntity entity) {
		return ResourceLocation.parse("superiorstructures:animations/gilded_golem.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SaddledGoldenGolemEntity entity) {
		return ResourceLocation.parse("superiorstructures:geo/gilded_golem.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SaddledGoldenGolemEntity entity) {
		return ResourceLocation.parse("superiorstructures:textures/entities/" + entity.getTexture() + ".png");
	}

}
