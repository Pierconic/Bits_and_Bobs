
package net.mcreator.superiorstructures.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.superiorstructures.entity.ThrownChakramEntity;
import net.mcreator.superiorstructures.client.model.Modelchakram_entity;

public class ThrownChakramRenderer extends MobRenderer<ThrownChakramEntity, Modelchakram_entity<ThrownChakramEntity>> {
	public ThrownChakramRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelchakram_entity(context.bakeLayer(Modelchakram_entity.LAYER_LOCATION)), 0.3f);
	}

	@Override
	public ResourceLocation getTextureLocation(ThrownChakramEntity entity) {
		return ResourceLocation.parse("superiorstructures:textures/entities/chakram_entity.png");
	}
}
