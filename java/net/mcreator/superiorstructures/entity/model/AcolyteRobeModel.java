package net.mcreator.superiorstructures.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.superiorstructures.entity.AcolyteRobeEntity;

public class AcolyteRobeModel extends GeoModel<AcolyteRobeEntity> {
	@Override
	public ResourceLocation getAnimationResource(AcolyteRobeEntity entity) {
		return ResourceLocation.parse("superiorstructures:animations/acolyte_robe.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AcolyteRobeEntity entity) {
		return ResourceLocation.parse("superiorstructures:geo/acolyte_robe.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AcolyteRobeEntity entity) {
		return ResourceLocation.parse("superiorstructures:textures/entities/" + entity.getTexture() + ".png");
	}

}
