package net.mcreator.superiorstructures.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.superiorstructures.entity.GrazerEntity;

public class GrazerModel extends GeoModel<GrazerEntity> {
	@Override
	public ResourceLocation getAnimationResource(GrazerEntity entity) {
		return ResourceLocation.parse("superiorstructures:animations/grazer.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GrazerEntity entity) {
		return ResourceLocation.parse("superiorstructures:geo/grazer.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GrazerEntity entity) {
		return ResourceLocation.parse("superiorstructures:textures/entities/" + entity.getTexture() + ".png");
	}

}
