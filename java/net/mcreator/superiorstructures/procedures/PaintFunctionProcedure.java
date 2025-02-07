package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class PaintFunctionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		String function_body = "";
		String command_line = "";
		String variant = "";
		String size = "";
		boolean specified = false;
		double facing = 0;
		double randomizer = 0;
		function_body = new Object() {
			public String getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getString(tag);
				return "";
			}
		}.getValue(world, BlockPos.containing(x, y, z), "StoredFunction");
		size = "small";
		specified = false;
		if (function_body.contains("$variant[") && function_body.contains("]variant$")) {
			variant = function_body.substring((int) function_body.indexOf("$variant[") + "$variant[".length(), (int) function_body.indexOf("]variant$"));
			specified = true;
		}
		if (function_body.contains("$s[") && function_body.contains("]s$")) {
			size = function_body.substring((int) function_body.indexOf("$s[") + "$s[".length(), (int) function_body.indexOf("]s$"));
		}
		if ((new Object() {
			public Direction getDirection(BlockState _bs) {
				Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (_prop instanceof DirectionProperty _dp)
					return _bs.getValue(_dp);
				_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
				return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
			}
		}.getDirection((world.getBlockState(BlockPos.containing(x, y, z))))) == Direction.NORTH) {
			facing = 2;
		} else if ((new Object() {
			public Direction getDirection(BlockState _bs) {
				Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (_prop instanceof DirectionProperty _dp)
					return _bs.getValue(_dp);
				_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
				return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
			}
		}.getDirection((world.getBlockState(BlockPos.containing(x, y, z))))) == Direction.SOUTH) {
			facing = 4;
		} else if ((new Object() {
			public Direction getDirection(BlockState _bs) {
				Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (_prop instanceof DirectionProperty _dp)
					return _bs.getValue(_dp);
				_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
				return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
			}
		}.getDirection((world.getBlockState(BlockPos.containing(x, y, z))))) == Direction.EAST) {
			facing = 3;
		} else if ((new Object() {
			public Direction getDirection(BlockState _bs) {
				Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (_prop instanceof DirectionProperty _dp)
					return _bs.getValue(_dp);
				_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
				return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
			}
		}.getDirection((world.getBlockState(BlockPos.containing(x, y, z))))) == Direction.WEST) {
			facing = 5;
		}
		if (!specified) {
			if ((size).equals("small")) {
				randomizer = Mth.nextInt(RandomSource.create(), 1, 7);
				if (randomizer == 1) {
					variant = "kebab";
				} else if (randomizer == 2) {
					variant = "aztec";
				} else if (randomizer == 3) {
					variant = "alban";
				} else if (randomizer == 4) {
					variant = "aztec2";
				} else if (randomizer == 5) {
					variant = "bomb";
				} else if (randomizer == 6) {
					variant = "plant";
				} else if (randomizer == 7) {
					variant = "wasteland";
				}
			} else if ((size).equals("portrait")) {
				randomizer = Mth.nextInt(RandomSource.create(), 1, 2);
				if (randomizer == 1) {
					variant = "wanderer";
				} else if (randomizer == 2) {
					variant = "graham";
				}
			} else if ((size).equals("landscape")) {
				randomizer = Mth.nextInt(RandomSource.create(), 1, 5);
				if (randomizer == 1) {
					variant = "pool";
				} else if (randomizer == 2) {
					variant = "courbet";
				} else if (randomizer == 3) {
					variant = "sunset";
				} else if (randomizer == 4) {
					variant = "sea";
				} else if (randomizer == 5) {
					variant = "creebet";
				}
			} else if ((size).equals("medium")) {
				randomizer = Mth.nextInt(RandomSource.create(), 1, 6);
				if (randomizer == 1) {
					variant = "match";
				} else if (randomizer == 2) {
					variant = "bust";
				} else if (randomizer == 3) {
					variant = "stage";
				} else if (randomizer == 4) {
					variant = "void";
				} else if (randomizer == 5) {
					variant = "skull_and_roses";
				} else if (randomizer == 6) {
					variant = "wither";
				}
			} else if ((size).equals("vista")) {
				variant = "fighters";
			} else if ((size).equals("large")) {
				randomizer = Mth.nextInt(RandomSource.create(), 1, 2);
				if (randomizer == 1) {
					variant = "skeleton";
				} else if (randomizer == 2) {
					variant = "donkey_kong";
				}
			} else if ((size).equals("giant")) {
				randomizer = Mth.nextInt(RandomSource.create(), 1, 3);
				if (randomizer == 1) {
					variant = "pointer";
				} else if (randomizer == 2) {
					variant = "burning_skull";
				} else if (randomizer == 3) {
					variant = "pigscene";
				}
			}
		}
		command_line = ("summon painting ~ ~ ~ {facing:$,variant:testificate}".replace("testificate", variant)).replace("$", new java.text.DecimalFormat("#").format(facing));
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), command_line);
	}
}
