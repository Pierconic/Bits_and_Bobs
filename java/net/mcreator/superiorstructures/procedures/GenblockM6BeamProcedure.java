package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModGameRules;
import net.mcreator.superiorstructures.init.SuperiorstructuresModBlocks;

public class GenblockM6BeamProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		String type = "";
		boolean stop = false;
		boolean north = false;
		boolean south = false;
		boolean east = false;
		boolean west = false;
		double steps = 0;
		double checksteps = 0;
		if (world.getLevelData().getGameRules().getBoolean(SuperiorstructuresModGameRules.TICK_GENBLOCKS)) {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SuperiorstructuresModBlocks.GENBLOCK_M_6_A.get()) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.STONE_BRICKS.defaultBlockState(), 3);
				type = "copper";
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SuperiorstructuresModBlocks.GENBLOCK_M_6_C.get()) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.CUT_RED_SANDSTONE.defaultBlockState(), 3);
				type = "gold";
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SuperiorstructuresModBlocks.GENBLOCK_M_6_B.get()) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.STONE_BRICKS.defaultBlockState(), 3);
				type = "iron";
			}
			east = false;
			north = false;
			south = false;
			west = false;
			checksteps = 1;
			if (world.isEmptyBlock(BlockPos.containing(x + 1, y, z))) {
				for (int index0 = 0; index0 < 14; index0++) {
					if (world.getBlockState(BlockPos.containing(x + checksteps, y, z)).canOcclude()) {
						east = true;
					} else if (!world.getBlockState(BlockPos.containing(x + checksteps, y, z)).canOcclude()) {
						checksteps = checksteps + 1;
					}
				}
			}
			checksteps = 1;
			if (world.isEmptyBlock(BlockPos.containing(x - 1, y, z))) {
				for (int index1 = 0; index1 < 14; index1++) {
					if (world.getBlockState(BlockPos.containing(x - checksteps, y, z)).canOcclude()) {
						west = true;
					} else if (!world.getBlockState(BlockPos.containing(x - checksteps, y, z)).canOcclude()) {
						checksteps = checksteps + 1;
					}
				}
			}
			checksteps = 1;
			if (world.isEmptyBlock(BlockPos.containing(x, y, z + 1))) {
				for (int index2 = 0; index2 < 14; index2++) {
					if (world.getBlockState(BlockPos.containing(x, y, z - checksteps)).canOcclude()) {
						north = true;
					} else if (!world.getBlockState(BlockPos.containing(x, y, z - checksteps)).canOcclude()) {
						checksteps = checksteps + 1;
					}
				}
			}
			checksteps = 1;
			if (world.isEmptyBlock(BlockPos.containing(x, y, z - 1))) {
				for (int index3 = 0; index3 < 14; index3++) {
					if (world.getBlockState(BlockPos.containing(x, y, z + checksteps)).canOcclude()) {
						south = true;
					} else if (!world.getBlockState(BlockPos.containing(x, y, z + checksteps)).canOcclude()) {
						checksteps = checksteps + 1;
					}
				}
			}
			steps = 1;
			stop = false;
			if (east) {
				while (stop == false && steps < 14) {
					if (world.getBlockState(BlockPos.containing(x + steps, y, z)).canOcclude() && !(world.getBlockState(BlockPos.containing(x + steps, y, z))).is(BlockTags.create(ResourceLocation.parse("forge:zappable")))) {
						stop = true;
						if ((type).equals("copper")) {
							if (world.isEmptyBlock(BlockPos.containing(x + steps - 1, y + 1, z)) && world.isEmptyBlock(BlockPos.containing(x + steps - 1, y - 1, z))) {
								world.setBlock(BlockPos.containing(x + steps - 1, y + 1, z), (new Object() {
									public BlockState with(BlockState _bs, String _property, String _newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
										return _prop instanceof EnumProperty _ep && _ep.getValue(_newValue).isPresent() ? _bs.setValue(_ep, (Enum) _ep.getValue(_newValue).get()) : _bs;
									}
								}.with(Blocks.OAK_SLAB.defaultBlockState(), "type", "bottom")), 3);
								world.setBlock(BlockPos.containing(x + steps - 1, y - 1, z), (new Object() {
									public BlockState with(BlockState _bs, String _property, String _newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
										return _prop instanceof EnumProperty _ep && _ep.getValue(_newValue).isPresent() ? _bs.setValue(_ep, (Enum) _ep.getValue(_newValue).get()) : _bs;
									}
								}.with(Blocks.OAK_SLAB.defaultBlockState(), "type", "top")), 3);
							}
						} else if ((type).equals("iron")) {
							if (world.isEmptyBlock(BlockPos.containing(x + steps - 1, y + 1, z)) && world.isEmptyBlock(BlockPos.containing(x + steps - 1, y - 1, z))) {
								world.setBlock(BlockPos.containing(x + steps - 1, y + 1, z), (new Object() {
									public BlockState with(BlockState _bs, String _property, String _newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
										return _prop instanceof EnumProperty _ep && _ep.getValue(_newValue).isPresent() ? _bs.setValue(_ep, (Enum) _ep.getValue(_newValue).get()) : _bs;
									}
								}.with(Blocks.SPRUCE_SLAB.defaultBlockState(), "type", "bottom")), 3);
								world.setBlock(BlockPos.containing(x + steps - 1, y - 1, z), (new Object() {
									public BlockState with(BlockState _bs, String _property, String _newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
										return _prop instanceof EnumProperty _ep && _ep.getValue(_newValue).isPresent() ? _bs.setValue(_ep, (Enum) _ep.getValue(_newValue).get()) : _bs;
									}
								}.with(Blocks.SPRUCE_SLAB.defaultBlockState(), "type", "top")), 3);
							}
						} else {
							if (world.isEmptyBlock(BlockPos.containing(x + steps - 1, y + 1, z)) && world.isEmptyBlock(BlockPos.containing(x + steps - 1, y - 1, z))) {
								world.setBlock(BlockPos.containing(x + steps - 1, y + 1, z), (new Object() {
									public BlockState with(BlockState _bs, String _property, String _newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
										return _prop instanceof EnumProperty _ep && _ep.getValue(_newValue).isPresent() ? _bs.setValue(_ep, (Enum) _ep.getValue(_newValue).get()) : _bs;
									}
								}.with(Blocks.DARK_OAK_SLAB.defaultBlockState(), "type", "bottom")), 3);
								world.setBlock(BlockPos.containing(x + steps - 1, y - 1, z), (new Object() {
									public BlockState with(BlockState _bs, String _property, String _newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
										return _prop instanceof EnumProperty _ep && _ep.getValue(_newValue).isPresent() ? _bs.setValue(_ep, (Enum) _ep.getValue(_newValue).get()) : _bs;
									}
								}.with(Blocks.DARK_OAK_SLAB.defaultBlockState(), "type", "top")), 3);
							}
						}
					} else {
						if ((type).equals("copper")) {
							world.setBlock(BlockPos.containing(x + steps, y, z), Blocks.OAK_PLANKS.defaultBlockState(), 3);
							if (steps == 1 && world.isEmptyBlock(BlockPos.containing(x + steps, y + 1, z)) && world.isEmptyBlock(BlockPos.containing(x + steps, y - 1, z))) {
								world.setBlock(BlockPos.containing(x + steps, y + 1, z), (new Object() {
									public BlockState with(BlockState _bs, String _property, String _newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
										return _prop instanceof EnumProperty _ep && _ep.getValue(_newValue).isPresent() ? _bs.setValue(_ep, (Enum) _ep.getValue(_newValue).get()) : _bs;
									}
								}.with(Blocks.OAK_SLAB.defaultBlockState(), "type", "bottom")), 3);
								world.setBlock(BlockPos.containing(x + steps, y - 1, z), (new Object() {
									public BlockState with(BlockState _bs, String _property, String _newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
										return _prop instanceof EnumProperty _ep && _ep.getValue(_newValue).isPresent() ? _bs.setValue(_ep, (Enum) _ep.getValue(_newValue).get()) : _bs;
									}
								}.with(Blocks.OAK_SLAB.defaultBlockState(), "type", "top")), 3);
							}
						} else if ((type).equals("iron")) {
							world.setBlock(BlockPos.containing(x + steps, y, z), Blocks.SPRUCE_PLANKS.defaultBlockState(), 3);
							if (steps == 1 && world.isEmptyBlock(BlockPos.containing(x + steps, y + 1, z)) && world.isEmptyBlock(BlockPos.containing(x + steps, y - 1, z))) {
								world.setBlock(BlockPos.containing(x + steps, y + 1, z), (new Object() {
									public BlockState with(BlockState _bs, String _property, String _newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
										return _prop instanceof EnumProperty _ep && _ep.getValue(_newValue).isPresent() ? _bs.setValue(_ep, (Enum) _ep.getValue(_newValue).get()) : _bs;
									}
								}.with(Blocks.SPRUCE_SLAB.defaultBlockState(), "type", "bottom")), 3);
								world.setBlock(BlockPos.containing(x + steps, y - 1, z), (new Object() {
									public BlockState with(BlockState _bs, String _property, String _newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
										return _prop instanceof EnumProperty _ep && _ep.getValue(_newValue).isPresent() ? _bs.setValue(_ep, (Enum) _ep.getValue(_newValue).get()) : _bs;
									}
								}.with(Blocks.SPRUCE_SLAB.defaultBlockState(), "type", "top")), 3);
							}
						} else {
							world.setBlock(BlockPos.containing(x + steps, y, z), Blocks.DARK_OAK_PLANKS.defaultBlockState(), 3);
							if (steps == 1 && world.isEmptyBlock(BlockPos.containing(x + steps, y + 1, z)) && world.isEmptyBlock(BlockPos.containing(x + steps, y - 1, z))) {
								world.setBlock(BlockPos.containing(x + steps, y + 1, z), (new Object() {
									public BlockState with(BlockState _bs, String _property, String _newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
										return _prop instanceof EnumProperty _ep && _ep.getValue(_newValue).isPresent() ? _bs.setValue(_ep, (Enum) _ep.getValue(_newValue).get()) : _bs;
									}
								}.with(Blocks.DARK_OAK_SLAB.defaultBlockState(), "type", "bottom")), 3);
								world.setBlock(BlockPos.containing(x + steps, y - 1, z), (new Object() {
									public BlockState with(BlockState _bs, String _property, String _newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
										return _prop instanceof EnumProperty _ep && _ep.getValue(_newValue).isPresent() ? _bs.setValue(_ep, (Enum) _ep.getValue(_newValue).get()) : _bs;
									}
								}.with(Blocks.DARK_OAK_SLAB.defaultBlockState(), "type", "top")), 3);
							}
						}
						steps = steps + 1;
					}
				}
			}
			steps = 1;
			stop = false;
			if (west) {
				while (stop == false && steps < 14) {
					if (world.getBlockState(BlockPos.containing(x - steps, y, z)).canOcclude() && !(world.getBlockState(BlockPos.containing(x - steps, y, z))).is(BlockTags.create(ResourceLocation.parse("forge:zappable")))) {
						stop = true;
						if ((type).equals("copper")) {
							if (world.isEmptyBlock(BlockPos.containing(x - (steps - 1), y + 1, z)) && world.isEmptyBlock(BlockPos.containing(x - (steps - 1), y - 1, z))) {
								world.setBlock(BlockPos.containing(x - (steps - 1), y + 1, z), (new Object() {
									public BlockState with(BlockState _bs, String _property, String _newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
										return _prop instanceof EnumProperty _ep && _ep.getValue(_newValue).isPresent() ? _bs.setValue(_ep, (Enum) _ep.getValue(_newValue).get()) : _bs;
									}
								}.with(Blocks.OAK_SLAB.defaultBlockState(), "type", "bottom")), 3);
								world.setBlock(BlockPos.containing(x - (steps - 1), y - 1, z), (new Object() {
									public BlockState with(BlockState _bs, String _property, String _newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
										return _prop instanceof EnumProperty _ep && _ep.getValue(_newValue).isPresent() ? _bs.setValue(_ep, (Enum) _ep.getValue(_newValue).get()) : _bs;
									}
								}.with(Blocks.OAK_SLAB.defaultBlockState(), "type", "top")), 3);
							}
						} else if ((type).equals("iron")) {
							if (world.isEmptyBlock(BlockPos.containing(x - (steps - 1), y + 1, z)) && world.isEmptyBlock(BlockPos.containing(x - (steps - 1), y - 1, z))) {
								world.setBlock(BlockPos.containing(x - (steps - 1), y + 1, z), (new Object() {
									public BlockState with(BlockState _bs, String _property, String _newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
										return _prop instanceof EnumProperty _ep && _ep.getValue(_newValue).isPresent() ? _bs.setValue(_ep, (Enum) _ep.getValue(_newValue).get()) : _bs;
									}
								}.with(Blocks.SPRUCE_SLAB.defaultBlockState(), "type", "bottom")), 3);
								world.setBlock(BlockPos.containing(x - (steps - 1), y - 1, z), (new Object() {
									public BlockState with(BlockState _bs, String _property, String _newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
										return _prop instanceof EnumProperty _ep && _ep.getValue(_newValue).isPresent() ? _bs.setValue(_ep, (Enum) _ep.getValue(_newValue).get()) : _bs;
									}
								}.with(Blocks.SPRUCE_SLAB.defaultBlockState(), "type", "top")), 3);
							}
						} else {
							if (world.isEmptyBlock(BlockPos.containing(x - (steps - 1), y + 1, z)) && world.isEmptyBlock(BlockPos.containing(x - (steps - 1), y - 1, z))) {
								world.setBlock(BlockPos.containing(x - (steps - 1), y + 1, z), (new Object() {
									public BlockState with(BlockState _bs, String _property, String _newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
										return _prop instanceof EnumProperty _ep && _ep.getValue(_newValue).isPresent() ? _bs.setValue(_ep, (Enum) _ep.getValue(_newValue).get()) : _bs;
									}
								}.with(Blocks.DARK_OAK_SLAB.defaultBlockState(), "type", "bottom")), 3);
								world.setBlock(BlockPos.containing(x - (steps - 1), y - 1, z), (new Object() {
									public BlockState with(BlockState _bs, String _property, String _newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
										return _prop instanceof EnumProperty _ep && _ep.getValue(_newValue).isPresent() ? _bs.setValue(_ep, (Enum) _ep.getValue(_newValue).get()) : _bs;
									}
								}.with(Blocks.DARK_OAK_SLAB.defaultBlockState(), "type", "top")), 3);
							}
						}
					} else {
						if ((type).equals("copper")) {
							world.setBlock(BlockPos.containing(x - steps, y, z), Blocks.OAK_PLANKS.defaultBlockState(), 3);
							if (steps == 1 && world.isEmptyBlock(BlockPos.containing(x - steps, y + 1, z)) && world.isEmptyBlock(BlockPos.containing(x - steps, y - 1, z))) {
								world.setBlock(BlockPos.containing(x - steps, y + 1, z), (new Object() {
									public BlockState with(BlockState _bs, String _property, String _newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
										return _prop instanceof EnumProperty _ep && _ep.getValue(_newValue).isPresent() ? _bs.setValue(_ep, (Enum) _ep.getValue(_newValue).get()) : _bs;
									}
								}.with(Blocks.OAK_SLAB.defaultBlockState(), "type", "bottom")), 3);
								world.setBlock(BlockPos.containing(x - steps, y - 1, z), (new Object() {
									public BlockState with(BlockState _bs, String _property, String _newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
										return _prop instanceof EnumProperty _ep && _ep.getValue(_newValue).isPresent() ? _bs.setValue(_ep, (Enum) _ep.getValue(_newValue).get()) : _bs;
									}
								}.with(Blocks.OAK_SLAB.defaultBlockState(), "type", "top")), 3);
							}
						} else if ((type).equals("iron")) {
							world.setBlock(BlockPos.containing(x - steps, y, z), Blocks.SPRUCE_PLANKS.defaultBlockState(), 3);
							if (steps == 1 && world.isEmptyBlock(BlockPos.containing(x - steps, y + 1, z)) && world.isEmptyBlock(BlockPos.containing(x - steps, y - 1, z))) {
								world.setBlock(BlockPos.containing(x - steps, y + 1, z), (new Object() {
									public BlockState with(BlockState _bs, String _property, String _newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
										return _prop instanceof EnumProperty _ep && _ep.getValue(_newValue).isPresent() ? _bs.setValue(_ep, (Enum) _ep.getValue(_newValue).get()) : _bs;
									}
								}.with(Blocks.SPRUCE_SLAB.defaultBlockState(), "type", "bottom")), 3);
								world.setBlock(BlockPos.containing(x - steps, y - 1, z), (new Object() {
									public BlockState with(BlockState _bs, String _property, String _newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
										return _prop instanceof EnumProperty _ep && _ep.getValue(_newValue).isPresent() ? _bs.setValue(_ep, (Enum) _ep.getValue(_newValue).get()) : _bs;
									}
								}.with(Blocks.SPRUCE_SLAB.defaultBlockState(), "type", "top")), 3);
							}
						} else {
							world.setBlock(BlockPos.containing(x - steps, y, z), Blocks.DARK_OAK_PLANKS.defaultBlockState(), 3);
							if (steps == 1 && world.isEmptyBlock(BlockPos.containing(x - steps, y + 1, z)) && world.isEmptyBlock(BlockPos.containing(x - steps, y - 1, z))) {
								world.setBlock(BlockPos.containing(x - steps, y + 1, z), (new Object() {
									public BlockState with(BlockState _bs, String _property, String _newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
										return _prop instanceof EnumProperty _ep && _ep.getValue(_newValue).isPresent() ? _bs.setValue(_ep, (Enum) _ep.getValue(_newValue).get()) : _bs;
									}
								}.with(Blocks.DARK_OAK_SLAB.defaultBlockState(), "type", "bottom")), 3);
								world.setBlock(BlockPos.containing(x - steps, y - 1, z), (new Object() {
									public BlockState with(BlockState _bs, String _property, String _newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
										return _prop instanceof EnumProperty _ep && _ep.getValue(_newValue).isPresent() ? _bs.setValue(_ep, (Enum) _ep.getValue(_newValue).get()) : _bs;
									}
								}.with(Blocks.DARK_OAK_SLAB.defaultBlockState(), "type", "top")), 3);
							}
						}
						steps = steps + 1;
					}
				}
			}
			steps = 1;
			stop = false;
			if (north) {
				while (stop == false && steps < 14) {
					if (world.getBlockState(BlockPos.containing(x, y, z - steps)).canOcclude() && !(world.getBlockState(BlockPos.containing(x, y, z - steps))).is(BlockTags.create(ResourceLocation.parse("forge:zappable")))) {
						stop = true;
						if ((type).equals("copper")) {
							if (world.isEmptyBlock(BlockPos.containing(x, y + 1, z - (steps - 1))) && world.isEmptyBlock(BlockPos.containing(x, y - 1, z - (steps - 1)))) {
								world.setBlock(BlockPos.containing(x, y + 1, z - (steps - 1)), (new Object() {
									public BlockState with(BlockState _bs, String _property, String _newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
										return _prop instanceof EnumProperty _ep && _ep.getValue(_newValue).isPresent() ? _bs.setValue(_ep, (Enum) _ep.getValue(_newValue).get()) : _bs;
									}
								}.with(Blocks.OAK_SLAB.defaultBlockState(), "type", "bottom")), 3);
								world.setBlock(BlockPos.containing(x, y - 1, z - (steps - 1)), (new Object() {
									public BlockState with(BlockState _bs, String _property, String _newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
										return _prop instanceof EnumProperty _ep && _ep.getValue(_newValue).isPresent() ? _bs.setValue(_ep, (Enum) _ep.getValue(_newValue).get()) : _bs;
									}
								}.with(Blocks.OAK_SLAB.defaultBlockState(), "type", "top")), 3);
							}
						} else if ((type).equals("iron")) {
							if (world.isEmptyBlock(BlockPos.containing(x, y + 1, z - (steps - 1))) && world.isEmptyBlock(BlockPos.containing(x, y - 1, z - (steps - 1)))) {
								world.setBlock(BlockPos.containing(x, y + 1, z - (steps - 1)), (new Object() {
									public BlockState with(BlockState _bs, String _property, String _newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
										return _prop instanceof EnumProperty _ep && _ep.getValue(_newValue).isPresent() ? _bs.setValue(_ep, (Enum) _ep.getValue(_newValue).get()) : _bs;
									}
								}.with(Blocks.SPRUCE_SLAB.defaultBlockState(), "type", "bottom")), 3);
								world.setBlock(BlockPos.containing(x, y - 1, z - (steps - 1)), (new Object() {
									public BlockState with(BlockState _bs, String _property, String _newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
										return _prop instanceof EnumProperty _ep && _ep.getValue(_newValue).isPresent() ? _bs.setValue(_ep, (Enum) _ep.getValue(_newValue).get()) : _bs;
									}
								}.with(Blocks.SPRUCE_SLAB.defaultBlockState(), "type", "top")), 3);
							}
						} else {
							if (world.isEmptyBlock(BlockPos.containing(x, y + 1, z - (steps - 1))) && world.isEmptyBlock(BlockPos.containing(x, y - 1, z - (steps - 1)))) {
								world.setBlock(BlockPos.containing(x, y + 1, z - (steps - 1)), (new Object() {
									public BlockState with(BlockState _bs, String _property, String _newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
										return _prop instanceof EnumProperty _ep && _ep.getValue(_newValue).isPresent() ? _bs.setValue(_ep, (Enum) _ep.getValue(_newValue).get()) : _bs;
									}
								}.with(Blocks.DARK_OAK_SLAB.defaultBlockState(), "type", "bottom")), 3);
								world.setBlock(BlockPos.containing(x, y - 1, z - (steps - 1)), (new Object() {
									public BlockState with(BlockState _bs, String _property, String _newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
										return _prop instanceof EnumProperty _ep && _ep.getValue(_newValue).isPresent() ? _bs.setValue(_ep, (Enum) _ep.getValue(_newValue).get()) : _bs;
									}
								}.with(Blocks.DARK_OAK_SLAB.defaultBlockState(), "type", "top")), 3);
							}
						}
					} else {
						if ((type).equals("copper")) {
							world.setBlock(BlockPos.containing(x, y, z - steps), Blocks.OAK_PLANKS.defaultBlockState(), 3);
							if (steps == 1 && world.isEmptyBlock(BlockPos.containing(x, y + 1, z - steps)) && world.isEmptyBlock(BlockPos.containing(x, y - 1, z - steps))) {
								world.setBlock(BlockPos.containing(x, y + 1, z - steps), (new Object() {
									public BlockState with(BlockState _bs, String _property, String _newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
										return _prop instanceof EnumProperty _ep && _ep.getValue(_newValue).isPresent() ? _bs.setValue(_ep, (Enum) _ep.getValue(_newValue).get()) : _bs;
									}
								}.with(Blocks.OAK_SLAB.defaultBlockState(), "type", "bottom")), 3);
								world.setBlock(BlockPos.containing(x, y - 1, z - steps), (new Object() {
									public BlockState with(BlockState _bs, String _property, String _newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
										return _prop instanceof EnumProperty _ep && _ep.getValue(_newValue).isPresent() ? _bs.setValue(_ep, (Enum) _ep.getValue(_newValue).get()) : _bs;
									}
								}.with(Blocks.OAK_SLAB.defaultBlockState(), "type", "top")), 3);
							}
						} else if ((type).equals("iron")) {
							world.setBlock(BlockPos.containing(x, y, z - steps), Blocks.SPRUCE_PLANKS.defaultBlockState(), 3);
							if (steps == 1 && world.isEmptyBlock(BlockPos.containing(x, y + 1, z - steps)) && world.isEmptyBlock(BlockPos.containing(x, y - 1, z - steps))) {
								world.setBlock(BlockPos.containing(x, y + 1, z - steps), (new Object() {
									public BlockState with(BlockState _bs, String _property, String _newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
										return _prop instanceof EnumProperty _ep && _ep.getValue(_newValue).isPresent() ? _bs.setValue(_ep, (Enum) _ep.getValue(_newValue).get()) : _bs;
									}
								}.with(Blocks.SPRUCE_SLAB.defaultBlockState(), "type", "bottom")), 3);
								world.setBlock(BlockPos.containing(x, y - 1, z - steps), (new Object() {
									public BlockState with(BlockState _bs, String _property, String _newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
										return _prop instanceof EnumProperty _ep && _ep.getValue(_newValue).isPresent() ? _bs.setValue(_ep, (Enum) _ep.getValue(_newValue).get()) : _bs;
									}
								}.with(Blocks.SPRUCE_SLAB.defaultBlockState(), "type", "top")), 3);
							}
						} else {
							world.setBlock(BlockPos.containing(x, y, z - steps), Blocks.DARK_OAK_PLANKS.defaultBlockState(), 3);
							if (steps == 1 && world.isEmptyBlock(BlockPos.containing(x, y + 1, z - steps)) && world.isEmptyBlock(BlockPos.containing(x, y - 1, z - steps))) {
								world.setBlock(BlockPos.containing(x, y + 1, z - steps), (new Object() {
									public BlockState with(BlockState _bs, String _property, String _newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
										return _prop instanceof EnumProperty _ep && _ep.getValue(_newValue).isPresent() ? _bs.setValue(_ep, (Enum) _ep.getValue(_newValue).get()) : _bs;
									}
								}.with(Blocks.DARK_OAK_SLAB.defaultBlockState(), "type", "bottom")), 3);
								world.setBlock(BlockPos.containing(x, y - 1, z - steps), (new Object() {
									public BlockState with(BlockState _bs, String _property, String _newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
										return _prop instanceof EnumProperty _ep && _ep.getValue(_newValue).isPresent() ? _bs.setValue(_ep, (Enum) _ep.getValue(_newValue).get()) : _bs;
									}
								}.with(Blocks.DARK_OAK_SLAB.defaultBlockState(), "type", "top")), 3);
							}
						}
						steps = steps + 1;
					}
				}
			}
			steps = 1;
			stop = false;
			if (south) {
				while (stop == false && steps < 14) {
					if (world.getBlockState(BlockPos.containing(x, y, z + steps)).canOcclude() && !(world.getBlockState(BlockPos.containing(x, y, z + steps))).is(BlockTags.create(ResourceLocation.parse("forge:zappable")))) {
						stop = true;
						if ((type).equals("copper")) {
							if (world.isEmptyBlock(BlockPos.containing(x, y + 1, z + steps - 1)) && world.isEmptyBlock(BlockPos.containing(x, y - 1, z + steps - 1))) {
								world.setBlock(BlockPos.containing(x, y + 1, z + steps - 1), (new Object() {
									public BlockState with(BlockState _bs, String _property, String _newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
										return _prop instanceof EnumProperty _ep && _ep.getValue(_newValue).isPresent() ? _bs.setValue(_ep, (Enum) _ep.getValue(_newValue).get()) : _bs;
									}
								}.with(Blocks.OAK_SLAB.defaultBlockState(), "type", "bottom")), 3);
								world.setBlock(BlockPos.containing(x, y - 1, z + steps - 1), (new Object() {
									public BlockState with(BlockState _bs, String _property, String _newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
										return _prop instanceof EnumProperty _ep && _ep.getValue(_newValue).isPresent() ? _bs.setValue(_ep, (Enum) _ep.getValue(_newValue).get()) : _bs;
									}
								}.with(Blocks.OAK_SLAB.defaultBlockState(), "type", "top")), 3);
							}
						} else if ((type).equals("iron")) {
							if (world.isEmptyBlock(BlockPos.containing(x, y + 1, z + steps - 1)) && world.isEmptyBlock(BlockPos.containing(x, y - 1, z + steps - 1))) {
								world.setBlock(BlockPos.containing(x, y + 1, z + steps - 1), (new Object() {
									public BlockState with(BlockState _bs, String _property, String _newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
										return _prop instanceof EnumProperty _ep && _ep.getValue(_newValue).isPresent() ? _bs.setValue(_ep, (Enum) _ep.getValue(_newValue).get()) : _bs;
									}
								}.with(Blocks.SPRUCE_SLAB.defaultBlockState(), "type", "bottom")), 3);
								world.setBlock(BlockPos.containing(x, y - 1, z + steps - 1), (new Object() {
									public BlockState with(BlockState _bs, String _property, String _newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
										return _prop instanceof EnumProperty _ep && _ep.getValue(_newValue).isPresent() ? _bs.setValue(_ep, (Enum) _ep.getValue(_newValue).get()) : _bs;
									}
								}.with(Blocks.SPRUCE_SLAB.defaultBlockState(), "type", "top")), 3);
							}
						} else {
							if (world.isEmptyBlock(BlockPos.containing(x, y + 1, z + steps - 1)) && world.isEmptyBlock(BlockPos.containing(x, y - 1, z + steps - 1))) {
								world.setBlock(BlockPos.containing(x, y + 1, z + steps - 1), (new Object() {
									public BlockState with(BlockState _bs, String _property, String _newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
										return _prop instanceof EnumProperty _ep && _ep.getValue(_newValue).isPresent() ? _bs.setValue(_ep, (Enum) _ep.getValue(_newValue).get()) : _bs;
									}
								}.with(Blocks.DARK_OAK_SLAB.defaultBlockState(), "type", "bottom")), 3);
								world.setBlock(BlockPos.containing(x, y - 1, z + steps - 1), (new Object() {
									public BlockState with(BlockState _bs, String _property, String _newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
										return _prop instanceof EnumProperty _ep && _ep.getValue(_newValue).isPresent() ? _bs.setValue(_ep, (Enum) _ep.getValue(_newValue).get()) : _bs;
									}
								}.with(Blocks.DARK_OAK_SLAB.defaultBlockState(), "type", "top")), 3);
							}
						}
					} else {
						if ((type).equals("copper")) {
							world.setBlock(BlockPos.containing(x, y, z + steps), Blocks.OAK_PLANKS.defaultBlockState(), 3);
							if (steps == 1 && world.isEmptyBlock(BlockPos.containing(x, y + 1, z + steps)) && world.isEmptyBlock(BlockPos.containing(x, y - 1, z + steps))) {
								world.setBlock(BlockPos.containing(x, y + 1, z + steps), (new Object() {
									public BlockState with(BlockState _bs, String _property, String _newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
										return _prop instanceof EnumProperty _ep && _ep.getValue(_newValue).isPresent() ? _bs.setValue(_ep, (Enum) _ep.getValue(_newValue).get()) : _bs;
									}
								}.with(Blocks.OAK_SLAB.defaultBlockState(), "type", "bottom")), 3);
								world.setBlock(BlockPos.containing(x, y - 1, z + steps), (new Object() {
									public BlockState with(BlockState _bs, String _property, String _newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
										return _prop instanceof EnumProperty _ep && _ep.getValue(_newValue).isPresent() ? _bs.setValue(_ep, (Enum) _ep.getValue(_newValue).get()) : _bs;
									}
								}.with(Blocks.OAK_SLAB.defaultBlockState(), "type", "top")), 3);
							}
						} else if ((type).equals("iron")) {
							world.setBlock(BlockPos.containing(x, y, z + steps), Blocks.SPRUCE_PLANKS.defaultBlockState(), 3);
							if (steps == 1 && world.isEmptyBlock(BlockPos.containing(x, y + 1, z + steps)) && world.isEmptyBlock(BlockPos.containing(x, y - 1, z + steps))) {
								world.setBlock(BlockPos.containing(x, y + 1, z + steps), (new Object() {
									public BlockState with(BlockState _bs, String _property, String _newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
										return _prop instanceof EnumProperty _ep && _ep.getValue(_newValue).isPresent() ? _bs.setValue(_ep, (Enum) _ep.getValue(_newValue).get()) : _bs;
									}
								}.with(Blocks.SPRUCE_SLAB.defaultBlockState(), "type", "bottom")), 3);
								world.setBlock(BlockPos.containing(x, y - 1, z + steps), (new Object() {
									public BlockState with(BlockState _bs, String _property, String _newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
										return _prop instanceof EnumProperty _ep && _ep.getValue(_newValue).isPresent() ? _bs.setValue(_ep, (Enum) _ep.getValue(_newValue).get()) : _bs;
									}
								}.with(Blocks.SPRUCE_SLAB.defaultBlockState(), "type", "top")), 3);
							}
						} else {
							world.setBlock(BlockPos.containing(x, y, z + steps), Blocks.DARK_OAK_PLANKS.defaultBlockState(), 3);
							if (steps == 1 && world.isEmptyBlock(BlockPos.containing(x, y + 1, z + steps)) && world.isEmptyBlock(BlockPos.containing(x, y - 1, z + steps))) {
								world.setBlock(BlockPos.containing(x, y + 1, z + steps), (new Object() {
									public BlockState with(BlockState _bs, String _property, String _newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
										return _prop instanceof EnumProperty _ep && _ep.getValue(_newValue).isPresent() ? _bs.setValue(_ep, (Enum) _ep.getValue(_newValue).get()) : _bs;
									}
								}.with(Blocks.DARK_OAK_SLAB.defaultBlockState(), "type", "bottom")), 3);
								world.setBlock(BlockPos.containing(x, y - 1, z + steps), (new Object() {
									public BlockState with(BlockState _bs, String _property, String _newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
										return _prop instanceof EnumProperty _ep && _ep.getValue(_newValue).isPresent() ? _bs.setValue(_ep, (Enum) _ep.getValue(_newValue).get()) : _bs;
									}
								}.with(Blocks.DARK_OAK_SLAB.defaultBlockState(), "type", "top")), 3);
							}
						}
						steps = steps + 1;
					}
				}
			}
		}
	}
}
