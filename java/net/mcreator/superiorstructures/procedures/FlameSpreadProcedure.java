package net.mcreator.superiorstructures.procedures;

import net.neoforged.fml.ModList;

import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class FlameSpreadProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double sx = 0;
		double sy = 0;
		double sz = 0;
		sx = -3;
		for (int index0 = 0; index0 < 6; index0++) {
			sy = -3;
			for (int index1 = 0; index1 < 6; index1++) {
				sz = -3;
				for (int index2 = 0; index2 < 6; index2++) {
					if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.AIR
							&& world.getBlockState(BlockPos.containing(x + sx, (y + sy) - 1, z + sz)).isFaceSturdy(world, BlockPos.containing(x + sx, (y + sy) - 1, z + sz), Direction.UP) && Math.random() < 0.1) {
						if (ModList.get().isLoaded("ashenremains")) {
							world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), BuiltInRegistries.BLOCK.get(ResourceLocation.parse("ashenremains:weird_fire")).defaultBlockState(), 3);
						} else {
							world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.FIRE.defaultBlockState(), 3);
						}
					} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:frosty")))) {
						if (Math.random() < 0.7) {
							world.destroyBlock(BlockPos.containing(x + sx, y + sy, z + sz), false);
						}
					} else {
						{
							BlockPos _pos = BlockPos.containing(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("lit") instanceof BooleanProperty _booleanProp)
								world.setBlock(_pos, _bs.setValue(_booleanProp, true), 3);
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
