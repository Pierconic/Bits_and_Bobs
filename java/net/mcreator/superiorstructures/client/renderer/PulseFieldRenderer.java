
package net.mcreator.superiorstructures.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.superiorstructures.entity.PulseFieldEntity;
import net.mcreator.superiorstructures.client.model.Modelorb_model;

public class PulseFieldRenderer extends MobRenderer<PulseFieldEntity, Modelorb_model<PulseFieldEntity>> {
	public PulseFieldRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelorb_model(context.bakeLayer(Modelorb_model.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(PulseFieldEntity entity) {
		return ResourceLocation.parse("superiorstructures:textures/entities/boltorbentity.png");
	}
}
