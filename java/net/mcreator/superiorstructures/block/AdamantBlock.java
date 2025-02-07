
package net.mcreator.superiorstructures.block;

import org.checkerframework.checker.units.qual.s;

import net.neoforged.neoforge.common.util.DeferredSoundType;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.procedures.AdamantBlockDestroyedProcedure;

public class AdamantBlock extends Block {
	public AdamantBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM)
				.sound(new DeferredSoundType(1.0f, 1.0f, () -> BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:adamant.break")),
						() -> BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:adamant.step")), () -> BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:adamant.place")),
						() -> BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:adamant.hit")), () -> BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:adamant.hit"))))
				.strength(65f, 10f).lightLevel(s -> 6).requiresCorrectToolForDrops().speedFactor(1.2f).jumpFactor(1.2f).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public boolean onDestroyedByPlayer(BlockState blockstate, Level world, BlockPos pos, Player entity, boolean willHarvest, FluidState fluid) {
		boolean retval = super.onDestroyedByPlayer(blockstate, world, pos, entity, willHarvest, fluid);
		AdamantBlockDestroyedProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), entity);
		return retval;
	}
}
