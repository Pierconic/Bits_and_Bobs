package net.mcreator.superiorstructures.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.superiorstructures.entity.GoldenGolemEntity;

public class GoldenGolemModel extends GeoModel<GoldenGolemEntity> {
	@Override
	public ResourceLocation getAnimationResource(GoldenGolemEntity entity) {
		return ResourceLocation.parse("superiorstructures:animations/gilded_golem.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GoldenGolemEntity entity) {
		return ResourceLocation.parse("superiorstructures:geo/gilded_golem.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GoldenGolemEntity entity) {
		return ResourceLocation.parse("superiorstructures:textures/entities/" + entity.getTexture() + ".png");
	}

}
