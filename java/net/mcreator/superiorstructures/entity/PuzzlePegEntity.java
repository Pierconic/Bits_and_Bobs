
package net.mcreator.superiorstructures.entity;

import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.common.NeoForgeMod;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ThrownPotion;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.ai.navigation.FlyingPathNavigation;
import net.minecraft.world.entity.ai.control.FlyingMoveControl;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.AreaEffectCloud;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.procedures.PuzzlePegClickProcedure;
import net.mcreator.superiorstructures.procedures.PuzzlePegBlockCheckProcedure;

public class PuzzlePegEntity extends PathfinderMob {
	public static final EntityDataAccessor<Integer> DATA_puzzle_box_x = SynchedEntityData.defineId(PuzzlePegEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_puzzle_box_z = SynchedEntityData.defineId(PuzzlePegEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_puzzle_box_y = SynchedEntityData.defineId(PuzzlePegEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Boolean> DATA_bound = SynchedEntityData.defineId(PuzzlePegEntity.class, EntityDataSerializers.BOOLEAN);
	public static final EntityDataAccessor<String> DATA_piece_type = SynchedEntityData.defineId(PuzzlePegEntity.class, EntityDataSerializers.STRING);
	public static final EntityDataAccessor<Integer> DATA_slot = SynchedEntityData.defineId(PuzzlePegEntity.class, EntityDataSerializers.INT);

	public PuzzlePegEntity(EntityType<PuzzlePegEntity> type, Level world) {
		super(type, world);
		xpReward = 0;
		setNoAi(true);
		setPersistenceRequired();
		this.moveControl = new FlyingMoveControl(this, 10, true);
	}

	@Override
	protected void defineSynchedData(SynchedEntityData.Builder builder) {
		super.defineSynchedData(builder);
		builder.define(DATA_puzzle_box_x, 0);
		builder.define(DATA_puzzle_box_z, 0);
		builder.define(DATA_puzzle_box_y, 0);
		builder.define(DATA_bound, false);
		builder.define(DATA_piece_type, "blank");
		builder.define(DATA_slot, 0);
	}

	@Override
	protected PathNavigation createNavigation(Level world) {
		return new FlyingPathNavigation(this, world);
	}

	@Override
	public boolean removeWhenFarAway(double distanceToClosestPlayer) {
		return false;
	}

	@Override
	public boolean causeFallDamage(float l, float d, DamageSource source) {
		return false;
	}

	@Override
	public boolean hurt(DamageSource damagesource, float amount) {
		if (damagesource.is(DamageTypes.IN_FIRE))
			return false;
		if (damagesource.getDirectEntity() instanceof AbstractArrow)
			return false;
		if (damagesource.getDirectEntity() instanceof Player)
			return false;
		if (damagesource.getDirectEntity() instanceof ThrownPotion || damagesource.getDirectEntity() instanceof AreaEffectCloud || damagesource.typeHolder().is(NeoForgeMod.POISON_DAMAGE))
			return false;
		if (damagesource.is(DamageTypes.FALL))
			return false;
		if (damagesource.is(DamageTypes.CACTUS))
			return false;
		if (damagesource.is(DamageTypes.DROWN))
			return false;
		if (damagesource.is(DamageTypes.LIGHTNING_BOLT))
			return false;
		if (damagesource.is(DamageTypes.EXPLOSION) || damagesource.is(DamageTypes.PLAYER_EXPLOSION))
			return false;
		if (damagesource.is(DamageTypes.TRIDENT))
			return false;
		if (damagesource.is(DamageTypes.FALLING_ANVIL))
			return false;
		if (damagesource.is(DamageTypes.DRAGON_BREATH))
			return false;
		if (damagesource.is(DamageTypes.WITHER) || damagesource.is(DamageTypes.WITHER_SKULL))
			return false;
		return super.hurt(damagesource, amount);
	}

	@Override
	public boolean ignoreExplosion(Explosion explosion) {
		return true;
	}

	@Override
	public boolean fireImmune() {
		return true;
	}

	@Override
	public void addAdditionalSaveData(CompoundTag compound) {
		super.addAdditionalSaveData(compound);
		compound.putInt("Datapuzzle_box_x", this.entityData.get(DATA_puzzle_box_x));
		compound.putInt("Datapuzzle_box_z", this.entityData.get(DATA_puzzle_box_z));
		compound.putInt("Datapuzzle_box_y", this.entityData.get(DATA_puzzle_box_y));
		compound.putBoolean("Databound", this.entityData.get(DATA_bound));
		compound.putString("Datapiece_type", this.entityData.get(DATA_piece_type));
		compound.putInt("Dataslot", this.entityData.get(DATA_slot));
	}

	@Override
	public void readAdditionalSaveData(CompoundTag compound) {
		super.readAdditionalSaveData(compound);
		if (compound.contains("Datapuzzle_box_x"))
			this.entityData.set(DATA_puzzle_box_x, compound.getInt("Datapuzzle_box_x"));
		if (compound.contains("Datapuzzle_box_z"))
			this.entityData.set(DATA_puzzle_box_z, compound.getInt("Datapuzzle_box_z"));
		if (compound.contains("Datapuzzle_box_y"))
			this.entityData.set(DATA_puzzle_box_y, compound.getInt("Datapuzzle_box_y"));
		if (compound.contains("Databound"))
			this.entityData.set(DATA_bound, compound.getBoolean("Databound"));
		if (compound.contains("Datapiece_type"))
			this.entityData.set(DATA_piece_type, compound.getString("Datapiece_type"));
		if (compound.contains("Dataslot"))
			this.entityData.set(DATA_slot, compound.getInt("Dataslot"));
	}

	@Override
	public InteractionResult mobInteract(Player sourceentity, InteractionHand hand) {
		ItemStack itemstack = sourceentity.getItemInHand(hand);
		InteractionResult retval = InteractionResult.sidedSuccess(this.level().isClientSide());
		super.mobInteract(sourceentity, hand);
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Entity entity = this;
		Level world = this.level();

		PuzzlePegClickProcedure.execute(entity);
		return retval;
	}

	@Override
	public void baseTick() {
		super.baseTick();
		PuzzlePegBlockCheckProcedure.execute(this.level(), this);
	}

	@Override
	public boolean checkSpawnObstruction(LevelReader world) {
		return world.isUnobstructed(this);
	}

	@Override
	public boolean canDrownInFluidType(FluidType type) {
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Level world = this.level();
		Entity entity = this;
		return false;
	}

	@Override
	public boolean isPushedByFluid() {
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Level world = this.level();
		Entity entity = this;
		return false;
	}

	@Override
	public boolean isPushable() {
		return false;
	}

	@Override
	protected void doPush(Entity entityIn) {
	}

	@Override
	protected void pushEntities() {
	}

	@Override
	protected void checkFallDamage(double y, boolean onGroundIn, BlockState state, BlockPos pos) {
	}

	@Override
	public void setNoGravity(boolean ignored) {
		super.setNoGravity(true);
	}

	public void aiStep() {
		super.aiStep();
		this.setNoGravity(true);
	}

	public static void init(RegisterSpawnPlacementsEvent event) {
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0);
		builder = builder.add(Attributes.MAX_HEALTH, 99);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 0);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		builder = builder.add(Attributes.STEP_HEIGHT, 0);
		builder = builder.add(Attributes.FLYING_SPEED, 0);
		builder = builder.add(NeoForgeMod.SWIM_SPEED, 0);
		return builder;
	}
}
