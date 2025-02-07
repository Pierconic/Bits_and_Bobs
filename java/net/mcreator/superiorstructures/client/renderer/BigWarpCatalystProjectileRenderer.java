
package net.mcreator.superiorstructures.client.renderer;

import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.superiorstructures.procedures.CatalystShakingProcedure;
import net.mcreator.superiorstructures.entity.BigWarpCatalystProjectileEntity;
import net.mcreator.superiorstructures.client.model.Modelbig_catalyst;

public class BigWarpCatalystProjectileRenderer extends MobRenderer<BigWarpCatalystProjectileEntity, Modelbig_catalyst<BigWarpCatalystProjectileEntity>> {
	public BigWarpCatalystProjectileRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbig_catalyst(context.bakeLayer(Modelbig_catalyst.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BigWarpCatalystProjectileEntity entity) {
		return ResourceLocation.parse("superiorstructures:textures/entities/big_warp_catalyst.png");
	}

	@Override
	protected boolean isShaking(BigWarpCatalystProjectileEntity entity) {
		Level world = entity.level();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		return CatalystShakingProcedure.execute(entity);
	}
}
