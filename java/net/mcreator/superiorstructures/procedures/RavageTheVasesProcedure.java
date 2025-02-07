package net.mcreator.superiorstructures.procedures;

import net.neoforged.neoforge.event.level.BlockEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.BlockTags;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.AdvancementHolder;

import net.mcreator.superiorstructures.network.SuperiorstructuresModVariables;
import net.mcreator.superiorstructures.SuperiorstructuresMod;

import javax.annotation.Nullable;

@EventBusSubscriber
public class RavageTheVasesProcedure {
	@SubscribeEvent
	public static void onBlockBreak(BlockEvent.BreakEvent event) {
		execute(event, event.getLevel(), event.getState(), event.getPlayer());
	}

	public static void execute(LevelAccessor world, BlockState blockstate, Entity entity) {
		execute(null, world, blockstate, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, BlockState blockstate, Entity entity) {
		if (entity == null)
			return;
		if (!((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.SILK_TOUCH)) != 0)
				&& blockstate.is(BlockTags.create(ResourceLocation.parse("forge:priceless_vases")))) {
			{
				SuperiorstructuresModVariables.PlayerVariables _vars = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES);
				_vars.chinashop = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).chinashop + 1;
				_vars.syncPlayerVariables(entity);
			}
			SuperiorstructuresMod.queueServerWork(1200, () -> {
				{
					SuperiorstructuresModVariables.PlayerVariables _vars = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES);
					_vars.chinashop = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).chinashop - 1;
					_vars.syncPlayerVariables(entity);
				}
			});
		}
		if (entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).chinashop >= 200) {
			if (entity instanceof ServerPlayer _player) {
				AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("superiorstructures:ravager_in_a_china_shop"));
				if (_adv != null) {
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						for (String criteria : _ap.getRemainingCriteria())
							_player.getAdvancements().award(_adv, criteria);
					}
				}
			}
		}
	}
}
