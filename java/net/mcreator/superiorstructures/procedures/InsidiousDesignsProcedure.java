package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.ItemTags;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.AdvancementHolder;

import net.mcreator.superiorstructures.init.SuperiorstructuresModItems;
import net.mcreator.superiorstructures.init.SuperiorstructuresModBlocks;

import java.util.function.Supplier;
import java.util.Map;

public class InsidiousDesignsProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean containsspecial = false;
		boolean strange = false;
		double s3 = 0;
		double pointvalue = 0;
		double elementalcount = 0;
		double s1 = 0;
		double s2 = 0;
		String element = "";
		if (new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount(0) > 0 && new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount(1) > 0 && new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount(2) > 0
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
						.is(ItemTags.create(ResourceLocation.parse("forge:tinkering_ingredients")))
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
						.is(ItemTags.create(ResourceLocation.parse("forge:tinkering_ingredients")))
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY)
						.is(ItemTags.create(ResourceLocation.parse("forge:tinkering_ingredients")))
				&& ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
						.is(ItemTags.create(ResourceLocation.parse("forge:machinery")))
						|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
								.is(ItemTags.create(ResourceLocation.parse("forge:machinery")))
						|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY)
								.is(ItemTags.create(ResourceLocation.parse("forge:machinery"))))) {
			elementalcount = 0;
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
					.is(ItemTags.create(ResourceLocation.parse("forge:special_ingredients")))
					|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
							.is(ItemTags.create(ResourceLocation.parse("forge:special_ingredients")))
					|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY)
							.is(ItemTags.create(ResourceLocation.parse("forge:special_ingredients")))) {
				containsspecial = true;
			} else {
				containsspecial = false;
			}
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
					.getItem() == SuperiorstructuresModItems.STRANGE_MACHINERY.get()
					|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
							.getItem() == SuperiorstructuresModItems.STRANGE_MACHINERY.get()
					|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY)
							.getItem() == SuperiorstructuresModItems.STRANGE_MACHINERY.get()) {
				strange = true;
			} else {
				strange = false;
			}
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
					.is(ItemTags.create(ResourceLocation.parse("forge:elemental_ingredients")))) {
				elementalcount = elementalcount + 1;
				if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == Items.FIRE_CHARGE) {
					element = "fire";
				} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
						.getItem() == SuperiorstructuresModItems.LIGHTNING_CHARGE.get()) {
					element = "bolt";
				} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
						.getItem() == SuperiorstructuresModItems.FROST_CHARGE.get()) {
					element = "ice";
				}
			} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
					.is(ItemTags.create(ResourceLocation.parse("forge:elemental_ingredients")))) {
				elementalcount = elementalcount + 1;
				if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == Items.FIRE_CHARGE) {
					element = "fire";
				} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
						.getItem() == SuperiorstructuresModItems.LIGHTNING_CHARGE.get()) {
					element = "bolt";
				} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
						.getItem() == SuperiorstructuresModItems.FROST_CHARGE.get()) {
					element = "ice";
				}
			} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY)
					.is(ItemTags.create(ResourceLocation.parse("forge:elemental_ingredients")))) {
				elementalcount = elementalcount + 1;
				if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY).getItem() == Items.FIRE_CHARGE) {
					element = "fire";
				} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY)
						.getItem() == SuperiorstructuresModItems.LIGHTNING_CHARGE.get()) {
					element = "bolt";
				} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY)
						.getItem() == SuperiorstructuresModItems.FROST_CHARGE.get()) {
					element = "ice";
				}
			} else {
				element = "none";
			}
			if (elementalcount <= 1) {
				pointvalue = 0;
				if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == Items.COPPER_INGOT) {
					pointvalue = pointvalue + 1;
				} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == Items.IRON_INGOT) {
					pointvalue = pointvalue + 2;
				} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == Items.REDSTONE) {
					pointvalue = pointvalue + 2;
				} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == Items.GOLD_INGOT) {
					pointvalue = pointvalue + 3;
				} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == Items.DIAMOND) {
					pointvalue = pointvalue + 8;
				} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == Items.NETHERITE_INGOT) {
					pointvalue = pointvalue + 13;
				} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
						.getItem() == SuperiorstructuresModItems.BROKEN_MACHINERY.get()) {
					pointvalue = pointvalue + 5;
				} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
						.getItem() == SuperiorstructuresModItems.OLD_MACHINERY.get()) {
					pointvalue = pointvalue + 10;
				} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
						.getItem() == SuperiorstructuresModItems.GILDED_MACHINERY.get()) {
					pointvalue = pointvalue + 11;
				} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
						.getItem() == SuperiorstructuresModItems.ANCIENT_MACHINERY.get()) {
					pointvalue = pointvalue + 16;
				} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
						.getItem() == SuperiorstructuresModItems.POWER_CELL.get()
						|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
								.getItem() == SuperiorstructuresModItems.EMPTY_POWER_CELL.get()) {
					pointvalue = pointvalue + 6;
				} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
						.getItem() == SuperiorstructuresModBlocks.POWER_CORE.get().asItem()) {
					pointvalue = pointvalue + 12;
				} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == Items.ENDER_PEARL) {
					pointvalue = pointvalue + 5;
				} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
						.getItem() == SuperiorstructuresModItems.STRANGE_MACHINERY.get()) {
					pointvalue = pointvalue + 6;
				} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == Items.AMETHYST_SHARD) {
					pointvalue = pointvalue + 3;
				}
				if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == Items.COPPER_INGOT) {
					pointvalue = pointvalue + 1;
				} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == Items.IRON_INGOT) {
					pointvalue = pointvalue + 2;
				} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == Items.REDSTONE) {
					pointvalue = pointvalue + 2;
				} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == Items.GOLD_INGOT) {
					pointvalue = pointvalue + 3;
				} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == Items.DIAMOND) {
					pointvalue = pointvalue + 8;
				} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == Items.NETHERITE_INGOT) {
					pointvalue = pointvalue + 13;
				} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
						.getItem() == SuperiorstructuresModItems.BROKEN_MACHINERY.get()) {
					pointvalue = pointvalue + 5;
				} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
						.getItem() == SuperiorstructuresModItems.OLD_MACHINERY.get()) {
					pointvalue = pointvalue + 10;
				} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
						.getItem() == SuperiorstructuresModItems.GILDED_MACHINERY.get()) {
					pointvalue = pointvalue + 11;
				} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
						.getItem() == SuperiorstructuresModItems.ANCIENT_MACHINERY.get()) {
					pointvalue = pointvalue + 16;
				} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
						.getItem() == SuperiorstructuresModItems.POWER_CELL.get()
						|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
								.getItem() == SuperiorstructuresModItems.EMPTY_POWER_CELL.get()) {
					pointvalue = pointvalue + 6;
				} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
						.getItem() == SuperiorstructuresModBlocks.POWER_CORE.get().asItem()) {
					pointvalue = pointvalue + 12;
				} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == Items.ENDER_PEARL) {
					pointvalue = pointvalue + 5;
				} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
						.getItem() == SuperiorstructuresModItems.STRANGE_MACHINERY.get()) {
					pointvalue = pointvalue + 6;
				} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == Items.AMETHYST_SHARD) {
					pointvalue = pointvalue + 3;
				}
				if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY).getItem() == Items.COPPER_INGOT) {
					pointvalue = pointvalue + 1;
				} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY).getItem() == Items.IRON_INGOT) {
					pointvalue = pointvalue + 2;
				} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY).getItem() == Items.REDSTONE) {
					pointvalue = pointvalue + 2;
				} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY).getItem() == Items.GOLD_INGOT) {
					pointvalue = pointvalue + 3;
				} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY).getItem() == Items.DIAMOND) {
					pointvalue = pointvalue + 8;
				} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY).getItem() == Items.NETHERITE_INGOT) {
					pointvalue = pointvalue + 13;
				} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY)
						.getItem() == SuperiorstructuresModItems.BROKEN_MACHINERY.get()) {
					pointvalue = pointvalue + 5;
				} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY)
						.getItem() == SuperiorstructuresModItems.OLD_MACHINERY.get()) {
					pointvalue = pointvalue + 10;
				} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY)
						.getItem() == SuperiorstructuresModItems.GILDED_MACHINERY.get()) {
					pointvalue = pointvalue + 11;
				} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY)
						.getItem() == SuperiorstructuresModItems.ANCIENT_MACHINERY.get()) {
					pointvalue = pointvalue + 16;
				} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY)
						.getItem() == SuperiorstructuresModItems.POWER_CELL.get()
						|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY)
								.getItem() == SuperiorstructuresModItems.EMPTY_POWER_CELL.get()) {
					pointvalue = pointvalue + 6;
				} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY)
						.getItem() == SuperiorstructuresModBlocks.POWER_CORE.get().asItem()) {
					pointvalue = pointvalue + 12;
				} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY).getItem() == Items.ENDER_PEARL) {
					pointvalue = pointvalue + 5;
				} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY)
						.getItem() == SuperiorstructuresModItems.STRANGE_MACHINERY.get()) {
					pointvalue = pointvalue + 6;
				} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY).getItem() == Items.AMETHYST_SHARD) {
					pointvalue = pointvalue + 3;
				}
				if (pointvalue > 1 && pointvalue <= 10) {
					if (new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(3) == 0 && new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(4) == 0 && new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(5) == 0 && (entity instanceof Player _plr ? _plr.experienceLevel : 0) >= 1) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.smithing_table.use")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.smithing_table.use")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
						if (entity instanceof ServerPlayer _player) {
							AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("superiorstructures:devious_machinations"));
							if (_adv != null) {
								AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
								if (!_ap.isDone()) {
									for (String criteria : _ap.getRemainingCriteria())
										_player.getAdvancements().award(_adv, criteria);
								}
							}
						}
						if (entity instanceof Player _player)
							_player.giveExperienceLevels(-(1));
						if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
							((Slot) _slots.get(0)).remove(1);
							_player.containerMenu.broadcastChanges();
						}
						if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
							((Slot) _slots.get(1)).remove(1);
							_player.containerMenu.broadcastChanges();
						}
						if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
							((Slot) _slots.get(2)).remove(1);
							_player.containerMenu.broadcastChanges();
						}
						if ((element).equals("fire")) {
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot1FireProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(3)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot1FireProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(4)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot1FireProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(5)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
						} else if ((element).equals("bolt")) {
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot1BoltProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(3)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot1BoltProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(4)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot1BoltProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(5)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
						} else if ((element).equals("ice")) {
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot1FrostProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(3)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot1FrostProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(4)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot1FrostProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(5)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
						} else if (strange == true) {
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot1StrangeProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(3)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot1StrangeProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(4)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot1StrangeProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(5)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
						} else if (containsspecial == true) {
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot1SpecialProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(3)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot1SpecialProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(4)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot1SpecialProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(5)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
						} else {
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot1NormalProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(3)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot1NormalProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(4)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot1NormalProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(5)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
						}
					}
				} else if (pointvalue > 10 && pointvalue <= 18) {
					if (new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(3) == 0 && new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(4) == 0 && new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(5) == 0 && (entity instanceof Player _plr ? _plr.experienceLevel : 0) >= 2) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.smithing_table.use")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.smithing_table.use")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
						if (entity instanceof ServerPlayer _player) {
							AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("superiorstructures:devious_machinations"));
							if (_adv != null) {
								AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
								if (!_ap.isDone()) {
									for (String criteria : _ap.getRemainingCriteria())
										_player.getAdvancements().award(_adv, criteria);
								}
							}
						}
						if (entity instanceof Player _player)
							_player.giveExperienceLevels(-(2));
						if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
							((Slot) _slots.get(0)).remove(1);
							_player.containerMenu.broadcastChanges();
						}
						if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
							((Slot) _slots.get(1)).remove(1);
							_player.containerMenu.broadcastChanges();
						}
						if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
							((Slot) _slots.get(2)).remove(1);
							_player.containerMenu.broadcastChanges();
						}
						if ((element).equals("fire")) {
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot2FireProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(3)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot2FireProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(4)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot2FireProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(5)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
						} else if ((element).equals("bolt")) {
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot2BoltProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(3)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot2BoltProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(4)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot2BoltProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(5)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
						} else if ((element).equals("ice")) {
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot2FrostProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(3)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot2FrostProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(4)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot2FrostProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(5)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
						} else if (strange == true) {
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot2StrangeProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(3)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot2StrangeProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(4)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot2StrangeProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(5)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
						} else if (containsspecial == true) {
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot2SpecialProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(3)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot2SpecialProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(4)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot2SpecialProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(5)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
						} else {
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot2NormalProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(3)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot2NormalProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(4)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot2NormalProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(5)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
						}
					}
				} else if (pointvalue > 18 && pointvalue <= 26) {
					if (new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(3) == 0 && new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(4) == 0 && new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(5) == 0 && (entity instanceof Player _plr ? _plr.experienceLevel : 0) >= 4) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.smithing_table.use")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.smithing_table.use")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
						if (entity instanceof Player _player)
							_player.giveExperienceLevels(-(4));
						if (entity instanceof ServerPlayer _player) {
							AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("superiorstructures:devious_machinations"));
							if (_adv != null) {
								AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
								if (!_ap.isDone()) {
									for (String criteria : _ap.getRemainingCriteria())
										_player.getAdvancements().award(_adv, criteria);
								}
							}
						}
						if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
							((Slot) _slots.get(0)).remove(1);
							_player.containerMenu.broadcastChanges();
						}
						if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
							((Slot) _slots.get(1)).remove(1);
							_player.containerMenu.broadcastChanges();
						}
						if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
							((Slot) _slots.get(2)).remove(1);
							_player.containerMenu.broadcastChanges();
						}
						if ((element).equals("fire")) {
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot3FireProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(3)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot3FireProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(4)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot3FireProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(5)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
						} else if ((element).equals("bolt")) {
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot3BoltProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(3)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot3BoltProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(4)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot3BoltProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(5)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
						} else if ((element).equals("ice")) {
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot3FrostProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(3)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot3FrostProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(4)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot3FrostProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(5)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
						} else if (strange == true) {
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot3StrangeProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(3)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot3StrangeProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(4)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot3StrangeProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(5)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
						} else if (containsspecial == true) {
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot3SpecialProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(3)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot3SpecialProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(4)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot3SpecialProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(5)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
						} else {
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot3NormalProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(3)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot3NormalProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(4)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot3NormalProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(5)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
						}
					}
				} else if (pointvalue > 26 && pointvalue <= 30) {
					if (new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(3) == 0 && new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(4) == 0 && new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(5) == 0 && (entity instanceof Player _plr ? _plr.experienceLevel : 0) >= 8) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.smithing_table.use")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.smithing_table.use")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
						if (entity instanceof ServerPlayer _player) {
							AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("superiorstructures:devious_machinations"));
							if (_adv != null) {
								AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
								if (!_ap.isDone()) {
									for (String criteria : _ap.getRemainingCriteria())
										_player.getAdvancements().award(_adv, criteria);
								}
							}
						}
						if (entity instanceof Player _player)
							_player.giveExperienceLevels(-(8));
						if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
							((Slot) _slots.get(0)).remove(1);
							_player.containerMenu.broadcastChanges();
						}
						if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
							((Slot) _slots.get(1)).remove(1);
							_player.containerMenu.broadcastChanges();
						}
						if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
							((Slot) _slots.get(2)).remove(1);
							_player.containerMenu.broadcastChanges();
						}
						if ((element).equals("fire")) {
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot4FireProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(3)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot4FireProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(4)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot4FireProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(5)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
						} else if ((element).equals("bolt")) {
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot4BoltProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(3)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot4BoltProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(4)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot4BoltProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(5)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
						} else if ((element).equals("ice")) {
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot4FrostProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(3)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot4FrostProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(4)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot4FrostProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(5)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
						} else if (strange == true) {
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot4StrangeProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(3)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot4StrangeProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(4)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot4StrangeProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(5)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
						} else if (containsspecial == true) {
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot4SpecialProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(3)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot4SpecialProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(4)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot4SpecialProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(5)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
						} else {
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot4NormalProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(3)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot4NormalProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(4)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot4NormalProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(5)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
						}
					}
				} else if (pointvalue > 31) {
					if (new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(3) == 0 && new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(4) == 0 && new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(5) == 0 && (entity instanceof Player _plr ? _plr.experienceLevel : 0) >= 8) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.smithing_table.use")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.smithing_table.use")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
						if (entity instanceof ServerPlayer _player) {
							AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("superiorstructures:devious_machinations"));
							if (_adv != null) {
								AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
								if (!_ap.isDone()) {
									for (String criteria : _ap.getRemainingCriteria())
										_player.getAdvancements().award(_adv, criteria);
								}
							}
						}
						if (entity instanceof ServerPlayer _player) {
							AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("superiorstructures:an_engenious_contraption"));
							if (_adv != null) {
								AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
								if (!_ap.isDone()) {
									for (String criteria : _ap.getRemainingCriteria())
										_player.getAdvancements().award(_adv, criteria);
								}
							}
						}
						if (entity instanceof Player _player)
							_player.giveExperienceLevels(-(16));
						if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
							((Slot) _slots.get(0)).remove(1);
							_player.containerMenu.broadcastChanges();
						}
						if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
							((Slot) _slots.get(1)).remove(1);
							_player.containerMenu.broadcastChanges();
						}
						if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
							((Slot) _slots.get(2)).remove(1);
							_player.containerMenu.broadcastChanges();
						}
						if ((element).equals("fire")) {
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot5FireProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(3)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot5FireProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(4)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot5FireProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(5)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
						} else if ((element).equals("bolt")) {
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot5BoltProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(3)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot5BoltProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(4)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot5BoltProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(5)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
						} else if ((element).equals("ice")) {
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot5FrostProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(3)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot5FrostProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(4)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot5FrostProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(5)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
						} else if (strange == true) {
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot5StrangeProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(3)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot5StrangeProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(4)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot5StrangeProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(5)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
						} else if (containsspecial == true) {
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot5SpecialProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(3)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot5SpecialProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(4)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot5SpecialProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(5)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
						} else {
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot5NormalProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(3)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot5NormalProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(4)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = ArtificeryLoot5NormalProcedure.execute().copy();
								_setstack.setCount(1);
								((Slot) _slots.get(5)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
						}
					}
				}
			}
		}
	}
}
