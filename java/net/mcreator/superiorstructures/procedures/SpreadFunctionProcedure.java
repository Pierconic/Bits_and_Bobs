package net.mcreator.superiorstructures.procedures;

import org.checkerframework.checker.units.qual.s;

import net.neoforged.fml.ModList;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class SpreadFunctionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		BlockState damage_block = Blocks.AIR.defaultBlockState();
		String function_body = "";
		String type = "";
		double mx = 0;
		double my = 0;
		double mz = 0;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double intensity = 0;
		double damage_chance = 0;
		double archeology_chance = 0;
		double carry_chance = 0;
		double solids = 0;
		double alternative = 0;
		double dx = 0;
		double dz = 0;
		boolean aerate = false;
		boolean filler = false;
		boolean vines = false;
		boolean lichen = false;
		boolean snowy = false;
		boolean chisels = false;
		boolean bonemeal = false;
		boolean inverted = false;
		boolean update = false;
		function_body = new Object() {
			public String getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getString(tag);
				return "";
			}
		}.getValue(world, BlockPos.containing(x, y, z), "StoredFunction");
		mx = 8;
		my = 8;
		mz = 8;
		intensity = 0.1;
		carry_chance = 0.3;
		chisels = false;
		if (function_body.contains("$type[") && function_body.contains("]type$")) {
			type = function_body.substring((int) function_body.indexOf("$type[") + "$type[".length(), (int) function_body.indexOf("]type$"));
		}
		if (function_body.contains("$c[") && function_body.contains("]c$")) {
			carry_chance = new Object() {
				double convert(String s) {
					try {
						return Double.parseDouble(s.trim());
					} catch (Exception e) {
					}
					return 0;
				}
			}.convert(function_body.substring((int) function_body.indexOf("$c[") + "$c[".length(), (int) function_body.indexOf("]c$")));
		}
		if (function_body.contains("$x[") && function_body.contains("]x$")) {
			mx = new Object() {
				double convert(String s) {
					try {
						return Double.parseDouble(s.trim());
					} catch (Exception e) {
					}
					return 0;
				}
			}.convert(function_body.substring((int) function_body.indexOf("$x[") + "$x[".length(), (int) function_body.indexOf("]x$")));
		}
		if (function_body.contains("$y[") && function_body.contains("]y$")) {
			my = new Object() {
				double convert(String s) {
					try {
						return Double.parseDouble(s.trim());
					} catch (Exception e) {
					}
					return 0;
				}
			}.convert(function_body.substring((int) function_body.indexOf("$y[") + "$y[".length(), (int) function_body.indexOf("]y$")));
		}
		if (function_body.contains("$z[") && function_body.contains("]z$")) {
			mz = new Object() {
				double convert(String s) {
					try {
						return Double.parseDouble(s.trim());
					} catch (Exception e) {
					}
					return 0;
				}
			}.convert(function_body.substring((int) function_body.indexOf("$z[") + "$z[".length(), (int) function_body.indexOf("]z$")));
		}
		if (function_body.contains("$i[") && function_body.contains("]i$")) {
			intensity = new Object() {
				double convert(String s) {
					try {
						return Double.parseDouble(s.trim());
					} catch (Exception e) {
					}
					return 0;
				}
			}.convert(function_body.substring((int) function_body.indexOf("$i[") + "$i[".length(), (int) function_body.indexOf("]i$")));
		}
		if (function_body.contains("$a[") && function_body.contains("]a$")) {
			archeology_chance = new Object() {
				double convert(String s) {
					try {
						return Double.parseDouble(s.trim());
					} catch (Exception e) {
					}
					return 0;
				}
			}.convert(function_body.substring((int) function_body.indexOf("$a[") + "$a[".length(), (int) function_body.indexOf("]a$")));
		}
		if (function_body.contains("$d[") && function_body.contains("]d$")) {
			damage_chance = new Object() {
				double convert(String s) {
					try {
						return Double.parseDouble(s.trim());
					} catch (Exception e) {
					}
					return 0;
				}
			}.convert(function_body.substring((int) function_body.indexOf("$d[") + "$d[".length(), (int) function_body.indexOf("]d$")));
		}
		if (function_body.contains("$w[") && function_body.contains("]w$")) {
			alternative = new Object() {
				double convert(String s) {
					try {
						return Double.parseDouble(s.trim());
					} catch (Exception e) {
					}
					return 0;
				}
			}.convert(function_body.substring((int) function_body.indexOf("$w[") + "$w[".length(), (int) function_body.indexOf("]w$")));
		}
		if (function_body.contains("$db[") && function_body.contains("]db$")) {
			damage_block = BuiltInRegistries.BLOCK.get(ResourceLocation.parse(((function_body.substring((int) function_body.indexOf("$db[") + "$db[".length(), (int) function_body.indexOf("]db$")))).toLowerCase(java.util.Locale.ENGLISH)))
					.defaultBlockState();
		}
		if (function_body.contains("$air$")) {
			aerate = true;
		} else {
			aerate = false;
		}
		if (function_body.contains("$snowy$")) {
			snowy = true;
		} else {
			snowy = false;
		}
		if (function_body.contains("$filler$")) {
			filler = true;
		} else {
			filler = false;
		}
		if (function_body.contains("$vines$")) {
			vines = true;
		} else {
			vines = false;
		}
		if (function_body.contains("$lichen$")) {
			lichen = true;
		} else {
			lichen = false;
		}
		if (function_body.contains("$bonemeal$")) {
			bonemeal = true;
		} else {
			bonemeal = false;
		}
		if (function_body.contains("$inset$")) {
			chisels = true;
		} else {
			chisels = false;
		}
		if (function_body.contains("$update$")) {
			update = true;
		} else {
			update = false;
		}
		if (ModList.get().isLoaded("charming_chisels")) {
			chisels = true;
		}
		if ((new Object() {
			public Direction getDirection(BlockState _bs) {
				Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (_prop instanceof DirectionProperty _dp)
					return _bs.getValue(_dp);
				_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
				return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
			}
		}.getDirection((world.getBlockState(BlockPos.containing(x, y, z))))) == Direction.NORTH || (new Object() {
			public Direction getDirection(BlockState _bs) {
				Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (_prop instanceof DirectionProperty _dp)
					return _bs.getValue(_dp);
				_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
				return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
			}
		}.getDirection((world.getBlockState(BlockPos.containing(x, y, z))))) == Direction.SOUTH) {
			dx = mz;
			dz = mx;
		} else {
			dx = mx;
			dz = mz;
		}
		if ((type).equals("monument")) {
			if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("deep_lukewarm_ocean")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("lukewarm_ocean"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("ocean")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("deep_ocean"))) {
				type = "mossy";
			}
		}
		sx = dx * (-1);
		for (int index0 = 0; index0 < (int) (dx * 2 + 1); index0++) {
			sy = my * (-1);
			for (int index1 = 0; index1 < (int) (my * 2 + 1); index1++) {
				sz = dz * (-1);
				for (int index2 = 0; index2 < (int) (dz * 2 + 1); index2++) {
					solids = 0;
					if (!world.isEmptyBlock(BlockPos.containing(x + sx, y + sy, z + sz))) {
						SpreadTargetProcedure.execute(world, x + sx, y + sy, z + sz, aerate, bonemeal, chisels, filler, inverted, lichen, snowy, vines, alternative, archeology_chance, carry_chance, damage_chance, intensity, type);
					}
					sz = sz + 1;
				}
				sy = sy + 1;
			}
			sx = sx + 1;
		}
	}
}
