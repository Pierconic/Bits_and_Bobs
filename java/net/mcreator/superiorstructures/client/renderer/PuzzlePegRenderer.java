
package net.mcreator.superiorstructures.client.renderer;

import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.superiorstructures.procedures.PuzzlePegGlazed8ConditionProcedure;
import net.mcreator.superiorstructures.procedures.PuzzlePegGlazed7ConditionProcedure;
import net.mcreator.superiorstructures.procedures.PuzzlePegGlazed6ConditionProcedure;
import net.mcreator.superiorstructures.procedures.PuzzlePegGlazed5ConditionProcedure;
import net.mcreator.superiorstructures.procedures.PuzzlePegGlazed4ConditionProcedure;
import net.mcreator.superiorstructures.procedures.PuzzlePegGlazed3ConditionProcedure;
import net.mcreator.superiorstructures.procedures.PuzzlePegGlazed2ConditionProcedure;
import net.mcreator.superiorstructures.procedures.PuzzlePegGlazed1ConditionProcedure;
import net.mcreator.superiorstructures.procedures.PuzzlePegGlazed0ConditionProcedure;
import net.mcreator.superiorstructures.entity.PuzzlePegEntity;
import net.mcreator.superiorstructures.client.model.Modelpuzzle_peg;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class PuzzlePegRenderer extends MobRenderer<PuzzlePegEntity, Modelpuzzle_peg<PuzzlePegEntity>> {
	public PuzzlePegRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelpuzzle_peg(context.bakeLayer(Modelpuzzle_peg.LAYER_LOCATION)), 0f);
		this.addLayer(new RenderLayer<PuzzlePegEntity, Modelpuzzle_peg<PuzzlePegEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("superiorstructures:textures/entities/puzzle_peg_glaze_0.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PuzzlePegEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (PuzzlePegGlazed0ConditionProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
				}
			}
		});
		this.addLayer(new RenderLayer<PuzzlePegEntity, Modelpuzzle_peg<PuzzlePegEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("superiorstructures:textures/entities/puzzle_peg_glaze_1.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PuzzlePegEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (PuzzlePegGlazed1ConditionProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
				}
			}
		});
		this.addLayer(new RenderLayer<PuzzlePegEntity, Modelpuzzle_peg<PuzzlePegEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("superiorstructures:textures/entities/puzzle_peg_glaze_2.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PuzzlePegEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (PuzzlePegGlazed2ConditionProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
				}
			}
		});
		this.addLayer(new RenderLayer<PuzzlePegEntity, Modelpuzzle_peg<PuzzlePegEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("superiorstructures:textures/entities/puzzle_peg_glaze_3.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PuzzlePegEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (PuzzlePegGlazed3ConditionProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
				}
			}
		});
		this.addLayer(new RenderLayer<PuzzlePegEntity, Modelpuzzle_peg<PuzzlePegEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("superiorstructures:textures/entities/puzzle_peg_glaze_4.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PuzzlePegEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (PuzzlePegGlazed4ConditionProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
				}
			}
		});
		this.addLayer(new RenderLayer<PuzzlePegEntity, Modelpuzzle_peg<PuzzlePegEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("superiorstructures:textures/entities/puzzle_peg_glaze_5.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PuzzlePegEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (PuzzlePegGlazed5ConditionProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
				}
			}
		});
		this.addLayer(new RenderLayer<PuzzlePegEntity, Modelpuzzle_peg<PuzzlePegEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("superiorstructures:textures/entities/puzzle_peg_glaze_6.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PuzzlePegEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (PuzzlePegGlazed6ConditionProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
				}
			}
		});
		this.addLayer(new RenderLayer<PuzzlePegEntity, Modelpuzzle_peg<PuzzlePegEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("superiorstructures:textures/entities/puzzle_peg_glaze_7.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PuzzlePegEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (PuzzlePegGlazed7ConditionProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
				}
			}
		});
		this.addLayer(new RenderLayer<PuzzlePegEntity, Modelpuzzle_peg<PuzzlePegEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("superiorstructures:textures/entities/puzzle_peg_glaze_8.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PuzzlePegEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (PuzzlePegGlazed8ConditionProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
				}
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(PuzzlePegEntity entity) {
		return ResourceLocation.parse("superiorstructures:textures/entities/puzzle_peg_glaze_5.png");
	}
}
