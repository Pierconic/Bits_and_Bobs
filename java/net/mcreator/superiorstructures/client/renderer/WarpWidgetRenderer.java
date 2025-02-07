
package net.mcreator.superiorstructures.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.superiorstructures.entity.WarpWidgetEntity;
import net.mcreator.superiorstructures.client.model.Modelchain_ball;

public class WarpWidgetRenderer extends MobRenderer<WarpWidgetEntity, Modelchain_ball<WarpWidgetEntity>> {
	public WarpWidgetRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelchain_ball(context.bakeLayer(Modelchain_ball.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(WarpWidgetEntity entity) {
		return ResourceLocation.parse("superiorstructures:textures/entities/warp_ball.png");
	}
}
