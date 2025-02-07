package net.mcreator.superiorstructures.procedures;

import net.neoforged.neoforge.event.entity.living.LivingDamageEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModItems;

import javax.annotation.Nullable;

@EventBusSubscriber
public class AutomaticTeleportProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingDamageEvent.Post event) {
		if (event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity(), event.getOriginalDamage());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, double amount) {
		execute(null, world, x, y, z, entity, amount);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, double amount) {
		if (entity == null)
			return;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == SuperiorstructuresModItems.PHASE_HELMET.get() && amount > 2) {
			if (Math.random() < 0.5) {
				sx = x + Mth.nextInt(RandomSource.create(), 6, 8);
			} else {
				sx = x + Mth.nextInt(RandomSource.create(), -8, -6);
			}
			if (Math.random() < 0.5) {
				sz = z + Mth.nextInt(RandomSource.create(), 6, 8);
			} else {
				sz = z + Mth.nextInt(RandomSource.create(), -8, -6);
			}
			sy = 0;
			if (world.getBlockState(BlockPos.containing(sx, y - 1, sz)).canOcclude() && !world.getBlockState(BlockPos.containing(sx, y + 0, sz)).canOcclude() && !world.getBlockState(BlockPos.containing(sx, y + 1, sz)).canOcclude()) {
				sy = y + 0;
			} else if (world.getBlockState(BlockPos.containing(sx, y + 0, sz)).canOcclude() && !world.getBlockState(BlockPos.containing(sx, y + 1, sz)).canOcclude() && !world.getBlockState(BlockPos.containing(sx, y + 2, sz)).canOcclude()) {
				sy = y + 1;
			} else if (world.getBlockState(BlockPos.containing(sx, y + 1, sz)).canOcclude() && !world.getBlockState(BlockPos.containing(sx, y + 2, sz)).canOcclude() && !world.getBlockState(BlockPos.containing(sx, y + 3, sz)).canOcclude()) {
				sy = y + 2;
			} else if (world.getBlockState(BlockPos.containing(sx, y + 2, sz)).canOcclude() && !world.getBlockState(BlockPos.containing(sx, y + 3, sz)).canOcclude() && !world.getBlockState(BlockPos.containing(sx, y + 4, sz)).canOcclude()) {
				sy = y + 3;
			} else if (world.getBlockState(BlockPos.containing(sx, y + 3, sz)).canOcclude() && !world.getBlockState(BlockPos.containing(sx, y + 4, sz)).canOcclude() && !world.getBlockState(BlockPos.containing(sx, y + 5, sz)).canOcclude()) {
				sy = y + 4;
			} else if (world.getBlockState(BlockPos.containing(sx, y + 4, sz)).canOcclude() && !world.getBlockState(BlockPos.containing(sx, y + 5, sz)).canOcclude() && !world.getBlockState(BlockPos.containing(sx, y + 6, sz)).canOcclude()) {
				sy = y + 5;
			} else if (world.getBlockState(BlockPos.containing(sx, y + 5, sz)).canOcclude() && !world.getBlockState(BlockPos.containing(sx, y + 6, sz)).canOcclude() && !world.getBlockState(BlockPos.containing(sx, y + 7, sz)).canOcclude()) {
				sy = y + 6;
			} else if (world.getBlockState(BlockPos.containing(sx, y - 2, sz)).canOcclude() && !world.getBlockState(BlockPos.containing(sx, y - 1, sz)).canOcclude() && !world.getBlockState(BlockPos.containing(sx, y - 0, sz)).canOcclude()) {
				sy = y - 1;
			} else if (world.getBlockState(BlockPos.containing(sx, y - 3, sz)).canOcclude() && !world.getBlockState(BlockPos.containing(sx, y - 2, sz)).canOcclude() && !world.getBlockState(BlockPos.containing(sx, y - 1, sz)).canOcclude()) {
				sy = y - 2;
			} else if (world.getBlockState(BlockPos.containing(sx, y - 4, sz)).canOcclude() && !world.getBlockState(BlockPos.containing(sx, y - 3, sz)).canOcclude() && !world.getBlockState(BlockPos.containing(sx, y - 2, sz)).canOcclude()) {
				sy = y - 3;
			} else if (world.getBlockState(BlockPos.containing(sx, y - 5, sz)).canOcclude() && !world.getBlockState(BlockPos.containing(sx, y - 4, sz)).canOcclude() && !world.getBlockState(BlockPos.containing(sx, y - 3, sz)).canOcclude()) {
				sy = y - 4;
			} else if (world.getBlockState(BlockPos.containing(sx, y - 6, sz)).canOcclude() && !world.getBlockState(BlockPos.containing(sx, y - 5, sz)).canOcclude() && !world.getBlockState(BlockPos.containing(sx, y - 4, sz)).canOcclude()) {
				sy = y - 5;
			}
			if (!(sy == 0)) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:randomteleport")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:randomteleport")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.PORTAL, x, y, z, 18, 0.3, 0.3, 0.3, 0.3);
				{
					Entity _ent = entity;
					_ent.teleportTo(sx, sy, sz);
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport(sx, sy, sz, _ent.getYRot(), _ent.getXRot());
				}
			}
		}
	}
}
