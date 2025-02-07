package net.mcreator.superiorstructures.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.animation.AnimationState;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.superiorstructures.entity.BrokenIronGolemEntity;

public class BrokenIronGolemModel extends GeoModel<BrokenIronGolemEntity> {
	@Override
	public ResourceLocation getAnimationResource(BrokenIronGolemEntity entity) {
		return ResourceLocation.parse("superiorstructures:animations/broken_golem.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BrokenIronGolemEntity entity) {
		return ResourceLocation.parse("superiorstructures:geo/broken_golem.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BrokenIronGolemEntity entity) {
		return ResourceLocation.parse("superiorstructures:textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(BrokenIronGolemEntity animatable, long instanceId, AnimationState animationState) {
		GeoBone head = getAnimationProcessor().getBone("head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
