package pl.lifelesspixels.lpvoidgenerator.generation;

import org.bukkit.World;
import org.bukkit.block.Biome;
import org.bukkit.generator.BiomeProvider;
import org.bukkit.generator.WorldInfo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class VoidBiomeProvider extends BiomeProvider {

    private final static HashMap<World.Environment, List<Biome>> ENVIRONMENT_TO_BIOMES_LIST;

    static {
        ENVIRONMENT_TO_BIOMES_LIST = new HashMap<>();
        for(World.Environment environment : World.Environment.values()) {
            ArrayList<Biome> biomesList = new ArrayList<>();
            switch (environment) {
                case NORMAL, CUSTOM -> biomesList.add(Biome.PLAINS);
                case NETHER -> biomesList.add(Biome.NETHER_WASTES);
                case THE_END -> biomesList.add(Biome.THE_END);
            }

            ENVIRONMENT_TO_BIOMES_LIST.put(environment, biomesList);
        }
    }

    @Override
    public Biome getBiome(WorldInfo worldInfo, int x, int y, int z) {
        return ENVIRONMENT_TO_BIOMES_LIST.get(worldInfo.getEnvironment()).get(0);
    }

    @Override
    public List<Biome> getBiomes(WorldInfo worldInfo) {
        return ENVIRONMENT_TO_BIOMES_LIST.get(worldInfo.getEnvironment());
    }

}
