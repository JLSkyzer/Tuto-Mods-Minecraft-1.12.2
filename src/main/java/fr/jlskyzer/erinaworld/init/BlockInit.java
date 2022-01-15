package fr.jlskyzer.erinaworld.init;

import fr.jlskyzer.erinaworld.objects.blocks.BlockBase;
//import fr.jlskyzer.erinaworld.objects.blocks.BlockOres;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class BlockInit {

    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block BLOCK_COPPER = new BlockBase("block_copper", Material.IRON);
    public static final Block ORE_COPPER = new BlockBase("ore_overworld_copper", Material.IRON);

    public static final Block ORE_END_TUTORIAL = new BlockBase("ore_end_tutorial", Material.IRON);
    public static final Block ORE_OVERWORLD_TUTORIAL = new BlockBase("ore_overworld_tutorial", Material.IRON);
    public static final Block ORE_NETHER_TUTORIAL = new BlockBase("ore_nether_tutorial", Material.IRON);

    public static final Block COPPER_PLANKS = new BlockBase("copper_planks", Material.WOOD);
    public static final Block COPPER_LOG = new BlockBase("copper_log", Material.WOOD);
    public static final Block COPPER_LEAVES = new BlockBase("copper_leaves", Material.LEAVES);
    public static final Block COPPER_SAPLINGS = new BlockBase("copper_sapling", Material.PLANTS);

}
