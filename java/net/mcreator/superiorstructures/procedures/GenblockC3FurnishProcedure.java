package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModBlocks;
import net.mcreator.superiorstructures.SuperiorstructuresMod;
import net.mcreator.superiorstructures.init.SuperiorstructuresModGameRules;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class GenblockC3FurnishProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z) {
       double number = 0;
       if (world.getLevelData().getGameRules().getBoolean(SuperiorstructuresModGameRules.TICK_GENBLOCKS) == true) {
           SuperiorstructuresMod.queueServerWork(10, () -> {
               {
                   final Vec3 _center = new Vec3(x, y, z);
                   List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(15 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
                           .collect(Collectors.toList());
                   for (Entity entityiterator : _entfound) {
                       if (entityiterator instanceof ItemEntity) {
                           if (!entityiterator.level().isClientSide())
                               entityiterator.discard();
                       }
                   }
               }
           });
           number = Mth.nextInt(RandomSource.create(), 0, 5);
           if (((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.SNOW_BLOCK || (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.PACKED_ICE)
                   && ((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.SNOW_BLOCK || (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.PACKED_ICE)
                   || (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.STRIPPED_SPRUCE_LOG || (world.getBlockState(BlockPos.containing(x - 1, y, z - 1))).getBlock() == Blocks.STRIPPED_SPRUCE_LOG) {
               if (number == 0) {
                   if (world instanceof ServerLevel _serverworld) {
                       StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_furniture_1"));
                       if (template != null) {
                           template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
                       }
                   }
               } else if (number == 1) {
                   if (world instanceof ServerLevel _serverworld) {
                       StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_furniture_2"));
                       if (template != null) {
                           template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
                       }
                   }
               } else if (number == 2) {
                   if (world instanceof ServerLevel _serverworld) {
                       StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_furniture_3"));
                       if (template != null) {
                           template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
                       }
                   }
               } else if (number == 3) {
                   if (world instanceof ServerLevel _serverworld) {
                       StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_furniture_4"));
                       if (template != null) {
                           template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
                       }
                   }
               } else if (number == 4) {
                   if (world instanceof ServerLevel _serverworld) {
                       StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_furniture_5"));
                       if (template != null) {
                           template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
                       }
                   }
               } else if (number == 5) {
                   if (world instanceof ServerLevel _serverworld) {
                       StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_furniture_6"));
                       if (template != null) {
                           template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
                       }
                   }
               }
           } else if (((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.SNOW_BLOCK || (world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.PACKED_ICE)
                   && ((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.SNOW_BLOCK || (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.PACKED_ICE)
                   || (world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.STRIPPED_SPRUCE_LOG || (world.getBlockState(BlockPos.containing(x + 1, y, z + 1))).getBlock() == Blocks.STRIPPED_SPRUCE_LOG) {
               if (number == 0) {
                   if (world instanceof ServerLevel _serverworld) {
                       StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_furniture_1"));
                       if (template != null) {
                           template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
                       }
                   }
               } else if (number == 1) {
                   if (world instanceof ServerLevel _serverworld) {
                       StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_furniture_2"));
                       if (template != null) {
                           template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
                       }
                   }
               } else if (number == 2) {
                   if (world instanceof ServerLevel _serverworld) {
                       StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_furniture_3"));
                       if (template != null) {
                           template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
                       }
                   }
               } else if (number == 3) {
                   if (world instanceof ServerLevel _serverworld) {
                       StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_furniture_4"));
                       if (template != null) {
                           template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
                       }
                   }
               } else if (number == 4) {
                   if (world instanceof ServerLevel _serverworld) {
                       StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_furniture_5"));
                       if (template != null) {
                           template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
                       }
                   }
               } else if (number == 5) {
                   if (world instanceof ServerLevel _serverworld) {
                       StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_furniture_6"));
                       if (template != null) {
                           template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
                       }
                   }
               }
           } else if (((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.SNOW_BLOCK || (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.PACKED_ICE)
                   && ((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.SNOW_BLOCK || (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.PACKED_ICE)
                   || (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.STRIPPED_SPRUCE_LOG || (world.getBlockState(BlockPos.containing(x - 1, y, z + 1))).getBlock() == Blocks.STRIPPED_SPRUCE_LOG) {
               if (number == 0) {
                   if (world instanceof ServerLevel _serverworld) {
                       StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_furniture_1"));
                       if (template != null) {
                           template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random,
                                   3);
                       }
                   }
               } else if (number == 1) {
                   if (world instanceof ServerLevel _serverworld) {
                       StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "dungeon_dorm"));
                       if (template != null) {
                           template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random,
                                   3);
                       }
                   }
               } else if (number == 2) {
                   if (world instanceof ServerLevel _serverworld) {
                       StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_furniture_3"));
                       if (template != null) {
                           template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random,
                                   3);
                       }
                   }
               } else if (number == 3) {
                   if (world instanceof ServerLevel _serverworld) {
                       StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_furniture_4"));
                       if (template != null) {
                           template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random,
                                   3);
                       }
                   }
               } else if (number == 4) {
                   if (world instanceof ServerLevel _serverworld) {
                       StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_furniture_5"));
                       if (template != null) {
                           template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random,
                                   3);
                       }
                   }
               } else if (number == 5) {
                   if (world instanceof ServerLevel _serverworld) {
                       StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_furniture_6"));
                       if (template != null) {
                           template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random,
                                   3);
                       }
                   }
               }
           } else if (((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.SNOW_BLOCK || (world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.PACKED_ICE)
                   && ((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.SNOW_BLOCK || (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.PACKED_ICE)
                   || (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.STRIPPED_SPRUCE_LOG || (world.getBlockState(BlockPos.containing(x + 1, y, z - 1))).getBlock() == Blocks.STRIPPED_SPRUCE_LOG) {
               if (number == 0) {
                   if (world instanceof ServerLevel _serverworld) {
                       StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_furniture_1"));
                       if (template != null) {
                           template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
                       }
                   }
               } else if (number == 1) {
                   if (world instanceof ServerLevel _serverworld) {
                       StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_furniture_2"));
                       if (template != null) {
                           template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
                       }
                   }
               } else if (number == 2) {
                   if (world instanceof ServerLevel _serverworld) {
                       StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_furniture_3"));
                       if (template != null) {
                           template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
                       }
                   }
               } else if (number == 3) {
                   if (world instanceof ServerLevel _serverworld) {
                       StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_furniture_4"));
                       if (template != null) {
                           template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
                       }
                   }
               } else if (number == 4) {
                   if (world instanceof ServerLevel _serverworld) {
                       StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_furniture_5"));
                       if (template != null) {
                           template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
                       }
                   }
               } else if (number == 5) {
                   if (world instanceof ServerLevel _serverworld) {
                       StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_furniture_6"));
                       if (template != null) {
                           template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
                       }
                   }
               }
           }
           world.setBlock(BlockPos.containing(x, y, z), (world.getBlockState(BlockPos.containing(x, y + 1, z))), 3);
           world.setBlock(BlockPos.containing(x, y - 1, z), SuperiorstructuresModBlocks.GENBLOCK_C_4.get().defaultBlockState(), 3);
       }
   }
}