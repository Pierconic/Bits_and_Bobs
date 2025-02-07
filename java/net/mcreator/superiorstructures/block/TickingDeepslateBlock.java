
package net.mcreator.superiorstructures.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.DirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.MenuProvider;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.procedures.SuspiciousBlockBrokenProcedure;
import net.mcreator.superiorstructures.procedures.SuspicionTickProcedure;
import net.mcreator.superiorstructures.block.entity.TickingDeepslateBlockEntity;

public class TickingDeepslateBlock extends Block implements SimpleWaterloggedBlock, EntityBlock {
	public static final IntegerProperty BLOCKSTATE = IntegerProperty.create("blockstate", 0, 15);
	public static final DirectionProperty FACING = DirectionalBlock.FACING;
	public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

	public TickingDeepslateBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.DEEPSLATE).sound(SoundType.DEEPSLATE).strength(3.6f, 6f).lightLevel(s -> (new Object() {
			public int getLightLevel() {
				if (s.getValue(BLOCKSTATE) == 1)
					return 0;
				if (s.getValue(BLOCKSTATE) == 2)
					return 0;
				if (s.getValue(BLOCKSTATE) == 3)
					return 0;
				if (s.getValue(BLOCKSTATE) == 4)
					return 0;
				if (s.getValue(BLOCKSTATE) == 5)
					return 0;
				if (s.getValue(BLOCKSTATE) == 6)
					return 0;
				if (s.getValue(BLOCKSTATE) == 7)
					return 0;
				if (s.getValue(BLOCKSTATE) == 8)
					return 0;
				if (s.getValue(BLOCKSTATE) == 9)
					return 0;
				if (s.getValue(BLOCKSTATE) == 10)
					return 0;
				if (s.getValue(BLOCKSTATE) == 11)
					return 0;
				if (s.getValue(BLOCKSTATE) == 12)
					return 0;
				if (s.getValue(BLOCKSTATE) == 13)
					return 0;
				if (s.getValue(BLOCKSTATE) == 14)
					return 0;
				if (s.getValue(BLOCKSTATE) == 15)
					return 0;
				return 0;
			}
		}.getLightLevel())));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(WATERLOGGED, false));
	}

	@Override
	public boolean shouldDisplayFluidOverlay(BlockState state, BlockAndTintGetter world, BlockPos pos, FluidState fluidstate) {
		return true;
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return state.getFluidState().isEmpty();
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		if (state.getValue(BLOCKSTATE) == 1) {
			return switch (state.getValue(FACING)) {
				default -> box(0, 0, 0, 16, 15, 16);
				case NORTH -> box(0, 0, 0, 16, 15, 16);
				case EAST -> box(0, 0, 0, 16, 15, 16);
				case WEST -> box(0, 0, 0, 16, 15, 16);
				case UP -> box(0, 0, 0, 16, 16, 15);
				case DOWN -> box(0, 0, 1, 16, 16, 16);
			};
		}
		if (state.getValue(BLOCKSTATE) == 2) {
			return switch (state.getValue(FACING)) {
				default -> box(0, 0, 0, 16, 14, 16);
				case NORTH -> box(0, 0, 0, 16, 14, 16);
				case EAST -> box(0, 0, 0, 16, 14, 16);
				case WEST -> box(0, 0, 0, 16, 14, 16);
				case UP -> box(0, 0, 0, 16, 16, 14);
				case DOWN -> box(0, 0, 2, 16, 16, 16);
			};
		}
		if (state.getValue(BLOCKSTATE) == 3) {
			return switch (state.getValue(FACING)) {
				default -> box(0, 0, 0, 16, 13, 16);
				case NORTH -> box(0, 0, 0, 16, 13, 16);
				case EAST -> box(0, 0, 0, 16, 13, 16);
				case WEST -> box(0, 0, 0, 16, 13, 16);
				case UP -> box(0, 0, 0, 16, 16, 13);
				case DOWN -> box(0, 0, 3, 16, 16, 16);
			};
		}
		if (state.getValue(BLOCKSTATE) == 4) {
			return switch (state.getValue(FACING)) {
				default -> box(0, 0, 0, 16, 12, 16);
				case NORTH -> box(0, 0, 0, 16, 12, 16);
				case EAST -> box(0, 0, 0, 16, 12, 16);
				case WEST -> box(0, 0, 0, 16, 12, 16);
				case UP -> box(0, 0, 0, 16, 16, 12);
				case DOWN -> box(0, 0, 4, 16, 16, 16);
			};
		}
		if (state.getValue(BLOCKSTATE) == 5) {
			return switch (state.getValue(FACING)) {
				default -> box(0, 0, 0, 16, 11, 16);
				case NORTH -> box(0, 0, 0, 16, 11, 16);
				case EAST -> box(0, 0, 0, 16, 11, 16);
				case WEST -> box(0, 0, 0, 16, 11, 16);
				case UP -> box(0, 0, 0, 16, 16, 11);
				case DOWN -> box(0, 0, 5, 16, 16, 16);
			};
		}
		if (state.getValue(BLOCKSTATE) == 6) {
			return switch (state.getValue(FACING)) {
				default -> box(0, 0, 0, 16, 10, 16);
				case NORTH -> box(0, 0, 0, 16, 10, 16);
				case EAST -> box(0, 0, 0, 16, 10, 16);
				case WEST -> box(0, 0, 0, 16, 10, 16);
				case UP -> box(0, 0, 0, 16, 16, 10);
				case DOWN -> box(0, 0, 6, 16, 16, 16);
			};
		}
		if (state.getValue(BLOCKSTATE) == 7) {
			return switch (state.getValue(FACING)) {
				default -> box(0, 0, 0, 16, 9, 16);
				case NORTH -> box(0, 0, 0, 16, 9, 16);
				case EAST -> box(0, 0, 0, 16, 9, 16);
				case WEST -> box(0, 0, 0, 16, 9, 16);
				case UP -> box(0, 0, 0, 16, 16, 9);
				case DOWN -> box(0, 0, 7, 16, 16, 16);
			};
		}
		if (state.getValue(BLOCKSTATE) == 8) {
			return switch (state.getValue(FACING)) {
				default -> box(0, 0, 0, 16, 8, 16);
				case NORTH -> box(0, 0, 0, 16, 8, 16);
				case EAST -> box(0, 0, 0, 16, 8, 16);
				case WEST -> box(0, 0, 0, 16, 8, 16);
				case UP -> box(0, 0, 0, 16, 16, 8);
				case DOWN -> box(0, 0, 8, 16, 16, 16);
			};
		}
		if (state.getValue(BLOCKSTATE) == 9) {
			return switch (state.getValue(FACING)) {
				default -> box(0, 0, 0, 16, 7, 16);
				case NORTH -> box(0, 0, 0, 16, 7, 16);
				case EAST -> box(0, 0, 0, 16, 7, 16);
				case WEST -> box(0, 0, 0, 16, 7, 16);
				case UP -> box(0, 0, 0, 16, 16, 7);
				case DOWN -> box(0, 0, 9, 16, 16, 16);
			};
		}
		if (state.getValue(BLOCKSTATE) == 10) {
			return switch (state.getValue(FACING)) {
				default -> box(0, 0, 0, 16, 6, 16);
				case NORTH -> box(0, 0, 0, 16, 6, 16);
				case EAST -> box(0, 0, 0, 16, 6, 16);
				case WEST -> box(0, 0, 0, 16, 6, 16);
				case UP -> box(0, 0, 0, 16, 16, 6);
				case DOWN -> box(0, 0, 10, 16, 16, 16);
			};
		}
		if (state.getValue(BLOCKSTATE) == 11) {
			return switch (state.getValue(FACING)) {
				default -> box(0, 0, 0, 16, 5, 16);
				case NORTH -> box(0, 0, 0, 16, 5, 16);
				case EAST -> box(0, 0, 0, 16, 5, 16);
				case WEST -> box(0, 0, 0, 16, 5, 16);
				case UP -> box(0, 0, 0, 16, 16, 5);
				case DOWN -> box(0, 0, 11, 16, 16, 16);
			};
		}
		if (state.getValue(BLOCKSTATE) == 12) {
			return switch (state.getValue(FACING)) {
				default -> box(0, 0, 0, 16, 4, 16);
				case NORTH -> box(0, 0, 0, 16, 4, 16);
				case EAST -> box(0, 0, 0, 16, 4, 16);
				case WEST -> box(0, 0, 0, 16, 4, 16);
				case UP -> box(0, 0, 0, 16, 16, 4);
				case DOWN -> box(0, 0, 12, 16, 16, 16);
			};
		}
		if (state.getValue(BLOCKSTATE) == 13) {
			return switch (state.getValue(FACING)) {
				default -> box(0, 0, 0, 16, 3, 16);
				case NORTH -> box(0, 0, 0, 16, 3, 16);
				case EAST -> box(0, 0, 0, 16, 3, 16);
				case WEST -> box(0, 0, 0, 16, 3, 16);
				case UP -> box(0, 0, 0, 16, 16, 3);
				case DOWN -> box(0, 0, 13, 16, 16, 16);
			};
		}
		if (state.getValue(BLOCKSTATE) == 14) {
			return switch (state.getValue(FACING)) {
				default -> box(0, 0, 0, 16, 2, 16);
				case NORTH -> box(0, 0, 0, 16, 2, 16);
				case EAST -> box(0, 0, 0, 16, 2, 16);
				case WEST -> box(0, 0, 0, 16, 2, 16);
				case UP -> box(0, 0, 0, 16, 16, 2);
				case DOWN -> box(0, 0, 14, 16, 16, 16);
			};
		}
		if (state.getValue(BLOCKSTATE) == 15) {
			return switch (state.getValue(FACING)) {
				default -> box(0, 0, 0, 16, 1, 16);
				case NORTH -> box(0, 0, 0, 16, 1, 16);
				case EAST -> box(0, 0, 0, 16, 1, 16);
				case WEST -> box(0, 0, 0, 16, 1, 16);
				case UP -> box(0, 0, 0, 16, 16, 1);
				case DOWN -> box(0, 0, 15, 16, 16, 16);
			};
		}
		return switch (state.getValue(FACING)) {
			default -> box(0, 0, 0, 16, 16, 16);
			case NORTH -> box(0, 0, 0, 16, 16, 16);
			case EAST -> box(0, 0, 0, 16, 16, 16);
			case WEST -> box(0, 0, 0, 16, 16, 16);
			case UP -> box(0, 0, 0, 16, 16, 16);
			case DOWN -> box(0, 0, 0, 16, 16, 16);
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(FACING, WATERLOGGED, BLOCKSTATE);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		boolean flag = context.getLevel().getFluidState(context.getClickedPos()).getType() == Fluids.WATER;
		return super.getStateForPlacement(context).setValue(FACING, context.getClickedFace()).setValue(WATERLOGGED, flag);
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	@Override
	public FluidState getFluidState(BlockState state) {
		return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
	}

	@Override
	public BlockState updateShape(BlockState state, Direction facing, BlockState facingState, LevelAccessor world, BlockPos currentPos, BlockPos facingPos) {
		if (state.getValue(WATERLOGGED)) {
			world.scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickDelay(world));
		}
		return super.updateShape(state, facing, facingState, world, currentPos, facingPos);
	}

	@Override
	public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
		super.onPlace(blockstate, world, pos, oldState, moving);
		world.scheduleTick(pos, this, 1);
	}

	@Override
	public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
		super.tick(blockstate, world, pos, random);
		SuspicionTickProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), blockstate);
		world.scheduleTick(pos, this, 1);
	}

	@Override
	public boolean onDestroyedByPlayer(BlockState blockstate, Level world, BlockPos pos, Player entity, boolean willHarvest, FluidState fluid) {
		boolean retval = super.onDestroyedByPlayer(blockstate, world, pos, entity, willHarvest, fluid);
		SuspiciousBlockBrokenProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), entity);
		return retval;
	}

	@Override
	public MenuProvider getMenuProvider(BlockState state, Level worldIn, BlockPos pos) {
		BlockEntity tileEntity = worldIn.getBlockEntity(pos);
		return tileEntity instanceof MenuProvider menuProvider ? menuProvider : null;
	}

	@Override
	public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
		return new TickingDeepslateBlockEntity(pos, state);
	}

	@Override
	public boolean triggerEvent(BlockState state, Level world, BlockPos pos, int eventID, int eventParam) {
		super.triggerEvent(state, world, pos, eventID, eventParam);
		BlockEntity blockEntity = world.getBlockEntity(pos);
		return blockEntity == null ? false : blockEntity.triggerEvent(eventID, eventParam);
	}
}
