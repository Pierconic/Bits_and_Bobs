
package net.mcreator.superiorstructures.block;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.procedures.RubbleSmashingProcedure;

import com.mojang.serialization.MapCodec;

public class NetherRubbleBlock extends FallingBlock {
	public static final MapCodec<NetherRubbleBlock> CODEC = simpleCodec(properties -> new NetherRubbleBlock());

	public MapCodec<NetherRubbleBlock> codec() {
		return CODEC;
	}

	public NetherRubbleBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.STONE).sound(SoundType.NETHER_BRICKS).strength(2f, 6f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		RubbleSmashingProcedure.execute(world, entity);
	}
}
