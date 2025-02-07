
package net.mcreator.superiorstructures.block;

import org.checkerframework.checker.units.qual.s;

import net.neoforged.neoforge.common.util.DeferredSoundType;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.procedures.ElectrifiedBulbUpdateProcedure;
import net.mcreator.superiorstructures.init.SuperiorstructuresModBlocks;

public class ShockingCopperBulbBlock extends Block {
	public static final IntegerProperty BLOCKSTATE = IntegerProperty.create("blockstate", 0, 16);

	public ShockingCopperBulbBlock() {
		super(BlockBehaviour.Properties.of()
				.sound(new DeferredSoundType(1.0f, 1.0f, () -> BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:block.copper_bulb.break")),
						() -> BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:block.copper_bulb.step")), () -> BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.copper_bulb.place")),
						() -> BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.copper_bulb.hit")), () -> BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.copper_bulb.hit"))))
				.strength(3f, 6f).lightLevel(s -> (new Object() {
					public int getLightLevel() {
						if (s.getValue(BLOCKSTATE) == 1)
							return 1;
						if (s.getValue(BLOCKSTATE) == 2)
							return 2;
						if (s.getValue(BLOCKSTATE) == 3)
							return 3;
						if (s.getValue(BLOCKSTATE) == 4)
							return 4;
						if (s.getValue(BLOCKSTATE) == 5)
							return 5;
						if (s.getValue(BLOCKSTATE) == 6)
							return 6;
						if (s.getValue(BLOCKSTATE) == 7)
							return 7;
						if (s.getValue(BLOCKSTATE) == 8)
							return 8;
						if (s.getValue(BLOCKSTATE) == 9)
							return 9;
						if (s.getValue(BLOCKSTATE) == 10)
							return 10;
						if (s.getValue(BLOCKSTATE) == 11)
							return 11;
						if (s.getValue(BLOCKSTATE) == 12)
							return 12;
						if (s.getValue(BLOCKSTATE) == 13)
							return 13;
						if (s.getValue(BLOCKSTATE) == 14)
							return 14;
						if (s.getValue(BLOCKSTATE) == 15)
							return 15;
						if (s.getValue(BLOCKSTATE) == 16)
							return 5;
						return 1;
					}
				}.getLightLevel())).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return box(0, 0, 0, 16, 16, 16);
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(BLOCKSTATE);
	}

	@Override
	public ItemStack getCloneItemStack(LevelReader level, BlockPos pos, BlockState state) {
		return new ItemStack(SuperiorstructuresModBlocks.COPPER_BULB.get());
	}

	@Override
	public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
		super.onPlace(blockstate, world, pos, oldState, moving);
		world.scheduleTick(pos, this, 1);
	}

	@Override
	public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
		super.tick(blockstate, world, pos, random);
		ElectrifiedBulbUpdateProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), blockstate);
		world.scheduleTick(pos, this, 1);
	}
}
