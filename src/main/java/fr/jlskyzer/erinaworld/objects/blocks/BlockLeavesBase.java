package fr.jlskyzer.erinaworld.objects.blocks;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

import fr.jlskyzer.erinaworld.Main;
import fr.jlskyzer.erinaworld.init.BlockInit;
import fr.jlskyzer.erinaworld.init.ItemInit;
import fr.jlskyzer.erinaworld.util.IHasModel;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockPlanks.EnumType;
import net.minecraft.block.SoundType;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;

public class BlockLeavesBase extends BlockLeaves implements IHasModel
{
    public static String type;

    public BlockLeavesBase(String name)
    {
        type = name.replaceAll("_leaves", "").trim();
        System.out.println(type);

        setUnlocalizedName(name);
        setRegistryName(name);
        setSoundType(SoundType.PLANT);
        setCreativeTab(Main.tutorialtab);
        setDefaultState(this.blockState.getBaseState().withProperty(CHECK_DECAY, Boolean.TRUE).withProperty(DECAYABLE, Boolean.TRUE));

        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(Objects.requireNonNull(this.getRegistryName())));
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        if(type == "copper"){
            return Item.getItemFromBlock(BlockInit.COPPER_SAPLINGS);
        }
        else{
            return Item.getItemFromBlock(Blocks.SAPLING);
        }
    }

    @Override
    public int getMetaFromState(IBlockState state)
    {
        int i = 0;
        if(!(Boolean) state.getValue(DECAYABLE)) i |= 2;
        if(!(Boolean) state.getValue(CHECK_DECAY)) i|= 4;
        return i;
    }

    @Override
    protected ItemStack getSilkTouchDrop(IBlockState state)
    {
        return new ItemStack(this);
    }

    @Override
    protected void dropApple(World worldIn, BlockPos pos, IBlockState state, int chance) {return;}

    @Override
    protected int getSaplingDropChance(IBlockState state) {return 30;}

    @Override
    public EnumType getWoodType(int meta) {return null;}

    @Override
    public List<ItemStack> onSheared(ItemStack item, IBlockAccess world, BlockPos pos, int fortune)
    {
        return NonNullList.withSize(1, new ItemStack(this));
    }

    @Override
    public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }

    @Override
    protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, new IProperty[] {CHECK_DECAY, DECAYABLE});
    }

    @Override
    public BlockRenderLayer getBlockLayer()
    {
        return BlockRenderLayer.TRANSLUCENT;
    }

    @Override
    public void registerModels()
    {
        Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}
