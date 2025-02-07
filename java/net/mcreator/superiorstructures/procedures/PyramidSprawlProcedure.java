package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModGameRules;
import net.mcreator.superiorstructures.SuperiorstructuresMod;

public class PyramidSprawlProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.getLevelData().getGameRules().getBoolean(SuperiorstructuresModGameRules.TICK_GENBLOCKS)) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			if (!((new Object() {
				public Direction getDirection(BlockState _bs) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_prop instanceof DirectionProperty _dp)
						return _bs.getValue(_dp);
					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
				}
			}.getDirection((world.getBlockState(BlockPos.containing(x, y + 1, z))))) == Direction.EAST)) {
				world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.AIR.defaultBlockState(), 3);
			} else {
				world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.AIR.defaultBlockState(), 3);
				PyramidHomeSelectProcedure.execute(world, x + 57, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 57), (int) (z - 12)), z - 12);
				PyramidHomeSelectProcedure.execute(world, x + 57, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 57), (int) (z + 26)), z + 26);
				PyramidHomeSelectProcedure.execute(world, x + 26, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 26), (int) (z + 57)), z + 57);
				PyramidHomeSelectProcedure.execute(world, x - 12, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 12), (int) (z + 57)), z + 57);
				PyramidHomeSelectProcedure.execute(world, x - 43, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 43), (int) (z + 26)), z + 26);
				PyramidHomeSelectProcedure.execute(world, x - 43, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 43), (int) (z - 10)), z - 10);
				PyramidHomeSelectProcedure.execute(world, x - 12, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 12), (int) (z - 43)), z - 43);
				PyramidHomeSelectProcedure.execute(world, x + 26, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 26), (int) (z - 43)), z - 43);
				SuperiorstructuresMod.queueServerWork(3, () -> {
					PyramidSmallSelectProcedure.execute(world, x + 82, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 82), (int) (z - 8)), z - 8);
					PyramidSmallSelectProcedure.execute(world, x + 82, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 82), (int) (z + 26)), z + 26);
					PyramidSmallSelectProcedure.execute(world, x + 26, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 26), (int) (z + 82)), z + 82);
					PyramidSmallSelectProcedure.execute(world, x - 8, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 8), (int) (z + 82)), z + 82);
					PyramidSmallSelectProcedure.execute(world, x - 64, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 64), (int) (z + 26)), z + 26);
					PyramidSmallSelectProcedure.execute(world, x - 64, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 64), (int) (z - 8)), z - 8);
					PyramidSmallSelectProcedure.execute(world, x - 8, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 8), (int) (z - 64)), z - 64);
					PyramidSmallSelectProcedure.execute(world, x + 26, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 26), (int) (z - 64)), z - 64);
				});
			}
		}
	}
}
