
package net.mcreator.superiorstructures.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.superiorstructures.entity.DoubleSparkInstigatorEntity;
import net.mcreator.superiorstructures.client.model.Modelorb_model;

public class DoubleSparkInstigatorRenderer extends MobRenderer<DoubleSparkInstigatorEntity, Modelorb_model<DoubleSparkInstigatorEntity>> {
	public DoubleSparkInstigatorRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelorb_model(context.bakeLayer(Modelorb_model.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(DoubleSparkInstigatorEntity entity) {
		return ResourceLocation.parse("superiorstructures:textures/entities/boltorbentity.png");
	}
}
