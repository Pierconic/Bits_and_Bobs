
package net.mcreator.superiorstructures.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.superiorstructures.entity.WarpshotBallEntity;
import net.mcreator.superiorstructures.client.model.Modelhookshot_ball;

public class WarpshotBallRenderer extends MobRenderer<WarpshotBallEntity, Modelhookshot_ball<WarpshotBallEntity>> {
	public WarpshotBallRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelhookshot_ball(context.bakeLayer(Modelhookshot_ball.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(WarpshotBallEntity entity) {
		return ResourceLocation.parse("superiorstructures:textures/entities/warpshot_ball.png");
	}
}
