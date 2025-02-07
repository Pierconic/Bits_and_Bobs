package net.mcreator.superiorstructures.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.superiorstructures.entity.ExposedCopperGolemEntity;

public class ExposedCopperGolemModel extends GeoModel<ExposedCopperGolemEntity> {
	@Override
	public ResourceLocation getAnimationResource(ExposedCopperGolemEntity entity) {
		return ResourceLocation.parse("superiorstructures:animations/copper_golem.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ExposedCopperGolemEntity entity) {
		return ResourceLocation.parse("superiorstructures:geo/copper_golem.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ExposedCopperGolemEntity entity) {
		return ResourceLocation.parse("superiorstructures:textures/entities/" + entity.getTexture() + ".png");
	}

}
