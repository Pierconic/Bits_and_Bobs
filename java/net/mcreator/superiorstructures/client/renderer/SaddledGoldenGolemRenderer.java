
package net.mcreator.superiorstructures.client.renderer;

import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.cache.object.BakedGeoModel;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.superiorstructures.entity.model.SaddledGoldenGolemModel;
import net.mcreator.superiorstructures.entity.layer.SaddledGoldenGolemLayer;
import net.mcreator.superiorstructures.entity.SaddledGoldenGolemEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class SaddledGoldenGolemRenderer extends GeoEntityRenderer<SaddledGoldenGolemEntity> {
	public SaddledGoldenGolemRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new SaddledGoldenGolemModel());
		this.shadowRadius = 1.5f;
		this.addRenderLayer(new SaddledGoldenGolemLayer(this));
	}

	@Override
	public RenderType getRenderType(SaddledGoldenGolemEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, SaddledGoldenGolemEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, int color) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, color);
	}

	@Override
	protected float getDeathMaxRotation(SaddledGoldenGolemEntity entityLivingBaseIn) {
		return 0.0F;
	}
}
