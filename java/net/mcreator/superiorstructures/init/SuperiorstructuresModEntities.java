
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.superiorstructures.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.registries.Registries;

import net.mcreator.superiorstructures.entity.WeatheredCopperSpearProjectileEntity;
import net.mcreator.superiorstructures.entity.WarpshotBallEntity;
import net.mcreator.superiorstructures.entity.WarpWidgetEntity;
import net.mcreator.superiorstructures.entity.WarpCatalystProjectileEntity;
import net.mcreator.superiorstructures.entity.WarpBallEntity;
import net.mcreator.superiorstructures.entity.ThrownFrostChargeEntity;
import net.mcreator.superiorstructures.entity.ThrownChakramEntity;
import net.mcreator.superiorstructures.entity.SpecterEntity;
import net.mcreator.superiorstructures.entity.SparkInstigatorEntity;
import net.mcreator.superiorstructures.entity.SaddledGoldenGolemEntity;
import net.mcreator.superiorstructures.entity.PuzzlePegEntity;
import net.mcreator.superiorstructures.entity.PulseFieldEntity;
import net.mcreator.superiorstructures.entity.PulseField2Entity;
import net.mcreator.superiorstructures.entity.PongormaRailProjectileEntity;
import net.mcreator.superiorstructures.entity.PhaseOrbEntity;
import net.mcreator.superiorstructures.entity.OxidizedCopperSpearProjectileEntity;
import net.mcreator.superiorstructures.entity.NewIronGolemEntity;
import net.mcreator.superiorstructures.entity.MineshaftCenterEntity;
import net.mcreator.superiorstructures.entity.MelonLordEntity;
import net.mcreator.superiorstructures.entity.LightningSpearProjectileEntity;
import net.mcreator.superiorstructures.entity.LightningProjectileProjectileEntity;
import net.mcreator.superiorstructures.entity.HostileBeamProjectileEntity;
import net.mcreator.superiorstructures.entity.HookshotBallEntity;
import net.mcreator.superiorstructures.entity.HollowEntity;
import net.mcreator.superiorstructures.entity.GrazerEntity;
import net.mcreator.superiorstructures.entity.GoldenGolemEntity;
import net.mcreator.superiorstructures.entity.FrostRail2ProjectileEntity;
import net.mcreator.superiorstructures.entity.FrostRail1ProjectileEntity;
import net.mcreator.superiorstructures.entity.FrostCatalystProjectileEntity;
import net.mcreator.superiorstructures.entity.FrostBlasterProjectileEntity;
import net.mcreator.superiorstructures.entity.FrostBlaster3ProjectileEntity;
import net.mcreator.superiorstructures.entity.FrostBlaster2ProjectileEntity;
import net.mcreator.superiorstructures.entity.FlavorNodeEntity;
import net.mcreator.superiorstructures.entity.FlameRail2ProjectileEntity;
import net.mcreator.superiorstructures.entity.FlameRail1ProjectileEntity;
import net.mcreator.superiorstructures.entity.FlameCatalystProjectileEntity;
import net.mcreator.superiorstructures.entity.FlameBlasterProjectileEntity;
import net.mcreator.superiorstructures.entity.FlameBlaster3ProjectileEntity;
import net.mcreator.superiorstructures.entity.FlameBlaster2ProjectileEntity;
import net.mcreator.superiorstructures.entity.FanSourceEntity;
import net.mcreator.superiorstructures.entity.FallingSmashstoneEntity;
import net.mcreator.superiorstructures.entity.ExposedCopperSpearProjectileEntity;
import net.mcreator.superiorstructures.entity.ExposedCopperGolemEntity;
import net.mcreator.superiorstructures.entity.EnergyRail2ProjectileEntity;
import net.mcreator.superiorstructures.entity.EnergyRail1ProjectileEntity;
import net.mcreator.superiorstructures.entity.EnergyCatalystProjectileEntity;
import net.mcreator.superiorstructures.entity.EnergyBlasterProjectileEntity;
import net.mcreator.superiorstructures.entity.EnergyBlaster3ProjectileEntity;
import net.mcreator.superiorstructures.entity.EnergyBlaster2ProjectileEntity;
import net.mcreator.superiorstructures.entity.EnergizerEntity;
import net.mcreator.superiorstructures.entity.DoubleSparkInstigatorEntity;
import net.mcreator.superiorstructures.entity.DormantIronGolemEntity;
import net.mcreator.superiorstructures.entity.DetectedBlockEntity;
import net.mcreator.superiorstructures.entity.CreepletEntity;
import net.mcreator.superiorstructures.entity.CopperSpearProjectileEntity;
import net.mcreator.superiorstructures.entity.CopperGolemEntity;
import net.mcreator.superiorstructures.entity.ChargedPongormaRailProjectileEntity;
import net.mcreator.superiorstructures.entity.ChargedFrostRail2ProjectileEntity;
import net.mcreator.superiorstructures.entity.ChargedFrostRail1ProjectileEntity;
import net.mcreator.superiorstructures.entity.ChargedFlameRail2ProjectileEntity;
import net.mcreator.superiorstructures.entity.ChargedFlameRail1ProjectileEntity;
import net.mcreator.superiorstructures.entity.ChargedEnergyRail2ProjectileEntity;
import net.mcreator.superiorstructures.entity.ChargedEnergyRail1ProjectileEntity;
import net.mcreator.superiorstructures.entity.ChargedBoltRail1ProjectileEntity;
import net.mcreator.superiorstructures.entity.ChainLinkEntity;
import net.mcreator.superiorstructures.entity.ChainBallEntity;
import net.mcreator.superiorstructures.entity.BrokenIronGolemEntity;
import net.mcreator.superiorstructures.entity.BrokenGoldenGolemEntity;
import net.mcreator.superiorstructures.entity.BoltRail1ProjectileEntity;
import net.mcreator.superiorstructures.entity.BoltCatalystProjectileEntity;
import net.mcreator.superiorstructures.entity.BoltBlasterProjectileEntity;
import net.mcreator.superiorstructures.entity.BoltBlaster3ProjectileEntity;
import net.mcreator.superiorstructures.entity.BoltBlaster2ProjectileEntity;
import net.mcreator.superiorstructures.entity.BigWarpCatalystProjectileEntity;
import net.mcreator.superiorstructures.entity.BigFrostCatalystProjectileEntity;
import net.mcreator.superiorstructures.entity.BigFlameCatalystProjectileEntity;
import net.mcreator.superiorstructures.entity.BigEnergyCatalystProjectileEntity;
import net.mcreator.superiorstructures.entity.BigBoltCatalystProjectileEntity;
import net.mcreator.superiorstructures.entity.AngryAcolyteEntity;
import net.mcreator.superiorstructures.entity.AncientCopperGolemEntity;
import net.mcreator.superiorstructures.entity.AmethystSpearsProjectileEntity;
import net.mcreator.superiorstructures.entity.AcolyteRobeEntity;
import net.mcreator.superiorstructures.entity.AcolyteEntity;
import net.mcreator.superiorstructures.SuperiorstructuresMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class SuperiorstructuresModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, SuperiorstructuresMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<PulseFieldEntity>> PULSE_FIELD = register("pulse_field",
			EntityType.Builder.<PulseFieldEntity>of(PulseFieldEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0f, 0f));
	public static final DeferredHolder<EntityType<?>, EntityType<EnergyCatalystProjectileEntity>> ENERGY_CATALYST_PROJECTILE = register("energy_catalyst_projectile",
			EntityType.Builder.<EnergyCatalystProjectileEntity>of(EnergyCatalystProjectileEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.3f, 0.3f));
	public static final DeferredHolder<EntityType<?>, EntityType<FrostCatalystProjectileEntity>> FROST_CATALYST_PROJECTILE = register("frost_catalyst_projectile",
			EntityType.Builder.<FrostCatalystProjectileEntity>of(FrostCatalystProjectileEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.3f, 0.3f));
	public static final DeferredHolder<EntityType<?>, EntityType<FlameCatalystProjectileEntity>> FLAME_CATALYST_PROJECTILE = register("flame_catalyst_projectile",
			EntityType.Builder.<FlameCatalystProjectileEntity>of(FlameCatalystProjectileEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.3f, 0.3f));
	public static final DeferredHolder<EntityType<?>, EntityType<BoltCatalystProjectileEntity>> BOLT_CATALYST_PROJECTILE = register("bolt_catalyst_projectile",
			EntityType.Builder.<BoltCatalystProjectileEntity>of(BoltCatalystProjectileEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.3f, 0.3f));
	public static final DeferredHolder<EntityType<?>, EntityType<PulseField2Entity>> PULSE_FIELD_2 = register("pulse_field_2",
			EntityType.Builder.<PulseField2Entity>of(PulseField2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0f, 0f));
	public static final DeferredHolder<EntityType<?>, EntityType<DetectedBlockEntity>> DETECTED_BLOCK = register("detected_block",
			EntityType.Builder.<DetectedBlockEntity>of(DetectedBlockEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(1f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<BigEnergyCatalystProjectileEntity>> BIG_ENERGY_CATALYST_PROJECTILE = register("big_energy_catalyst_projectile",
			EntityType.Builder.<BigEnergyCatalystProjectileEntity>of(BigEnergyCatalystProjectileEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BigFlameCatalystProjectileEntity>> BIG_FLAME_CATALYST_PROJECTILE = register("big_flame_catalyst_projectile",
			EntityType.Builder.<BigFlameCatalystProjectileEntity>of(BigFlameCatalystProjectileEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BigFrostCatalystProjectileEntity>> BIG_FROST_CATALYST_PROJECTILE = register("big_frost_catalyst_projectile",
			EntityType.Builder.<BigFrostCatalystProjectileEntity>of(BigFrostCatalystProjectileEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BigBoltCatalystProjectileEntity>> BIG_BOLT_CATALYST_PROJECTILE = register("big_bolt_catalyst_projectile",
			EntityType.Builder.<BigBoltCatalystProjectileEntity>of(BigBoltCatalystProjectileEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BrokenIronGolemEntity>> BROKEN_IRON_GOLEM = register("broken_iron_golem",
			EntityType.Builder.<BrokenIronGolemEntity>of(BrokenIronGolemEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.7f, 2.2f));
	public static final DeferredHolder<EntityType<?>, EntityType<CopperGolemEntity>> COPPER_GOLEM = register("copper_golem",
			EntityType.Builder.<CopperGolemEntity>of(CopperGolemEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<ExposedCopperGolemEntity>> EXPOSED_COPPER_GOLEM = register("exposed_copper_golem",
			EntityType.Builder.<ExposedCopperGolemEntity>of(ExposedCopperGolemEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<AncientCopperGolemEntity>> ANCIENT_COPPER_GOLEM = register("ancient_copper_golem",
			EntityType.Builder.<AncientCopperGolemEntity>of(AncientCopperGolemEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<MineshaftCenterEntity>> MINESHAFT_CENTER = register("mineshaft_center",
			EntityType.Builder.<MineshaftCenterEntity>of(MineshaftCenterEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0f, 0f));
	public static final DeferredHolder<EntityType<?>, EntityType<GoldenGolemEntity>> GOLDEN_GOLEM = register("golden_golem",
			EntityType.Builder.<GoldenGolemEntity>of(GoldenGolemEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(2f, 3f));
	public static final DeferredHolder<EntityType<?>, EntityType<NewIronGolemEntity>> NEW_IRON_GOLEM = register("new_iron_golem",
			EntityType.Builder.<NewIronGolemEntity>of(NewIronGolemEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 2.2f));
	public static final DeferredHolder<EntityType<?>, EntityType<SaddledGoldenGolemEntity>> SADDLED_GOLDEN_GOLEM = register("saddled_golden_golem",
			EntityType.Builder.<SaddledGoldenGolemEntity>of(SaddledGoldenGolemEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(2f, 3f));
	public static final DeferredHolder<EntityType<?>, EntityType<BrokenGoldenGolemEntity>> BROKEN_GOLDEN_GOLEM = register("broken_golden_golem",
			EntityType.Builder.<BrokenGoldenGolemEntity>of(BrokenGoldenGolemEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(2f, 3f));
	public static final DeferredHolder<EntityType<?>, EntityType<CreepletEntity>> CREEPLET = register("creeplet",
			EntityType.Builder.<CreepletEntity>of(CreepletEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.3f, 0.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<FallingSmashstoneEntity>> FALLING_SMASHSTONE = register("falling_smashstone",
			EntityType.Builder.<FallingSmashstoneEntity>of(FallingSmashstoneEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(1f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<ChainLinkEntity>> CHAIN_LINK = register("chain_link",
			EntityType.Builder.<ChainLinkEntity>of(ChainLinkEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<ChainBallEntity>> CHAIN_BALL = register("chain_ball",
			EntityType.Builder.<ChainBallEntity>of(ChainBallEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<HookshotBallEntity>> HOOKSHOT_BALL = register("hookshot_ball",
			EntityType.Builder.<HookshotBallEntity>of(HookshotBallEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<WarpBallEntity>> WARP_BALL = register("warp_ball",
			EntityType.Builder.<WarpBallEntity>of(WarpBallEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<WarpWidgetEntity>> WARP_WIDGET = register("warp_widget",
			EntityType.Builder.<WarpWidgetEntity>of(WarpWidgetEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<WarpshotBallEntity>> WARPSHOT_BALL = register("warpshot_ball",
			EntityType.Builder.<WarpshotBallEntity>of(WarpshotBallEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<FanSourceEntity>> FAN_SOURCE = register("fan_source",
			EntityType.Builder.<FanSourceEntity>of(FanSourceEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<LightningProjectileProjectileEntity>> LIGHTNING_PROJECTILE_PROJECTILE = register("lightning_projectile_projectile",
			EntityType.Builder.<LightningProjectileProjectileEntity>of(LightningProjectileProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<CopperSpearProjectileEntity>> COPPER_SPEAR_PROJECTILE = register("copper_spear_projectile",
			EntityType.Builder.<CopperSpearProjectileEntity>of(CopperSpearProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<ExposedCopperSpearProjectileEntity>> EXPOSED_COPPER_SPEAR_PROJECTILE = register("exposed_copper_spear_projectile",
			EntityType.Builder.<ExposedCopperSpearProjectileEntity>of(ExposedCopperSpearProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<WeatheredCopperSpearProjectileEntity>> WEATHERED_COPPER_SPEAR_PROJECTILE = register("weathered_copper_spear_projectile",
			EntityType.Builder.<WeatheredCopperSpearProjectileEntity>of(WeatheredCopperSpearProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<OxidizedCopperSpearProjectileEntity>> OXIDIZED_COPPER_SPEAR_PROJECTILE = register("oxidized_copper_spear_projectile",
			EntityType.Builder.<OxidizedCopperSpearProjectileEntity>of(OxidizedCopperSpearProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<AmethystSpearsProjectileEntity>> AMETHYST_SPEARS_PROJECTILE = register("amethyst_spears_projectile",
			EntityType.Builder.<AmethystSpearsProjectileEntity>of(AmethystSpearsProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<EnergyBlaster2ProjectileEntity>> ENERGY_BLASTER_2_PROJECTILE = register("energy_blaster_2_projectile",
			EntityType.Builder.<EnergyBlaster2ProjectileEntity>of(EnergyBlaster2ProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<EnergyBlaster3ProjectileEntity>> ENERGY_BLASTER_3_PROJECTILE = register("energy_blaster_3_projectile",
			EntityType.Builder.<EnergyBlaster3ProjectileEntity>of(EnergyBlaster3ProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<FlameBlasterProjectileEntity>> FLAME_BLASTER_PROJECTILE = register("flame_blaster_projectile",
			EntityType.Builder.<FlameBlasterProjectileEntity>of(FlameBlasterProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<FlameBlaster2ProjectileEntity>> FLAME_BLASTER_2_PROJECTILE = register("flame_blaster_2_projectile",
			EntityType.Builder.<FlameBlaster2ProjectileEntity>of(FlameBlaster2ProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<FlameBlaster3ProjectileEntity>> FLAME_BLASTER_3_PROJECTILE = register("flame_blaster_3_projectile",
			EntityType.Builder.<FlameBlaster3ProjectileEntity>of(FlameBlaster3ProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<FrostBlasterProjectileEntity>> FROST_BLASTER_PROJECTILE = register("frost_blaster_projectile",
			EntityType.Builder.<FrostBlasterProjectileEntity>of(FrostBlasterProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<FrostBlaster2ProjectileEntity>> FROST_BLASTER_2_PROJECTILE = register("frost_blaster_2_projectile",
			EntityType.Builder.<FrostBlaster2ProjectileEntity>of(FrostBlaster2ProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<FrostBlaster3ProjectileEntity>> FROST_BLASTER_3_PROJECTILE = register("frost_blaster_3_projectile",
			EntityType.Builder.<FrostBlaster3ProjectileEntity>of(FrostBlaster3ProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BoltBlasterProjectileEntity>> BOLT_BLASTER_PROJECTILE = register("bolt_blaster_projectile",
			EntityType.Builder.<BoltBlasterProjectileEntity>of(BoltBlasterProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BoltBlaster2ProjectileEntity>> BOLT_BLASTER_2_PROJECTILE = register("bolt_blaster_2_projectile",
			EntityType.Builder.<BoltBlaster2ProjectileEntity>of(BoltBlaster2ProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BoltBlaster3ProjectileEntity>> BOLT_BLASTER_3_PROJECTILE = register("bolt_blaster_3_projectile",
			EntityType.Builder.<BoltBlaster3ProjectileEntity>of(BoltBlaster3ProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<EnergyRail1ProjectileEntity>> ENERGY_RAIL_1_PROJECTILE = register("energy_rail_1_projectile",
			EntityType.Builder.<EnergyRail1ProjectileEntity>of(EnergyRail1ProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<ChargedEnergyRail1ProjectileEntity>> CHARGED_ENERGY_RAIL_1_PROJECTILE = register("charged_energy_rail_1_projectile",
			EntityType.Builder.<ChargedEnergyRail1ProjectileEntity>of(ChargedEnergyRail1ProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<EnergyRail2ProjectileEntity>> ENERGY_RAIL_2_PROJECTILE = register("energy_rail_2_projectile",
			EntityType.Builder.<EnergyRail2ProjectileEntity>of(EnergyRail2ProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<ChargedEnergyRail2ProjectileEntity>> CHARGED_ENERGY_RAIL_2_PROJECTILE = register("charged_energy_rail_2_projectile",
			EntityType.Builder.<ChargedEnergyRail2ProjectileEntity>of(ChargedEnergyRail2ProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<FlameRail1ProjectileEntity>> FLAME_RAIL_1_PROJECTILE = register("flame_rail_1_projectile",
			EntityType.Builder.<FlameRail1ProjectileEntity>of(FlameRail1ProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<ChargedFlameRail1ProjectileEntity>> CHARGED_FLAME_RAIL_1_PROJECTILE = register("charged_flame_rail_1_projectile",
			EntityType.Builder.<ChargedFlameRail1ProjectileEntity>of(ChargedFlameRail1ProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<FlameRail2ProjectileEntity>> FLAME_RAIL_2_PROJECTILE = register("flame_rail_2_projectile",
			EntityType.Builder.<FlameRail2ProjectileEntity>of(FlameRail2ProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<ChargedFlameRail2ProjectileEntity>> CHARGED_FLAME_RAIL_2_PROJECTILE = register("charged_flame_rail_2_projectile",
			EntityType.Builder.<ChargedFlameRail2ProjectileEntity>of(ChargedFlameRail2ProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<FrostRail1ProjectileEntity>> FROST_RAIL_1_PROJECTILE = register("frost_rail_1_projectile",
			EntityType.Builder.<FrostRail1ProjectileEntity>of(FrostRail1ProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<ChargedFrostRail1ProjectileEntity>> CHARGED_FROST_RAIL_1_PROJECTILE = register("charged_frost_rail_1_projectile",
			EntityType.Builder.<ChargedFrostRail1ProjectileEntity>of(ChargedFrostRail1ProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<FrostRail2ProjectileEntity>> FROST_RAIL_2_PROJECTILE = register("frost_rail_2_projectile",
			EntityType.Builder.<FrostRail2ProjectileEntity>of(FrostRail2ProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<ChargedFrostRail2ProjectileEntity>> CHARGED_FROST_RAIL_2_PROJECTILE = register("charged_frost_rail_2_projectile",
			EntityType.Builder.<ChargedFrostRail2ProjectileEntity>of(ChargedFrostRail2ProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BoltRail1ProjectileEntity>> BOLT_RAIL_1_PROJECTILE = register("bolt_rail_1_projectile",
			EntityType.Builder.<BoltRail1ProjectileEntity>of(BoltRail1ProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<ChargedBoltRail1ProjectileEntity>> CHARGED_BOLT_RAIL_1_PROJECTILE = register("charged_bolt_rail_1_projectile",
			EntityType.Builder.<ChargedBoltRail1ProjectileEntity>of(ChargedBoltRail1ProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<PongormaRailProjectileEntity>> PONGORMA_RAIL_PROJECTILE = register("pongorma_rail_projectile",
			EntityType.Builder.<PongormaRailProjectileEntity>of(PongormaRailProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<ChargedPongormaRailProjectileEntity>> CHARGED_PONGORMA_RAIL_PROJECTILE = register("charged_pongorma_rail_projectile",
			EntityType.Builder.<ChargedPongormaRailProjectileEntity>of(ChargedPongormaRailProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<LightningSpearProjectileEntity>> LIGHTNING_SPEAR_PROJECTILE = register("lightning_spear_projectile",
			EntityType.Builder.<LightningSpearProjectileEntity>of(LightningSpearProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<EnergyBlasterProjectileEntity>> ENERGY_BLASTER_PROJECTILE = register("energy_blaster_projectile",
			EntityType.Builder.<EnergyBlasterProjectileEntity>of(EnergyBlasterProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<WarpCatalystProjectileEntity>> WARP_CATALYST_PROJECTILE = register("warp_catalyst_projectile",
			EntityType.Builder.<WarpCatalystProjectileEntity>of(WarpCatalystProjectileEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.3f, 0.3f));
	public static final DeferredHolder<EntityType<?>, EntityType<BigWarpCatalystProjectileEntity>> BIG_WARP_CATALYST_PROJECTILE = register("big_warp_catalyst_projectile",
			EntityType.Builder.<BigWarpCatalystProjectileEntity>of(BigWarpCatalystProjectileEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<GrazerEntity>> GRAZER = register("grazer",
			EntityType.Builder.<GrazerEntity>of(GrazerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<ThrownChakramEntity>> THROWN_CHAKRAM = register("thrown_chakram",
			EntityType.Builder.<ThrownChakramEntity>of(ThrownChakramEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3)

					.sized(0.6f, 0.15f));
	public static final DeferredHolder<EntityType<?>, EntityType<EnergizerEntity>> ENERGIZER = register("energizer",
			EntityType.Builder.<EnergizerEntity>of(EnergizerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<PhaseOrbEntity>> PHASE_ORB = register("phase_orb",
			EntityType.Builder.<PhaseOrbEntity>of(PhaseOrbEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.3f, 0.3f));
	public static final DeferredHolder<EntityType<?>, EntityType<AcolyteEntity>> ACOLYTE = register("acolyte",
			EntityType.Builder.<AcolyteEntity>of(AcolyteEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(48).setUpdateInterval(3)

					.sized(0.6f, 1.4f));
	public static final DeferredHolder<EntityType<?>, EntityType<SpecterEntity>> SPECTER = register("specter",
			EntityType.Builder.<SpecterEntity>of(SpecterEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.4f));
	public static final DeferredHolder<EntityType<?>, EntityType<HostileBeamProjectileEntity>> HOSTILE_BEAM_PROJECTILE = register("hostile_beam_projectile",
			EntityType.Builder.<HostileBeamProjectileEntity>of(HostileBeamProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<ThrownFrostChargeEntity>> THROWN_FROST_CHARGE = register("thrown_frost_charge",
			EntityType.Builder.<ThrownFrostChargeEntity>of(ThrownFrostChargeEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<FlavorNodeEntity>> FLAVOR_NODE = register("flavor_node",
			EntityType.Builder.<FlavorNodeEntity>of(FlavorNodeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(1024).setUpdateInterval(3).fireImmune().sized(0.3f, 0.3f));
	public static final DeferredHolder<EntityType<?>, EntityType<HollowEntity>> HOLLOW = register("hollow",
			EntityType.Builder.<HollowEntity>of(HollowEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3)

					.sized(0.6f, 2.4f));
	public static final DeferredHolder<EntityType<?>, EntityType<SparkInstigatorEntity>> SPARK_INSTIGATOR = register("spark_instigator",
			EntityType.Builder.<SparkInstigatorEntity>of(SparkInstigatorEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0f, 0f));
	public static final DeferredHolder<EntityType<?>, EntityType<DoubleSparkInstigatorEntity>> DOUBLE_SPARK_INSTIGATOR = register("double_spark_instigator",
			EntityType.Builder.<DoubleSparkInstigatorEntity>of(DoubleSparkInstigatorEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0f, 0f));
	public static final DeferredHolder<EntityType<?>, EntityType<AcolyteRobeEntity>> ACOLYTE_ROBE = register("acolyte_robe",
			EntityType.Builder.<AcolyteRobeEntity>of(AcolyteRobeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<AngryAcolyteEntity>> ANGRY_ACOLYTE = register("angry_acolyte",
			EntityType.Builder.<AngryAcolyteEntity>of(AngryAcolyteEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(48).setUpdateInterval(3)

					.sized(0.6f, 1.4f));
	public static final DeferredHolder<EntityType<?>, EntityType<DormantIronGolemEntity>> DORMANT_IRON_GOLEM = register("dormant_iron_golem",
			EntityType.Builder.<DormantIronGolemEntity>of(DormantIronGolemEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 2.2f));
	public static final DeferredHolder<EntityType<?>, EntityType<PuzzlePegEntity>> PUZZLE_PEG = register("puzzle_peg",
			EntityType.Builder.<PuzzlePegEntity>of(PuzzlePegEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(32).setUpdateInterval(3).fireImmune().sized(0f, 0.3f));
	public static final DeferredHolder<EntityType<?>, EntityType<MelonLordEntity>> MELON_LORD = register("melon_lord",
			EntityType.Builder.<MelonLordEntity>of(MelonLordEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.4f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		PulseFieldEntity.init(event);
		EnergyCatalystProjectileEntity.init(event);
		FrostCatalystProjectileEntity.init(event);
		FlameCatalystProjectileEntity.init(event);
		BoltCatalystProjectileEntity.init(event);
		PulseField2Entity.init(event);
		DetectedBlockEntity.init(event);
		BigEnergyCatalystProjectileEntity.init(event);
		BigFlameCatalystProjectileEntity.init(event);
		BigFrostCatalystProjectileEntity.init(event);
		BigBoltCatalystProjectileEntity.init(event);
		BrokenIronGolemEntity.init(event);
		CopperGolemEntity.init(event);
		ExposedCopperGolemEntity.init(event);
		AncientCopperGolemEntity.init(event);
		MineshaftCenterEntity.init(event);
		GoldenGolemEntity.init(event);
		NewIronGolemEntity.init(event);
		SaddledGoldenGolemEntity.init(event);
		BrokenGoldenGolemEntity.init(event);
		CreepletEntity.init(event);
		FallingSmashstoneEntity.init(event);
		ChainLinkEntity.init(event);
		ChainBallEntity.init(event);
		HookshotBallEntity.init(event);
		WarpBallEntity.init(event);
		WarpWidgetEntity.init(event);
		WarpshotBallEntity.init(event);
		FanSourceEntity.init(event);
		WarpCatalystProjectileEntity.init(event);
		BigWarpCatalystProjectileEntity.init(event);
		GrazerEntity.init(event);
		ThrownChakramEntity.init(event);
		EnergizerEntity.init(event);
		PhaseOrbEntity.init(event);
		AcolyteEntity.init(event);
		SpecterEntity.init(event);
		FlavorNodeEntity.init(event);
		HollowEntity.init(event);
		SparkInstigatorEntity.init(event);
		DoubleSparkInstigatorEntity.init(event);
		AcolyteRobeEntity.init(event);
		AngryAcolyteEntity.init(event);
		DormantIronGolemEntity.init(event);
		PuzzlePegEntity.init(event);
		MelonLordEntity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(PULSE_FIELD.get(), PulseFieldEntity.createAttributes().build());
		event.put(ENERGY_CATALYST_PROJECTILE.get(), EnergyCatalystProjectileEntity.createAttributes().build());
		event.put(FROST_CATALYST_PROJECTILE.get(), FrostCatalystProjectileEntity.createAttributes().build());
		event.put(FLAME_CATALYST_PROJECTILE.get(), FlameCatalystProjectileEntity.createAttributes().build());
		event.put(BOLT_CATALYST_PROJECTILE.get(), BoltCatalystProjectileEntity.createAttributes().build());
		event.put(PULSE_FIELD_2.get(), PulseField2Entity.createAttributes().build());
		event.put(DETECTED_BLOCK.get(), DetectedBlockEntity.createAttributes().build());
		event.put(BIG_ENERGY_CATALYST_PROJECTILE.get(), BigEnergyCatalystProjectileEntity.createAttributes().build());
		event.put(BIG_FLAME_CATALYST_PROJECTILE.get(), BigFlameCatalystProjectileEntity.createAttributes().build());
		event.put(BIG_FROST_CATALYST_PROJECTILE.get(), BigFrostCatalystProjectileEntity.createAttributes().build());
		event.put(BIG_BOLT_CATALYST_PROJECTILE.get(), BigBoltCatalystProjectileEntity.createAttributes().build());
		event.put(BROKEN_IRON_GOLEM.get(), BrokenIronGolemEntity.createAttributes().build());
		event.put(COPPER_GOLEM.get(), CopperGolemEntity.createAttributes().build());
		event.put(EXPOSED_COPPER_GOLEM.get(), ExposedCopperGolemEntity.createAttributes().build());
		event.put(ANCIENT_COPPER_GOLEM.get(), AncientCopperGolemEntity.createAttributes().build());
		event.put(MINESHAFT_CENTER.get(), MineshaftCenterEntity.createAttributes().build());
		event.put(GOLDEN_GOLEM.get(), GoldenGolemEntity.createAttributes().build());
		event.put(NEW_IRON_GOLEM.get(), NewIronGolemEntity.createAttributes().build());
		event.put(SADDLED_GOLDEN_GOLEM.get(), SaddledGoldenGolemEntity.createAttributes().build());
		event.put(BROKEN_GOLDEN_GOLEM.get(), BrokenGoldenGolemEntity.createAttributes().build());
		event.put(CREEPLET.get(), CreepletEntity.createAttributes().build());
		event.put(FALLING_SMASHSTONE.get(), FallingSmashstoneEntity.createAttributes().build());
		event.put(CHAIN_LINK.get(), ChainLinkEntity.createAttributes().build());
		event.put(CHAIN_BALL.get(), ChainBallEntity.createAttributes().build());
		event.put(HOOKSHOT_BALL.get(), HookshotBallEntity.createAttributes().build());
		event.put(WARP_BALL.get(), WarpBallEntity.createAttributes().build());
		event.put(WARP_WIDGET.get(), WarpWidgetEntity.createAttributes().build());
		event.put(WARPSHOT_BALL.get(), WarpshotBallEntity.createAttributes().build());
		event.put(FAN_SOURCE.get(), FanSourceEntity.createAttributes().build());
		event.put(WARP_CATALYST_PROJECTILE.get(), WarpCatalystProjectileEntity.createAttributes().build());
		event.put(BIG_WARP_CATALYST_PROJECTILE.get(), BigWarpCatalystProjectileEntity.createAttributes().build());
		event.put(GRAZER.get(), GrazerEntity.createAttributes().build());
		event.put(THROWN_CHAKRAM.get(), ThrownChakramEntity.createAttributes().build());
		event.put(ENERGIZER.get(), EnergizerEntity.createAttributes().build());
		event.put(PHASE_ORB.get(), PhaseOrbEntity.createAttributes().build());
		event.put(ACOLYTE.get(), AcolyteEntity.createAttributes().build());
		event.put(SPECTER.get(), SpecterEntity.createAttributes().build());
		event.put(FLAVOR_NODE.get(), FlavorNodeEntity.createAttributes().build());
		event.put(HOLLOW.get(), HollowEntity.createAttributes().build());
		event.put(SPARK_INSTIGATOR.get(), SparkInstigatorEntity.createAttributes().build());
		event.put(DOUBLE_SPARK_INSTIGATOR.get(), DoubleSparkInstigatorEntity.createAttributes().build());
		event.put(ACOLYTE_ROBE.get(), AcolyteRobeEntity.createAttributes().build());
		event.put(ANGRY_ACOLYTE.get(), AngryAcolyteEntity.createAttributes().build());
		event.put(DORMANT_IRON_GOLEM.get(), DormantIronGolemEntity.createAttributes().build());
		event.put(PUZZLE_PEG.get(), PuzzlePegEntity.createAttributes().build());
		event.put(MELON_LORD.get(), MelonLordEntity.createAttributes().build());
	}
}
