
package net.mcreator.superiorstructures.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.superiorstructures.entity.PulseField2Entity;
import net.mcreator.superiorstructures.client.model.Modelorb_model;

public class PulseField2Renderer extends MobRenderer<PulseField2Entity, Modelorb_model<PulseField2Entity>> {
	public PulseField2Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelorb_model(context.bakeLayer(Modelorb_model.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(PulseField2Entity entity) {
		return ResourceLocation.parse("superiorstructures:textures/entities/boltorbentity.png");
	}
}
