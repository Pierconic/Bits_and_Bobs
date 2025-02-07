
package net.mcreator.superiorstructures.client.renderer;

import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.superiorstructures.procedures.CatalystShakingProcedure;
import net.mcreator.superiorstructures.entity.WarpCatalystProjectileEntity;
import net.mcreator.superiorstructures.client.model.Modelcatalyst_model;

public class WarpCatalystProjectileRenderer extends MobRenderer<WarpCatalystProjectileEntity, Modelcatalyst_model<WarpCatalystProjectileEntity>> {
	public WarpCatalystProjectileRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcatalyst_model(context.bakeLayer(Modelcatalyst_model.LAYER_LOCATION)), 0.3f);
	}

	@Override
	public ResourceLocation getTextureLocation(WarpCatalystProjectileEntity entity) {
		return ResourceLocation.parse("superiorstructures:textures/entities/warp_catalyst.png");
	}

	@Override
	protected boolean isShaking(WarpCatalystProjectileEntity entity) {
		Level world = entity.level();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		return CatalystShakingProcedure.execute(entity);
	}
}
