package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModBlocks;

public class FanSFXProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		ItemStack nameditem = ItemStack.EMPTY;
		boolean blocked = false;
		boolean found = false;
		String name = "";
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double power = 0;
		double n = 0;
		double damage = 0;
		double slotnumber = 0;
		if (blockstate.getBlock().getStateDefinition().getProperty("waterlogged") instanceof BooleanProperty _getbp1 && blockstate.getValue(_getbp1)) {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SuperiorstructuresModBlocks.ACTIVATED_FAN.get()) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:propeller.woosh.1")), SoundSource.BLOCKS, (float) 0.15, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:propeller.woosh.1")), SoundSource.BLOCKS, (float) 0.15, 1, false);
					}
				}
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SuperiorstructuresModBlocks.DEACTIVATED_FAN_2.get()) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:propeller.woosh.2")), SoundSource.BLOCKS, (float) 0.3, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:propeller.woosh.2")), SoundSource.BLOCKS, (float) 0.3, 1, false);
					}
				}
			} else {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:propeller.woosh.3")), SoundSource.BLOCKS, (float) 0.5, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:propeller.woosh.3")), SoundSource.BLOCKS, (float) 0.5, 1, false);
					}
				}
			}
		} else {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SuperiorstructuresModBlocks.ACTIVATED_FAN.get()) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:fan.blow.1")), SoundSource.BLOCKS, (float) 0.15, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:fan.blow.1")), SoundSource.BLOCKS, (float) 0.15, 1, false);
					}
				}
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SuperiorstructuresModBlocks.DEACTIVATED_FAN_2.get()) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:fan.blow.2")), SoundSource.BLOCKS, (float) 0.3, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:fan.blow.2")), SoundSource.BLOCKS, (float) 0.3, 1, false);
					}
				}
			} else {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:fan.blow.3")), SoundSource.BLOCKS, (float) 0.5, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:fan.blow.3")), SoundSource.BLOCKS, (float) 0.5, 1, false);
					}
				}
			}
		}
	}
}
