package net.mcreator.superiorstructures.procedures;

import net.neoforged.neoforge.event.level.BlockEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.network.SuperiorstructuresModVariables;
import net.mcreator.superiorstructures.init.SuperiorstructuresModItems;

import javax.annotation.Nullable;

@EventBusSubscriber
public class GauntletPlacementProcedure {
	@SubscribeEvent
	public static void onBlockPlace(BlockEvent.EntityPlaceEvent event) {
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		BlockState targeted_block = Blocks.AIR.defaultBlockState();
		Direction target_face = Direction.NORTH;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double targetx = 0;
		double targety = 0;
		double targetz = 0;
		double zorientation = 0;
		double xorientation = 0;
		double zscale = 0;
		double xscale = 0;
		double scale = 0;
		if (((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == SuperiorstructuresModItems.GAUNTLET.get()
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == SuperiorstructuresModItems.PHASE_GAUNTLET.get()) && !entity.isShiftKeyDown()
				&& (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("charge") > 0
				&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() instanceof BlockItem) {
			targetx = x;
			targety = y;
			targetz = z;
			{
				final String _tagName = "charge";
				final double _tagValue = ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("charge") - 1);
				CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY), tag -> tag.putDouble(_tagName, _tagValue));
			}
			if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
				if (world instanceof ServerLevel _level) {
					(entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).hurtAndBreak(1, _level, null, _stkprov -> {
					});
				}
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).copy();
					_setstack.setCount((int) ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() - 1));
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			}
			targeted_block = (world.getBlockState(BlockPos.containing(targetx + 0, targety + 0, targetz + 0)));
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == SuperiorstructuresModItems.PHASE_GAUNTLET.get()) {
				scale = 3;
			} else {
				scale = 2;
			}
			if (entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).gesture == 1) {
				sx = -1;
				for (int index0 = 0; index0 < (int) scale; index0++) {
					sy = 0;
					for (int index1 = 0; index1 < (int) scale; index1++) {
						sz = -1;
						for (int index2 = 0; index2 < (int) scale; index2++) {
							if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == (new ItemStack(targeted_block.getBlock())).getItem()
									&& (world.isEmptyBlock(BlockPos.containing(targetx + sx, targety + sy, targetz + sz)) || (world.getBlockState(BlockPos.containing(targetx + sx, targety + sy, targetz + sz))).getBlock() instanceof LiquidBlock)
									&& !(!world.getEntitiesOfClass(LivingEntity.class, AABB.ofSize(new Vec3((targetx + sx + 0.5), (targety + sy + 0.5), (targetz + sz + 0.5)), 1, 1, 1), e -> true).isEmpty())) {
								world.setBlock(BlockPos.containing(targetx + sx, targety + sy, targetz + sz), targeted_block, 3);
								world.levelEvent(2001, BlockPos.containing(targetx + sx, targety + sy, targetz + sz), Block.getId(targeted_block));
								if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
									if (entity instanceof LivingEntity _entity) {
										ItemStack _setstack = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).copy();
										_setstack.setCount((int) ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() - 1));
										_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
										if (_entity instanceof Player _player)
											_player.getInventory().setChanged();
									}
								}
							}
							sz = sz + 1;
						}
						sy = sy + 1;
					}
					sx = sx + 1;
				}
			} else if (entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).gesture == 2) {
				xscale = 3;
				zscale = 3;
				if ((entity.getDirection()) == Direction.EAST) {
					xorientation = 1;
					if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == SuperiorstructuresModItems.PHASE_GAUNTLET.get()) {
						xscale = 9;
					} else {
						xscale = 6;
					}
				} else if ((entity.getDirection()) == Direction.WEST) {
					xorientation = -1;
					if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == SuperiorstructuresModItems.PHASE_GAUNTLET.get()) {
						xscale = 9;
					} else {
						xscale = 6;
					}
				} else {
					xorientation = 0;
					xscale = 3;
				}
				if ((entity.getDirection()) == Direction.SOUTH) {
					zorientation = 1;
					if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == SuperiorstructuresModItems.PHASE_GAUNTLET.get()) {
						zscale = 9;
					} else {
						zscale = 6;
					}
				} else if ((entity.getDirection()) == Direction.NORTH) {
					zorientation = -1;
					if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == SuperiorstructuresModItems.PHASE_GAUNTLET.get()) {
						zscale = 9;
					} else {
						zscale = 6;
					}
				} else {
					zorientation = 0;
					zscale = 3;
				}
				sx = 0;
				for (int index3 = 0; index3 < (int) xscale; index3++) {
					sy = 0;
					for (int index4 = 0; index4 < 1; index4++) {
						sz = 0;
						for (int index5 = 0; index5 < (int) zscale; index5++) {
							if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == (new ItemStack(targeted_block.getBlock())).getItem()
									&& (world.isEmptyBlock(BlockPos.containing(targetx + sx, targety + sy, targetz + sz)) || (world.getBlockState(BlockPos.containing(targetx + sx, targety + sy, targetz + sz))).getBlock() instanceof LiquidBlock)
									&& !(!world.getEntitiesOfClass(LivingEntity.class, AABB.ofSize(new Vec3((targetx + sx + 0.5), (targety + sy + 0.5), (targetz + sz + 0.5)), 1, 1, 1), e -> true).isEmpty())) {
								world.setBlock(BlockPos.containing(targetx + sx, targety + sy, targetz + sz), targeted_block, 3);
								world.levelEvent(2001, BlockPos.containing(targetx + sx, targety + sy, targetz + sz), Block.getId(targeted_block));
								if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
									if (entity instanceof LivingEntity _entity) {
										ItemStack _setstack = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).copy();
										_setstack.setCount((int) ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() - 1));
										_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
										if (_entity instanceof Player _player)
											_player.getInventory().setChanged();
									}
								}
							}
							sz = sz + 1 * zorientation;
						}
						sy = sy + 1;
					}
					sx = sx + 1 * xorientation;
				}
			}
		}
	}
}
