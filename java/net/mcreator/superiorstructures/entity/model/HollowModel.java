package net.mcreator.superiorstructures.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.animation.AnimationState;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.superiorstructures.entity.HollowEntity;

public class HollowModel extends GeoModel<HollowEntity> {
	@Override
	public ResourceLocation getAnimationResource(HollowEntity entity) {
		return ResourceLocation.parse("superiorstructures:animations/hollow_model.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HollowEntity entity) {
		return ResourceLocation.parse("superiorstructures:geo/hollow_model.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HollowEntity entity) {
		return ResourceLocation.parse("superiorstructures:textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(HollowEntity animatable, long instanceId, AnimationState animationState) {
		GeoBone head = getAnimationProcessor().getBone("Head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
