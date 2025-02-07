package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModBlocks;

public class SuspicionTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		if (!world.isClientSide()) {
			BlockPos _bp = BlockPos.containing(x, y, z);
			BlockEntity _blockEntity = world.getBlockEntity(_bp);
			BlockState _bs = world.getBlockState(_bp);
			if (_blockEntity != null)
				_blockEntity.getPersistentData().putDouble("stability", ((new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getPersistentData().getDouble(tag);
						return -1;
					}
				}.getValue(world, BlockPos.containing(x, y, z), "stability")) - 1));
			if (world instanceof Level _level)
				_level.sendBlockUpdated(_bp, _bs, _bs, 3);
		}
		if ((new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "stability")) % 12 == 0) {
			world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId((world.getBlockState(BlockPos.containing(x, y, z)))));
		}
		if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "stability") <= 0) {
			if (blockstate.getBlock() == SuperiorstructuresModBlocks.SUSPICIOUS_TICKING_CITY_ENDSTONE.get()) {
				if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip9 ? blockstate.getValue(_getip9) : -1) < 10) {
					CityEndstoneJunkProcedure.execute(world, x, y, z);
				} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip11 ? blockstate.getValue(_getip11) : -1) < 15) {
					CityEndstoneUsefulProcedure.execute(world, x, y, z);
				} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip13 ? blockstate.getValue(_getip13) : -1) == 15) {
					CityEndstoneSpecialProcedure.execute(world, x, y, z);
				}
			} else if (blockstate.getBlock() == SuperiorstructuresModBlocks.TICKING_ENDSTONE.get()) {
				if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip17 ? blockstate.getValue(_getip17) : -1) < 10) {
					EndstoneJunkProcedure.execute(world, x, y, z);
				} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip19 ? blockstate.getValue(_getip19) : -1) < 15) {
					EndstoneUsefulProcedure.execute(world, x, y, z);
				} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip21 ? blockstate.getValue(_getip21) : -1) == 15) {
					EndstoneSpecialProcedure.execute(world, x, y, z);
				}
			} else if (blockstate.getBlock() == SuperiorstructuresModBlocks.SUSPICIOUS_TICKING_DIRT.get()) {
				if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip25 ? blockstate.getValue(_getip25) : -1) < 10) {
					SuspiciousDirtJunkProcedure.execute(world, x, y, z);
				} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip27 ? blockstate.getValue(_getip27) : -1) < 15) {
					SuspiciousDirtUsefulProcedure.execute(world, x, y, z);
				} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip29 ? blockstate.getValue(_getip29) : -1) == 15) {
					SuspiciousDirtSpecialProcedure.execute(world, x, y, z);
				}
			} else if (blockstate.getBlock() == SuperiorstructuresModBlocks.ANCIENT_TICKING_DIRT.get()) {
				if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip33 ? blockstate.getValue(_getip33) : -1) < 10) {
					AncientDirtJunkProcedure.execute(world, x, y, z);
				} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip35 ? blockstate.getValue(_getip35) : -1) < 15) {
					AncientDirtUsefulProcedure.execute(world, x, y, z);
				} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip37 ? blockstate.getValue(_getip37) : -1) == 15) {
					AncientDirtSpecialProcedure.execute(world, x, y, z);
				}
			} else if (blockstate.getBlock() == SuperiorstructuresModBlocks.GRAVE_TICKING_DIRT.get()) {
				if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip41 ? blockstate.getValue(_getip41) : -1) < 10) {
					GraveDirtJunkProcedure.execute(world, x, y, z);
				} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip43 ? blockstate.getValue(_getip43) : -1) < 15) {
					GraveDirtUsefulProcedure.execute(world, x, y, z);
				} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip45 ? blockstate.getValue(_getip45) : -1) == 15) {
					GraveDirtSpecialProcedure.execute(world, x, y, z);
				}
			} else if (blockstate.getBlock() == SuperiorstructuresModBlocks.LUSH_TICKING_DIRT.get()) {
				if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip49 ? blockstate.getValue(_getip49) : -1) < 10) {
					LushDirtJunkProcedure.execute(world, x, y, z);
				} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip51 ? blockstate.getValue(_getip51) : -1) < 15) {
					LushDirtUsefulProcedure.execute(world, x, y, z);
				} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip53 ? blockstate.getValue(_getip53) : -1) == 15) {
					LushDirtSpecialProcedure.execute(world, x, y, z);
				}
			} else if (blockstate.getBlock() == SuperiorstructuresModBlocks.TOWN_TICKING_DIRT.get()) {
				if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip57 ? blockstate.getValue(_getip57) : -1) < 10) {
					TownDirtJunkProcedure.execute(world, x, y, z);
				} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip59 ? blockstate.getValue(_getip59) : -1) < 15) {
					TownDirtUsefulProcedure.execute(world, x, y, z);
				} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip61 ? blockstate.getValue(_getip61) : -1) == 15) {
					TownDirtSpecialProcedure.execute(world, x, y, z);
				}
			} else if (blockstate.getBlock() == SuperiorstructuresModBlocks.SUSPICIOUS_TICKING_SAND.get()) {
				if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip65 ? blockstate.getValue(_getip65) : -1) < 10) {
					SandJunkProcedure.execute(world, x, y, z);
				} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip67 ? blockstate.getValue(_getip67) : -1) < 15) {
					SandUsefulProcedure.execute(world, x, y, z);
				} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip69 ? blockstate.getValue(_getip69) : -1) == 15) {
					SandSpecialProcedure.execute(world, x, y, z);
				}
			} else if (blockstate.getBlock() == SuperiorstructuresModBlocks.PYRAMID_TICKING_SAND.get()) {
				if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip73 ? blockstate.getValue(_getip73) : -1) < 10) {
					PyramidJunkProcedure.execute(world, x, y, z);
				} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip75 ? blockstate.getValue(_getip75) : -1) < 15) {
					PyramidUsefulProcedure.execute(world, x, y, z);
				} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip77 ? blockstate.getValue(_getip77) : -1) == 15) {
					PyramidSpecialProcedure.execute(world, x, y, z);
				}
			} else if (blockstate.getBlock() == SuperiorstructuresModBlocks.TICKING_GRAVEL.get()) {
				if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip81 ? blockstate.getValue(_getip81) : -1) < 10) {
					GravelJunkProcedure.execute(world, x, y, z);
				} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip83 ? blockstate.getValue(_getip83) : -1) < 15) {
					GravelUsefulProcedure.execute(world, x, y, z);
				} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip85 ? blockstate.getValue(_getip85) : -1) == 15) {
					GravelSpecialProcedure.execute(world, x, y, z);
				}
			} else if (blockstate.getBlock() == SuperiorstructuresModBlocks.TICKING_NETHERRACK.get()) {
				if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip89 ? blockstate.getValue(_getip89) : -1) < 10) {
					NetherrackJunkProcedure.execute(world, x, y, z);
				} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip91 ? blockstate.getValue(_getip91) : -1) < 15) {
					NetherrackUsefulProcedure.execute(world, x, y, z);
				} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip93 ? blockstate.getValue(_getip93) : -1) == 15) {
					NetherrackSpecialProcedure.execute(world, x, y, z);
				}
			} else if (blockstate.getBlock() == SuperiorstructuresModBlocks.FORTRESS_TICKING_NETHERRACK.get()) {
				if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip97 ? blockstate.getValue(_getip97) : -1) < 10) {
					FortressJunkProcedure.execute(world, x, y, z);
				} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip99 ? blockstate.getValue(_getip99) : -1) < 15) {
					FortressUsefulProcedure.execute(world, x, y, z);
				} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip101 ? blockstate.getValue(_getip101) : -1) == 15) {
					FortressSpecialProcedure.execute(world, x, y, z);
				}
			} else if (blockstate.getBlock() == SuperiorstructuresModBlocks.TICKING_BLACKSTONE.get()) {
				if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip105 ? blockstate.getValue(_getip105) : -1) < 10) {
					BlackstoneJunkProcedure.execute(world, x, y, z);
				} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip107 ? blockstate.getValue(_getip107) : -1) < 15) {
					BlackstoneUsefulProcedure.execute(world, x, y, z);
				} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip109 ? blockstate.getValue(_getip109) : -1) == 15) {
					BlackstoneSpecialProcedure.execute(world, x, y, z);
				}
			} else if (blockstate.getBlock() == SuperiorstructuresModBlocks.TICKING_STONE.get()) {
				if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip113 ? blockstate.getValue(_getip113) : -1) < 10) {
					StoneJunkProcedure.execute(world, x, y, z);
				} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip115 ? blockstate.getValue(_getip115) : -1) < 15) {
					StoneUsefulProcedure.execute(world, x, y, z);
				} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip117 ? blockstate.getValue(_getip117) : -1) == 15) {
					StoneSpecialProcedure.execute(world, x, y, z);
				}
			} else if (blockstate.getBlock() == SuperiorstructuresModBlocks.MINER_TICKING_STONE.get()) {
				if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip121 ? blockstate.getValue(_getip121) : -1) < 10) {
					MinerJunkProcedure.execute(world, x, y, z);
				} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip123 ? blockstate.getValue(_getip123) : -1) < 15) {
					MinerUsefulProcedure.execute(world, x, y, z);
				} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip125 ? blockstate.getValue(_getip125) : -1) == 15) {
					MinerSpecialProcedure.execute(world, x, y, z);
				}
			} else if (blockstate.getBlock() == SuperiorstructuresModBlocks.TICKING_DEEPSLATE.get()) {
				if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip129 ? blockstate.getValue(_getip129) : -1) < 10) {
					DeepslateJunkProcedure.execute(world, x, y, z);
				} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip131 ? blockstate.getValue(_getip131) : -1) < 15) {
					DeepslateUsefulProcedure.execute(world, x, y, z);
				} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip133 ? blockstate.getValue(_getip133) : -1) == 15) {
					DeepslateSpecialProcedure.execute(world, x, y, z);
				}
			}
			if (blockstate.getBlock().getStateDefinition().getProperty("waterlogged") instanceof BooleanProperty _getbp135 && blockstate.getValue(_getbp135)) {
				world.destroyBlock(BlockPos.containing(x, y, z), false);
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.BUBBLE, (x + 0.5), (y + 0.5), (z + 0.5), 15, 0.2, 0.2, 0.2, 0.1);
				world.setBlock(BlockPos.containing(x, y, z), Blocks.WATER.defaultBlockState(), 3);
			} else {
				world.destroyBlock(BlockPos.containing(x, y, z), false);
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.POOF, (x + 0.5), (y + 0.5), (z + 0.5), 15, 0.2, 0.2, 0.2, 0.1);
			}
		}
	}
}
