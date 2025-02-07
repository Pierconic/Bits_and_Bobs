package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.network.SuperiorstructuresModVariables;
import net.mcreator.superiorstructures.init.SuperiorstructuresModItems;

public class BoosteringProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double sy = 0;
		double power = 0;
		power = 0.8;
		if (!entity.onGround() && !(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false) && entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).BoostJumps > 0) {
			if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == SuperiorstructuresModItems.PHASE_CHESTPLATE.get()) {
				sy = 0;
				if (!entity.isShiftKeyDown() && !((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.NETHER && y > 120)) {
					if (world.getBlockState(BlockPos.containing(x, y + 6, z)).canOcclude()) {
						sy = sy + 1;
					}
					if (world.getBlockState(BlockPos.containing(x, y + 7, z)).canOcclude()) {
						sy = sy + 1;
					}
					if (world.getBlockState(BlockPos.containing(x, y + 8, z)).canOcclude()) {
						sy = sy + 1;
					}
					{
						SuperiorstructuresModVariables.PlayerVariables _vars = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES);
						_vars.BoostJumps = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).BoostJumps - 1;
						_vars.syncPlayerVariables(entity);
					}
					{
						Entity _ent = entity;
						_ent.teleportTo(x, (y + Mth.nextInt(RandomSource.create(), 6, 8) + sy), z);
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport(x, (y + Mth.nextInt(RandomSource.create(), 6, 8) + sy), z, _ent.getYRot(), _ent.getXRot());
					}
					entity.fallDistance = 0;
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.chorus_fruit.teleport")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.chorus_fruit.teleport")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.PORTAL, x, y, z, 16, 0.2, 0.2, 0.2, 0.2);
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.PORTAL, x, (y + 3), z, 16, 0.2, 0.2, 0.2, 0.2);
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.PORTAL, x, (y + 6), z, 16, 0.2, 0.2, 0.2, 0.2);
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.PORTAL, x, (y + 9), z, 16, 0.2, 0.2, 0.2, 0.2);
				} else if (!((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.NETHER && y < 9)
						&& !((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.OVERWORLD && y < -57)) {
					if (world.getBlockState(BlockPos.containing(x, y - 6, z)).canOcclude()) {
						sy = sy + 1;
					}
					if (world.getBlockState(BlockPos.containing(x, y - 7, z)).canOcclude()) {
						sy = sy + 1;
					}
					if (world.getBlockState(BlockPos.containing(x, y - 8, z)).canOcclude()) {
						sy = sy + 1;
					}
					{
						SuperiorstructuresModVariables.PlayerVariables _vars = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES);
						_vars.BoostJumps = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).BoostJumps - 1;
						_vars.syncPlayerVariables(entity);
					}
					{
						Entity _ent = entity;
						_ent.teleportTo(x, (y - Mth.nextInt(RandomSource.create(), 6, 8) + sy), z);
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport(x, (y - Mth.nextInt(RandomSource.create(), 6, 8) + sy), z, _ent.getYRot(), _ent.getXRot());
					}
					entity.fallDistance = 0;
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.chorus_fruit.teleport")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.chorus_fruit.teleport")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.PORTAL, x, y, z, 16, 0.2, 0.2, 0.2, 0.2);
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.PORTAL, x, (y - 3), z, 16, 0.2, 0.2, 0.2, 0.2);
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.PORTAL, x, (y - 6), z, 16, 0.2, 0.2, 0.2, 0.2);
				}
			} else {
				if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == Items.IRON_BOOTS
						|| (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == Items.NETHERITE_BOOTS) {
					power = power - 0.2;
				}
				if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == Items.IRON_LEGGINGS
						|| (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == Items.NETHERITE_LEGGINGS) {
					power = power - 0.2;
				}
				if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == Items.IRON_HELMET
						|| (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == Items.NETHERITE_HELMET) {
					power = power - 0.2;
				}
				if (entity instanceof LivingEntity _livEnt47 && _livEnt47.hasEffect(MobEffects.JUMP)) {
					power = power * 1.5;
				}
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == SuperiorstructuresModItems.TOTEM_OF_HURDLING.get()
						|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == SuperiorstructuresModItems.TOTEM_OF_HURDLING.get()) {
					power = power * 0.75;
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:boosted_jump")), SoundSource.NEUTRAL, (float) 0.7,
								(float) (1.3 - entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).BoostJumps * 0.2 + Mth.nextDouble(RandomSource.create(), -0.1, 0.1)));
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:boosted_jump")), SoundSource.NEUTRAL, (float) 0.7,
								(float) (1.3 - entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).BoostJumps * 0.2 + Mth.nextDouble(RandomSource.create(), -0.1, 0.1)), false);
					}
				}
				entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (entity.getDeltaMovement().y() + power), (entity.getDeltaMovement().z())));
				entity.fallDistance = 0;
				{
					final String _tagName = "charge";
					final double _tagValue = ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("charge")
							- 1);
					CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY), tag -> tag.putDouble(_tagName, _tagValue));
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.SOUL_FIRE_FLAME, x, y, z, 16, 0.2, 0.2, 0.2, 0.2);
				{
					SuperiorstructuresModVariables.PlayerVariables _vars = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES);
					_vars.BoostJumps = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).BoostJumps - 1;
					_vars.syncPlayerVariables(entity);
				}
			}
		}
	}
}
