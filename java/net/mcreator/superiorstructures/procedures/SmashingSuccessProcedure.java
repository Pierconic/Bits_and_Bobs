package net.mcreator.superiorstructures.procedures;

import net.neoforged.neoforge.event.entity.living.LivingFallEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.animal.Chicken;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.network.SuperiorstructuresModVariables;

import javax.annotation.Nullable;

@EventBusSubscriber
public class SmashingSuccessProcedure {
	@SubscribeEvent
	public static void onEntityFall(LivingFallEvent event) {
		if (event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity(), event.getDistance());
		}
	}

	public static void execute(LevelAccessor world, Entity entity, double distance) {
		execute(null, world, entity, distance);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity, double distance) {
		if (entity == null)
			return;
		double bx = 0;
		double by = 0;
		double bz = 0;
		if (!(entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(MobEffects.SLOW_FALLING)) && !((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)
				.getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.FEATHER_FALLING)) != 0) && !(entity instanceof Chicken)) {
			bx = Math.floor(entity.getX());
			by = Math.floor(entity.getY());
			bz = Math.floor(entity.getZ());
			if (distance >= 2 && (world.getBlockState(BlockPos.containing(bx, by - 1, bz))).is(BlockTags.create(ResourceLocation.parse("forge:priceless_vases")))) {
				world.destroyBlock(BlockPos.containing(bx, by - 1, bz), false);
			}
			if (distance >= 2 && (world.getBlockState(BlockPos.containing(bx, by, bz))).is(BlockTags.create(ResourceLocation.parse("forge:priceless_vases")))) {
				world.destroyBlock(BlockPos.containing(bx, by, bz), false);
			}
			if (distance >= 16 && (world.getBlockState(BlockPos.containing(bx, by - 1, bz))).is(BlockTags.create(ResourceLocation.parse("forge:smashable")))) {
				if (entity instanceof Player) {
					{
						SuperiorstructuresModVariables.PlayerVariables _vars = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES);
						_vars.smashcount = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).smashcount + 1;
						_vars.syncPlayerVariables(entity);
					}
					{
						SuperiorstructuresModVariables.PlayerVariables _vars = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES);
						_vars.smashtimer = 60;
						_vars.syncPlayerVariables(entity);
					}
				}
				world.destroyBlock(BlockPos.containing(bx, by - 1, bz), false);
				if ((world.getBlockState(BlockPos.containing(bx, by - 2, bz))).is(BlockTags.create(ResourceLocation.parse("forge:smashable")))) {
					world.destroyBlock(BlockPos.containing(bx, by - 2, bz), false);
				}
				if ((world.getBlockState(BlockPos.containing(bx, by - 3, bz))).is(BlockTags.create(ResourceLocation.parse("forge:smashable")))) {
					world.destroyBlock(BlockPos.containing(bx, by - 3, bz), false);
				}
				if ((world.getBlockState(BlockPos.containing(bx - 2, by - 1, bz))).is(BlockTags.create(ResourceLocation.parse("forge:smashable")))) {
					world.destroyBlock(BlockPos.containing(bx - 2, by - 1, bz), false);
				}
				if ((world.getBlockState(BlockPos.containing(bx + 2, by - 1, bz))).is(BlockTags.create(ResourceLocation.parse("forge:smashable")))) {
					world.destroyBlock(BlockPos.containing(bx + 2, by - 1, bz), false);
				}
				if ((world.getBlockState(BlockPos.containing(bx, by - 1, bz + 2))).is(BlockTags.create(ResourceLocation.parse("forge:smashable")))) {
					world.destroyBlock(BlockPos.containing(bx, by - 1, bz + 2), false);
				}
				if ((world.getBlockState(BlockPos.containing(bx, by - 1, bz - 2))).is(BlockTags.create(ResourceLocation.parse("forge:smashable")))) {
					world.destroyBlock(BlockPos.containing(bx, by - 1, bz - 2), false);
				}
				if ((world.getBlockState(BlockPos.containing(bx - 1, by - 1, bz - 1))).is(BlockTags.create(ResourceLocation.parse("forge:smashable")))) {
					world.destroyBlock(BlockPos.containing(bx - 1, by - 1, bz - 1), false);
				}
				if ((world.getBlockState(BlockPos.containing(bx + 1, by - 1, bz + 1))).is(BlockTags.create(ResourceLocation.parse("forge:smashable")))) {
					world.destroyBlock(BlockPos.containing(bx + 1, by - 1, bz + 1), false);
				}
				if ((world.getBlockState(BlockPos.containing(bx + 1, by - 1, bz - 1))).is(BlockTags.create(ResourceLocation.parse("forge:smashable")))) {
					world.destroyBlock(BlockPos.containing(bx + 1, by - 1, bz - 1), false);
				}
				if ((world.getBlockState(BlockPos.containing(bx - 1, by - 1, bz + 1))).is(BlockTags.create(ResourceLocation.parse("forge:smashable")))) {
					world.destroyBlock(BlockPos.containing(bx - 1, by - 1, bz + 1), false);
				}
				if ((world.getBlockState(BlockPos.containing(bx - 1, by - 1, bz))).is(BlockTags.create(ResourceLocation.parse("forge:smashable")))) {
					world.destroyBlock(BlockPos.containing(bx - 1, by - 1, bz), false);
				}
				if ((world.getBlockState(BlockPos.containing(bx + 1, by - 1, bz))).is(BlockTags.create(ResourceLocation.parse("forge:smashable")))) {
					world.destroyBlock(BlockPos.containing(bx + 1, by - 1, bz), false);
				}
				if ((world.getBlockState(BlockPos.containing(bx, by - 1, bz + 1))).is(BlockTags.create(ResourceLocation.parse("forge:smashable")))) {
					world.destroyBlock(BlockPos.containing(bx, by - 1, bz + 1), false);
				}
				if ((world.getBlockState(BlockPos.containing(bx, by - 1, bz - 1))).is(BlockTags.create(ResourceLocation.parse("forge:smashable")))) {
					world.destroyBlock(BlockPos.containing(bx, by - 1, bz - 1), false);
				}
				if ((world.getBlockState(BlockPos.containing(bx - 1, by - 2, bz))).is(BlockTags.create(ResourceLocation.parse("forge:smashable")))) {
					world.destroyBlock(BlockPos.containing(bx - 1, by - 2, bz), false);
				}
				if ((world.getBlockState(BlockPos.containing(bx + 1, by - 2, bz))).is(BlockTags.create(ResourceLocation.parse("forge:smashable")))) {
					world.destroyBlock(BlockPos.containing(bx + 1, by - 2, bz), false);
				}
				if ((world.getBlockState(BlockPos.containing(bx, by - 2, bz + 1))).is(BlockTags.create(ResourceLocation.parse("forge:smashable")))) {
					world.destroyBlock(BlockPos.containing(bx, by - 2, bz + 1), false);
				}
				if ((world.getBlockState(BlockPos.containing(bx, by - 2, bz - 1))).is(BlockTags.create(ResourceLocation.parse("forge:smashable")))) {
					world.destroyBlock(BlockPos.containing(bx, by - 2, bz - 1), false);
				}
			} else if (distance >= 8 && (world.getBlockState(BlockPos.containing(bx, by - 1, bz))).is(BlockTags.create(ResourceLocation.parse("forge:smashable")))) {
				world.destroyBlock(BlockPos.containing(bx, by - 1, bz), false);
				if (entity instanceof Player) {
					{
						SuperiorstructuresModVariables.PlayerVariables _vars = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES);
						_vars.smashcount = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).smashcount + 1;
						_vars.syncPlayerVariables(entity);
					}
					{
						SuperiorstructuresModVariables.PlayerVariables _vars = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES);
						_vars.smashtimer = 60;
						_vars.syncPlayerVariables(entity);
					}
				}
				if ((world.getBlockState(BlockPos.containing(bx, by - 2, bz))).is(BlockTags.create(ResourceLocation.parse("forge:smashable")))) {
					world.destroyBlock(BlockPos.containing(bx, by - 2, bz), false);
				}
				if ((world.getBlockState(BlockPos.containing(bx - 1, by - 1, bz))).is(BlockTags.create(ResourceLocation.parse("forge:smashable")))) {
					world.destroyBlock(BlockPos.containing(bx - 1, by - 1, bz), false);
				}
				if ((world.getBlockState(BlockPos.containing(bx + 1, by - 1, bz))).is(BlockTags.create(ResourceLocation.parse("forge:smashable")))) {
					world.destroyBlock(BlockPos.containing(bx + 1, by - 1, bz), false);
				}
				if ((world.getBlockState(BlockPos.containing(bx, by - 1, bz + 1))).is(BlockTags.create(ResourceLocation.parse("forge:smashable")))) {
					world.destroyBlock(BlockPos.containing(bx, by - 1, bz + 1), false);
				}
				if ((world.getBlockState(BlockPos.containing(bx, by - 1, bz - 1))).is(BlockTags.create(ResourceLocation.parse("forge:smashable")))) {
					world.destroyBlock(BlockPos.containing(bx, by - 1, bz - 1), false);
				}
				if (entity.getBbWidth() >= 1.5) {
					if ((world.getBlockState(BlockPos.containing(bx, by - 2, bz))).is(BlockTags.create(ResourceLocation.parse("forge:smashable")))) {
						world.destroyBlock(BlockPos.containing(bx, by - 2, bz), false);
					}
					if ((world.getBlockState(BlockPos.containing(bx, by - 3, bz))).is(BlockTags.create(ResourceLocation.parse("forge:smashable")))) {
						world.destroyBlock(BlockPos.containing(bx, by - 3, bz), false);
					}
					if ((world.getBlockState(BlockPos.containing(bx - 2, by - 1, bz))).is(BlockTags.create(ResourceLocation.parse("forge:smashable")))) {
						world.destroyBlock(BlockPos.containing(bx - 2, by - 1, bz), false);
					}
					if ((world.getBlockState(BlockPos.containing(bx + 2, by - 1, bz))).is(BlockTags.create(ResourceLocation.parse("forge:smashable")))) {
						world.destroyBlock(BlockPos.containing(bx + 2, by - 1, bz), false);
					}
					if ((world.getBlockState(BlockPos.containing(bx, by - 1, bz + 2))).is(BlockTags.create(ResourceLocation.parse("forge:smashable")))) {
						world.destroyBlock(BlockPos.containing(bx, by - 1, bz + 2), false);
					}
					if ((world.getBlockState(BlockPos.containing(bx, by - 1, bz - 2))).is(BlockTags.create(ResourceLocation.parse("forge:smashable")))) {
						world.destroyBlock(BlockPos.containing(bx, by - 1, bz - 2), false);
					}
					if ((world.getBlockState(BlockPos.containing(bx - 1, by - 1, bz - 1))).is(BlockTags.create(ResourceLocation.parse("forge:smashable")))) {
						world.destroyBlock(BlockPos.containing(bx - 1, by - 1, bz - 1), false);
					}
					if ((world.getBlockState(BlockPos.containing(bx + 1, by - 1, bz + 1))).is(BlockTags.create(ResourceLocation.parse("forge:smashable")))) {
						world.destroyBlock(BlockPos.containing(bx + 1, by - 1, bz + 1), false);
					}
					if ((world.getBlockState(BlockPos.containing(bx + 1, by - 1, bz - 1))).is(BlockTags.create(ResourceLocation.parse("forge:smashable")))) {
						world.destroyBlock(BlockPos.containing(bx + 1, by - 1, bz - 1), false);
					}
					if ((world.getBlockState(BlockPos.containing(bx - 1, by - 1, bz + 1))).is(BlockTags.create(ResourceLocation.parse("forge:smashable")))) {
						world.destroyBlock(BlockPos.containing(bx - 1, by - 1, bz + 1), false);
					}
					if ((world.getBlockState(BlockPos.containing(bx - 1, by - 2, bz))).is(BlockTags.create(ResourceLocation.parse("forge:smashable")))) {
						world.destroyBlock(BlockPos.containing(bx - 1, by - 2, bz), false);
					}
					if ((world.getBlockState(BlockPos.containing(bx + 1, by - 2, bz))).is(BlockTags.create(ResourceLocation.parse("forge:smashable")))) {
						world.destroyBlock(BlockPos.containing(bx + 1, by - 2, bz), false);
					}
					if ((world.getBlockState(BlockPos.containing(bx, by - 2, bz + 1))).is(BlockTags.create(ResourceLocation.parse("forge:smashable")))) {
						world.destroyBlock(BlockPos.containing(bx, by - 2, bz + 1), false);
					}
					if ((world.getBlockState(BlockPos.containing(bx, by - 2, bz - 1))).is(BlockTags.create(ResourceLocation.parse("forge:smashable")))) {
						world.destroyBlock(BlockPos.containing(bx, by - 2, bz - 1), false);
					}
				}
			} else if (distance >= 4 && (world.getBlockState(BlockPos.containing(bx, by - 1, bz))).is(BlockTags.create(ResourceLocation.parse("forge:smashable")))) {
				world.destroyBlock(BlockPos.containing(bx, by - 1, bz), false);
				if (entity instanceof Player) {
					{
						SuperiorstructuresModVariables.PlayerVariables _vars = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES);
						_vars.smashcount = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).smashcount + 1;
						_vars.syncPlayerVariables(entity);
					}
					{
						SuperiorstructuresModVariables.PlayerVariables _vars = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES);
						_vars.smashtimer = 60;
						_vars.syncPlayerVariables(entity);
					}
				}
				if (entity.getBbWidth() >= 1.5) {
					if ((world.getBlockState(BlockPos.containing(bx, by - 2, bz))).is(BlockTags.create(ResourceLocation.parse("forge:smashable")))) {
						world.destroyBlock(BlockPos.containing(bx, by - 2, bz), false);
					}
					if ((world.getBlockState(BlockPos.containing(bx - 1, by - 1, bz))).is(BlockTags.create(ResourceLocation.parse("forge:smashable")))) {
						world.destroyBlock(BlockPos.containing(bx - 1, by - 1, bz), false);
					}
					if ((world.getBlockState(BlockPos.containing(bx + 1, by - 1, bz))).is(BlockTags.create(ResourceLocation.parse("forge:smashable")))) {
						world.destroyBlock(BlockPos.containing(bx + 1, by - 1, bz), false);
					}
					if ((world.getBlockState(BlockPos.containing(bx, by - 1, bz + 1))).is(BlockTags.create(ResourceLocation.parse("forge:smashable")))) {
						world.destroyBlock(BlockPos.containing(bx, by - 1, bz + 1), false);
					}
					if ((world.getBlockState(BlockPos.containing(bx, by - 1, bz - 1))).is(BlockTags.create(ResourceLocation.parse("forge:smashable")))) {
						world.destroyBlock(BlockPos.containing(bx, by - 1, bz - 1), false);
					}
				}
			}
		}
	}
}
