package fr.jlskyzer.erinaworld.world.gen;

import fr.jlskyzer.erinaworld.init.BlockInit;
//import fr.jlskyzer.erinaworld.objects.blocks.BlockOres;
//import fr.jlskyzer.erinaworld.util.handlers.EnumHandler;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class WorldGenCustomOres implements IWorldGenerator {

    private final WorldGenerator ore_overworld_copper;
    private final WorldGenerator ore_overworld_tutorial, ore_nether_tutorial, ore_end_tutorial;

    public WorldGenCustomOres(){

        ore_overworld_copper = new WorldGenMinable(BlockInit.ORE_COPPER.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.STONE));

        ore_overworld_tutorial = new WorldGenMinable(BlockInit.ORE_OVERWORLD_TUTORIAL.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.STONE));
        ore_nether_tutorial = new WorldGenMinable(BlockInit.ORE_NETHER_TUTORIAL.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.NETHERRACK));
        ore_end_tutorial = new WorldGenMinable(BlockInit.ORE_END_TUTORIAL.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.END_STONE));

    }

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        switch (world.provider.getDimension()){
//            La dimension
            case 0:

                runGenerator(ore_overworld_copper, world, random, chunkX, chunkZ, 50, 0, 60);
                runGenerator(ore_overworld_tutorial, world, random, chunkX, chunkZ, 50, 0, 60);

                break;
            case -1:

                runGenerator(ore_nether_tutorial, world, random, chunkX, chunkZ, 50, 0, 100);

                break;
            case 1:

                runGenerator(ore_end_tutorial, world, random, chunkX, chunkZ, 50, 0, 256);

                break;
        }
    }

    private void runGenerator(WorldGenerator gen, World world, Random rand, int chunkX, int chunkZ, int chance, int minHeight, int maxHeight){
        if(minHeight > maxHeight || minHeight < 0 || maxHeight > 256) throw new IllegalArgumentException("Ore generated out of bounds");

        int heightDiff = maxHeight - minHeight + 1;
        for(int i = 0; i < chance; i++){
            int x = chunkX * 16 + rand.nextInt(16);
            int y = minHeight + rand.nextInt(heightDiff);
            int z = chunkZ * 16 + rand.nextInt(16);

            gen.generate(world, rand, new BlockPos(x,y,z));
        }
    }
}
