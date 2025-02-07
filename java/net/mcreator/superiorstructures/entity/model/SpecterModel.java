package net.mcreator.superiorstructures.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.superiorstructures.entity.SpecterEntity;

public class SpecterModel extends GeoModel<SpecterEntity> {
	@Override
	public ResourceLocation getAnimationResource(SpecterEntity entity) {
		return ResourceLocation.parse("superiorstructures:animations/specter.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpecterEntity entity) {
		return ResourceLocation.parse("superiorstructures:geo/specter.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpecterEntity entity) {
		return ResourceLocation.parse("superiorstructures:textures/entities/" + entity.getTexture() + ".png");
	}

}
