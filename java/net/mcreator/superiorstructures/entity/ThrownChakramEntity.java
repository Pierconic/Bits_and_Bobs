
package net.mcreator.superiorstructures.entity;

import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.common.NeoForgeMod;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.entity.projectile.ThrownPotion;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.ai.navigation.FlyingPathNavigation;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.control.FlyingMoveControl;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.AreaEffectCloud;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.procedures.ChakramFliesProcedure;
import net.mcreator.superiorstructures.procedures.ChakramDeflectionProcedure;

public class ThrownChakramEntity extends PathfinderMob {
	public static final EntityDataAccessor<Integer> DATA_Loyalty = SynchedEntityData.defineId(ThrownChakramEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_Richochet = SynchedEntityData.defineId(ThrownChakramEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_Firestorm = SynchedEntityData.defineId(ThrownChakramEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<String> DATA_Owner = SynchedEntityData.defineId(ThrownChakramEntity.class, EntityDataSerializers.STRING);
	public static final EntityDataAccessor<Integer> DATA_Damage = SynchedEntityData.defineId(ThrownChakramEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_Lifetime = SynchedEntityData.defineId(ThrownChakramEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<String> DATA_Name = SynchedEntityData.defineId(ThrownChakramEntity.class, EntityDataSerializers.STRING);
	public static final EntityDataAccessor<Integer> DATA_Interval = SynchedEntityData.defineId(ThrownChakramEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_Power = SynchedEntityData.defineId(ThrownChakramEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_Punch = SynchedEntityData.defineId(ThrownChakramEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_Sharpness = SynchedEntityData.defineId(ThrownChakramEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Boolean> DATA_Flame = SynchedEntityData.defineId(ThrownChakramEntity.class, EntityDataSerializers.BOOLEAN);
	public static final EntityDataAccessor<Integer> DATA_Unbreaking = SynchedEntityData.defineId(ThrownChakramEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Boolean> DATA_Mending = SynchedEntityData.defineId(ThrownChakramEntity.class, EntityDataSerializers.BOOLEAN);
	public static final EntityDataAccessor<Integer> DATA_Bounces = SynchedEntityData.defineId(ThrownChakramEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_Whirlwind = SynchedEntityData.defineId(ThrownChakramEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_InitialYDelta = SynchedEntityData.defineId(ThrownChakramEntity.class, EntityDataSerializers.INT);

	public ThrownChakramEntity(EntityType<ThrownChakramEntity> type, Level world) {
		super(type, world);
		xpReward = 0;
		setNoAi(false);
		setPersistenceRequired();
		this.moveControl = new FlyingMoveControl(this, 10, true);
	}

	@Override
	protected void defineSynchedData(SynchedEntityData.Builder builder) {
		super.defineSynchedData(builder);
		builder.define(DATA_Loyalty, 0);
		builder.define(DATA_Richochet, 0);
		builder.define(DATA_Firestorm, 0);
		builder.define(DATA_Owner, "");
		builder.define(DATA_Damage, 0);
		builder.define(DATA_Lifetime, 30);
		builder.define(DATA_Name, "");
		builder.define(DATA_Interval, 8);
		builder.define(DATA_Power, 0);
		builder.define(DATA_Punch, 0);
		builder.define(DATA_Sharpness, 0);
		builder.define(DATA_Flame, false);
		builder.define(DATA_Unbreaking, 0);
		builder.define(DATA_Mending, false);
		builder.define(DATA_Bounces, 8);
		builder.define(DATA_Whirlwind, 0);
		builder.define(DATA_InitialYDelta, 0);
	}

	@Override
	protected PathNavigation createNavigation(Level world) {
		return new FlyingPathNavigation(this, world);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.2, false) {
			@Override
			protected boolean canPerformAttack(LivingEntity entity) {
				return this.isTimeToAttack() && this.mob.distanceToSqr(entity) < (this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth()) && this.mob.getSensing().hasLineOfSight(entity);
			}
		});
		this.goalSelector.addGoal(2, new RandomStrollGoal(this, 1));
		this.targetSelector.addGoal(3, new HurtByTargetGoal(this));
		this.goalSelector.addGoal(4, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(5, new FloatGoal(this));
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
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Level world = this.level();
		Entity entity = this;
		Entity sourceentity = damagesource.getEntity();
		Entity immediatesourceentity = damagesource.getDirectEntity();
		if (!ChakramDeflectionProcedure.execute(damagesource, entity, sourceentity))
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
	public void addAdditionalSaveData(CompoundTag compound) {
		super.addAdditionalSaveData(compound);
		compound.putInt("DataLoyalty", this.entityData.get(DATA_Loyalty));
		compound.putInt("DataRichochet", this.entityData.get(DATA_Richochet));
		compound.putInt("DataFirestorm", this.entityData.get(DATA_Firestorm));
		compound.putString("DataOwner", this.entityData.get(DATA_Owner));
		compound.putInt("DataDamage", this.entityData.get(DATA_Damage));
		compound.putInt("DataLifetime", this.entityData.get(DATA_Lifetime));
		compound.putString("DataName", this.entityData.get(DATA_Name));
		compound.putInt("DataInterval", this.entityData.get(DATA_Interval));
		compound.putInt("DataPower", this.entityData.get(DATA_Power));
		compound.putInt("DataPunch", this.entityData.get(DATA_Punch));
		compound.putInt("DataSharpness", this.entityData.get(DATA_Sharpness));
		compound.putBoolean("DataFlame", this.entityData.get(DATA_Flame));
		compound.putInt("DataUnbreaking", this.entityData.get(DATA_Unbreaking));
		compound.putBoolean("DataMending", this.entityData.get(DATA_Mending));
		compound.putInt("DataBounces", this.entityData.get(DATA_Bounces));
		compound.putInt("DataWhirlwind", this.entityData.get(DATA_Whirlwind));
		compound.putInt("DataInitialYDelta", this.entityData.get(DATA_InitialYDelta));
	}

	@Override
	public void readAdditionalSaveData(CompoundTag compound) {
		super.readAdditionalSaveData(compound);
		if (compound.contains("DataLoyalty"))
			this.entityData.set(DATA_Loyalty, compound.getInt("DataLoyalty"));
		if (compound.contains("DataRichochet"))
			this.entityData.set(DATA_Richochet, compound.getInt("DataRichochet"));
		if (compound.contains("DataFirestorm"))
			this.entityData.set(DATA_Firestorm, compound.getInt("DataFirestorm"));
		if (compound.contains("DataOwner"))
			this.entityData.set(DATA_Owner, compound.getString("DataOwner"));
		if (compound.contains("DataDamage"))
			this.entityData.set(DATA_Damage, compound.getInt("DataDamage"));
		if (compound.contains("DataLifetime"))
			this.entityData.set(DATA_Lifetime, compound.getInt("DataLifetime"));
		if (compound.contains("DataName"))
			this.entityData.set(DATA_Name, compound.getString("DataName"));
		if (compound.contains("DataInterval"))
			this.entityData.set(DATA_Interval, compound.getInt("DataInterval"));
		if (compound.contains("DataPower"))
			this.entityData.set(DATA_Power, compound.getInt("DataPower"));
		if (compound.contains("DataPunch"))
			this.entityData.set(DATA_Punch, compound.getInt("DataPunch"));
		if (compound.contains("DataSharpness"))
			this.entityData.set(DATA_Sharpness, compound.getInt("DataSharpness"));
		if (compound.contains("DataFlame"))
			this.entityData.set(DATA_Flame, compound.getBoolean("DataFlame"));
		if (compound.contains("DataUnbreaking"))
			this.entityData.set(DATA_Unbreaking, compound.getInt("DataUnbreaking"));
		if (compound.contains("DataMending"))
			this.entityData.set(DATA_Mending, compound.getBoolean("DataMending"));
		if (compound.contains("DataBounces"))
			this.entityData.set(DATA_Bounces, compound.getInt("DataBounces"));
		if (compound.contains("DataWhirlwind"))
			this.entityData.set(DATA_Whirlwind, compound.getInt("DataWhirlwind"));
		if (compound.contains("DataInitialYDelta"))
			this.entityData.set(DATA_InitialYDelta, compound.getInt("DataInitialYDelta"));
	}

	@Override
	public void baseTick() {
		super.baseTick();
		ChakramFliesProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ(), this);
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
		builder = builder.add(Attributes.MAX_HEALTH, 10);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 0);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		builder = builder.add(Attributes.STEP_HEIGHT, 0);
		builder = builder.add(Attributes.FLYING_SPEED, 0);
		return builder;
	}
}
