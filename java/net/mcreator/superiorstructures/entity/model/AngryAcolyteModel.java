package net.mcreator.superiorstructures.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.animation.AnimationState;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.superiorstructures.entity.AngryAcolyteEntity;

public class AngryAcolyteModel extends GeoModel<AngryAcolyteEntity> {
	@Override
	public ResourceLocation getAnimationResource(AngryAcolyteEntity entity) {
		return ResourceLocation.parse("superiorstructures:animations/angry_acolyte.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngryAcolyteEntity entity) {
		return ResourceLocation.parse("superiorstructures:geo/angry_acolyte.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngryAcolyteEntity entity) {
		return ResourceLocation.parse("superiorstructures:textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(AngryAcolyteEntity animatable, long instanceId, AnimationState animationState) {
		GeoBone head = getAnimationProcessor().getBone("head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
