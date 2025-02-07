package net.mcreator.superiorstructures.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.superiorstructures.entity.CopperGolemEntity;

public class CopperGolemModel extends GeoModel<CopperGolemEntity> {
	@Override
	public ResourceLocation getAnimationResource(CopperGolemEntity entity) {
		return ResourceLocation.parse("superiorstructures:animations/copper_golem.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CopperGolemEntity entity) {
		return ResourceLocation.parse("superiorstructures:geo/copper_golem.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CopperGolemEntity entity) {
		return ResourceLocation.parse("superiorstructures:textures/entities/" + entity.getTexture() + ".png");
	}

}
