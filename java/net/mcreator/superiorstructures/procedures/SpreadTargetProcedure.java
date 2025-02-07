package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.superiorstructures.init.SuperiorstructuresModBlocks;
import net.mcreator.superiorstructures.entity.FlavorNodeEntity;

public class SpreadTargetProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, boolean aerate_input, boolean bonemeal_input, boolean chisel_input, boolean filler_input, boolean inverted_input, boolean lichen_input, boolean snowy_input,
			boolean vines_input, double alternative_input, double archeology_input, double carry_input, double damage_input, double intensity_input, String type_input) {
		if (type_input == null)
			return;
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
		sx = 0;
		sy = 0;
		sz = 0;
		intensity = intensity_input;
		damage_chance = damage_input;
		archeology_chance = archeology_input;
		carry_chance = carry_input;
		alternative = alternative_input;
		aerate = aerate_input;
		filler = filler_input;
		vines = vines_input;
		lichen = lichen_input;
		snowy = snowy_input;
		chisels = chisel_input;
		bonemeal = bonemeal_input;
		inverted = inverted_input;
		update = true;
		type = type_input;
		if (world.getBlockState(BlockPos.containing(x + sx + 1, y + sy, z + sz)).canOcclude() && !((world.getBlockState(BlockPos.containing(x + sx + 1, y + sy, z + sz))).getBlock() == Blocks.ICE)
				&& !((world.getBlockState(BlockPos.containing(x + sx + 1, y + sy, z + sz))).getBlock() == Blocks.PACKED_ICE)) {
			solids = solids + 1;
		}
		if (world.getBlockState(BlockPos.containing((x + sx) - 1, y + sy, z + sz)).canOcclude() && !((world.getBlockState(BlockPos.containing((x + sx) - 1, y + sy, z + sz))).getBlock() == Blocks.ICE)
				&& !((world.getBlockState(BlockPos.containing((x + sx) - 1, y + sy, z + sz))).getBlock() == Blocks.PACKED_ICE)) {
			solids = solids + 1;
		}
		if (world.getBlockState(BlockPos.containing(x + sx, y + sy, (z + sz) - 1)).canOcclude() && !((world.getBlockState(BlockPos.containing(x + sx, y + sy, (z + sz) - 1))).getBlock() == Blocks.ICE)
				&& !((world.getBlockState(BlockPos.containing(x + sx, y + sy, (z + sz) - 1))).getBlock() == Blocks.PACKED_ICE)) {
			solids = solids + 1;
		}
		if (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz + 1)).canOcclude() && !((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz + 1))).getBlock() == Blocks.ICE)
				&& !((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz + 1))).getBlock() == Blocks.PACKED_ICE)) {
			solids = solids + 1;
		}
		if (world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz)).canOcclude() && !((world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz))).getBlock() == Blocks.ICE)
				&& !((world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz))).getBlock() == Blocks.PACKED_ICE)) {
			solids = solids + 1;
		}
		if (world.getBlockState(BlockPos.containing(x + sx, (y + sy) - 1, z + sz)).canOcclude() && !((world.getBlockState(BlockPos.containing(x + sx, (y + sy) - 1, z + sz))).getBlock() == Blocks.ICE)
				&& !((world.getBlockState(BlockPos.containing(x + sx, (y + sy) - 1, z + sz))).getBlock() == Blocks.PACKED_ICE)) {
			solids = solids + 1;
		}
		if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.VAULT) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3((x + sx), (y + sy), (z + sz)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						("/data merge block ~ ~ ~ {server_data:{state_updating_resumes_at:TESTIFICATE}}".replace("TESTIFICATE", new java.text.DecimalFormat("#############").format(world.getLevelData().getGameTime() + 20) + "L")));
		}
		if (((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == SuperiorstructuresModBlocks.RUNESTONE.get()
				|| (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == SuperiorstructuresModBlocks.JAWSTONE.get()) && y > 110) {
			CarpetUpdateProcedure.execute(world, x + sx, y + sy, z + sz);
		}
		if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == SuperiorstructuresModBlocks.FLAVORBLOCK.get()) {
			if (!(!world.getEntitiesOfClass(FlavorNodeEntity.class, AABB.ofSize(new Vec3((x + sx), (y + sy), (z + sz)), 2, 2, 2), e -> true).isEmpty())) {
				{
					BlockPos _bp = BlockPos.containing(x + sx, y + sy, z + sz);
					BlockState _bs = Blocks.AIR.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Property<?> _propertyOld : _bso.getProperties()) {
						Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
						if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
							try {
								_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			}
		}
		if (Math.random() < alternative) {
			if ((type).equals("coral")) {
				if ((world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz))).getBlock() == Blocks.WATER && solids > 0) {
					CoralPlacementProcedure.execute(world, x + sx, y + sy + 1, z + sz);
				}
			} else if ((type).equals("frozen") && Math.random() < 0.1 && solids > 0 && world.isEmptyBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz))) {
				IcePlacementProcedure.execute(world, x + sx, y + sy + 1, z + sz);
			} else if ((type).equals("mossy")) {
				if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:ruinable")))
						|| (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:ruined")))) {
					MossPlacementProcedure.execute(world, x + sx, y + sy, z + sz);
				}
			} else if ((type).equals("spider") && solids > 0 || (type).equals("mine") && solids > 1) {
				if (world.isEmptyBlock(BlockPos.containing(x + sx, y + sy, z + sz))) {
					WebPlacementProcedure.execute(world, x + sx, y + sy, z + sz);
				}
			} else if ((type).equals("bastion")) {
				if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:ruinable")))
						|| (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:ruined")))) {
					RepairPlacementProcedure.execute(world, x + sx, y + sy, z + sz);
				}
			} else {
				RuinousTransformationAlternateProcedure.execute(world, x + sx, y + sy, z + sz);
			}
		}
		if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:ruin_replaceable")))
				&& !((world.getBlockState(BlockPos.containing(x + sx + 1, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:break_preventable")))
						|| (world.getBlockState(BlockPos.containing((x + sx) - 1, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:break_preventable")))
						|| (world.getBlockState(BlockPos.containing(x + sx, (y + sy) - 1, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:break_preventable")))
						|| (world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:break_preventable")))
						|| (world.getBlockState(BlockPos.containing(x + sx, y + sy, (z + sz) - 1))).is(BlockTags.create(ResourceLocation.parse("forge:break_preventable")))
						|| (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz + 1))).is(BlockTags.create(ResourceLocation.parse("forge:break_preventable"))))
				&& Math.random() < damage_chance) {
			{
				BlockPos _bp = BlockPos.containing(x + sx, y + sy, z + sz);
				BlockState _bs = damage_block;
				BlockState _bso = world.getBlockState(_bp);
				for (Property<?> _propertyOld : _bso.getProperties()) {
					Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
					if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
						try {
							_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		}
		if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:ruinable")))) {
			if (((world.getBlockState(BlockPos.containing(x + sx + 1, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:ruin_required")))
					|| (world.getBlockState(BlockPos.containing((x + sx) - 1, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:ruin_required")))
					|| (world.getBlockState(BlockPos.containing(x + sx, (y + sy) - 1, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:ruin_required")))
					|| (world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:ruin_required")))
					|| (world.getBlockState(BlockPos.containing(x + sx, y + sy, (z + sz) - 1))).is(BlockTags.create(ResourceLocation.parse("forge:ruin_required")))
					|| (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz + 1))).is(BlockTags.create(ResourceLocation.parse("forge:ruin_required")))) && Math.random() < intensity * 5.5) {
				if ((type).equals("mossy")) {
					RuinousTransformationMossyProcedure.execute(world, x + sx, y + sy, z + sz);
					if (Math.random() < 0.8) {
						LichenPlacementProcedure.execute(world, x + sx, y + sy, z + sz);
					}
				} else {
					RuinousTransformationProcedure.execute(world, x + sx, y + sy, z + sz);
				}
			} else if (Math.random() < intensity) {
				if ((type).equals("mossy")) {
					RuinousTransformationMossyProcedure.execute(world, x + sx, y + sy, z + sz);
				} else {
					if (Math.random() < intensity * 0.08) {
						RuinousTransformationAlternateProcedure.execute(world, x + sx, y + sy, z + sz);
					} else {
						RuinousTransformationProcedure.execute(world, x + sx, y + sy, z + sz);
					}
				}
			}
			if ((type).equals("mossy")) {
				if (Math.random() < carry_chance) {
					RuinousTransformationMossyProcedure.execute(world, x + sx + 1, y + sy, z + sz);
				}
				if (Math.random() < carry_chance) {
					RuinousTransformationMossyProcedure.execute(world, (x + sx) - 1, y + sy, z + sz);
				}
				if (Math.random() < carry_chance) {
					RuinousTransformationMossyProcedure.execute(world, x + sx, y + sy, (z + sz) - 1);
				}
				if (Math.random() < carry_chance) {
					RuinousTransformationMossyProcedure.execute(world, x + sx, y + sy, z + sz + 1);
				}
				if (Math.random() < carry_chance) {
					RuinousTransformationMossyProcedure.execute(world, x + sx, y + sy + 1, z + sz);
				}
				if (Math.random() < carry_chance) {
					RuinousTransformationMossyProcedure.execute(world, x + sx, (y + sy) - 1, z + sz);
				}
			} else {
				if (Math.random() < carry_chance) {
					RuinousTransformationProcedure.execute(world, x + sx + 1, y + sy, z + sz);
				}
				if (Math.random() < carry_chance) {
					RuinousTransformationProcedure.execute(world, (x + sx) - 1, y + sy, z + sz);
				}
				if (Math.random() < carry_chance) {
					RuinousTransformationProcedure.execute(world, x + sx, y + sy, (z + sz) - 1);
				}
				if (Math.random() < carry_chance) {
					RuinousTransformationProcedure.execute(world, x + sx, y + sy, z + sz + 1);
				}
				if (Math.random() < carry_chance) {
					RuinousTransformationProcedure.execute(world, x + sx, y + sy + 1, z + sz);
				}
				if (Math.random() < carry_chance) {
					RuinousTransformationProcedure.execute(world, x + sx, (y + sy) - 1, z + sz);
				}
			}
		}
		if (y + sy > 62 || !world.getBiome(BlockPos.containing(x, y, z)).is(TagKey.create(Registries.BIOME, ResourceLocation.parse("minecraft:is_ocean")))) {
			if (aerate && ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.WATER || (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.WATER
					|| (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.BUBBLE_COLUMN)) {
				world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.AIR.defaultBlockState(), 3);
			}
		}
		if (Math.random() < archeology_chance && (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:archeological")))) {
			if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.DIRT) {
				if ((type).equals("village")) {
					world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), SuperiorstructuresModBlocks.TOWN_SUSPICIOUS_DIRT.get().defaultBlockState(), 3);
				} else if ((type).equals("lush")) {
					world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), SuperiorstructuresModBlocks.LUSH_SUSPICIOUS_DIRT.get().defaultBlockState(), 3);
				} else if ((type).equals("trail")) {
					world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), SuperiorstructuresModBlocks.ANCIENT_SUSPICIOUS_DIRT.get().defaultBlockState(), 3);
				} else {
					world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), SuperiorstructuresModBlocks.SUSPICIOUS_DIRT.get().defaultBlockState(), 3);
				}
			} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.SAND) {
				if ((type).equals("dune")) {
					world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), SuperiorstructuresModBlocks.PYRAMID_SAND.get().defaultBlockState(), 3);
				} else {
					world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), SuperiorstructuresModBlocks.SUSPICIOUS_SAND.get().defaultBlockState(), 3);
				}
			} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.STONE) {
				if ((type).equals("mine")) {
					world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), SuperiorstructuresModBlocks.MINER_STONE.get().defaultBlockState(), 3);
				} else {
					world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), SuperiorstructuresModBlocks.SUSPICIOUS_STONE.get().defaultBlockState(), 3);
				}
			} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.DEEPSLATE) {
				if ((type).equals("ancient")) {
					world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), SuperiorstructuresModBlocks.SUSPICIOUS_DEEPSLATE.get().defaultBlockState(), 3);
				}
			} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.NETHERRACK) {
				if ((type).equals("fortress")) {
					world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), SuperiorstructuresModBlocks.FORTRESS_NETHERRACK.get().defaultBlockState(), 3);
				} else {
					world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), SuperiorstructuresModBlocks.SUSPICIOUS_NETHERRACK.get().defaultBlockState(), 3);
				}
			} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.BLACKSTONE) {
				if (!(type).equals("fortress")) {
					world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), SuperiorstructuresModBlocks.SUSPICIOUS_BLACKSTONE.get().defaultBlockState(), 3);
				}
			} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.GRAVEL) {
				if (!(type).equals("monument")) {
					world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), SuperiorstructuresModBlocks.SUSPICIOUS_GRAVEL.get().defaultBlockState(), 3);
				}
			} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.END_STONE) {
				if (!(type).equals("city")) {
					world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), SuperiorstructuresModBlocks.SUSPICIOUS_CITY_ENDSTONE.get().defaultBlockState(), 3);
				} else {
					world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), SuperiorstructuresModBlocks.SUSPICIOUS_ENDSTONE.get().defaultBlockState(), 3);
				}
			}
		}
		if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:flavor_vanishable")))) {
			world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.AIR.defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:flavor_updateable")))) {
			FlavorUpdateProcedure.execute(world, x + sx, y + sy, z + sz);
		}
		if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.CHISELED_BOOKSHELF) {
			LibrariansUniteProcedure.execute(world, x + sx, y + sy, z + sz);
		} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:pottery")))) {
			PotteryFillProcedure.execute(world, x + sx, y + sy, z + sz);
		}
		if (world.isEmptyBlock(BlockPos.containing(x + sx, y + sy, z + sz)) && (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).isCollisionShapeFullBlock(world, BlockPos.containing(0, 0, 0))) {
			if (snowy && world.canSeeSkyFromBelowWater(BlockPos.containing(x + sx, y + sy + 1, z + sz))) {
				world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.SNOW.defaultBlockState(), 3);
			} else if ((type).equals("mossy") && Math.random() < intensity) {
				world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.MOSS_CARPET.defaultBlockState(), 3);
			}
		}
		if (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz)).canOcclude() && Math.random() < intensity && vines && 0 < solids) {
			VinePlacementProcedure.execute(world, x + sx, y + sy, z + sz);
		} else if (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz)).canOcclude() && Math.random() < intensity && lichen) {
			LichenPlacementProcedure.execute(world, x + sx, y + sy, z + sz);
		}
		if (chisels && (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:modded_chiselable")))) {
			CharmingChiselingProcedure.execute();
		}
		if (Math.random() < intensity * 1.65 && bonemeal) {
			if ((world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz))).getBlock() == Blocks.WATER && (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).isCollisionShapeFullBlock(world, BlockPos.containing(0, 0, 0))) {
				if (Math.random() < 0.65) {
					world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.SEAGRASS.defaultBlockState(), 3);
				} else {
					world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.KELP.defaultBlockState(), 3);
					if (Math.random() < 0.7 && (world.getBlockState(BlockPos.containing(x + sx, y + sy + 2, z + sz))).getBlock() == Blocks.WATER) {
						world.setBlock(BlockPos.containing(x + sx, y + sy + 2, z + sz), Blocks.KELP.defaultBlockState(), 3);
						if (Math.random() < 0.6 && (world.getBlockState(BlockPos.containing(x + sx, y + sy + 3, z + sz))).getBlock() == Blocks.WATER) {
							world.setBlock(BlockPos.containing(x + sx, y + sy + 3, z + sz), Blocks.KELP.defaultBlockState(), 3);
							if (Math.random() < 0.5 && (world.getBlockState(BlockPos.containing(x + sx, y + sy + 4, z + sz))).getBlock() == Blocks.WATER) {
								world.setBlock(BlockPos.containing(x + sx, y + sy + 4, z + sz), Blocks.KELP.defaultBlockState(), 3);
								if (Math.random() < 0.4 && (world.getBlockState(BlockPos.containing(x + sx, y + sy + 5, z + sz))).getBlock() == Blocks.WATER) {
									world.setBlock(BlockPos.containing(x + sx, y + sy + 5, z + sz), Blocks.KELP.defaultBlockState(), 3);
									if (Math.random() < 0.3 && (world.getBlockState(BlockPos.containing(x + sx, y + sy + 6, z + sz))).getBlock() == Blocks.WATER) {
										world.setBlock(BlockPos.containing(x + sx, y + sy + 6, z + sz), Blocks.KELP.defaultBlockState(), 3);
									}
								}
							}
						}
					}
				}
			} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.GRASS_BLOCK && !world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz)).canOcclude()) {
				if ((world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz))).is(BlockTags.create(ResourceLocation.parse("minecraft:small_flowers")))) {
					if (Math.random() < 0.7) {
						world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.SHORT_GRASS.defaultBlockState(), 3);
					} else {
						world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.AIR.defaultBlockState(), 3);
					}
				} else if (Math.random() < 0.3) {
					world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.SHORT_GRASS.defaultBlockState(), 3);
				}
			} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.PODZOL && (world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz))).getBlock() == Blocks.BLUE_ORCHID) {
				world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz),
						(BuiltInRegistries.BLOCK.getOrCreateTag(BlockTags.create(ResourceLocation.parse("forge:weird_flowers"))).getRandomElement(RandomSource.create()).orElseGet(() -> BuiltInRegistries.BLOCK.wrapAsHolder(Blocks.AIR)).value())
								.defaultBlockState(),
						3);
			}
		}
	}
}
