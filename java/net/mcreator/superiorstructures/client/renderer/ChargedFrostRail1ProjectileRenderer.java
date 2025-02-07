package net.mcreator.superiorstructures.client.renderer;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.superiorstructures.entity.ChargedFrostRail1ProjectileEntity;
import net.mcreator.superiorstructures.client.model.Modelorb_model;

import com.mojang.math.Axis;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class ChargedFrostRail1ProjectileRenderer extends EntityRenderer<ChargedFrostRail1ProjectileEntity> {
	private static final ResourceLocation texture = ResourceLocation.parse("superiorstructures:textures/entities/frostorbentity.png");
	private final Modelorb_model model;

	public ChargedFrostRail1ProjectileRenderer(EntityRendererProvider.Context context) {
		super(context);
		model = new Modelorb_model(context.bakeLayer(Modelorb_model.LAYER_LOCATION));
	}

	@Override
	public void render(ChargedFrostRail1ProjectileEntity entityIn, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource bufferIn, int packedLightIn) {
		VertexConsumer vb = bufferIn.getBuffer(RenderType.entityCutout(this.getTextureLocation(entityIn)));
		poseStack.pushPose();
		poseStack.mulPose(Axis.YP.rotationDegrees(Mth.lerp(partialTicks, entityIn.yRotO, entityIn.getYRot()) - 90));
		poseStack.mulPose(Axis.ZP.rotationDegrees(90 + Mth.lerp(partialTicks, entityIn.xRotO, entityIn.getXRot())));
		model.renderToBuffer(poseStack, vb, packedLightIn, OverlayTexture.NO_OVERLAY);
		poseStack.popPose();
		super.render(entityIn, entityYaw, partialTicks, poseStack, bufferIn, packedLightIn);
	}

	@Override
	public ResourceLocation getTextureLocation(ChargedFrostRail1ProjectileEntity entity) {
		return texture;
	}
}
