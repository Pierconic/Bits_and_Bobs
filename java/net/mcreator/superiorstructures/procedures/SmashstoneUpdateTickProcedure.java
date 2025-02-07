package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModBlocks;

import java.util.Comparator;

public class SmashstoneUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean clear = false;
		double offset = 0;
		if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip1 ? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip1) : -1) == 0) {
			if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 16, 16, 16), e -> true).isEmpty()) {
				if (0.75 > Math.abs(((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 16, 16, 16), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)).getX() - (x + 0.5)) && 0.75 > Math.abs(((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 16, 16, 16), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)).getZ() - (z + 0.5))) {
					clear = false;
					offset = -1;
					for (int index0 = 0; index0 < 7; index0++) {
						if (world.getBlockState(BlockPos.containing(x, y + offset, z)).canOcclude() && !(world.getBlockState(BlockPos.containing(x, y + offset, z))).is(BlockTags.create(ResourceLocation.parse("forge:smashable")))
								&& !(world.getBlockState(BlockPos.containing(x, y + offset, z))).is(BlockTags.create(ResourceLocation.parse("forge:falling_blocks")))) {
							clear = false;
						} else if (y + offset == Math.floor(((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 16, 16, 16), e -> true).stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(null)).getY())) {
							clear = true;
						} else if (!world.getBlockState(BlockPos.containing(x, y + offset, z)).canOcclude() || (world.getBlockState(BlockPos.containing(x, y + offset, z))).is(BlockTags.create(ResourceLocation.parse("forge:smashable")))
								|| (world.getBlockState(BlockPos.containing(x, y + offset, z))).is(BlockTags.create(ResourceLocation.parse("forge:falling_blocks")))) {
							offset = offset - 1;
						}
					}
					if (!clear) {
						offset = 1;
						for (int index1 = 0; index1 < 7; index1++) {
							if (world.getBlockState(BlockPos.containing(x, y + offset, z)).canOcclude() && !(world.getBlockState(BlockPos.containing(x, y + offset, z))).is(BlockTags.create(ResourceLocation.parse("forge:smashable")))
									&& !(world.getBlockState(BlockPos.containing(x, y + offset, z))).is(BlockTags.create(ResourceLocation.parse("forge:falling_blocks")))) {
								clear = false;
							} else if (y + offset == Math.floor(((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 16, 16, 16), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).getY())) {
								clear = true;
							} else if (!world.getBlockState(BlockPos.containing(x, y + offset, z)).canOcclude() || (world.getBlockState(BlockPos.containing(x, y + offset, z))).is(BlockTags.create(ResourceLocation.parse("forge:smashable")))
									|| (world.getBlockState(BlockPos.containing(x, y + offset, z))).is(BlockTags.create(ResourceLocation.parse("forge:falling_blocks")))) {
								offset = offset + 1;
							}
						}
					}
					if (clear) {
						world.setBlock(BlockPos.containing(x, y, z), SuperiorstructuresModBlocks.PEEKING_SMASHSTONE.get().defaultBlockState(), 3);
					}
				}
			}
		}
	}
}
