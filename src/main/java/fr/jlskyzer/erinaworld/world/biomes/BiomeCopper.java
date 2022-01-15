package fr.jlskyzer.erinaworld.world.biomes;

import java.util.Random;

import fr.jlskyzer.erinaworld.init.BlockInit;
import fr.jlskyzer.erinaworld.objects.blocks.BlockBase;
import fr.jlskyzer.erinaworld.world.gen.generators.WorldGenCopperTree;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class BiomeCopper extends Biome
{
    protected static final WorldGenAbstractTree TREE = new WorldGenCopperTree();

    public BiomeCopper()
    {
        super(new BiomeProperties("Copper").setBaseHeight(1.0F).setHeightVariation(1.0F).setRainDisabled().setTemperature(1.0F));

        topBlock = BlockInit.COPPER_DIRT.getDefaultState();
        fillerBlock = BlockInit.ORE_COPPER.getDefaultState();

//        this.spawnableCaveCreatureList.clear();
//        this.spawnableCreatureList.clear();
//        this.spawnableMonsterList.clear();
//        this.spawnableWaterCreatureList.clear();

        this.decorator.coalGen = new WorldGenMinable(fillerBlock, 10);

        this.decorator.treesPerChunk = 2;

//        this.spawnableCreatureList.add(new SpawnListEntry(EntityCentaur.class, 5, 1, 5));
    }

    public WorldGenAbstractTree getRandomTreeFeature(Random rand){
        return TREE;
    }
}
