package net.mcreator.superiorstructures.procedures;

import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.tags.BlockTags;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModBlocks;

import javax.annotation.Nullable;

@EventBusSubscriber
public class WaxOnWaxOffProcedure {
	@SubscribeEvent
	public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
		if (event.getHand() != event.getEntity().getUsedItemHand())
			return;
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getLevel().getBlockState(event.getPos()), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate, Entity entity) {
		execute(null, world, x, y, z, blockstate, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, BlockState blockstate, Entity entity) {
		if (entity == null)
			return;
		boolean waxed = false;
		boolean axed = false;
		axed = false;
		waxed = false;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() instanceof AxeItem && blockstate.is(BlockTags.create(ResourceLocation.parse("minecraft:waxy")))) {
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.WAX_OFF, (x + 0.5), (y + 0.5), (z + 0.5), 16, 0.4, 0.4, 0.4, 0);
			if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
				if (world instanceof ServerLevel _level) {
					(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).hurtAndBreak(1, _level, null, _stkprov -> {
					});
				}
			}
			axed = true;
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() instanceof AxeItem && blockstate.is(BlockTags.create(ResourceLocation.parse("minecraft:waxy")))) {
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.OFF_HAND, true);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.WAX_OFF, (x + 0.5), (y + 0.5), (z + 0.5), 16, 0.4, 0.4, 0.4, 0);
			if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
				if (world instanceof ServerLevel _level) {
					(entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).hurtAndBreak(1, _level, null, _stkprov -> {
					});
				}
			}
			axed = true;
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.HONEYCOMB && blockstate.is(BlockTags.create(ResourceLocation.parse("minecraft:waxy")))) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.WAX_ON, (x + 0.5), (y + 0.5), (z + 0.5), 16, 0.4, 0.4, 0.4, 0);
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
			if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
				(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).shrink(1);
			}
			waxed = true;
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == Items.HONEYCOMB && blockstate.is(BlockTags.create(ResourceLocation.parse("minecraft:waxy")))) {
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.OFF_HAND, true);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.WAX_ON, (x + 0.5), (y + 0.5), (z + 0.5), 16, 0.4, 0.4, 0.4, 0);
			if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
				(entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).shrink(1);
			}
			waxed = true;
		}
		if (waxed) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.honeycomb.wax_on")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.honeycomb.wax_on")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			if (blockstate.getBlock() == SuperiorstructuresModBlocks.COPPER_GRATE.get()) {
				world.setBlock(BlockPos.containing(x, y, z), SuperiorstructuresModBlocks.WAXED_COPPER_GRATE.get().defaultBlockState(), 3);
			} else if (blockstate.getBlock() == SuperiorstructuresModBlocks.EXPOSED_COPPER_GRATE.get()) {
				world.setBlock(BlockPos.containing(x, y, z), SuperiorstructuresModBlocks.WAXED_EXPOSED_COPPER_GRATE.get().defaultBlockState(), 3);
			} else if (blockstate.getBlock() == SuperiorstructuresModBlocks.WEATHERED_COPPER_GRATE.get()) {
				world.setBlock(BlockPos.containing(x, y, z), SuperiorstructuresModBlocks.WAXED_WEATHERED_COPPER_GRATE.get().defaultBlockState(), 3);
			}
			if (blockstate.getBlock() == SuperiorstructuresModBlocks.CHISELED_COPPER.get()) {
				world.setBlock(BlockPos.containing(x, y, z), SuperiorstructuresModBlocks.WAXED_CHISELED_COPPER.get().defaultBlockState(), 3);
			} else if (blockstate.getBlock() == SuperiorstructuresModBlocks.EXPOSED_CHISELED_COPPER.get()) {
				world.setBlock(BlockPos.containing(x, y, z), SuperiorstructuresModBlocks.WAXED_EXPOSED_CHISELED_COPPER.get().defaultBlockState(), 3);
			} else if (blockstate.getBlock() == SuperiorstructuresModBlocks.WEATHERED_CHISELED_COPPER.get()) {
				world.setBlock(BlockPos.containing(x, y, z), SuperiorstructuresModBlocks.WAXED_WEATHERED_CHISELED_COPPER.get().defaultBlockState(), 3);
			}
			if (blockstate.getBlock() == SuperiorstructuresModBlocks.COPPER_BULB.get()) {
				world.setBlock(BlockPos.containing(x, y, z), SuperiorstructuresModBlocks.WAXED_COPPER_BULB.get().defaultBlockState(), 3);
			} else if (blockstate.getBlock() == SuperiorstructuresModBlocks.COPPER_BULB_LIT.get()) {
				world.setBlock(BlockPos.containing(x, y, z), SuperiorstructuresModBlocks.WAXED_COPPER_BULB_LIT.get().defaultBlockState(), 3);
			} else if (blockstate.getBlock() == SuperiorstructuresModBlocks.EXPOSED_COPPER_BULB.get()) {
				world.setBlock(BlockPos.containing(x, y, z), SuperiorstructuresModBlocks.WAXED_EXPOSED_COPPER_BULB.get().defaultBlockState(), 3);
			} else if (blockstate.getBlock() == SuperiorstructuresModBlocks.EXPOSED_COPPER_BULB_LIT.get()) {
				world.setBlock(BlockPos.containing(x, y, z), SuperiorstructuresModBlocks.WAXED_EXPOSED_COPPER_BULB_LIT.get().defaultBlockState(), 3);
			} else if (blockstate.getBlock() == SuperiorstructuresModBlocks.WEATHERED_COPPER_BULB.get()) {
				world.setBlock(BlockPos.containing(x, y, z), SuperiorstructuresModBlocks.WAXED_WEATHERED_COPPER_BULB.get().defaultBlockState(), 3);
			} else if (blockstate.getBlock() == SuperiorstructuresModBlocks.WEATHERED_COPPER_BULB_LIT.get()) {
				world.setBlock(BlockPos.containing(x, y, z), SuperiorstructuresModBlocks.WAXED_WEATHERED_COPPER_BULB_LIT.get().defaultBlockState(), 3);
			}
			if (blockstate.getBlock() == SuperiorstructuresModBlocks.COPPER_TRAPDOOR.get()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = SuperiorstructuresModBlocks.WAXED_COPPER_TRAPDOOR.get().defaultBlockState();
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
			} else if (blockstate.getBlock() == SuperiorstructuresModBlocks.EXPOSED_COPPER_TRAPDOOR.get()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = SuperiorstructuresModBlocks.WAXED_EXPOSED_COPPER_TRAPDOOR.get().defaultBlockState();
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
			} else if (blockstate.getBlock() == SuperiorstructuresModBlocks.WEATHERED_COPPER_TRAPDOOR.get()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = SuperiorstructuresModBlocks.WAXED_WEATHERED_COPPER_TRAPDOOR.get().defaultBlockState();
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
		} else if (axed) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.axe.wax_off")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.axe.wax_off")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			if (blockstate.getBlock() == SuperiorstructuresModBlocks.WAXED_COPPER_GRATE.get()) {
				world.setBlock(BlockPos.containing(x, y, z), SuperiorstructuresModBlocks.COPPER_GRATE.get().defaultBlockState(), 3);
			} else if (blockstate.getBlock() == SuperiorstructuresModBlocks.EXPOSED_COPPER_GRATE.get() || blockstate.getBlock() == SuperiorstructuresModBlocks.WAXED_EXPOSED_COPPER_GRATE.get()) {
				world.setBlock(BlockPos.containing(x, y, z), SuperiorstructuresModBlocks.COPPER_GRATE.get().defaultBlockState(), 3);
			} else if (blockstate.getBlock() == SuperiorstructuresModBlocks.WEATHERED_COPPER_GRATE.get() || blockstate.getBlock() == SuperiorstructuresModBlocks.WAXED_WEATHERED_COPPER_GRATE.get()) {
				world.setBlock(BlockPos.containing(x, y, z), SuperiorstructuresModBlocks.EXPOSED_COPPER_GRATE.get().defaultBlockState(), 3);
			} else if (blockstate.getBlock() == SuperiorstructuresModBlocks.OXIDIZED_COPPER_GRATE.get()) {
				world.setBlock(BlockPos.containing(x, y, z), SuperiorstructuresModBlocks.WEATHERED_COPPER_GRATE.get().defaultBlockState(), 3);
			}
			if (blockstate.getBlock() == SuperiorstructuresModBlocks.WAXED_CHISELED_COPPER.get()) {
				world.setBlock(BlockPos.containing(x, y, z), SuperiorstructuresModBlocks.CHISELED_COPPER.get().defaultBlockState(), 3);
			} else if (blockstate.getBlock() == SuperiorstructuresModBlocks.EXPOSED_CHISELED_COPPER.get() || blockstate.getBlock() == SuperiorstructuresModBlocks.WAXED_EXPOSED_CHISELED_COPPER.get()) {
				world.setBlock(BlockPos.containing(x, y, z), SuperiorstructuresModBlocks.CHISELED_COPPER.get().defaultBlockState(), 3);
			} else if (blockstate.getBlock() == SuperiorstructuresModBlocks.WEATHERED_CHISELED_COPPER.get() || blockstate.getBlock() == SuperiorstructuresModBlocks.WAXED_WEATHERED_CHISELED_COPPER.get()) {
				world.setBlock(BlockPos.containing(x, y, z), SuperiorstructuresModBlocks.EXPOSED_CHISELED_COPPER.get().defaultBlockState(), 3);
			} else if (blockstate.getBlock() == SuperiorstructuresModBlocks.OXIDIZED_CHISELED_COPPER.get()) {
				world.setBlock(BlockPos.containing(x, y, z), SuperiorstructuresModBlocks.WEATHERED_CHISELED_COPPER.get().defaultBlockState(), 3);
			}
			if (blockstate.getBlock() == SuperiorstructuresModBlocks.WAXED_COPPER_BULB.get()) {
				world.setBlock(BlockPos.containing(x, y, z), SuperiorstructuresModBlocks.COPPER_BULB.get().defaultBlockState(), 3);
			} else if (blockstate.getBlock() == SuperiorstructuresModBlocks.WAXED_COPPER_BULB_LIT.get()) {
				world.setBlock(BlockPos.containing(x, y, z), SuperiorstructuresModBlocks.COPPER_BULB_LIT.get().defaultBlockState(), 3);
			} else if (blockstate.getBlock() == SuperiorstructuresModBlocks.WAXED_EXPOSED_COPPER_BULB.get() || blockstate.getBlock() == SuperiorstructuresModBlocks.EXPOSED_COPPER_BULB.get()) {
				world.setBlock(BlockPos.containing(x, y, z), SuperiorstructuresModBlocks.COPPER_BULB.get().defaultBlockState(), 3);
			} else if (blockstate.getBlock() == SuperiorstructuresModBlocks.EXPOSED_COPPER_BULB_LIT.get() || blockstate.getBlock() == SuperiorstructuresModBlocks.WAXED_EXPOSED_COPPER_BULB_LIT.get()) {
				world.setBlock(BlockPos.containing(x, y, z), SuperiorstructuresModBlocks.COPPER_BULB_LIT.get().defaultBlockState(), 3);
			} else if (blockstate.getBlock() == SuperiorstructuresModBlocks.WAXED_WEATHERED_COPPER_BULB.get() || blockstate.getBlock() == SuperiorstructuresModBlocks.WEATHERED_COPPER_BULB.get()) {
				world.setBlock(BlockPos.containing(x, y, z), SuperiorstructuresModBlocks.WAXED_EXPOSED_COPPER_BULB.get().defaultBlockState(), 3);
			} else if (blockstate.getBlock() == SuperiorstructuresModBlocks.WEATHERED_COPPER_BULB_LIT.get() || blockstate.getBlock() == SuperiorstructuresModBlocks.WAXED_WEATHERED_COPPER_BULB_LIT.get()) {
				world.setBlock(BlockPos.containing(x, y, z), SuperiorstructuresModBlocks.WAXED_EXPOSED_COPPER_BULB_LIT.get().defaultBlockState(), 3);
			} else if (blockstate.getBlock() == SuperiorstructuresModBlocks.OXIDIZED_COPPER_BULB.get()) {
				world.setBlock(BlockPos.containing(x, y, z), SuperiorstructuresModBlocks.WEATHERED_COPPER_BULB.get().defaultBlockState(), 3);
			} else if (blockstate.getBlock() == SuperiorstructuresModBlocks.OXIDIZED_COPPER_BULB_LIT.get()) {
				world.setBlock(BlockPos.containing(x, y, z), SuperiorstructuresModBlocks.WEATHERED_COPPER_BULB_LIT.get().defaultBlockState(), 3);
			}
			if (blockstate.getBlock() == SuperiorstructuresModBlocks.WAXED_COPPER_TRAPDOOR.get()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = SuperiorstructuresModBlocks.COPPER_TRAPDOOR.get().defaultBlockState();
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
			} else if (blockstate.getBlock() == SuperiorstructuresModBlocks.EXPOSED_COPPER_TRAPDOOR.get() || blockstate.getBlock() == SuperiorstructuresModBlocks.WAXED_EXPOSED_COPPER_TRAPDOOR.get()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = SuperiorstructuresModBlocks.COPPER_TRAPDOOR.get().defaultBlockState();
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
			} else if (blockstate.getBlock() == SuperiorstructuresModBlocks.WEATHERED_COPPER_TRAPDOOR.get() || blockstate.getBlock() == SuperiorstructuresModBlocks.WAXED_WEATHERED_COPPER_TRAPDOOR.get()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = SuperiorstructuresModBlocks.EXPOSED_COPPER_TRAPDOOR.get().defaultBlockState();
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
			} else if (blockstate.getBlock() == SuperiorstructuresModBlocks.OXIDIZED_COPPER_TRAPDOOR.get()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = SuperiorstructuresModBlocks.WEATHERED_COPPER_TRAPDOOR.get().defaultBlockState();
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
	}
}
