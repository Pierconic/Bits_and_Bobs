
package net.mcreator.superiorstructures.client.renderer;

import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.cache.object.BakedGeoModel;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.superiorstructures.entity.model.CopperGolemModel;
import net.mcreator.superiorstructures.entity.layer.CopperGolemLayer;
import net.mcreator.superiorstructures.entity.CopperGolemEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class CopperGolemRenderer extends GeoEntityRenderer<CopperGolemEntity> {
	public CopperGolemRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new CopperGolemModel());
		this.shadowRadius = 0.5f;
		this.addRenderLayer(new CopperGolemLayer(this));
	}

	@Override
	public RenderType getRenderType(CopperGolemEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, CopperGolemEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, int color) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, color);
	}
}
