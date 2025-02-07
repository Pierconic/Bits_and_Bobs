package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModGameRules;
import net.mcreator.superiorstructures.entity.MineshaftCenterEntity;
import net.mcreator.superiorstructures.SuperiorstructuresMod;

public class GenblockM3NodeProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double EndChance = 0;
		if (!world.getEntitiesOfClass(MineshaftCenterEntity.class, AABB.ofSize(new Vec3(x, y, z), 160, 160, 160), e -> true).isEmpty()) {
			if (!world.getEntitiesOfClass(MineshaftCenterEntity.class, AABB.ofSize(new Vec3(x, y, z), 32, 32, 32), e -> true).isEmpty()) {
				EndChance = 0.1;
			} else if (!world.getEntitiesOfClass(MineshaftCenterEntity.class, AABB.ofSize(new Vec3(x, y, z), 64, 64, 64), e -> true).isEmpty()) {
				EndChance = 0.25;
			} else if (!world.getEntitiesOfClass(MineshaftCenterEntity.class, AABB.ofSize(new Vec3(x, y, z), 96, 96, 96), e -> true).isEmpty()) {
				EndChance = 0.45;
			} else if (!world.getEntitiesOfClass(MineshaftCenterEntity.class, AABB.ofSize(new Vec3(x, y, z), 128, 128, 128), e -> true).isEmpty()) {
				EndChance = 0.65;
			} else if (!world.getEntitiesOfClass(MineshaftCenterEntity.class, AABB.ofSize(new Vec3(x, y, z), 148, 148, 148), e -> true).isEmpty()) {
				EndChance = 0.85;
			} else {
				EndChance = 1;
			}
		} else {
			EndChance = 1;
		}
		if (world.getLevelData().getGameRules().getBoolean(SuperiorstructuresModGameRules.TICK_GENBLOCKS)) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.PURPLE_CONCRETE.defaultBlockState(), 3);
			if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.PINK_GLAZED_TERRACOTTA) {
				world.setBlock(BlockPos.containing(x - 1, y, z), (world.getBlockState(BlockPos.containing(x - 2, y, z))), 3);
				world.setBlock(BlockPos.containing(x, y, z), (world.getBlockState(BlockPos.containing(x - 2, y, z))), 3);
				if (MineshaftNodeCheckProcedure.execute(world, x, y, z)) {
					if (Math.random() < EndChance) {
						MineshaftEndSelectProcedure.execute(world, x + 1, y, z - 1);
					} else {
						SuperiorstructuresMod.queueServerWork(1, () -> {
							MineshaftNodeSelectProcedure.execute(world, x + 1, y, z - 4);
						});
					}
				} else {
					MineshaftEndSelectProcedure.execute(world, x + 1, y, z - 1);
				}
			} else if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.PINK_GLAZED_TERRACOTTA) {
				world.setBlock(BlockPos.containing(x + 1, y, z), (world.getBlockState(BlockPos.containing(x + 2, y, z))), 3);
				world.setBlock(BlockPos.containing(x, y, z), (world.getBlockState(BlockPos.containing(x + 2, y, z))), 3);
				if (MineshaftNodeBackCheckProcedure.execute(world, x, y, z)) {
					if (Math.random() < EndChance) {
						MineshaftEndBackProcedure.execute(world, x - 1, y, z + 1);
					} else {
						SuperiorstructuresMod.queueServerWork(1, () -> {
							MineshaftNodeBackProcedure.execute(world, x - 1, y, z + 4);
						});
					}
				} else {
					MineshaftEndBackProcedure.execute(world, x - 1, y, z + 1);
				}
			} else if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.PINK_GLAZED_TERRACOTTA) {
				world.setBlock(BlockPos.containing(x, y, z - 1), (world.getBlockState(BlockPos.containing(x, y, z - 2))), 3);
				world.setBlock(BlockPos.containing(x, y, z), (world.getBlockState(BlockPos.containing(x, y, z - 2))), 3);
				if (GenblockNodeRightCheckProcedure.execute(world, x, y, z)) {
					if (Math.random() < EndChance) {
						MineshaftEndRightProcedure.execute(world, x + 1, y, z + 1);
					} else {
						SuperiorstructuresMod.queueServerWork(1, () -> {
							MineshaftNodeRightProcedure.execute(world, x + 4, y, z + 1);
						});
					}
				} else {
					MineshaftEndRightProcedure.execute(world, x + 1, y, z + 1);
				}
			} else if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.PINK_GLAZED_TERRACOTTA) {
				world.setBlock(BlockPos.containing(x, y, z + 1), (world.getBlockState(BlockPos.containing(x, y, z + 2))), 3);
				world.setBlock(BlockPos.containing(x, y, z), (world.getBlockState(BlockPos.containing(x, y, z + 2))), 3);
				if (MineshaftNodeLeftCheckProcedure.execute(world, x, y, z)) {
					if (Math.random() < EndChance) {
						MineshaftEndLeftProcedure.execute(world, x - 1, y, z - 1);
					} else {
						SuperiorstructuresMod.queueServerWork(1, () -> {
							MineshaftNodeLeftProcedure.execute(world, x - 4, y, z - 1);
						});
					}
				} else {
					MineshaftEndLeftProcedure.execute(world, x - 1, y, z - 1);
				}
			}
		}
	}
}
