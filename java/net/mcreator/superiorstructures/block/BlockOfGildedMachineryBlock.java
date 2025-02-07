
package net.mcreator.superiorstructures.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.procedures.BlockOfGildedMachineryUpdateTickProcedure;

public class BlockOfGildedMachineryBlock extends Block {
	public BlockOfGildedMachineryBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.GILDED_BLACKSTONE).strength(0.7f, 3f).requiresCorrectToolForDrops().randomTicks());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public void randomTick(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
		super.randomTick(blockstate, world, pos, random);
		BlockOfGildedMachineryUpdateTickProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}
}
