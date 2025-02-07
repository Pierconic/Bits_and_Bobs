
package net.mcreator.superiorstructures.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.superiorstructures.entity.SparkInstigatorEntity;
import net.mcreator.superiorstructures.client.model.Modelorb_model;

public class SparkInstigatorRenderer extends MobRenderer<SparkInstigatorEntity, Modelorb_model<SparkInstigatorEntity>> {
	public SparkInstigatorRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelorb_model(context.bakeLayer(Modelorb_model.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(SparkInstigatorEntity entity) {
		return ResourceLocation.parse("superiorstructures:textures/entities/boltorbentity.png");
	}
}
