package fr.jlskyzer.erinaworld.util.handlers;

import fr.jlskyzer.erinaworld.init.BiomeInit;
import fr.jlskyzer.erinaworld.init.BlockInit;
import fr.jlskyzer.erinaworld.init.ItemInit;
import fr.jlskyzer.erinaworld.util.IHasModel;
import fr.jlskyzer.erinaworld.world.gen.WorldGenCustomOres;
import fr.jlskyzer.erinaworld.world.gen.WorldGenCustomTrees;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import static fr.jlskyzer.erinaworld.init.ItemInit.ITEMS;


@EventBusSubscriber
public class RegistryHandler {

    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event){
        event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
    }

    @SubscribeEvent
    public static void onBlockRegister(RegistryEvent.Register<Block> event){
        event.getRegistry().registerAll(BlockInit.BLOCKS.toArray(new Block[0]));
    }

    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event){

        for(Item item : ItemInit.ITEMS){

            if(item instanceof IHasModel){
                ((IHasModel)item).registerModels();
            }
        }

        for (Block block : BlockInit.BLOCKS)
        {
            if (block instanceof IHasModel){
                ((IHasModel)block).registerModels();
            }
        }
    }

    public static void otherRegistries(){


    }

    public static void preInitRegistries(FMLPreInitializationEvent event)
    {
        GameRegistry.registerWorldGenerator(new WorldGenCustomOres(), 0);
        GameRegistry.registerWorldGenerator(new WorldGenCustomTrees(), 0);

        BiomeInit.registerBiomes();
    }

}
