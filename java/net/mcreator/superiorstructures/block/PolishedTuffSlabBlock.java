
package net.mcreator.superiorstructures.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class PolishedTuffSlabBlock extends SlabBlock {
	public PolishedTuffSlabBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.TUFF).strength(1.5f, 6f).requiresCorrectToolForDrops().dynamicShape());
	}
}
