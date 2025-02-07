
package net.mcreator.superiorstructures.client.renderer;

import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.cache.object.BakedGeoModel;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.superiorstructures.entity.model.ExposedCopperGolemModel;
import net.mcreator.superiorstructures.entity.layer.ExposedCopperGolemLayer;
import net.mcreator.superiorstructures.entity.ExposedCopperGolemEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class ExposedCopperGolemRenderer extends GeoEntityRenderer<ExposedCopperGolemEntity> {
	public ExposedCopperGolemRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new ExposedCopperGolemModel());
		this.shadowRadius = 0.5f;
		this.addRenderLayer(new ExposedCopperGolemLayer(this));
	}

	@Override
	public RenderType getRenderType(ExposedCopperGolemEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, ExposedCopperGolemEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, int color) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, color);
	}
}
