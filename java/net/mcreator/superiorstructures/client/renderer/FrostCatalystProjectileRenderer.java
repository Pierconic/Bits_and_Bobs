
package net.mcreator.superiorstructures.client.renderer;

import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.superiorstructures.procedures.CatalystShakingProcedure;
import net.mcreator.superiorstructures.entity.FrostCatalystProjectileEntity;
import net.mcreator.superiorstructures.client.model.Modelcatalyst_model;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class FrostCatalystProjectileRenderer extends MobRenderer<FrostCatalystProjectileEntity, Modelcatalyst_model<FrostCatalystProjectileEntity>> {
	public FrostCatalystProjectileRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcatalyst_model(context.bakeLayer(Modelcatalyst_model.LAYER_LOCATION)), 0.3f);
		this.addLayer(new RenderLayer<FrostCatalystProjectileEntity, Modelcatalyst_model<FrostCatalystProjectileEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("superiorstructures:textures/entities/catalystglow.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, FrostCatalystProjectileEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(FrostCatalystProjectileEntity entity) {
		return ResourceLocation.parse("superiorstructures:textures/entities/frostcatalyst.png");
	}

	@Override
	protected boolean isShaking(FrostCatalystProjectileEntity entity) {
		Level world = entity.level();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		return CatalystShakingProcedure.execute(entity);
	}
}
