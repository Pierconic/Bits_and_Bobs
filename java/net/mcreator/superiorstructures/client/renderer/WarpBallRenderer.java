
package net.mcreator.superiorstructures.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.superiorstructures.entity.WarpBallEntity;
import net.mcreator.superiorstructures.client.model.Modelphase_ball;

public class WarpBallRenderer extends MobRenderer<WarpBallEntity, Modelphase_ball<WarpBallEntity>> {
	public WarpBallRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelphase_ball(context.bakeLayer(Modelphase_ball.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(WarpBallEntity entity) {
		return ResourceLocation.parse("superiorstructures:textures/entities/warp_ball2.png");
	}
}
