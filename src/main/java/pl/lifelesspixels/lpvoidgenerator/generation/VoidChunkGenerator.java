package pl.lifelesspixels.lpvoidgenerator.generation;

import org.bukkit.generator.ChunkGenerator;

public class VoidChunkGenerator extends ChunkGenerator {

    @Override
    public boolean shouldGenerateCaves() {
        return false;
    }

    @Override
    public boolean shouldGenerateDecorations() {
        return false;
    }

    @Override
    public boolean shouldGenerateMobs() {
        return false;
    }

    @Override
    public boolean shouldGenerateNoise() {
        return false;
    }

    @Override
    public boolean shouldGenerateStructures() {
        return false;
    }

    @Override
    public boolean shouldGenerateSurface() {
        return false;
    }
}
