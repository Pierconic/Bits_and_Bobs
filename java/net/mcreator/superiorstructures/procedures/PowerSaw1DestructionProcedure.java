package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.tags.BlockTags;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.SuperiorstructuresMod;

public class PowerSaw1DestructionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, ItemStack itemstack) {
		if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("charge") > 0) {
			{
				final String _tagName = "charge";
				final double _tagValue = (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("charge") - 1);
				CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:sawbladewhir")), SoundSource.NEUTRAL, (float) 0.4, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:sawbladewhir")), SoundSource.NEUTRAL, (float) 0.4, 1, false);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("minecraft:mineable/axe")))) {
				SuperiorstructuresMod.queueServerWork(5, () -> {
					if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).is(BlockTags.create(ResourceLocation.parse("minecraft:mineable/axe")))) {
						{
							BlockPos _pos = BlockPos.containing(x, y + 1, z);
							Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y + 1, z), null);
							world.destroyBlock(_pos, false);
						}
					}
					if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).is(BlockTags.create(ResourceLocation.parse("minecraft:mineable/axe")))) {
						{
							BlockPos _pos = BlockPos.containing(x, y - 1, z);
							Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y - 1, z), null);
							world.destroyBlock(_pos, false);
						}
					}
					if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).is(BlockTags.create(ResourceLocation.parse("minecraft:mineable/axe")))) {
						{
							BlockPos _pos = BlockPos.containing(x + 1, y, z);
							Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x + 1, y, z), null);
							world.destroyBlock(_pos, false);
						}
					}
					if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).is(BlockTags.create(ResourceLocation.parse("minecraft:mineable/axe")))) {
						{
							BlockPos _pos = BlockPos.containing(x - 1, y, z);
							Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x - 1, y, z), null);
							world.destroyBlock(_pos, false);
						}
					}
					if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).is(BlockTags.create(ResourceLocation.parse("minecraft:mineable/axe")))) {
						{
							BlockPos _pos = BlockPos.containing(x, y, z + 1);
							Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z + 1), null);
							world.destroyBlock(_pos, false);
						}
					}
					if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).is(BlockTags.create(ResourceLocation.parse("minecraft:mineable/axe")))) {
						{
							BlockPos _pos = BlockPos.containing(x, y, z - 1);
							Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z - 1), null);
							world.destroyBlock(_pos, false);
						}
					}
				});
				SuperiorstructuresMod.queueServerWork(10, () -> {
					if ((world.getBlockState(BlockPos.containing(x, y + 2, z))).is(BlockTags.create(ResourceLocation.parse("minecraft:mineable/axe")))) {
						{
							BlockPos _pos = BlockPos.containing(x, y + 2, z);
							Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y + 2, z), null);
							world.destroyBlock(_pos, false);
						}
					}
					if ((world.getBlockState(BlockPos.containing(x, y - 2, z))).is(BlockTags.create(ResourceLocation.parse("minecraft:mineable/axe")))) {
						{
							BlockPos _pos = BlockPos.containing(x, y - 2, z);
							Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y - 2, z), null);
							world.destroyBlock(_pos, false);
						}
					}
					if ((world.getBlockState(BlockPos.containing(x + 2, y, z))).is(BlockTags.create(ResourceLocation.parse("minecraft:mineable/axe")))) {
						{
							BlockPos _pos = BlockPos.containing(x + 2, y, z);
							Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x + 2, y, z), null);
							world.destroyBlock(_pos, false);
						}
					}
					if ((world.getBlockState(BlockPos.containing(x - 2, y, z))).is(BlockTags.create(ResourceLocation.parse("minecraft:mineable/axe")))) {
						{
							BlockPos _pos = BlockPos.containing(x - 2, y, z);
							Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x - 2, y, z), null);
							world.destroyBlock(_pos, false);
						}
					}
					if ((world.getBlockState(BlockPos.containing(x, y, z + 2))).is(BlockTags.create(ResourceLocation.parse("minecraft:mineable/axe")))) {
						{
							BlockPos _pos = BlockPos.containing(x, y, z + 2);
							Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z + 2), null);
							world.destroyBlock(_pos, false);
						}
					}
					if ((world.getBlockState(BlockPos.containing(x, y, z - 2))).is(BlockTags.create(ResourceLocation.parse("minecraft:mineable/axe")))) {
						{
							BlockPos _pos = BlockPos.containing(x, y, z - 2);
							Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z - 2), null);
							world.destroyBlock(_pos, false);
						}
					}
				});
			}
		}
	}
}
