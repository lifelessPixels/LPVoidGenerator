package pl.lifelesspixels.lpvoidgenerator;

import org.bukkit.generator.BiomeProvider;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.plugin.java.JavaPlugin;
import pl.lifelesspixels.lpvoidgenerator.generation.VoidBiomeProvider;
import pl.lifelesspixels.lpvoidgenerator.generation.VoidChunkGenerator;

public class LPVoidGenerator extends JavaPlugin {

    @Override
    public ChunkGenerator getDefaultWorldGenerator(String worldName, String id) {
        return new VoidChunkGenerator();
    }

    @Override
    public BiomeProvider getDefaultBiomeProvider(String worldName, String id) {
        return new VoidBiomeProvider();
    }
}
