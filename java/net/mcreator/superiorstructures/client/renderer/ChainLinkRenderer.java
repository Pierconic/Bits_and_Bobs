
package net.mcreator.superiorstructures.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.superiorstructures.entity.ChainLinkEntity;
import net.mcreator.superiorstructures.client.model.Modelchain_link;

public class ChainLinkRenderer extends MobRenderer<ChainLinkEntity, Modelchain_link<ChainLinkEntity>> {
	public ChainLinkRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelchain_link(context.bakeLayer(Modelchain_link.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(ChainLinkEntity entity) {
		return ResourceLocation.parse("superiorstructures:textures/entities/chain_texture.png");
	}
}
