package net.mcreator.superiorstructures.client.renderer;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.superiorstructures.entity.ExposedCopperSpearProjectileEntity;
import net.mcreator.superiorstructures.client.model.Modelspear_base;

import com.mojang.math.Axis;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class ExposedCopperSpearProjectileRenderer extends EntityRenderer<ExposedCopperSpearProjectileEntity> {
	private static final ResourceLocation texture = ResourceLocation.parse("superiorstructures:textures/entities/exposedcopperspearentity.png");
	private final Modelspear_base model;

	public ExposedCopperSpearProjectileRenderer(EntityRendererProvider.Context context) {
		super(context);
		model = new Modelspear_base(context.bakeLayer(Modelspear_base.LAYER_LOCATION));
	}

	@Override
	public void render(ExposedCopperSpearProjectileEntity entityIn, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource bufferIn, int packedLightIn) {
		VertexConsumer vb = bufferIn.getBuffer(RenderType.entityCutout(this.getTextureLocation(entityIn)));
		poseStack.pushPose();
		poseStack.mulPose(Axis.YP.rotationDegrees(Mth.lerp(partialTicks, entityIn.yRotO, entityIn.getYRot()) - 90));
		poseStack.mulPose(Axis.ZP.rotationDegrees(90 + Mth.lerp(partialTicks, entityIn.xRotO, entityIn.getXRot())));
		model.renderToBuffer(poseStack, vb, packedLightIn, OverlayTexture.NO_OVERLAY);
		poseStack.popPose();
		super.render(entityIn, entityYaw, partialTicks, poseStack, bufferIn, packedLightIn);
	}

	@Override
	public ResourceLocation getTextureLocation(ExposedCopperSpearProjectileEntity entity) {
		return texture;
	}
}
