package net.mcreator.superiorstructures.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.superiorstructures.entity.BrokenGoldenGolemEntity;

public class BrokenGoldenGolemModel extends GeoModel<BrokenGoldenGolemEntity> {
	@Override
	public ResourceLocation getAnimationResource(BrokenGoldenGolemEntity entity) {
		return ResourceLocation.parse("superiorstructures:animations/gilded_golem.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BrokenGoldenGolemEntity entity) {
		return ResourceLocation.parse("superiorstructures:geo/gilded_golem.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BrokenGoldenGolemEntity entity) {
		return ResourceLocation.parse("superiorstructures:textures/entities/" + entity.getTexture() + ".png");
	}

}
