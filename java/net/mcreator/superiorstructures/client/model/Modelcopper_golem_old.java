package net.mcreator.superiorstructures.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelcopper_golem_old<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("superiorstructures", "modelcopper_golem_old"), "main");
	public final ModelPart MainBody;
	public final ModelPart Rod;
	public final ModelPart vines;

	public Modelcopper_golem_old(ModelPart root) {
		this.MainBody = root.getChild("MainBody");
		this.Rod = root.getChild("Rod");
		this.vines = root.getChild("vines");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition MainBody = partdefinition.addOrReplaceChild("MainBody",
				CubeListBuilder.create().texOffs(0, 19).addBox(-2.0F, -3.0F, -6.0F, 6.0F, 3.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-5.0F, -12.0F, -8.0F, 12.0F, 9.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 33)
						.addBox(-3.0F, -10.0F, 2.0F, 8.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(25, 24).addBox(-2.0F, -13.0F, -5.0F, 6.0F, 6.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(0.0F, -6.0F, -10.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition Rod = partdefinition.addOrReplaceChild("Rod",
				CubeListBuilder.create().texOffs(0, 19).addBox(-1.0F, -18.0F, -1.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(34, 0).addBox(-2.0F, -22.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.0F, 24.0F, -1.0F));
		PartDefinition vines = partdefinition.addOrReplaceChild("vines",
				CubeListBuilder.create().texOffs(28, 33).addBox(-4.1F, -10.0F, 3.0F, 0.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(23, 13).addBox(3.1F, -3.0F, -4.0F, 0.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(23, 13)
						.addBox(-3.3F, -3.0F, -4.0F, 0.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(28, 33).addBox(4.1F, -10.0F, 3.0F, 0.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.0F, 24.0F, -1.0F));
		PartDefinition cube_r1 = vines.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(23, 13).addBox(9.1F, -6.0F, -3.0F, 0.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		MainBody.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		Rod.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		vines.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.Rod.yRot = ageInTicks / 20.f;
	}
}
