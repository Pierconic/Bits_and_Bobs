package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.network.SuperiorstructuresModVariables;
import net.mcreator.superiorstructures.init.SuperiorstructuresModItems;

import java.util.ArrayList;

public class TeleporterGreenUnbindProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		for (Entity entityiterator : new ArrayList<>(world.players())) {
			if (entityiterator.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPGreenX == x && entityiterator.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPGreenY == y
					&& entityiterator.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPGreenZ == z
					&& ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.OVERWORLD
							&& entityiterator.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPGreenDimension == 0
							|| (world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.NETHER
									&& entityiterator.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPGreenDimension == 1
							|| (world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.END
									&& entityiterator.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPGreenDimension == 2)) {
				{
					SuperiorstructuresModVariables.PlayerVariables _vars = entityiterator.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES);
					_vars.EPGreenX = 0;
					_vars.syncPlayerVariables(entityiterator);
				}
				{
					SuperiorstructuresModVariables.PlayerVariables _vars = entityiterator.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES);
					_vars.EPGreenY = 0;
					_vars.syncPlayerVariables(entityiterator);
				}
				{
					SuperiorstructuresModVariables.PlayerVariables _vars = entityiterator.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES);
					_vars.EPGreenZ = 0;
					_vars.syncPlayerVariables(entityiterator);
				}
				if (entityiterator instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(SuperiorstructuresModItems.WARP_CHIP_GREEN.get())) : false) {
					if (entityiterator instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Green Enderporter has been unbound"), true);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ()), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:transponder.transmission.off")),
									SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:transponder.transmission.off")),
									SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
			}
		}
	}
}
