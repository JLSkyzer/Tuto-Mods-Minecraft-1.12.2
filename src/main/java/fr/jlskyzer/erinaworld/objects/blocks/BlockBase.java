package fr.jlskyzer.erinaworld.objects.blocks;

import fr.jlskyzer.erinaworld.Main;
import fr.jlskyzer.erinaworld.init.BlockInit;
import fr.jlskyzer.erinaworld.init.ItemInit;
import fr.jlskyzer.erinaworld.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel {

    public BlockBase(String name, Material material){
    super(material);
    setUnlocalizedName(name);
    setRegistryName(name);
    setCreativeTab(Main.tutorialtab);

        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void registerModels(){
        // Creation de la methode de creation d'item
        Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}
