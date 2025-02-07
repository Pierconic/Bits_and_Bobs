
package net.mcreator.superiorstructures.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.superiorstructures.entity.FanSourceEntity;
import net.mcreator.superiorstructures.client.model.Modelorb_model;

public class FanSourceRenderer extends MobRenderer<FanSourceEntity, Modelorb_model<FanSourceEntity>> {
	public FanSourceRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelorb_model(context.bakeLayer(Modelorb_model.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(FanSourceEntity entity) {
		return ResourceLocation.parse("superiorstructures:textures/entities/boltorbentity.png");
	}

	@Override
	protected boolean isBodyVisible(FanSourceEntity entity) {
		return false;
	}
}
