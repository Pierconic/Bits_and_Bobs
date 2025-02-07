
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
import net.mcreator.superiorstructures.entity.BigEnergyCatalystProjectileEntity;
import net.mcreator.superiorstructures.client.model.Modelbig_catalyst;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class BigEnergyCatalystProjectileRenderer extends MobRenderer<BigEnergyCatalystProjectileEntity, Modelbig_catalyst<BigEnergyCatalystProjectileEntity>> {
	public BigEnergyCatalystProjectileRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbig_catalyst(context.bakeLayer(Modelbig_catalyst.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<BigEnergyCatalystProjectileEntity, Modelbig_catalyst<BigEnergyCatalystProjectileEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("superiorstructures:textures/entities/bigcatalystglow.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, BigEnergyCatalystProjectileEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw,
					float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(BigEnergyCatalystProjectileEntity entity) {
		return ResourceLocation.parse("superiorstructures:textures/entities/bigenergybombentity.png");
	}

	@Override
	protected boolean isShaking(BigEnergyCatalystProjectileEntity entity) {
		Level world = entity.level();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		return CatalystShakingProcedure.execute(entity);
	}
}
