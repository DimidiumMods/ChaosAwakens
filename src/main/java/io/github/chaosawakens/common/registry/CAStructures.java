package io.github.chaosawakens.common.registry;

import java.util.HashMap;
import java.util.Map;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

import io.github.chaosawakens.ChaosAwakens;
import io.github.chaosawakens.common.worldgen.structures.EntDungeonStructure;
import io.github.chaosawakens.common.worldgen.structures.WaspDungeonStructure;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.gen.feature.structure.Structure;
import net.minecraft.world.gen.settings.DimensionStructuresSettings;
import net.minecraft.world.gen.settings.StructureSeparationSettings;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class CAStructures {

	public static final DeferredRegister<Structure<?>> STRUCTURES = DeferredRegister.create(ForgeRegistries.STRUCTURE_FEATURES, ChaosAwakens.MODID);

	public static final RegistryObject<Structure<NoFeatureConfig>> ENT_DUNGEON = STRUCTURES.register("ent_dungeon", () -> (new EntDungeonStructure(NoFeatureConfig.CODEC)));
	public static final RegistryObject<Structure<NoFeatureConfig>> WASP_DUNGEON = STRUCTURES.register("wasp_dungeon", () -> (new WaspDungeonStructure(NoFeatureConfig.CODEC)));

	public static void setupStructures() {
		setupMapSpacingAndLand(ENT_DUNGEON.get(), new StructureSeparationSettings(27 , 25, 32034987), true);
		setupMapSpacingAndLand(WASP_DUNGEON.get(), new StructureSeparationSettings(21 , 19, 139369349), true);
	}

	public static <F extends Structure<?>> void setupMapSpacingAndLand(F structure,
			StructureSeparationSettings structureSeparationSettings, boolean transformSurroundingLand) {
		
		Structure.STRUCTURES_REGISTRY.put(structure.getRegistryName().toString(), structure);                                                                                                                                                                                                                                          
		
		if (transformSurroundingLand) {
			Structure.NOISE_AFFECTING_FEATURES = ImmutableList.<Structure<?>>builder().addAll(Structure.NOISE_AFFECTING_FEATURES).add(structure).build();
		}
		
		DimensionStructuresSettings.DEFAULTS = ImmutableMap.<Structure<?>, StructureSeparationSettings>builder()
				.putAll(DimensionStructuresSettings.DEFAULTS).put(structure, structureSeparationSettings).build();
		
		WorldGenRegistries.NOISE_GENERATOR_SETTINGS.entrySet().forEach(settings -> {
			Map<Structure<?>, StructureSeparationSettings> structureMap = settings.getValue()
					.structureSettings().structureConfig;
			
			if (structureMap instanceof ImmutableMap) {
				Map<Structure<?>, StructureSeparationSettings> tempMap = new HashMap<>(structureMap);
				tempMap.put(structure, structureSeparationSettings);
				settings.getValue().structureSettings().structureConfig = tempMap;
			} else {
				structureMap.put(structure, structureSeparationSettings);
			}
		});
	}
}