package net.mcreator.superiorstructures.procedures;

import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.superiorstructures.network.SuperiorstructuresModVariables;
import net.mcreator.superiorstructures.init.SuperiorstructuresModItems;

import javax.annotation.Nullable;

@EventBusSubscriber
public class VoidWandClickProcedure {
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
		if ((entity instanceof Player _plr ? _plr.getAbilities().instabuild : false) && (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == SuperiorstructuresModItems.VOID_WAND.get()) {
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
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.allay.hurt")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.allay.hurt")), SoundSource.NEUTRAL, 1, 1, false);
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
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.allay.hurt")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.allay.hurt")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					if (entity instanceof Player _player)
						_player.getCooldowns().addCooldown((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem(), 10);
				} else if ((entity instanceof Player _plrCldRem16 ? _plrCldRem16.getCooldowns().getCooldownPercent((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem(), 0f) * 100 : 0) == 0) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										(((((("fill [a] [b] [c] [d] [e] [f] structure_void replace air".replace("[f]", new java.text.DecimalFormat("####").format(entity.level()
												.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ())))
												.replace("[e]",
														new java.text.DecimalFormat("####").format(entity.level()
																.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																.getBlockPos().getY())))
												.replace("[d]",
														new java.text.DecimalFormat("####").format(entity.level()
																.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																.getBlockPos().getX())))
												.replace("[c]", new java.text.DecimalFormat("####").format(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).WandZ)))
												.replace("[b]", new java.text.DecimalFormat("####").format(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).WandY)))
												.replace("[a]", new java.text.DecimalFormat("####").format(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).WandX))));
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.illusioner.cast_spell")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.illusioner.cast_spell")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Area Voided"), false);
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
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
				}
			}
		}
	}
}
