
package net.mcreator.superiorstructures.block;

import net.neoforged.neoforge.common.util.DeferredSoundType;

import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResult;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.procedures.LegacyBlockDeprecationProcedure;

public class TuffBrickStairsBlock extends StairBlock {
	public TuffBrickStairsBlock() {
		super(Blocks.AIR.defaultBlockState(), BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM)
				.sound(new DeferredSoundType(1.0f, 1.0f, () -> BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.tuff.break")),
						() -> BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:block.tuff_bricks.step")), () -> BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:block.tuff_bricks.place")),
						() -> BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.tuff.hit")), () -> BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.tuff.fall"))))
				.strength(1.5f, 6f).requiresCorrectToolForDrops().dynamicShape());
	}

	@Override
	public float getExplosionResistance() {
		return 6f;
	}

	@Override
	public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
		super.onPlace(blockstate, world, pos, oldState, moving);
		LegacyBlockDeprecationProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), blockstate);
	}

	@Override
	public void attack(BlockState blockstate, Level world, BlockPos pos, Player entity) {
		super.attack(blockstate, world, pos, entity);
		LegacyBlockDeprecationProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), blockstate);
	}

	@Override
	public InteractionResult useWithoutItem(BlockState blockstate, Level world, BlockPos pos, Player entity, BlockHitResult hit) {
		super.useWithoutItem(blockstate, world, pos, entity, hit);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		double hitX = hit.getLocation().x;
		double hitY = hit.getLocation().y;
		double hitZ = hit.getLocation().z;
		Direction direction = hit.getDirection();
		LegacyBlockDeprecationProcedure.execute(world, x, y, z, blockstate);
		return InteractionResult.SUCCESS;
	}
}
