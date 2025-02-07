
package net.mcreator.superiorstructures.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.superiorstructures.entity.DetectedBlockEntity;
import net.mcreator.superiorstructures.client.model.Modeldetected_block;

public class DetectedBlockRenderer extends MobRenderer<DetectedBlockEntity, Modeldetected_block<DetectedBlockEntity>> {
	public DetectedBlockRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeldetected_block(context.bakeLayer(Modeldetected_block.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(DetectedBlockEntity entity) {
		return ResourceLocation.parse("superiorstructures:textures/entities/texture.png");
	}
}
