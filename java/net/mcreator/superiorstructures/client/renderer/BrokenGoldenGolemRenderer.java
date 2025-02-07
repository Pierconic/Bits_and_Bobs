
package net.mcreator.superiorstructures.client.renderer;

import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.cache.object.BakedGeoModel;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.superiorstructures.entity.model.BrokenGoldenGolemModel;
import net.mcreator.superiorstructures.entity.layer.BrokenGoldenGolemLayer;
import net.mcreator.superiorstructures.entity.BrokenGoldenGolemEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class BrokenGoldenGolemRenderer extends GeoEntityRenderer<BrokenGoldenGolemEntity> {
	public BrokenGoldenGolemRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new BrokenGoldenGolemModel());
		this.shadowRadius = 1.5f;
		this.addRenderLayer(new BrokenGoldenGolemLayer(this));
	}

	@Override
	public RenderType getRenderType(BrokenGoldenGolemEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, BrokenGoldenGolemEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, int color) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, color);
	}

	@Override
	protected float getDeathMaxRotation(BrokenGoldenGolemEntity entityLivingBaseIn) {
		return 0.0F;
	}
}
