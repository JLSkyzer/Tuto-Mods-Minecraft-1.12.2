package fr.jlskyzer.erinaworld.objects.blocks;

import fr.jlskyzer.erinaworld.Main;
import fr.jlskyzer.erinaworld.init.BlockInit;
import fr.jlskyzer.erinaworld.init.ItemInit;
import fr.jlskyzer.erinaworld.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.client.ForgeHooksClient;
import net.minecraftforge.common.IPlantable;

import java.util.Objects;

public class BlockDirtBase extends Block implements IHasModel {


    private ForgeHooksClient RenderTypeLookup;

    public BlockDirtBase(String name, Material material, CreativeTabs tab){
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setSoundType(SoundType.GROUND);


        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    public BlockDirtBase(Material material) {
        super(material);
    }

    @Override
    public void registerModels(){
        // Creation de la methode de creation d'item
        Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }

    @Override
    public boolean canSustainPlant(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing direction, IPlantable plantable)
    {
        return true;
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
