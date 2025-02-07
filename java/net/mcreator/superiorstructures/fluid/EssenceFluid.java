
package net.mcreator.superiorstructures.fluid;

import net.neoforged.neoforge.fluids.BaseFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.procedures.EssenceConversionProcedure;
import net.mcreator.superiorstructures.init.SuperiorstructuresModItems;
import net.mcreator.superiorstructures.init.SuperiorstructuresModFluids;
import net.mcreator.superiorstructures.init.SuperiorstructuresModFluidTypes;
import net.mcreator.superiorstructures.init.SuperiorstructuresModBlocks;

public abstract class EssenceFluid extends BaseFlowingFluid {
	public static final BaseFlowingFluid.Properties PROPERTIES = new BaseFlowingFluid.Properties(() -> SuperiorstructuresModFluidTypes.ESSENCE_TYPE.get(), () -> SuperiorstructuresModFluids.ESSENCE.get(),
			() -> SuperiorstructuresModFluids.FLOWING_ESSENCE.get()).explosionResistance(100f).tickRate(10).bucket(() -> SuperiorstructuresModItems.ESSENCE_BUCKET.get()).block(() -> (LiquidBlock) SuperiorstructuresModBlocks.ESSENCE.get());

	private EssenceFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.SOUL_FIRE_FLAME;
	}

	@Override
	protected void beforeDestroyingBlock(LevelAccessor world, BlockPos pos, BlockState blockstate) {
		EssenceConversionProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}

	public static class Source extends EssenceFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends EssenceFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
