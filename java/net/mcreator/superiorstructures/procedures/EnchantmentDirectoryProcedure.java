package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

public class EnchantmentDirectoryProcedure {
	public static ItemStack execute(LevelAccessor world, double x, double y, double z) {
		double chance = 0;
		ItemStack final_item = ItemStack.EMPTY;
		final_item = new ItemStack(Items.ENCHANTED_BOOK);
		chance = Mth.nextInt(RandomSource.create(), 1, 8);
		if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("desert"))) {
			if (chance == 1) {
				final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.BLAST_PROTECTION), Mth.nextInt(RandomSource.create(), 1, 4));
			} else if (chance == 2) {
				final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.LOOTING), Mth.nextInt(RandomSource.create(), 1, 3));
			} else if (chance == 3) {
				final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.UNBREAKING), Mth.nextInt(RandomSource.create(), 1, 3));
			} else if (chance == 4) {
				final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.VANISHING_CURSE), 1);
			} else if (chance == 5) {
				final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.SHARPNESS), Mth.nextInt(RandomSource.create(), 1, 4));
			} else if (chance == 6) {
				final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.FLAME), 1);
			} else if (chance == 7) {
				final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.SMITE), Mth.nextInt(RandomSource.create(), 1, 4));
			} else if (chance == 8) {
				final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.MENDING), 1);
			}
			if (Math.random() < 0.3) {
				chance = Mth.nextInt(RandomSource.create(), 1, 4);
				if (chance == 1) {
					final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.FROST_WALKER), 1);
				} else if (chance == 2) {
					final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.SILK_TOUCH), 1);
				} else if (chance == 3) {
					final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.SMITE), Mth.nextInt(RandomSource.create(), 1, 5));
				} else if (chance == 4) {
					final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.VANISHING_CURSE), 1);
				}
			}
		} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("sparse_jungle")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("jungle"))) {
			if (chance == 1) {
				final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.PROJECTILE_PROTECTION), Mth.nextInt(RandomSource.create(), 1, 4));
			} else if (chance == 2) {
				final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.FORTUNE), Mth.nextInt(RandomSource.create(), 1, 3));
			} else if (chance == 3) {
				final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.UNBREAKING), Mth.nextInt(RandomSource.create(), 1, 3));
			} else if (chance == 4) {
				final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.EFFICIENCY), Mth.nextInt(RandomSource.create(), 1, 4));
			} else if (chance == 5) {
				final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.KNOCKBACK), Mth.nextInt(RandomSource.create(), 1, 2));
			} else if (chance == 6) {
				final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.SILK_TOUCH), 1);
			} else if (chance == 7) {
				final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.POWER), Mth.nextInt(RandomSource.create(), 1, 4));
			} else if (chance == 8) {
				final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.MENDING), 1);
			}
		} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_taiga")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_plains"))) {
			if (chance == 1) {
				final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.FROST_WALKER), Mth.nextInt(RandomSource.create(), 1, 2));
			} else if (chance == 2) {
				final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.FORTUNE), Mth.nextInt(RandomSource.create(), 1, 3));
			} else if (chance == 3) {
				final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.UNBREAKING), Mth.nextInt(RandomSource.create(), 1, 3));
			} else if (chance == 4) {
				final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.EFFICIENCY), Mth.nextInt(RandomSource.create(), 1, 4));
			} else if (chance == 5) {
				final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.FLAME), 1);
			} else if (chance == 6) {
				final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.DEPTH_STRIDER), Mth.nextInt(RandomSource.create(), 1, 3));
			} else if (chance == 7) {
				final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.PIERCING), Mth.nextInt(RandomSource.create(), 1, 3));
			} else if (chance == 8) {
				final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.IMPALING), Mth.nextInt(RandomSource.create(), 1, 3));
			}
		} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("ocean")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("deep_ocean"))
				|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("cold_ocean")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("deep_cold_ocean"))
				|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("deep_frozen_ocean")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("frozen_ocean"))
				|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("deep_lukewarm_ocean")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("lukewarm_ocean"))
				|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("warm_ocean"))) {
			if (chance == 1) {
				final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.RESPIRATION), Mth.nextInt(RandomSource.create(), 1, 3));
			} else if (chance == 2) {
				final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.DEPTH_STRIDER), Mth.nextInt(RandomSource.create(), 1, 3));
			} else if (chance == 3) {
				final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.LURE), Mth.nextInt(RandomSource.create(), 1, 3));
			} else if (chance == 4) {
				final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.LUCK_OF_THE_SEA), Mth.nextInt(RandomSource.create(), 1, 3));
			} else if (chance == 5) {
				final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.IMPALING), Mth.nextInt(RandomSource.create(), 1, 5));
			} else if (chance == 6) {
				final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.RIPTIDE), Mth.nextInt(RandomSource.create(), 1, 5));
			} else if (chance == 7) {
				final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.CHANNELING), 1);
			} else if (chance == 8) {
				final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.AQUA_AFFINITY), 1);
			}
		} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("dark_forest"))) {
			chance = Mth.nextInt(RandomSource.create(), 1, 12);
			if (chance == 1) {
				final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.QUICK_CHARGE), Mth.nextInt(RandomSource.create(), 1, 3));
			} else if (chance == 2) {
				final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.POWER), Mth.nextInt(RandomSource.create(), 1, 5));
			} else if (chance == 3) {
				final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.PIERCING), Mth.nextInt(RandomSource.create(), 1, 3));
			} else if (chance == 4) {
				final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.MULTISHOT), 1);
			} else if (chance == 5) {
				final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.FORTUNE), Mth.nextInt(RandomSource.create(), 1, 3));
			} else if (chance == 6) {
				final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.FEATHER_FALLING), Mth.nextInt(RandomSource.create(), 1, 3));
			} else if (chance == 7) {
				final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.FLAME), 1);
			} else if (chance == 8) {
				final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.MENDING), 1);
			} else if (chance == 9) {
				final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.FROST_WALKER), 1);
			} else if (chance == 10) {
				final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.PUNCH), Mth.nextInt(RandomSource.create(), 1, 2));
			} else if (chance == 11) {
				final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.LOOTING), Mth.nextInt(RandomSource.create(), 1, 3));
			} else if (chance == 12) {
				final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.CHANNELING), 1);
			}
			if (Math.random() < 0.4) {
				chance = Mth.nextInt(RandomSource.create(), 1, 4);
				if (chance == 1) {
					final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.BINDING_CURSE), 1);
				} else if (chance == 2) {
					final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.VANISHING_CURSE), 1);
				} else if (chance == 3) {
					final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.BANE_OF_ARTHROPODS), Mth.nextInt(RandomSource.create(), 1, 5));
				} else if (chance == 4) {
					final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.SMITE), Mth.nextInt(RandomSource.create(), 1, 5));
				}
			}
		} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("nether_wastes")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("basalt_deltas"))
				|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("soul_sand_valley")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("crimson_forest"))
				|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("warped_forest"))) {
			if (chance == 1) {
				final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.SOUL_SPEED), Mth.nextInt(RandomSource.create(), 1, 3));
			} else if (chance == 2) {
				final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.FIRE_ASPECT), Mth.nextInt(RandomSource.create(), 1, 2));
			} else if (chance == 3) {
				final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.FIRE_PROTECTION), Mth.nextInt(RandomSource.create(), 1, 4));
			} else if (chance == 4) {
				final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.BLAST_PROTECTION), Mth.nextInt(RandomSource.create(), 1, 4));
			} else if (chance == 5) {
				final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.SHARPNESS), Mth.nextInt(RandomSource.create(), 1, 5));
			} else if (chance == 6) {
				final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.LOOTING), Mth.nextInt(RandomSource.create(), 1, 5));
			} else if (chance == 7) {
				final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.POWER), Mth.nextInt(RandomSource.create(), 1, 5));
			} else if (chance == 8) {
				final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.FLAME), 1);
			}
		} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("end_barrens")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("deep_dark"))
				|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("end_highlands")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("end_midlands"))
				|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("small_end_islands")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("the_end"))) {
			if (chance == 1) {
				final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.EFFICIENCY), Mth.nextInt(RandomSource.create(), 3, 5));
			} else if (chance == 2) {
				final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.SHARPNESS), Mth.nextInt(RandomSource.create(), 3, 5));
			} else if (chance == 3) {
				final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.UNBREAKING), Mth.nextInt(RandomSource.create(), 2, 3));
			} else if (chance == 4) {
				final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.FEATHER_FALLING), Mth.nextInt(RandomSource.create(), 2, 3));
			} else if (chance == 5) {
				final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.POWER), Mth.nextInt(RandomSource.create(), 3, 5));
			} else if (chance == 6) {
				final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.INFINITY), 1);
			} else if (chance == 7) {
				final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.LOOTING), Mth.nextInt(RandomSource.create(), 2, 3));
			} else if (chance == 8) {
				final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.MENDING), 1);
			}
			if (Math.random() < 0.5) {
				chance = Mth.nextInt(RandomSource.create(), 1, 12);
				if (chance == 1) {
					final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.PROTECTION), Mth.nextInt(RandomSource.create(), 3, 5));
				} else if (chance == 2) {
					final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.FORTUNE), Mth.nextInt(RandomSource.create(), 2, 3));
				} else if (chance == 3) {
					final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.PIERCING), Mth.nextInt(RandomSource.create(), 2, 4));
				} else if (chance == 4) {
					final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.SWIFT_SNEAK), Mth.nextInt(RandomSource.create(), 1, 3));
				} else if (chance == 5) {
					final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.POWER), Mth.nextInt(RandomSource.create(), 3, 5));
				} else if (chance == 6) {
					final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.INFINITY), 1);
				} else if (chance == 7) {
					final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.LOOTING), Mth.nextInt(RandomSource.create(), 2, 3));
				} else if (chance == 8) {
					final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.MENDING), 1);
				}
			}
		} else {
			if (chance == 1) {
				final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.BANE_OF_ARTHROPODS), Mth.nextInt(RandomSource.create(), 1, 3));
			} else if (chance == 2) {
				final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.SMITE), Mth.nextInt(RandomSource.create(), 1, 3));
			} else if (chance == 3) {
				final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.UNBREAKING), Mth.nextInt(RandomSource.create(), 1, 2));
			} else if (chance == 4) {
				final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.EFFICIENCY), Mth.nextInt(RandomSource.create(), 1, 3));
			} else if (chance == 5) {
				final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.LURE), Mth.nextInt(RandomSource.create(), 1, 3));
			} else if (chance == 6) {
				final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.PROTECTION), Mth.nextInt(RandomSource.create(), 1, 2));
			} else if (chance == 7) {
				final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.PROJECTILE_PROTECTION), Mth.nextInt(RandomSource.create(), 1, 2));
			} else if (chance == 8) {
				final_item.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.SILK_TOUCH), 1);
			}
		}
		return final_item;
	}
}
