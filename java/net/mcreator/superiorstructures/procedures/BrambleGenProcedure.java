package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModBlocks;

public class BrambleGenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double sx = 0;
		double sy = 0;
		double sz = 0;
		sx = -3;
		for (int index0 = 0; index0 < 6; index0++) {
			sy = 0;
			for (int index1 = 0; index1 < 4; index1++) {
				sz = -3;
				for (int index2 = 0; index2 < 6; index2++) {
					if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.AIR) {
						if (!(world.getBlockState(BlockPos.containing(x + sx, (y + sy) - 1, z + sz))).is(BlockTags.create(ResourceLocation.parse("minecraft:leaves"))) && (world.getBlockState(BlockPos.containing(x, (y + sy) - 1, z)).canOcclude()
								|| (world.getBlockState(BlockPos.containing(x + sx, (y + sy) - 1, z + sz))).getBlock() == SuperiorstructuresModBlocks.BRAMBLE_BLOCK.get())) {
							if (Math.random() < 0.35) {
								world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), SuperiorstructuresModBlocks.BRAMBLE_BLOCK.get().defaultBlockState(), 3);
							}
						}
					}
					sz = sz + 1;
				}
				sy = sy + 1;
			}
			sx = sx + 1;
		}
		sx = -3;
		for (int index3 = 0; index3 < 6; index3++) {
			sy = 0;
			for (int index4 = 0; index4 < 5; index4++) {
				sz = -3;
				for (int index5 = 0; index5 < 6; index5++) {
					if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == SuperiorstructuresModBlocks.BRAMBLE_BLOCK.get()) {
						if (Math.random() < 0.8 && world.isEmptyBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz))) {
							world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), (new Object() {
								public BlockState with(BlockState _bs, Direction newValue) {
									Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
									if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
										return _bs.setValue(_dp, newValue);
									_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
									return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
								}
							}.with(SuperiorstructuresModBlocks.BRAMBLES.get().defaultBlockState(), Direction.UP)), 3);
						}
						if (Math.random() < 0.8 && world.isEmptyBlock(BlockPos.containing(x + sx, (y + sy) - 1, z + sz))) {
							world.setBlock(BlockPos.containing(x + sx, (y + sy) - 1, z + sz), (new Object() {
								public BlockState with(BlockState _bs, Direction newValue) {
									Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
									if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
										return _bs.setValue(_dp, newValue);
									_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
									return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
								}
							}.with(SuperiorstructuresModBlocks.BRAMBLES.get().defaultBlockState(), Direction.DOWN)), 3);
						}
						if (Math.random() < 0.3 && world.isEmptyBlock(BlockPos.containing(x + sx, y + sy, (z + sz) - 1))) {
							world.setBlock(BlockPos.containing(x + sx, y + sy, (z + sz) - 1), (new Object() {
								public BlockState with(BlockState _bs, Direction newValue) {
									Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
									if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
										return _bs.setValue(_dp, newValue);
									_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
									return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
								}
							}.with(SuperiorstructuresModBlocks.BRAMBLES.get().defaultBlockState(), Direction.NORTH)), 3);
						}
						if (Math.random() < 0.3 && world.isEmptyBlock(BlockPos.containing(x + sx, y + sy, z + sz + 1))) {
							world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz + 1), (new Object() {
								public BlockState with(BlockState _bs, Direction newValue) {
									Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
									if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
										return _bs.setValue(_dp, newValue);
									_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
									return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
								}
							}.with(SuperiorstructuresModBlocks.BRAMBLES.get().defaultBlockState(), Direction.SOUTH)), 3);
						}
						if (Math.random() < 0.3 && world.isEmptyBlock(BlockPos.containing(x + sx + 1, y + sy, z + sz))) {
							world.setBlock(BlockPos.containing(x + sx + 1, y + sy, z + sz), (new Object() {
								public BlockState with(BlockState _bs, Direction newValue) {
									Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
									if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
										return _bs.setValue(_dp, newValue);
									_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
									return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
								}
							}.with(SuperiorstructuresModBlocks.BRAMBLES.get().defaultBlockState(), Direction.EAST)), 3);
						}
						if (Math.random() < 0.3 && world.isEmptyBlock(BlockPos.containing((x + sx) - 1, y + sy, z + sz))) {
							world.setBlock(BlockPos.containing((x + sx) - 1, y + sy, z + sz), (new Object() {
								public BlockState with(BlockState _bs, Direction newValue) {
									Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
									if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
										return _bs.setValue(_dp, newValue);
									_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
									return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
								}
							}.with(SuperiorstructuresModBlocks.BRAMBLES.get().defaultBlockState(), Direction.WEST)), 3);
						}
					}
					sz = sz + 1;
				}
				sy = sy + 1;
			}
			sx = sx + 1;
		}
	}
}
