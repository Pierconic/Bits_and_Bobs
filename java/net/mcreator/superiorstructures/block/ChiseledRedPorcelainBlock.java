
package net.mcreator.superiorstructures.block;

import net.neoforged.neoforge.common.util.DeferredSoundType;

import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.procedures.SmashitProcedure;

public class ChiseledRedPorcelainBlock extends Block {
	public ChiseledRedPorcelainBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.QUARTZ)
				.sound(new DeferredSoundType(1.0f, 1.0f, () -> BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:breakporcelain")),
						() -> BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:stepporcelain")), () -> BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:placeporcelain")),
						() -> BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:hitpottery")), () -> BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:hitpottery"))))
				.strength(1f, 3f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public void onProjectileHit(Level world, BlockState blockstate, BlockHitResult hit, Projectile entity) {
		SmashitProcedure.execute(world, hit.getBlockPos().getX(), hit.getBlockPos().getY(), hit.getBlockPos().getZ());
	}
}
