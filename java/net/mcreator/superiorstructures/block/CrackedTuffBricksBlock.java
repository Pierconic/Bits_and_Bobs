
package net.mcreator.superiorstructures.block;

import net.neoforged.neoforge.common.util.DeferredSoundType;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

public class CrackedTuffBricksBlock extends Block {
	public CrackedTuffBricksBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM)
				.sound(new DeferredSoundType(1.0f, 1.0f, () -> BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.tuff.break")),
						() -> BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:block.tuff_bricks.step")), () -> BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:block.tuff_bricks.place")),
						() -> BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.tuff.hit")), () -> BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.tuff.fall"))))
				.strength(1.5f, 6f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}
