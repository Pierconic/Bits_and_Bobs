package net.mcreator.superiorstructures.procedures;

import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.superiorstructures.network.SuperiorstructuresModVariables;
import net.mcreator.superiorstructures.init.SuperiorstructuresModItems;
import net.mcreator.superiorstructures.init.SuperiorstructuresModBlocks;

import javax.annotation.Nullable;

@EventBusSubscriber
public class AirWandClickProcedure {
	@SubscribeEvent
	public static void onLeftClickBlock(PlayerInteractEvent.LeftClickBlock event) {
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double x_orientation = 0;
		double tx = 0;
		double ty = 0;
		double sx = 0;
		double tz = 0;
		double sy = 0;
		double y_orientation = 0;
		double sz = 0;
		double z_orientation = 0;
		if ((entity instanceof Player _plr ? _plr.getAbilities().instabuild : false) && (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == SuperiorstructuresModItems.AIR_WAND.get()) {
			if (entity.isShiftKeyDown()) {
				{
					SuperiorstructuresModVariables.PlayerVariables _vars = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES);
					_vars.WandX = 0;
					_vars.syncPlayerVariables(entity);
				}
				{
					SuperiorstructuresModVariables.PlayerVariables _vars = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES);
					_vars.WandY = 0;
					_vars.syncPlayerVariables(entity);
				}
				{
					SuperiorstructuresModVariables.PlayerVariables _vars = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES);
					_vars.WandZ = 0;
					_vars.syncPlayerVariables(entity);
				}
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Reset centerpoint"), false);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.breeze.hurt")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.breeze.hurt")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
			} else {
				if (entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).WandX == 0 && entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).WandY == 0
						&& entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).WandZ == 0) {
					{
						SuperiorstructuresModVariables.PlayerVariables _vars = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES);
						_vars.WandX = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX();
						_vars.syncPlayerVariables(entity);
					}
					{
						SuperiorstructuresModVariables.PlayerVariables _vars = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES);
						_vars.WandY = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY();
						_vars.syncPlayerVariables(entity);
					}
					{
						SuperiorstructuresModVariables.PlayerVariables _vars = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES);
						_vars.WandZ = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ();
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal(((("Centerpoint Set to [a] [b] [c]".replace("[c]", new java.text.DecimalFormat("####").format(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).WandZ)))
								.replace("[b]", new java.text.DecimalFormat("####").format(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).WandY)))
								.replace("[a]", new java.text.DecimalFormat("####").format(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).WandX)))), false);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.breeze.hurt")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.breeze.hurt")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					if (entity instanceof Player _player)
						_player.getCooldowns().addCooldown((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem(), 10);
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() instanceof BlockItem
						&& (entity instanceof Player _plrCldRem18 ? _plrCldRem18.getCooldowns().getCooldownPercent((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem(), 0f) * 100 : 0) == 0) {
					if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == SuperiorstructuresModBlocks.FLAVORBLOCK.get().asItem()) {
						tx = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX();
						ty = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY();
						tz = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ();
						sx = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).WandX;
						x_orientation = 1;
						y_orientation = 1;
						z_orientation = 1;
						for (int index0 = 0; index0 < (int) Math.abs((tx + 1) - entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).WandX); index0++) {
							sy = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).WandY;
							for (int index1 = 0; index1 < (int) Math.abs((ty + 1) - entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).WandY); index1++) {
								sz = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).WandZ;
								for (int index2 = 0; index2 < (int) Math.abs((tz + 1) - entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).WandZ); index2++) {
									if ((world.getBlockState(BlockPos.containing(sx, sy, sz))).getBlock() == SuperiorstructuresModBlocks.FLAVORBLOCK.get()
											&& ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getString("StoredFunction"))
													.equals(new Object() {
														public String getValue(LevelAccessor world, BlockPos pos, String tag) {
															BlockEntity blockEntity = world.getBlockEntity(pos);
															if (blockEntity != null)
																return blockEntity.getPersistentData().getString(tag);
															return "";
														}
													}.getValue(world, BlockPos.containing(sx, sy, sz), "StoredFunction"))) {
										world.setBlock(BlockPos.containing(sx, sy, sz), Blocks.AIR.defaultBlockState(), 3);
									}
									sz = sz + 1 * z_orientation;
								}
								sy = sy + 1 * y_orientation;
							}
							sx = sx + 1 * x_orientation;
						}
					} else {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									((((((("fill [a] [b] [c] [d] [e] [f] air replace [block]".replace("[block]", BuiltInRegistries.BLOCK.getKey(
											((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() instanceof BlockItem _bi ? _bi.getBlock().defaultBlockState() : Blocks.AIR.defaultBlockState()).getBlock())
											.toString()))
											.replace("[f]", new java.text.DecimalFormat("####").format(entity.level()
													.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ())))
											.replace("[e]", new java.text.DecimalFormat("####").format(entity.level()
													.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY())))
											.replace("[d]", new java.text.DecimalFormat("####").format(entity.level()
													.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX())))
											.replace("[c]", new java.text.DecimalFormat("####").format(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).WandZ)))
											.replace("[b]", new java.text.DecimalFormat("####").format(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).WandY)))
											.replace("[a]", new java.text.DecimalFormat("####").format(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).WandX))));
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.breeze.jump")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.breeze.jump")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Area Replaced"), false);
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
				} else {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Select Block..."), false);
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
				}
			}
		}
	}
}
