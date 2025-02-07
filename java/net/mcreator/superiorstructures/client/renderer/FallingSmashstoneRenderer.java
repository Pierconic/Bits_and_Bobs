
package net.mcreator.superiorstructures.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.superiorstructures.entity.FallingSmashstoneEntity;
import net.mcreator.superiorstructures.client.model.Modelpush_block;

public class FallingSmashstoneRenderer extends MobRenderer<FallingSmashstoneEntity, Modelpush_block<FallingSmashstoneEntity>> {
	public FallingSmashstoneRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelpush_block(context.bakeLayer(Modelpush_block.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(FallingSmashstoneEntity entity) {
		return ResourceLocation.parse("superiorstructures:textures/entities/smashstone_entity.png");
	}
}
