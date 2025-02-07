
package net.mcreator.superiorstructures.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.superiorstructures.entity.PhaseOrbEntity;
import net.mcreator.superiorstructures.client.model.Modelorb_model;

public class PhaseOrbRenderer extends MobRenderer<PhaseOrbEntity, Modelorb_model<PhaseOrbEntity>> {
	public PhaseOrbRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelorb_model(context.bakeLayer(Modelorb_model.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(PhaseOrbEntity entity) {
		return ResourceLocation.parse("superiorstructures:textures/entities/phase_ball.png");
	}
}
