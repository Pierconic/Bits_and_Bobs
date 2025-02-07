
package net.mcreator.superiorstructures.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.superiorstructures.entity.ChainBallEntity;
import net.mcreator.superiorstructures.client.model.Modelchain_ball;

public class ChainBallRenderer extends MobRenderer<ChainBallEntity, Modelchain_ball<ChainBallEntity>> {
	public ChainBallRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelchain_ball(context.bakeLayer(Modelchain_ball.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(ChainBallEntity entity) {
		return ResourceLocation.parse("superiorstructures:textures/entities/ball_texture.png");
	}
}
