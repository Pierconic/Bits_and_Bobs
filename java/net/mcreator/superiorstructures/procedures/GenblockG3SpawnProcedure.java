package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.Drowned;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.superiorstructures.init.SuperiorstructuresModGameRules;

import java.util.Comparator;

public class GenblockG3SpawnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.getLevelData().getGameRules().getBoolean(SuperiorstructuresModGameRules.TICK_GENBLOCKS) == true) {
			if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.WATER) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.WATER.defaultBlockState(), 3);
			} else {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			}
			if (!world.getBlockState(BlockPos.containing(x, y, z)).canOcclude() || !world.getBlockState(BlockPos.containing(x, y + 1, z)).canOcclude()) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, new Vec3((x + 0.5), y, (z + 0.5)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"/summon minecraft:drowned ~ ~ ~ {PersistenceRequired:1b}");
				if (Math.random() < 0.5) {
					{
						Entity _entity = ((Entity) world.getEntitiesOfClass(Drowned.class, AABB.ofSize(new Vec3((x + 0.5), y, (z + 0.5)), 4, 4, 4), e -> true).stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
							}
						}.compareDistOf((x + 0.5), y, (z + 0.5))).findFirst().orElse(null));
						if (_entity instanceof Player _player) {
							_player.getInventory().armor.set(3, new ItemStack(Items.LEATHER_HELMET));
							_player.getInventory().setChanged();
						} else if (_entity instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(Items.LEATHER_HELMET));
						}
					}
				} else if (Math.random() < 0.03) {
					{
						Entity _entity = ((Entity) world.getEntitiesOfClass(Drowned.class, AABB.ofSize(new Vec3((x + 0.5), y, (z + 0.5)), 4, 4, 4), e -> true).stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
							}
						}.compareDistOf((x + 0.5), y, (z + 0.5))).findFirst().orElse(null));
						if (_entity instanceof Player _player) {
							_player.getInventory().armor.set(3, new ItemStack(Items.TURTLE_HELMET));
							_player.getInventory().setChanged();
						} else if (_entity instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(Items.TURTLE_HELMET));
						}
					}
				}
				if (Math.random() < 0.3) {
					if (((Entity) world.getEntitiesOfClass(Drowned.class, AABB.ofSize(new Vec3((x + 0.5), y, (z + 0.5)), 4, 4, 4), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf((x + 0.5), y, (z + 0.5))).findFirst().orElse(null)) instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(Items.IRON_SWORD).copy();
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				} else if (Math.random() < 0.3) {
					if (((Entity) world.getEntitiesOfClass(Drowned.class, AABB.ofSize(new Vec3((x + 0.5), y, (z + 0.5)), 4, 4, 4), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf((x + 0.5), y, (z + 0.5))).findFirst().orElse(null)) instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(Items.IRON_AXE).copy();
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				} else if (Math.random() < 0.03) {
					if (((Entity) world.getEntitiesOfClass(Drowned.class, AABB.ofSize(new Vec3((x + 0.5), y, (z + 0.5)), 4, 4, 4), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf((x + 0.5), y, (z + 0.5))).findFirst().orElse(null)) instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(Items.TRIDENT).copy();
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				}
			}
		}
	}
}
