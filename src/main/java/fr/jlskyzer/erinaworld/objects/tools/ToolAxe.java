package fr.jlskyzer.erinaworld.objects.tools;

import com.google.common.collect.Sets;
import fr.jlskyzer.erinaworld.Main;
import fr.jlskyzer.erinaworld.init.ItemInit;
import fr.jlskyzer.erinaworld.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

import java.util.Set;

public class ToolAxe extends ItemAxe implements IHasModel {

    public static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.MELON_BLOCK, Blocks.WOODEN_BUTTON, Blocks.LADDER, Blocks.WOODEN_PRESSURE_PLATE);

    public ToolAxe(String name, ToolMaterial material) {
        super(material, 8.1F, -3.1F);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.TOOLS);

        ItemInit.ITEMS.add(this);
    }

                               @Override
    public void registerModels(){
        // Creation de la methode de creation d'item
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
