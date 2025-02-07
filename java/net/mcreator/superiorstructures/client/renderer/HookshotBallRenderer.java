
package net.mcreator.superiorstructures.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.superiorstructures.entity.HookshotBallEntity;
import net.mcreator.superiorstructures.client.model.Modelhookshot_ball;

public class HookshotBallRenderer extends MobRenderer<HookshotBallEntity, Modelhookshot_ball<HookshotBallEntity>> {
	public HookshotBallRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelhookshot_ball(context.bakeLayer(Modelhookshot_ball.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(HookshotBallEntity entity) {
		return ResourceLocation.parse("superiorstructures:textures/entities/hookshot_texture.png");
	}
}
