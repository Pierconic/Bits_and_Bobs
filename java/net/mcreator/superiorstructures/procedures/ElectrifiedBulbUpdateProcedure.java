package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.BlockTags;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModMobEffects;
import net.mcreator.superiorstructures.init.SuperiorstructuresModBlocks;
import net.mcreator.superiorstructures.entity.SparkInstigatorEntity;
import net.mcreator.superiorstructures.entity.DoubleSparkInstigatorEntity;

import java.util.List;
import java.util.Comparator;

public class ElectrifiedBulbUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		boolean host = false;
		double iterator = 0;
		double ox = 0;
		double oy = 0;
		double oz = 0;
		double insulation = 0;
		host = false;
		if (!(world.getBlockState(BlockPos.containing(x, y + 1, z)).canOcclude() && world.getBlockState(BlockPos.containing(x, y - 1, z)).canOcclude() && world.getBlockState(BlockPos.containing(x - 1, y, z)).canOcclude()
				&& world.getBlockState(BlockPos.containing(x + 1, y, z)).canOcclude() && world.getBlockState(BlockPos.containing(x, y, z + 1)).canOcclude() && world.getBlockState(BlockPos.containing(x, y, z - 1)).canOcclude())) {
			{
				final Vec3 _center = new Vec3((x + 0.5), (y + 0.5), (z + 0.5));
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(1.2 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (!(entityiterator instanceof Player _plr ? _plr.getAbilities().instabuild : false) && entityiterator instanceof LivingEntity) {
						if (entityiterator instanceof SparkInstigatorEntity || entityiterator instanceof DoubleSparkInstigatorEntity) {
							host = true;
						}
						if (Math.round(entityiterator.getY()) > y) {
							if (!((entityiterator instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).is(ItemTags.create(ResourceLocation.parse("minecraft:freeze_immune_wearables"))))) {
								if ((entityiterator instanceof LivingEntity _livEnt && _livEnt.hasEffect(SuperiorstructuresModMobEffects.SHOCK) ? _livEnt.getEffect(SuperiorstructuresModMobEffects.SHOCK).getDuration() : 0) < 55) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
										_entity.addEffect(new MobEffectInstance(SuperiorstructuresModMobEffects.SHOCK, 70, 1, false, false));
								}
								if ((entityiterator instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getCount() > 0) {
									host = true;
								}
							}
						} else if (Math.round(entityiterator.getY()) < y) {
							if (!((entityiterator instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).is(ItemTags.create(ResourceLocation.parse("minecraft:freeze_immune_wearables"))))) {
								if ((entityiterator instanceof LivingEntity _livEnt && _livEnt.hasEffect(SuperiorstructuresModMobEffects.SHOCK) ? _livEnt.getEffect(SuperiorstructuresModMobEffects.SHOCK).getDuration() : 0) < 55) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
										_entity.addEffect(new MobEffectInstance(SuperiorstructuresModMobEffects.SHOCK, 70, 1, false, false));
								}
								if ((entityiterator instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getCount() > 0) {
									host = true;
								}
							}
						} else if (!((entityiterator instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).is(ItemTags.create(ResourceLocation.parse("minecraft:freeze_immune_wearables")))
								|| (entityiterator instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).is(ItemTags.create(ResourceLocation.parse("minecraft:freeze_immune_wearables"))))) {
							if ((entityiterator instanceof LivingEntity _livEnt && _livEnt.hasEffect(SuperiorstructuresModMobEffects.SHOCK) ? _livEnt.getEffect(SuperiorstructuresModMobEffects.SHOCK).getDuration() : 0) < 55) {
								if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(SuperiorstructuresModMobEffects.SHOCK, 70, 1, false, false));
							}
							if ((entityiterator instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getCount() > 0
									|| (entityiterator instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getCount() > 0) {
								host = true;
							}
						}
					}
				}
			}
		}
		if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip40 ? blockstate.getValue(_getip40) : -1) == 16) {
			if (!((world.getBlockState(BlockPos.containing(x, y + 1, z))).is(BlockTags.create(ResourceLocation.parse("forge:electric")))
					|| (world.getBlockState(BlockPos.containing(x, y - 1, z))).is(BlockTags.create(ResourceLocation.parse("forge:electric")))
					|| (world.getBlockState(BlockPos.containing(x, y, z - 1))).is(BlockTags.create(ResourceLocation.parse("forge:electric")))
					|| (world.getBlockState(BlockPos.containing(x, y, z + 1))).is(BlockTags.create(ResourceLocation.parse("forge:electric")))
					|| (world.getBlockState(BlockPos.containing(x + 1, y, z))).is(BlockTags.create(ResourceLocation.parse("forge:electric")))
					|| (world.getBlockState(BlockPos.containing(x - 1, y, z))).is(BlockTags.create(ResourceLocation.parse("forge:electric"))))) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = Blocks.COPPER_BULB.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Property<?> _propertyOld : _bso.getProperties()) {
						Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
						if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
							try {
								_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
							} catch (Exception e) {
							}
					}
					BlockEntity _be = world.getBlockEntity(_bp);
					CompoundTag _bnbt = null;
					if (_be != null) {
						_bnbt = _be.saveWithFullMetadata(world.registryAccess());
						_be.setRemoved();
					}
					world.setBlock(_bp, _bs, 3);
					if (_bnbt != null) {
						_be = world.getBlockEntity(_bp);
						if (_be != null) {
							try {
								_be.loadWithComponents(_bnbt, world.registryAccess());
							} catch (Exception ignored) {
							}
						}
					}
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:block.copper_bulb.burst")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:block.copper_bulb.burst")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
		} else if (!(((world.getBlockState(BlockPos.containing(x, y + 1, z))).is(BlockTags.create(ResourceLocation.parse("forge:electric")))
				&& ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip58
						? (world.getBlockState(BlockPos.containing(x, y + 1, z))).getValue(_getip58)
						: -1) == (blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip60 ? blockstate.getValue(_getip60) : -1) - 1
				|| (world.getBlockState(BlockPos.containing(x, y - 1, z))).is(BlockTags.create(ResourceLocation.parse("forge:electric")))
						&& ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip64
								? (world.getBlockState(BlockPos.containing(x, y - 1, z))).getValue(_getip64)
								: -1) == (blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip66 ? blockstate.getValue(_getip66) : -1) - 1
				|| (world.getBlockState(BlockPos.containing(x, y, z - 1))).is(BlockTags.create(ResourceLocation.parse("forge:electric")))
						&& ((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip70
								? (world.getBlockState(BlockPos.containing(x, y, z - 1))).getValue(_getip70)
								: -1) == (blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip72 ? blockstate.getValue(_getip72) : -1) - 1
				|| (world.getBlockState(BlockPos.containing(x, y, z + 1))).is(BlockTags.create(ResourceLocation.parse("forge:electric")))
						&& ((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip76
								? (world.getBlockState(BlockPos.containing(x, y, z + 1))).getValue(_getip76)
								: -1) == (blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip78 ? blockstate.getValue(_getip78) : -1) - 1
				|| (world.getBlockState(BlockPos.containing(x + 1, y, z))).is(BlockTags.create(ResourceLocation.parse("forge:electric")))
						&& ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip82
								? (world.getBlockState(BlockPos.containing(x + 1, y, z))).getValue(_getip82)
								: -1) == (blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip84 ? blockstate.getValue(_getip84) : -1) - 1
				|| (world.getBlockState(BlockPos.containing(x - 1, y, z))).is(BlockTags.create(ResourceLocation.parse("forge:electric")))
						&& ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip88
								? (world.getBlockState(BlockPos.containing(x - 1, y, z))).getValue(_getip88)
								: -1) == (blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip90 ? blockstate.getValue(_getip90) : -1) - 1)
				&& !host)) {
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = Blocks.COPPER_BULB.defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Property<?> _propertyOld : _bso.getProperties()) {
					Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
					if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
						try {
							_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
						} catch (Exception e) {
						}
				}
				BlockEntity _be = world.getBlockEntity(_bp);
				CompoundTag _bnbt = null;
				if (_be != null) {
					_bnbt = _be.saveWithFullMetadata(world.registryAccess());
					_be.setRemoved();
				}
				world.setBlock(_bp, _bs, 3);
				if (_bnbt != null) {
					_be = world.getBlockEntity(_bp);
					if (_be != null) {
						try {
							_be.loadWithComponents(_bnbt, world.registryAccess());
						} catch (Exception ignored) {
						}
					}
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:block.copper_bulb.burst")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:block.copper_bulb.burst")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		} else {
			iterator = 0;
			for (int index0 = 0; index0 < 6; index0++) {
				if (iterator == 0) {
					ox = 1;
					oy = 0;
					oz = 0;
				} else if (iterator == 1) {
					ox = -1;
					oy = 0;
					oz = 0;
				} else if (iterator == 2) {
					ox = 0;
					oy = 1;
					oz = 0;
				} else if (iterator == 3) {
					ox = 0;
					oy = -1;
					oz = 0;
				} else if (iterator == 4) {
					ox = 0;
					oy = 0;
					oz = 1;
				} else {
					ox = 0;
					oy = 0;
					oz = -1;
				}
				if ((world.getBlockState(BlockPos.containing(x + ox, y + oy, z + oz))).is(BlockTags.create(ResourceLocation.parse("forge:electric")))
						&& !(((world.getBlockState(BlockPos.containing(x + ox, y + oy, z + oz))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip96
								? (world.getBlockState(BlockPos.containing(x + ox, y + oy, z + oz))).getValue(_getip96)
								: -1) == (blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip98 ? blockstate.getValue(_getip98) : -1) - 1)) {
					{
						int _value = (int) (16 - (blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip100 ? blockstate.getValue(_getip100) : -1) + 1);
						BlockPos _pos = BlockPos.containing(x + ox, y + oy, z + oz);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
				} else {
					if ((world.getBlockState(BlockPos.containing(x + ox, y + oy, z + oz))).is(BlockTags.create(ResourceLocation.parse("forge:copper_blocks")))) {
						{
							BlockPos _bp = BlockPos.containing(x + ox, y + oy, z + oz);
							BlockState _bs = (new Object() {
								public BlockState with(BlockState _bs, String _property, int _newValue) {
									Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
									return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
								}
							}.with(SuperiorstructuresModBlocks.SHOCKING_COPPER.get().defaultBlockState(), "blockstate",
									(int) (16 - (blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip105 ? blockstate.getValue(_getip105) : -1) + 1)));
							BlockState _bso = world.getBlockState(_bp);
							for (Property<?> _propertyOld : _bso.getProperties()) {
								Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
								if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
									try {
										_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
									} catch (Exception e) {
									}
							}
							BlockEntity _be = world.getBlockEntity(_bp);
							CompoundTag _bnbt = null;
							if (_be != null) {
								_bnbt = _be.saveWithFullMetadata(world.registryAccess());
								_be.setRemoved();
							}
							world.setBlock(_bp, _bs, 3);
							if (_bnbt != null) {
								_be = world.getBlockEntity(_bp);
								if (_be != null) {
									try {
										_be.loadWithComponents(_bnbt, world.registryAccess());
									} catch (Exception ignored) {
									}
								}
							}
						}
					} else if ((world.getBlockState(BlockPos.containing(x + ox, y + oy, z + oz))).is(BlockTags.create(ResourceLocation.parse("forge:chiseled_copper_blocks")))) {
						{
							BlockPos _bp = BlockPos.containing(x + ox, y + oy, z + oz);
							BlockState _bs = (new Object() {
								public BlockState with(BlockState _bs, String _property, int _newValue) {
									Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
									return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
								}
							}.with(SuperiorstructuresModBlocks.SHOCKING_CHISELED_COPPER.get().defaultBlockState(), "blockstate",
									(int) (16 - (blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip111 ? blockstate.getValue(_getip111) : -1) + 1)));
							BlockState _bso = world.getBlockState(_bp);
							for (Property<?> _propertyOld : _bso.getProperties()) {
								Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
								if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
									try {
										_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
									} catch (Exception e) {
									}
							}
							BlockEntity _be = world.getBlockEntity(_bp);
							CompoundTag _bnbt = null;
							if (_be != null) {
								_bnbt = _be.saveWithFullMetadata(world.registryAccess());
								_be.setRemoved();
							}
							world.setBlock(_bp, _bs, 3);
							if (_bnbt != null) {
								_be = world.getBlockEntity(_bp);
								if (_be != null) {
									try {
										_be.loadWithComponents(_bnbt, world.registryAccess());
									} catch (Exception ignored) {
									}
								}
							}
						}
					} else if ((world.getBlockState(BlockPos.containing(x + ox, y + oy, z + oz))).is(BlockTags.create(ResourceLocation.parse("forge:cut_copper")))) {
						{
							BlockPos _bp = BlockPos.containing(x + ox, y + oy, z + oz);
							BlockState _bs = (new Object() {
								public BlockState with(BlockState _bs, String _property, int _newValue) {
									Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
									return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
								}
							}.with(SuperiorstructuresModBlocks.SHOCKING_CUT_COPPER.get().defaultBlockState(), "blockstate",
									(int) (16 - (blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip117 ? blockstate.getValue(_getip117) : -1) + 1)));
							BlockState _bso = world.getBlockState(_bp);
							for (Property<?> _propertyOld : _bso.getProperties()) {
								Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
								if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
									try {
										_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
									} catch (Exception e) {
									}
							}
							BlockEntity _be = world.getBlockEntity(_bp);
							CompoundTag _bnbt = null;
							if (_be != null) {
								_bnbt = _be.saveWithFullMetadata(world.registryAccess());
								_be.setRemoved();
							}
							world.setBlock(_bp, _bs, 3);
							if (_bnbt != null) {
								_be = world.getBlockEntity(_bp);
								if (_be != null) {
									try {
										_be.loadWithComponents(_bnbt, world.registryAccess());
									} catch (Exception ignored) {
									}
								}
							}
						}
					} else if ((world.getBlockState(BlockPos.containing(x + ox, y + oy, z + oz))).is(BlockTags.create(ResourceLocation.parse("forge:copper_grates")))) {
						{
							BlockPos _bp = BlockPos.containing(x + ox, y + oy, z + oz);
							BlockState _bs = (new Object() {
								public BlockState with(BlockState _bs, String _property, int _newValue) {
									Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
									return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
								}
							}.with(SuperiorstructuresModBlocks.SHOCKING_COPPER_GRATE.get().defaultBlockState(), "blockstate",
									(int) (16 - (blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip123 ? blockstate.getValue(_getip123) : -1) + 1)));
							BlockState _bso = world.getBlockState(_bp);
							for (Property<?> _propertyOld : _bso.getProperties()) {
								Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
								if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
									try {
										_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
									} catch (Exception e) {
									}
							}
							BlockEntity _be = world.getBlockEntity(_bp);
							CompoundTag _bnbt = null;
							if (_be != null) {
								_bnbt = _be.saveWithFullMetadata(world.registryAccess());
								_be.setRemoved();
							}
							world.setBlock(_bp, _bs, 3);
							if (_bnbt != null) {
								_be = world.getBlockEntity(_bp);
								if (_be != null) {
									try {
										_be.loadWithComponents(_bnbt, world.registryAccess());
									} catch (Exception ignored) {
									}
								}
							}
						}
					} else if ((world.getBlockState(BlockPos.containing(x + ox, y + oy, z + oz))).is(BlockTags.create(ResourceLocation.parse("forge:copper_slabs")))) {
						{
							BlockPos _bp = BlockPos.containing(x + ox, y + oy, z + oz);
							BlockState _bs = SuperiorstructuresModBlocks.SHOCKING_CUT_COPPER_SLAB.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Property<?> _propertyOld : _bso.getProperties()) {
								Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
								if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
									try {
										_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
									} catch (Exception e) {
									}
							}
							BlockEntity _be = world.getBlockEntity(_bp);
							CompoundTag _bnbt = null;
							if (_be != null) {
								_bnbt = _be.saveWithFullMetadata(world.registryAccess());
								_be.setRemoved();
							}
							world.setBlock(_bp, _bs, 3);
							if (_bnbt != null) {
								_be = world.getBlockEntity(_bp);
								if (_be != null) {
									try {
										_be.loadWithComponents(_bnbt, world.registryAccess());
									} catch (Exception ignored) {
									}
								}
							}
						}
					} else if ((world.getBlockState(BlockPos.containing(x + ox, y + oy, z + oz))).is(BlockTags.create(ResourceLocation.parse("forge:copper_stairs")))) {
						{
							BlockPos _bp = BlockPos.containing(x + ox, y + oy, z + oz);
							BlockState _bs = SuperiorstructuresModBlocks.SHOCKING_CUT_COPPER_STAIRS.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Property<?> _propertyOld : _bso.getProperties()) {
								Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
								if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
									try {
										_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
									} catch (Exception e) {
									}
							}
							BlockEntity _be = world.getBlockEntity(_bp);
							CompoundTag _bnbt = null;
							if (_be != null) {
								_bnbt = _be.saveWithFullMetadata(world.registryAccess());
								_be.setRemoved();
							}
							world.setBlock(_bp, _bs, 3);
							if (_bnbt != null) {
								_be = world.getBlockEntity(_bp);
								if (_be != null) {
									try {
										_be.loadWithComponents(_bnbt, world.registryAccess());
									} catch (Exception ignored) {
									}
								}
							}
						}
					} else if ((world.getBlockState(BlockPos.containing(x + ox, y + oy, z + oz))).getBlock() == SuperiorstructuresModBlocks.FAKE_IRON.get()
							|| (world.getBlockState(BlockPos.containing(x + ox, y + oy, z + oz))).getBlock() == Blocks.IRON_BLOCK) {
						{
							BlockPos _bp = BlockPos.containing(x + ox, y + oy, z + oz);
							BlockState _bs = (new Object() {
								public BlockState with(BlockState _bs, String _property, int _newValue) {
									Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
									return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
								}
							}.with(SuperiorstructuresModBlocks.SHOCKING_IRON_BLOCK.get().defaultBlockState(), "blockstate",
									(int) (16 - (blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip137 ? blockstate.getValue(_getip137) : -1) + 1)));
							BlockState _bso = world.getBlockState(_bp);
							for (Property<?> _propertyOld : _bso.getProperties()) {
								Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
								if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
									try {
										_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
									} catch (Exception e) {
									}
							}
							BlockEntity _be = world.getBlockEntity(_bp);
							CompoundTag _bnbt = null;
							if (_be != null) {
								_bnbt = _be.saveWithFullMetadata(world.registryAccess());
								_be.setRemoved();
							}
							world.setBlock(_bp, _bs, 3);
							if (_bnbt != null) {
								_be = world.getBlockEntity(_bp);
								if (_be != null) {
									try {
										_be.loadWithComponents(_bnbt, world.registryAccess());
									} catch (Exception ignored) {
									}
								}
							}
						}
					} else if ((world.getBlockState(BlockPos.containing(x + ox, y + oy, z + oz))).getBlock() == Blocks.RAW_IRON_BLOCK) {
						{
							BlockPos _bp = BlockPos.containing(x + ox, y + oy, z + oz);
							BlockState _bs = (new Object() {
								public BlockState with(BlockState _bs, String _property, int _newValue) {
									Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
									return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
								}
							}.with(SuperiorstructuresModBlocks.SHOCKING_RAW_IRON.get().defaultBlockState(), "blockstate",
									(int) (16 - (blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip143 ? blockstate.getValue(_getip143) : -1) + 1)));
							BlockState _bso = world.getBlockState(_bp);
							for (Property<?> _propertyOld : _bso.getProperties()) {
								Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
								if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
									try {
										_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
									} catch (Exception e) {
									}
							}
							BlockEntity _be = world.getBlockEntity(_bp);
							CompoundTag _bnbt = null;
							if (_be != null) {
								_bnbt = _be.saveWithFullMetadata(world.registryAccess());
								_be.setRemoved();
							}
							world.setBlock(_bp, _bs, 3);
							if (_bnbt != null) {
								_be = world.getBlockEntity(_bp);
								if (_be != null) {
									try {
										_be.loadWithComponents(_bnbt, world.registryAccess());
									} catch (Exception ignored) {
									}
								}
							}
						}
					}
				}
				iterator = iterator + 1;
			}
		}
	}
}
