package fr.jlskyzer.erinaworld.objects.blocks;

import fr.jlskyzer.erinaworld.Main;
import fr.jlskyzer.erinaworld.init.BlockInit;
import fr.jlskyzer.erinaworld.init.ItemInit;
import fr.jlskyzer.erinaworld.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.ForgeHooksClient;


public class BlockBase extends Block implements IHasModel {


    private ForgeHooksClient RenderTypeLookup;

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


    /* 
    @Override
	public List<ItemStack> getDrops(IBlockAccess world, BlockPos pos, IBlockState state, int fortune) 
	{
		List<ItemStack> list = new ArrayList<ItemStack>();
		list.add(new ItemStack(ItemInit.SLIMY_INGOT));
		list.add(new ItemStack(ItemInit.FUSIONITE_INGOT));
		return list;
	}
    */
}

/*
* @Override
	@OnlyIn(Dist.CLIENT)
	public void clientLoad(FMLClientSetupEvent event) {
		RenderTypeLookup.setRenderLayer(block, RenderType.getCutoutMipped());
	}

* */
