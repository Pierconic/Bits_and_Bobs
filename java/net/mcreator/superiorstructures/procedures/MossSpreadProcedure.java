package net.mcreator.superiorstructures.procedures;

import net.neoforged.neoforge.items.IItemHandlerModifiable;
import net.neoforged.neoforge.common.extensions.ILevelExtension;
import net.neoforged.neoforge.capabilities.Capabilities;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModGameRules;

public class MossSpreadProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if (world.getLevelData().getGameRules().getBoolean(SuperiorstructuresModGameRules.TICK_GENBLOCKS) == true) {
			sx = -6;
			for (int index0 = 0; index0 < 12; index0++) {
				sy = -6;
				for (int index1 = 0; index1 < 12; index1++) {
					sz = -6;
					for (int index2 = 0; index2 < 12; index2++) {
						if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.AIR && Math.random() < 0.5
								&& world.getBlockState(BlockPos.containing(x + sx, (y + sy) - 1, z + sz)).isFaceSturdy(world, BlockPos.containing(x + sx, (y + sy) - 1, z + sz), Direction.UP)) {
							world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.MOSS_CARPET.defaultBlockState(), 3);
						} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:ruinable")))) {
							RuinousTransformationProcedure.execute(world, x + sx, y + sy, z + sz);
						} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:pottery")))) {
							if (Math.random() < 0.7) {
								if (Math.random() < 0.3) {
									if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x + sx, y + sy, z + sz), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
										ItemStack _setstack = new ItemStack(Blocks.MOSS_BLOCK).copy();
										_setstack.setCount(Mth.nextInt(RandomSource.create(), 3, 10));
										_itemHandlerModifiable.setStackInSlot(0, _setstack);
									}
								} else if (Math.random() < 0.3) {
									if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x + sx, y + sy, z + sz), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
										ItemStack _setstack = new ItemStack(Items.ROTTEN_FLESH).copy();
										_setstack.setCount(Mth.nextInt(RandomSource.create(), 3, 10));
										_itemHandlerModifiable.setStackInSlot(0, _setstack);
									}
								} else if (Math.random() < 0.3) {
									if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x + sx, y + sy, z + sz), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
										ItemStack _setstack = new ItemStack(Items.IRON_NUGGET).copy();
										_setstack.setCount(Mth.nextInt(RandomSource.create(), 3, 10));
										_itemHandlerModifiable.setStackInSlot(0, _setstack);
									}
								} else if (Math.random() < 0.3) {
									if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x + sx, y + sy, z + sz), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
										ItemStack _setstack = new ItemStack(Items.GOLD_NUGGET).copy();
										_setstack.setCount(Mth.nextInt(RandomSource.create(), 3, 10));
										_itemHandlerModifiable.setStackInSlot(0, _setstack);
									}
								}
							}
						}
						sz = sz + 1;
					}
					sy = sy + 1;
				}
				sx = sx + 1;
			}
			LichenageProcedure.execute(world, x + sx, y + sy, z + sz);
			world.setBlock(BlockPos.containing(x, y, z), Blocks.CHISELED_STONE_BRICKS.defaultBlockState(), 3);
		}
	}
}
