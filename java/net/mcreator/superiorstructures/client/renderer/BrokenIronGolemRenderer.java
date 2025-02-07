
package net.mcreator.superiorstructures.client.renderer;

import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.cache.object.BakedGeoModel;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.superiorstructures.entity.model.BrokenIronGolemModel;
import net.mcreator.superiorstructures.entity.layer.BrokenIronGolemLayer;
import net.mcreator.superiorstructures.entity.BrokenIronGolemEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class BrokenIronGolemRenderer extends GeoEntityRenderer<BrokenIronGolemEntity> {
	public BrokenIronGolemRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new BrokenIronGolemModel());
		this.shadowRadius = 0.6f;
		this.addRenderLayer(new BrokenIronGolemLayer(this));
	}

	@Override
	public RenderType getRenderType(BrokenIronGolemEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, BrokenIronGolemEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, int color) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, color);
	}

	@Override
	protected float getDeathMaxRotation(BrokenIronGolemEntity entityLivingBaseIn) {
		return 0.0F;
	}
}
