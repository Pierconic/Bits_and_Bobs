package net.mcreator.superiorstructures.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.superiorstructures.entity.AncientCopperGolemEntity;

public class AncientCopperGolemModel extends GeoModel<AncientCopperGolemEntity> {
	@Override
	public ResourceLocation getAnimationResource(AncientCopperGolemEntity entity) {
		return ResourceLocation.parse("superiorstructures:animations/copper_golem.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AncientCopperGolemEntity entity) {
		return ResourceLocation.parse("superiorstructures:geo/copper_golem.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AncientCopperGolemEntity entity) {
		return ResourceLocation.parse("superiorstructures:textures/entities/" + entity.getTexture() + ".png");
	}

}
