package fr.jlskyzer.erinaworld.tabs;

import fr.jlskyzer.erinaworld.init.BlockInit;
import fr.jlskyzer.erinaworld.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class TutorialTab extends CreativeTabs {
    public TutorialTab(String label) {
        super("tutorialtab");
        this.setBackgroundImageName("tutorial.png");
    }
    public ItemStack getTabIconItem() {
        return new ItemStack(ItemInit.COPPER_INGOT);
//        return new ItemStack(Item.getItemFromBlock(BlockInit.ORE_COPPER));
    }
}
