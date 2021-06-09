package io.github.chaosawakens.common.registry;

import io.github.chaosawakens.ChaosAwakens;
import io.github.chaosawakens.common.entity.*;
import io.github.chaosawakens.common.entity.projectile.*;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.ArrayList;
import java.util.List;

public class CAEntityTypes {
	
	public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, ChaosAwakens.MODID);
	
	private static final List<EntityType<?>> ALL = new ArrayList<>();
	// ENTITY TYPES
	// Ent
	public static final RegistryObject<EntityType<EntEntity>> ENT = ENTITY_TYPES.register("ent",
			() -> EntityType.Builder.create(EntEntity::new, EntityClassification.MONSTER)
				.size(2.5f, 3.125f) // Hitbox Size ()
				.build(new ResourceLocation(ChaosAwakens.MODID, "ent").toString()));
	
	// Hercules Beetle
	public static final RegistryObject<EntityType<HerculesBeetleEntity>> HERCULES_BEETLE = ENTITY_TYPES.register("hercules_beetle",
			() -> EntityType.Builder.create(HerculesBeetleEntity::new, EntityClassification.MONSTER)
				.size(4.5f, 3.125f) // Hitbox Size ()
				.build(new ResourceLocation(ChaosAwakens.MODID, "hercules_beetle").toString()));
	
	// Apple Cows
	public static final RegistryObject<EntityType<AppleCowEntity>> APPLE_COW = ENTITY_TYPES.register("apple_cow",
			() -> EntityType.Builder.create(AppleCowEntity::new, EntityClassification.CREATURE)
				.size(0.9F, 1.4F)
				.trackingRange(10)// Hitbox Size ()
				.build(new ResourceLocation(ChaosAwakens.MODID, "apple_cow").toString()));
	public static final RegistryObject<EntityType<GoldenAppleCowEntity>> GOLDEN_APPLE_COW = ENTITY_TYPES.register("golden_apple_cow",
			() -> EntityType.Builder.create(GoldenAppleCowEntity::new, EntityClassification.CREATURE)
					.size(0.9F, 1.4F)
					.trackingRange(10)// Hitbox Size ()
					.build(new ResourceLocation(ChaosAwakens.MODID, "golden_apple_cow").toString()));
	public static final RegistryObject<EntityType<EnchantedGoldenAppleCowEntity>> ENCHANTED_GOLDEN_APPLE_COW = ENTITY_TYPES.register("enchanted_golden_apple_cow",
			() -> EntityType.Builder.create(EnchantedGoldenAppleCowEntity::new, EntityClassification.CREATURE)
					.size(0.9F, 1.4F)
					.trackingRange(10)// Hitbox Size ()
					.build(new ResourceLocation(ChaosAwakens.MODID, "enchanted_golden_apple_cow").toString()));
	public static final RegistryObject<EntityType<CrystalAppleCowEntity>> CRYSTAL_APPLE_COW = ENTITY_TYPES.register("crystal_apple_cow",
			() -> EntityType.Builder.create(CrystalAppleCowEntity::new, EntityClassification.CREATURE)
					.size(0.9F, 1.4F)
					.trackingRange(10)// Hitbox Size ()
					.build(new ResourceLocation(ChaosAwakens.MODID, "crystal_apple_cow").toString()));
	
	// Ants
	public static final RegistryObject<EntityType<BrownAntEntity>> BROWN_ANT = ENTITY_TYPES.register("brown_ant",
			() -> EntityType.Builder.create(BrownAntEntity::new, EntityClassification.CREATURE)
				.size(0.25f, 0.25f) // Hitbox Size ()
				.build(new ResourceLocation(ChaosAwakens.MODID, "brown_ant").toString()));
	
	public static final RegistryObject<EntityType<RainbowAntEntity>> RAINBOW_ANT = ENTITY_TYPES.register("rainbow_ant",
			() -> EntityType.Builder.create(RainbowAntEntity::new, EntityClassification.CREATURE)
				.size(0.25f, 0.25f) // Hitbox Size ()
				.build(new ResourceLocation(ChaosAwakens.MODID, "rainbow_ant").toString()));
	
	public static final RegistryObject<EntityType<RedAntEntity>> RED_ANT = ENTITY_TYPES.register("red_ant",
			() -> EntityType.Builder.create(RedAntEntity::new, EntityClassification.MONSTER)
				.size(0.25f, 0.25f) // Hitbox Size ()
				.build(new ResourceLocation(ChaosAwakens.MODID, "red_ant").toString()));
	public static final RegistryObject<EntityType<UnstableAntEntity>> UNSTABLE_ANT = ENTITY_TYPES.register("unstable_ant",
			() -> EntityType.Builder.create(UnstableAntEntity::new, EntityClassification.CREATURE)
				.size(0.25f, 0.25f) // Hitbox Size ()
				.build(new ResourceLocation(ChaosAwakens.MODID, "unstable_ant").toString()));
	
	// Termite
	public static final RegistryObject<EntityType<TermiteEntity>> TERMITE = ENTITY_TYPES.register("termite",
			() -> EntityType.Builder.create(TermiteEntity::new, EntityClassification.CREATURE)
				.size(0.5f, 0.25f) // Hitbox Size ()
				.build(new ResourceLocation(ChaosAwakens.MODID, "termite").toString()));
	
	// Beaver
	public static final RegistryObject<EntityType<BeaverEntity>> BEAVER = ENTITY_TYPES.register("beaver",
			() -> EntityType.Builder.create(BeaverEntity::new, EntityClassification.CREATURE)
				.size(0.75f, 0.7f) // Hitbox Size ()
				.build(new ResourceLocation(ChaosAwakens.MODID, "beaver").toString()));
	
	// Emerald Gator
	public static final RegistryObject<EntityType<EmeraldGatorEntity>> EMERALD_GATOR = ENTITY_TYPES.register("emerald_gator",
			() -> EntityType.Builder.create(EmeraldGatorEntity::new, EntityClassification.CREATURE)
				.size(1.5f, 1.0f) // Hitbox Size ()
				.build(new ResourceLocation(ChaosAwakens.MODID, "emerald_gator").toString()));

	// Ruby Bug
	public static final RegistryObject<EntityType<RubyBugEntity>> RUBY_BUG = ENTITY_TYPES.register("ruby_bug",
			() -> EntityType.Builder.create(RubyBugEntity::new, EntityClassification.CREATURE)
					.size(0.5f, 0.5f) // Hitbox Size ()
					.build(new ResourceLocation(ChaosAwakens.MODID, "ruby_bug").toString()));

	// Stink Bug
	public static final RegistryObject<EntityType<StinkBugEntity>> STINK_BUG = ENTITY_TYPES.register("stink_bug",
			() -> EntityType.Builder.create(StinkBugEntity::new, EntityClassification.CREATURE)
					.size(0.5f, 0.5f) // Hitbox Size ()
					.build(new ResourceLocation(ChaosAwakens.MODID, "stink_bug").toString()));

	// Robo Sniper
	public static final RegistryObject<EntityType<RoboSniperEntity>> ROBO_SNIPER = ENTITY_TYPES.register("robo_sniper",
			() -> EntityType.Builder.create(RoboSniperEntity::new, EntityClassification.MONSTER)
					.size(1.0f, 1.5f) // Hitbox Size ()
					.build(new ResourceLocation(ChaosAwakens.MODID, "robo_sniper").toString()));

	// Robo Warrior
	public static final RegistryObject<EntityType<RoboWarriorEntity>> ROBO_WARRIOR = ENTITY_TYPES.register("robo_warrior",
			() -> EntityType.Builder.create(RoboWarriorEntity::new, EntityClassification.MONSTER)
					.size(2.0f, 4.0f) // Hitbox Size ()
					.build(new ResourceLocation(ChaosAwakens.MODID, "robo_warrior").toString()));

	// Projectiles
	public static final RegistryObject<EntityType<RoboLaserEntity>> ROBO_LASER = ENTITY_TYPES.register("robo_laser",
			() -> EntityType.Builder.<RoboLaserEntity>create(RoboLaserEntity::new, EntityClassification.MISC)
				.size(0.5F, 0.5F).trackingRange(4).updateInterval(20)
				.build(new ResourceLocation(ChaosAwakens.MODID, "robo_laser").toString()));

	public static final RegistryObject<EntityType<UltimateArrowEntity>> ULTIMATE_ARROW = ENTITY_TYPES.register("ultimate_arrow",
			() -> EntityType.Builder.<UltimateArrowEntity>create(UltimateArrowEntity::new, EntityClassification.MISC)
				.size(0.5F, 0.5F).trackingRange(4).updateInterval(20)
				.build(new ResourceLocation(ChaosAwakens.MODID, "ultimate_arrow").toString()));
	
	public static final RegistryObject<EntityType<IrukandjiArrowEntity>> IRUKANDJI_ARROW = ENTITY_TYPES.register("irukandji_arrow",
			() -> EntityType.Builder.<IrukandjiArrowEntity>create(IrukandjiArrowEntity::new, EntityClassification.MISC)
				.size(0.5F, 0.5F).trackingRange(4).updateInterval(20)
				.build(new ResourceLocation(ChaosAwakens.MODID, "irukandji_arrow").toString()));

	public static final RegistryObject<EntityType<ThunderStaffProjectileEntity>> THUNDER_BALL = ENTITY_TYPES.register("thunder_ball",
			() -> EntityType.Builder.<ThunderStaffProjectileEntity>create(ThunderStaffProjectileEntity::new, EntityClassification.MISC)
					.size(0.25F, 0.25F).trackingRange(4).updateInterval(20)
					.build(new ResourceLocation(ChaosAwakens.MODID, "thunder_ball").toString()));

	public static final RegistryObject<EntityType<RayGunProjectileEntity>> EXPLOSIVE_BALL = ENTITY_TYPES.register("explosive_ball",
			() -> EntityType.Builder.<RayGunProjectileEntity>create(RayGunProjectileEntity::new, EntityClassification.MISC)
					.size(0.25F, 0.25F).trackingRange(4).updateInterval(20)
					.build(new ResourceLocation(ChaosAwakens.MODID, "explosive_ball").toString()));

	public static final RegistryObject<EntityType<UltimateFishingBobberEntity>> ULTIMATE_FISHING_BOBBER = ENTITY_TYPES.register("ultimate_fishing_bobber",
			() -> EntityType.Builder.<UltimateFishingBobberEntity>create(EntityClassification.MISC).disableSerialization().disableSummoning().size(0.25F, 0.25F).trackingRange(4).updateInterval(5)
					.size(0.5F, 0.5F).trackingRange(4).updateInterval(20)
					.build(new ResourceLocation(ChaosAwakens.MODID, "ultimate_fishing_bobber").toString()));
}